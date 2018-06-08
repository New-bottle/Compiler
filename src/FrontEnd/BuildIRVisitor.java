package FrontEnd;

import AST.*;
import CompilerOptions.CompilerOptions;
import IR.*;
import Symbols.Scope;
import Symbols.Symbol;
import Symbols.VariableSymbol;

import java.util.HashMap;
import java.util.Map;

public class BuildIRVisitor implements ASTVisitor<IRBaseClass> {
    private IRRoot irRoot;
    private IRInstruction head;
    private IRInstruction last;
    private IRInstruction curIns;
    private boolean getAddress;
    private Scope globalscope;
    private Scope currentscope;
    private Label curLoopContinueTarget;
    private Label curLoopBreakTarget;

    Map<Symbol, VirtualRegister> varmap;

    private void append(IRInstruction ins) {
        curIns.linkNext(ins);
        curIns = ins;
    }
    public BuildIRVisitor(IRInstruction head) {
        this.head = this.last = this.curIns = head;
    }

    public BuildIRVisitor(Scope globalscope) {
        irRoot = new IRRoot();
        curIns = irRoot;
        varmap = new HashMap<>();
        this.currentscope = this.globalscope = globalscope;
    }

    private boolean isLogicalExpr(ExprNode node) {
        if (node instanceof BinaryOpNode) {
            BinaryOpNode.BinaryOp op = ((BinaryOpNode)node).op;
            return op == BinaryOpNode.BinaryOp.LAND || op == BinaryOpNode.BinaryOp.LOR;
        } else if (node instanceof UnaryExprNode) {
            UnaryOpNode.UnaryOp op = ((UnaryExprNode)node).op;
            return op == UnaryOpNode.UnaryOp.LNOT;
        } else {
            return false;
        }
    }
    private boolean needMemoryAccess(ExprNode node) {
        if (node instanceof MemberNode) return true;
        if (node instanceof ArefNode) return true;
        return false;
    }
    private void assign(boolean isMemOp, int size, IntValue addr, int offset, ExprNode rhs) {
        // for short-circuit evaluation
        // Label merge = new Label("merge");
        if (isMemOp) {
            append(new Store(rhs.intValue, size, addr, offset));
        } else {
            append(new Move((VirtualRegister)addr, rhs.intValue));
        }
    }
    private void processAssign(BinaryOpNode binaryOpNode) {
        // build rhs
        if (isLogicalExpr(binaryOpNode.right)) {
            binaryOpNode.right.ifTrue = new Label(null);
            binaryOpNode.right.ifFalse = new Label(null);
        }
        binaryOpNode.right.accept(this);

        // build the address of lhs
        boolean isMemOp = needMemoryAccess(binaryOpNode.left);
        getAddress = isMemOp;
        binaryOpNode.left.accept(this);
        getAddress = false;

        // build assignment
        IntValue addr = isMemOp ? binaryOpNode.left.addressValue : binaryOpNode.left.intValue;
        int offset = isMemOp ? binaryOpNode.left.addressOffset : 0;
        int size = globalscope.resolve(binaryOpNode.right.exprType).getRegisterSize();
        assign(isMemOp, size, addr, offset, binaryOpNode.right);
    }
    private void processLogicalBinaryExpr(BinaryOpNode binaryOpNode) {
        // check lhs
        Label lb = null;
        if (binaryOpNode.op == BinaryOpNode.BinaryOp.LAND) {
            lb = new Label("lhs_true");
            binaryOpNode.left.ifTrue = lb;
            binaryOpNode.left.ifFalse = binaryOpNode.ifFalse;
            binaryOpNode.left.accept(this);
        } else {
            lb = new Label("lhs_false");
            binaryOpNode.left.ifTrue = binaryOpNode.ifTrue;
            binaryOpNode.left.ifFalse = lb;
            binaryOpNode.left.accept(this);
        }
        binaryOpNode.right.ifTrue = binaryOpNode.ifTrue;
        binaryOpNode.right.ifFalse = binaryOpNode.ifFalse;
        append(lb);
        binaryOpNode.right.accept(this);
    }
    private void processStringBinaryExpr(BinaryOpNode binaryOpNode) {

    }
    private void processIntRelationalExpr(BinaryOpNode binaryOpNode) {
        binaryOpNode.left.accept(this);
        binaryOpNode.right.accept(this);
        IntComparison.Condition cond = null;
        switch (binaryOpNode.op) {
            case EQ: cond = IntComparison.Condition.EQ; break;
            case NE: cond = IntComparison.Condition.NE; break;
            case LT: cond = IntComparison.Condition.LT; break;
            case GT: cond = IntComparison.Condition.GT; break;
            case LE: cond = IntComparison.Condition.LE; break;
            case GE: cond = IntComparison.Condition.GE; break;
        }
        VirtualRegister reg = new VirtualRegister(null);
        append(new IntComparison(reg, cond, binaryOpNode.left.intValue, binaryOpNode.right.intValue));
        if (binaryOpNode.ifTrue != null) {
            // if the expression is in a condition part
            append(new Branch(reg, binaryOpNode.ifTrue, binaryOpNode.ifFalse));
        } else {
            // if the expression is in an assignment
            binaryOpNode.intValue = reg;
        }
    }
    private void processIntArithmeticExpr(BinaryOpNode binaryOpNode) {
        binaryOpNode.left.accept(this);
        binaryOpNode.right.accept(this);
        BinaryOperation.BinaryOp op = null;
        switch (binaryOpNode.op) {
            case SHL: op = BinaryOperation.BinaryOp.SHL; break;
            case SHR: op = BinaryOperation.BinaryOp.SHR; break;
            case ADD: op = BinaryOperation.BinaryOp.ADD; break;
            case SUB: op = BinaryOperation.BinaryOp.SUB; break;
            case MUL: op = BinaryOperation.BinaryOp.MUL; break;
            case DIV: op = BinaryOperation.BinaryOp.DIV; break;
            case MOD: op = BinaryOperation.BinaryOp.MOD; break;
            case XOR: op = BinaryOperation.BinaryOp.XOR; break;
            case OR : op = BinaryOperation.BinaryOp.OR ; break;
            case AND: op = BinaryOperation.BinaryOp.AND; break;
        }
        VirtualRegister reg = new VirtualRegister(null);
        binaryOpNode.intValue = reg;
        append(new BinaryOperation(reg, op, binaryOpNode.left.intValue, binaryOpNode.right.intValue));
    }

    private void processSelfIncDec(ExprNode body, ExprNode node, boolean isInc, boolean isPostfix) {
        boolean isMemOp = needMemoryAccess(node);
        // getaddress
        boolean getaddr = getAddress;
        getAddress = isMemOp;
        body.accept(this);
        IntValue addr = node.addressValue;
        int offset = node.addressOffset;

        // get value
        getAddress = false;
        body.accept(this);
        getAddress = getaddr;

        // stuffs
        BinaryOperation.BinaryOp op = isInc ? BinaryOperation.BinaryOp.ADD : BinaryOperation.BinaryOp.SUB;
        IntImmediate one = new IntImmediate(1);
        VirtualRegister reg = new VirtualRegister(null);

        if (isPostfix) {
            append(new Move(reg, body.intValue));
            node.intValue = reg;
        } else {
            node.intValue = body.intValue;
        }

        // if need memory operation, introduce temporary register
        if (isMemOp) {
            append(new BinaryOperation(reg, op, body.intValue, one));
            append(new Store(reg, body.exprType.getRegisterSize(), addr, offset));

            if (!isPostfix) node.intValue = reg;
        } else {
            append(new BinaryOperation((Register) body.intValue, op, body.intValue, one));
        }
    }

    @Override
    public IRBaseClass visit(AST node) {
        for (int i = 0; i < node.comps.size(); i++) {
            node.comps.get(i).accept(this);
        }
        return irRoot;
    }

    @Override
    public IRBaseClass visit(ArefNode arefNode) {
        boolean getaddr = getAddress;
        getAddress = false;
        arefNode.name.accept(this);
        arefNode.iter.accept(this);
        getAddress = getaddr;

        IntValue tmp1 = new IntImmediate(((ArrayType)arefNode.name.exprType).baseType.getRegisterSize());
        VirtualRegister reg = new VirtualRegister(null);
        append(new BinaryOperation(reg, BinaryOperation.BinaryOp.MUL, arefNode.iter.intValue, tmp1));
        append(new BinaryOperation(reg, BinaryOperation.BinaryOp.ADD, arefNode.name.intValue, reg));

        if (getAddress) {
            arefNode.addressValue = reg;
            arefNode.addressOffset = CompilerOptions.getSizeInt();
        } else {
            append(new Load(reg, arefNode.exprType.getRegisterSize(), reg, CompilerOptions.getSizeInt()));
            arefNode.intValue = reg;
            if (arefNode.ifTrue != null) {
                append(new Branch(arefNode.intValue, arefNode.ifTrue, arefNode.ifFalse));
            }
        }
        return null;
    }

    @Override
    public IRBaseClass visit(ArrayType arrayType) {
        return null;
    }

    @Override
    public IRBaseClass visit(BinaryOpNode binaryOpNode) {
        switch (binaryOpNode.op) {
            case ASSIGN:
                processAssign(binaryOpNode);
                break;
            case LAND: case LOR:
                processLogicalBinaryExpr(binaryOpNode);
                break;
            case EQ: case NE: case LT: case GT: case LE: case GE:
                if (binaryOpNode.left.exprType.getType() == Symbol.Types.STRING)
                    processStringBinaryExpr(binaryOpNode);
                else
                    processIntRelationalExpr(binaryOpNode);
                break;
            case SHL: case SHR: case ADD: case SUB: case MUL: case DIV: case MOD: case XOR:
            case OR:  case AND:
                if (binaryOpNode.left.exprType.getType() == Symbol.Types.STRING)
                    processStringBinaryExpr(binaryOpNode);
                else
                    processIntArithmeticExpr(binaryOpNode);
                break;
        }
        return null;
    }

    @Override
    public IRBaseClass visit(BlockNode blockNode) {
        if (blockNode.scope != null)
            currentscope = blockNode.scope;
        for (int i = 0; i < blockNode.stmts.size(); i++) {
            blockNode.stmts.get(i).accept(this);
        }
        if (blockNode.scope != null)
            currentscope = currentscope.getEnclosingScope();
        return null;
    }

    @Override
    public IRBaseClass visit(BoolLiteralNode boolLiteralNode) {
        return null;
    }

    @Override
    public IRBaseClass visit(BreakNode breakNode) {
        append(new Jump(curLoopBreakTarget));
        return null;
    }

    @Override
    public IRBaseClass visit(BuiltInType builtInType) {
        return null;
    }

    @Override
    public IRBaseClass visit(ClassNode classNode) {
        return null;
    }

    @Override
    public IRBaseClass visit(ClassType classType) {
        return null;
    }

    @Override
    public IRBaseClass visit(ContinueNode continueNode) {
        append(new Jump(curLoopContinueTarget));
        return null;
    }

    @Override
    public IRBaseClass visit(ExprNode exprNode) {
        return null;
    }

    @Override
    public IRBaseClass visit(ExprStmtNode exprStmtNode) {
        exprStmtNode.expr.accept(this);
        return null;
    }

    @Override
    public IRBaseClass visit(ForNode forNode) {
        // for init
        if (forNode.initWithDecl != null) {
            forNode.initWithDecl.accept(this);
        } else {
            forNode.init.accept(this);
        }

        Label forbody = new Label("forbody");
        Label forstep = new Label("forstep");
        Label forjudge = new Label("forjudge");
        Label forend = new Label("forend");

        Label tmpLoopContinueTarget = curLoopContinueTarget;
        Label tmpLoopBreakTarget = curLoopBreakTarget;

        curLoopBreakTarget = forend;
        curLoopContinueTarget = forstep;

        // init to judge
        append(new Jump(forjudge));

        // body
        append(forbody);
        forNode.body.accept(this);

        curLoopBreakTarget = tmpLoopBreakTarget;
        curLoopContinueTarget = tmpLoopContinueTarget;

        // body to step
        append(new Jump(forstep));

        // step
        append(forstep);

        // step to judge
        append(new Jump(forjudge));

        // judge
        append(forjudge);
        forNode.cond.accept(this);
        IntValue forcond = forNode.cond.intValue;
        append(new Branch(forcond, forbody, forend));

        append(forend);
        return null;
    }

    @Override
    public IRBaseClass visit(FuncDeclNode funcDeclNode) {
        if (funcDeclNode.scope != null) {
            currentscope = funcDeclNode.scope;
        }
        append(new Label(funcDeclNode.name));

        if (funcDeclNode.parameters != null) {
            for (int i = 0; i < funcDeclNode.parameters.size(); i++) {
                funcDeclNode.parameters.get(i).accept(this);
            }
        }

        funcDeclNode.body.accept(this);
        if (funcDeclNode.scope != null) {
            currentscope = currentscope.getEnclosingScope();
        }
        return null;
    }

    @Override
    public IRBaseClass visit(FunctionCallNode functionCallNode) {
        return null;
    }

    @Override
    public IRBaseClass visit(FunctionType functionType) {
        return null;
    }

    @Override
    public IRBaseClass visit(IfNode ifNode) {
        Label ifTrue = new Label("ifTrue");
        Label ifFalse = new Label("ifFalse");
        Label ifend = new Label("ifend");
        ifNode.cond.ifTrue = ifTrue;
        ifNode.cond.ifFalse = (ifNode.otherwise == null) ? ifend : ifFalse;

        ifNode.cond.accept(this);
        IntValue ifcond = ifNode.cond.intValue;
        Jump jumpend = new Jump(ifend);

        append(ifTrue);

        currentscope = ifNode.scope;
        ifNode.then.accept(this);
        currentscope = currentscope.getEnclosingScope();

        append(jumpend);

        if (ifNode.otherwise != null) {
            append(ifFalse);

            currentscope = ifNode.otherwiseScope;
            ifNode.otherwise.accept(this);
            currentscope = currentscope.getEnclosingScope();

            // false jump end
            append(new Jump(ifend));
        }
        append(ifend);
        return null;
    }

    @Override
    public IRBaseClass visit(IntegerLiteralNode integerLiteralNode) {
        IntImmediate intImmediate = new IntImmediate(integerLiteralNode.val.intValue());
        integerLiteralNode.intValue = intImmediate;
        return null;
    }

    @Override
    public IRBaseClass visit(LiteralNode literalNode) {
        return null;
    }

    @Override
    public IRBaseClass visit(MemberNode memberNode) {
        return null;
    }

    @Override
    public IRBaseClass visit(MemberFuncNode memberFuncNode) {
        return null;
    }

    @Override
    public IRBaseClass visit(NewExpr newExpr) {
        return null;
    }

    @Override
    public IRBaseClass visit(NullNode nullNode) {
        return null;
    }

    @Override
    public IRBaseClass visit(PostOpNode postOpNode) {
        postOpNode.expr.accept(this);
        switch (postOpNode.op) {
            case ADD:
                processSelfIncDec(postOpNode.expr, postOpNode, true, true);
                break;
            case SUB:
                processSelfIncDec(postOpNode.expr, postOpNode, false, true);
                break;
            default:
        }
        return null;
    }

    @Override
    public IRBaseClass visit(ReturnNode returnNode) {
        return null;
    }

    @Override
    public IRBaseClass visit(StmtNode stmtNode) {
        return null;
    }

    @Override
    public IRBaseClass visit(StringLiteralNode stringLiteralNode) {
        return null;
    }

    @Override
    public IRBaseClass visit(ThisNode thisNode) {
        return null;
    }

    @Override
    public IRBaseClass visit(UnaryExprNode unaryExprNode) {
        if (unaryExprNode.op == UnaryOpNode.UnaryOp.LNOT) {
            unaryExprNode.expr.ifTrue = unaryExprNode.ifFalse;
            unaryExprNode.expr.ifFalse = unaryExprNode.ifTrue;
            unaryExprNode.expr.accept(this);
            return null;
        }

        unaryExprNode.expr.accept(this);
        VirtualRegister reg = new VirtualRegister(null);
        switch (unaryExprNode.op) {
            case ADD:
                processSelfIncDec(unaryExprNode.expr, unaryExprNode, true, false);
                break;
            case SUB:
                processSelfIncDec(unaryExprNode.expr, unaryExprNode, false, false);
                break;
            case POS:
                unaryExprNode.intValue = unaryExprNode.expr.intValue;
                break;
            case NEG:
                unaryExprNode.intValue = reg;
                append(new UnaryOperation(reg, UnaryOperation.UnaryOp.NEG, unaryExprNode.expr.intValue));
                break;
            case BNOT:
            default:
                unaryExprNode.intValue = reg;
                append(new UnaryOperation(reg, UnaryOperation.UnaryOp.NOT, unaryExprNode.expr.intValue));
                break;
        }
        return null;
    }

    @Override
    public IRBaseClass visit(VariableDecl variableDecl) {
        VariableSymbol varsym = (VariableSymbol) currentscope.resolve(variableDecl.name);
        VirtualRegister reg = new VirtualRegister(variableDecl.name);
        varmap.put(varsym, reg);
        if (variableDecl.init != null) {
            variableDecl.init.accept(this);
            append(new Move(reg, variableDecl.init.intValue));
        }
        return null;
    }

    @Override
    public IRBaseClass visit(VariableNode variableNode) {
        VirtualRegister reg = new VirtualRegister(variableNode.name);
        variableNode.intValue = reg;
        return null;
    }

    @Override
    public IRBaseClass visit(WhileNode whileNode) {
        Label whilebody = new Label("whilebody");
        Label whilejudge = new Label("whilejudge");
        Label whileend = new Label("whileend");

        Label tmpLoopBreakTarget = curLoopBreakTarget;
        Label tmpLoopContinueTarget = curLoopContinueTarget;

        // init to judge
        append(new Jump(whilejudge));

        // body
        append(whilebody);
        whileNode.body.accept(this);

        curLoopContinueTarget = tmpLoopContinueTarget;
        curLoopBreakTarget = tmpLoopBreakTarget;

        // body to judge
        append(new Jump(whilejudge));

        // judge
        append(whilejudge);
        whileNode.cond.accept(this);
        IntValue whilecond = whileNode.cond.intValue;

        append(new Branch(whilecond, whilebody, whileend));

        append(whileend);
        return null;
    }
}
