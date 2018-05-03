package SemanticCheck;

import AST.*;
import Symbols.*;
import Exception.*;

import java.util.*;

import static Symbols.Symbol.getType;

public class LastPhase<T> implements ASTVisitor<T> {
    public Scope currentScope;
    public int inloop;
    public Type funcReturnType;
    public boolean newBlockScope;
    public Type thisType;
    private List<Type> BuiltInTypeTable;

    public LastPhase(Scope currentScope) {
        this.currentScope = currentScope;
        this.funcReturnType = null;
        this.thisType = null;
        inloop = 0;
        newBlockScope = true;
        BuiltInTypeTable = new ArrayList<Type>();
        BuiltInTypeTable.add(new BuiltInType(Symbol.Types.INT));
        BuiltInTypeTable.add(new BuiltInType(Symbol.Types.BOOL));
        BuiltInTypeTable.add(new ClassType("string"));
    }

    @Override
    public T visit(AST node) {
        for (int i = 0; i < node.comps.size(); i++) {
            node.comps.get(i).accept(this);
        }
        Symbol main = currentScope.resolve("main");
        if (!(main instanceof FunctionTypeSymbol)) {
            throw new MainError("Program don't have a Main Function!");
        }
        if (((FunctionTypeSymbol)main).argNames.size() != 0) {
            throw new MainError("Main Function shouldn't have args!");
        }
        if (!((FunctionTypeSymbol)main).returnType.equals(new BuiltInTypeSymbol(Symbol.Types.INT))) {
            throw new MainError("Main Function should return an INT!");
        }
        return null;
    }

    @Override
    public T visit(ArefNode arefNode) {
        arefNode.name.accept(this);
        if (!(currentScope.resolve(arefNode.name.exprType) instanceof ArraySymbol)) {
            throw new TypeError(arefNode.name.toString() + " is not an array.");
        }
//        ArraySymbol arraySymbol = (ArraySymbol) currentScope.resolve(arefNode.name.exprType);
        arefNode.exprType = ((ArrayType)arefNode.name.exprType).baseType;
        return null;
    }

    @Override
    public T visit(ArrayType arrayType) {
        if (arrayType.baseType.getType() == Symbol.Types.VOID) {
            throw new TypeError("Can't make array of VOID.");
        }
        currentScope.resolve(arrayType.baseType);
        return null;
    }

    @Override
    public T visit(BinaryOpNode binaryOpNode) {
        binaryOpNode.left.accept(this);
        binaryOpNode.right.accept(this);

        Type typel = binaryOpNode.left.exprType;
        Type typer = binaryOpNode.right.exprType;
        if (binaryOpNode.op == BinaryOpNode.BinaryOp.ASSIGN) {
            if (!binaryOpNode.left.isLvalue) {
                throw new AssignError(binaryOpNode.left.toString() +" is not a Lvalue.");
            }
            if (!typel.equals(typer)) {
                if (typer.getType() != Symbol.Types.NULL) {
                    String err = '(' + typel.toString() + " " + binaryOpNode.op.name() + " "
                            + typer.toString() + ')';
                    throw new TypeError("BinaryOp : " + err);
                } else {
                    Symbol.Types type1 = typel.getType();
                    Symbol.Types type2 = typer.getType();

                    if (BuiltInTypeTable.contains(typel))
                        throw new TypeError("Can't assign null to a " + typel.getType().name() + " variable.");
                }
            }
        } else if (binaryOpNode.op == BinaryOpNode.BinaryOp.EQ || binaryOpNode.op == BinaryOpNode.BinaryOp.NE) {
            if (!typel.equals(typer)) {
                if (typer.getType() != Symbol.Types.NULL) {
                    String err = '(' + typel.getType().name() + " " + binaryOpNode.op.name() + " "
                            + typer.getType().name() + ')';
                    throw new TypeError("BinaryOp : " + err);
                } else {
                    if (BuiltInTypeTable.contains(typel))
                        throw new TypeError("Can't compare null equals to a " + typel.getType().name() + " variable.");
                }
            }
        } else {
            if (!typel.equals(typer)) {
                String err = '(' + typel.getType().name() + " " + binaryOpNode.op.name() + " "
                        + typer.getType().name() + ')';
                throw new TypeError("BinaryOp : " + err);
            }
            if (!BuiltInTypeTable.contains(typel)) {
                throw new TypeError("BinaryOp computing "+ binaryOpNode.op.name() +" non-builtin type.");
            }
        }
        switch (binaryOpNode.op) {
            case LOR:case LAND:
                if (!typel.equals(new BuiltInType(Symbol.Types.BOOL)))
                    throw new TypeError("Can only do " + binaryOpNode.op.name() + " on BOOL.");
                break;
            case NE:case EQ:case ASSIGN:
                break;
            case ADD:case GE:case GT:case LE:case LT:
                if (!typel.equals(new BuiltInType(Symbol.Types.INT)) && !typel.equals(new ClassType("string")))
                    throw new TypeError("Can only do " + binaryOpNode.op.name() + " with INT or string.");
                break;
            default:
                if (!typel.equals(new BuiltInType(Symbol.Types.INT)))
                    throw new TypeError("Can only do " + binaryOpNode.op.name() + " with INT.");
                break;
//            case ADD:case SUB:case MUL:case DIV:case MOD:case AND:case OR:case LT:case LE:case GT:case GE:case XOR:case SHL:case SHR:
        }
        switch (binaryOpNode.op) {
            case EQ: case GE: case GT:case LE:case LT:case NE:case LAND:case LOR:
                binaryOpNode.exprType = new BuiltInType(Symbol.Types.BOOL); break;
            default:
                binaryOpNode.exprType = typel;
        }
        return null;
    }

    @Override
    public T visit(BlockNode blockNode) {
        boolean built = false;
        if (newBlockScope == true) {
            blockNode.scope = new LocalScope("Block", currentScope);
            currentScope = blockNode.scope;
            built = true;
        } else {
            newBlockScope = true;
        }

        for (int i = 0; i < blockNode.stmts.size(); i++) {
            blockNode.stmts.get(i).accept(this);
        }
        if (built) {
            currentScope = currentScope.getEnclosingScope();
        }
        return null;
    }

    @Override
    public T visit(BoolLiteralNode boolLiteralNode) {
        boolLiteralNode.exprType = new BuiltInType(Symbol.Types.BOOL);
        return null;
    }

    @Override
    public T visit(BreakNode breakNode) {
        if (inloop == 0) {
            throw new JumpError("Not in a loop, can't break.");
        }
        return null;
    }

    @Override
    public T visit(BuiltInType builtInType) {
        return null;
    }

    @Override
    public T visit(ClassNode classNode) {
        thisType = getType(currentScope.resolve(classNode.name));
        currentScope = classNode.scope;
        for (int i = 0; i < classNode.memberf.size(); i++) {
            classNode.memberf.get(i).accept(this);
        }
        currentScope = currentScope.getEnclosingScope();
        thisType = null;
        return null;
    }

    @Override
    public T visit(ClassType classType) { //currentScope.resolve(classType.name);
        return null;
    }

    @Override
    public T visit(ContinueNode continueNode) {
        if (inloop == 0) {
            throw new JumpError("Not in a loop, can't continue,");
        }
        return null;
    }

    @Override
    public T visit(ExprNode exprNode) {
        return null;
    }

    @Override
    public T visit(ExprStmtNode exprStmtNode) {
        if (exprStmtNode.expr != null)
            exprStmtNode.expr.accept(this);
        return null;
    }

    @Override
    public T visit(ForNode forNode) {
        if (forNode.initWithDecl != null) {
            newBlockScope = false;
            forNode.initWithDecl.accept(this);
        } else if (forNode.init != null) {
            forNode.init.accept(this);
        }
        inloop ++;
        if (forNode.cond != null) {
            forNode.cond.accept(this);
            if (forNode.cond.exprType.getType() != Symbol.Types.BOOL) {
                throw new TypeError("Need a boolean expression but got a : "+forNode.cond.exprType.toString());
            }
        }
        if (forNode.iter != null)
            forNode.iter.accept(this);
        forNode.body.accept(this);
        inloop --;
        if (forNode.initWithDecl != null)
            newBlockScope = true;
        return null;
    }

    @Override
    public T visit(FuncDeclNode funcDeclNode) {
        newBlockScope = false;
        funcReturnType = funcDeclNode.type;
        if (currentScope.getEnclosingScope() != null) { // class member func
            currentScope = funcDeclNode.scope;
            funcDeclNode.body.accept(this);
            currentScope = currentScope.getEnclosingScope();
            funcReturnType = null;
            return null;
        }
        FunctionTypeSymbol funcSymbol =
                (FunctionTypeSymbol)currentScope.resolve(funcDeclNode.name);
        funcDeclNode.scope = new LocalScope(funcDeclNode.name, currentScope);
        currentScope = funcDeclNode.scope;
        if (funcDeclNode.parameters != null) {
            for (int i = 0; i < funcDeclNode.parameters.size(); i++) {
                VariableDecl vard = funcDeclNode.parameters.get(i);
                TypeSymbol typeSymbol = (TypeSymbol) currentScope.resolve(vard.type);
                currentScope.define(vard.name, new VariableSymbol(typeSymbol, vard.name));
                funcSymbol.addArg(typeSymbol, vard.name);
            }
        }

        funcDeclNode.body.accept(this);
        currentScope = currentScope.getEnclosingScope();
        funcReturnType = null;
        return null;
    }

    @Override
    public T visit(FunctionCallNode functionCallNode) {
        Symbol sym = currentScope.resolve(functionCallNode.name);
        if (sym == null) {
            throw new RuntimeException("FunctionCall failed: No such symbol.");
        }
        if (sym.type != Symbol.Types.FUNCTION) {
            throw new RuntimeException("FunctionCall failed: Symbol is not a function.");
        }
        FunctionTypeSymbol funcSymbol = (FunctionTypeSymbol) sym;
        int need = funcSymbol.argTypes.size();
        int have = 0;
        if (functionCallNode.parameters != null) {
            have = functionCallNode.parameters.size();
            if (need != have) {
                throw new FunctionCallError("Need " + need + " parameter(s) but got " + have + "." );
            }
            for (int i = 0; i < functionCallNode.parameters.size(); i++) {
                functionCallNode.parameters.get(i).accept(this);
                Type type1 = getType(funcSymbol.argTypes.get(i));
                Type type2 = functionCallNode.parameters.get(i).exprType;
                if (!type1.equals(type2)) {
                    if (BuiltInTypeTable.contains(type1) || type2.getType() != Symbol.Types.NULL) {
                        throw new TypeError("Function parameter type error when calling " + functionCallNode.name);
                    }
                }
            }
        }
        if (need != have) {
            throw new FunctionCallError("Need " + need + " parameter(s) but got " + have + "." );
        }
        functionCallNode.exprType = getType(funcSymbol.returnType);
        return null;
    }

    @Override
    public T visit(FunctionType functionType) {
        return null;
    }

    @Override
    public T visit(IfNode ifNode) {
        ifNode.cond.accept(this);
        if (ifNode.cond.exprType.getType() != Symbol.Types.BOOL) {
            throw new TypeError("Need a boolean expression but got a : "+ifNode.cond.exprType.getType().name());
        }

        newBlockScope = false;
        ifNode.scope = new LocalScope("IfthenScope", currentScope);
        currentScope = ifNode.scope;
        ifNode.then.accept(this);
        currentScope = currentScope.getEnclosingScope();
        newBlockScope = true;

        if (ifNode.otherwise != null) {
            newBlockScope = false;
            ifNode.otherwiseScope = new LocalScope("IfotherwiseScope", currentScope);
            currentScope = ifNode.otherwiseScope;
            ifNode.otherwise.accept(this);
            currentScope = currentScope.getEnclosingScope();
            newBlockScope = true;
        }
        return null;
    }

    @Override
    public T visit(IntegerLiteralNode integerLiteralNode) {
        return null;
    }

    @Override
    public T visit(LiteralNode literalNode) {
        return null;
    }

    @Override
    public T visit(MemberNode memberNode) {
        memberNode.expr.accept(this);
        ClassTypeSymbol classTypeSymbol =
                (ClassTypeSymbol)currentScope.resolve(memberNode.expr.exprType);
        try {
            classTypeSymbol.members.find(memberNode.name);
        } catch (RuntimeException e) {
            throw new MemberError(classTypeSymbol.name+" don't have member var " + memberNode.name);
        }
        memberNode.exprType = getType(classTypeSymbol.members.find(memberNode.name));
        return null;
    }

    @Override
    public T visit(MemberFuncNode memberFuncNode) {
        memberFuncNode.expr.accept(this);
        Symbol sym = currentScope.resolve(memberFuncNode.expr.exprType);
        if (sym instanceof ClassTypeSymbol) {
            ClassTypeSymbol classTypeSymbol = (ClassTypeSymbol) sym;
            try {
                classTypeSymbol.members.find(memberFuncNode.name);
            } catch (RuntimeException e) {
                throw new MemberError(classTypeSymbol.name + " don't have member func " + memberFuncNode.name);
            }
            memberFuncNode.exprType = getType(classTypeSymbol.members.find(memberFuncNode.name));
        } else {
            ArraySymbol arraySymbol = (ArraySymbol) sym;
            try {
                arraySymbol.members.find(memberFuncNode.name);
            } catch (RuntimeException e) {
                throw new MemberError("Array don't have this member function " + memberFuncNode.name);
            }
            memberFuncNode.exprType = new BuiltInType(Symbol.Types.INT);
        }
        return null;
    }

    @Override
    public T visit(NewExpr newExpr) {
        newExpr.type.accept(this);
        if (newExpr.type.getType() == Symbol.Types.VOID) {
            throw new TypeError("Can't new a variable of void.");
        }
        return null;
    }

    @Override
    public T visit(NullNode nullNode) {
        return null;
    }

    @Override
    public T visit(PostOpNode postOpNode) {
        postOpNode.expr.accept(this);
        if (!postOpNode.expr.isLvalue) {
            throw new AssignError("PostOp " + postOpNode.expr.toString()+" is not a L value.");
        }
        if (postOpNode.expr.exprType.getType() != Symbol.Types.INT) {
            throw new TypeError("Can't do Post ++/-- on a non-INT.");
        }
        postOpNode.exprType = postOpNode.expr.exprType;
        return null;
    }

    @Override
    public T visit(ReturnNode returnNode) {
        if (funcReturnType == null) {
            throw new JumpError("Not in a function, can't return!");
        }
        if (returnNode.expr == null) {
            if (funcReturnType.getType() != Symbol.Types.VOID) {
                throw new TypeError("Function return type error!");
            }
        } else {
            returnNode.expr.accept(this);
            if (!funcReturnType.equals(returnNode.expr.exprType)) {
                if (BuiltInTypeTable.contains(funcReturnType) || returnNode.expr.exprType.getType() != Symbol.Types.NULL) {
                    throw new TypeError("Function return type error!");
                }
            }
        }
        return null;
    }

    @Override
    public T visit(StmtNode stmtNode) {
        return null;
    }

    @Override
    public T visit(StringLiteralNode stringLiteralNode) {
        return null;
    }

    @Override
    public T visit(ThisNode thisNode) {
        thisNode.exprType = thisType;
        return null;
    }

    @Override
    public T visit(UnaryExprNode unaryExprNode) {
        unaryExprNode.expr.accept(this);
        switch (unaryExprNode.op) {
            case ADD: case SUB:
                if (!unaryExprNode.expr.isLvalue) {
                    throw new AssignError("Can't do Prev ++/-- to a non-Lvalue.");
                }
                if (unaryExprNode.expr.exprType.getType() != Symbol.Types.INT) {
                    throw new TypeError("Can't do Prev ++/-- on a non-INT.");
                }
                break;
            case NEG:case POS:case BNOT:
                if (unaryExprNode.expr.exprType.getType() != Symbol.Types.INT) {
                    throw new TypeError("Can't do Prev +/-/~ on a non-INT.");
                }
                break;
            case LNOT:
                if (unaryExprNode.expr.exprType.getType() != Symbol.Types.BOOL) {
                    throw new TypeError("Can't do Prev ! on a non-BOOL.");
                }
                break;
        }
        unaryExprNode.isLvalue = false;
        unaryExprNode.exprType = unaryExprNode.expr.exprType;
        return null;
    }

    @Override
    public T visit(VariableDecl variableDecl) {
        variableDecl.type.accept(this);
        TypeSymbol typeSymbol = (TypeSymbol) currentScope.resolve(variableDecl.type);
        if (typeSymbol.type == Symbol.Types.VOID) {
            throw new TypeError("Can't make a variable of void.");
        }
        if (variableDecl.init != null) {
            variableDecl.init.accept(this);
            if (!variableDecl.init.exprType.equals(variableDecl.type)) {
                if (BuiltInTypeTable.contains(variableDecl.type) || variableDecl.init.exprType.getType() != Symbol.Types.NULL)
                    throw new TypeError("Initial expr's type doesn't match.");
            }
        }
        currentScope.define(variableDecl.name, new VariableSymbol(typeSymbol, variableDecl.name));
        return null;
    }

    @Override
    public T visit(VariableNode variableNode) {
        if (!(currentScope.resolve(variableNode.name) instanceof VariableSymbol))
            throw new TypeError("This symbol is not a var : " + variableNode.name);
        variableNode.exprType = getType(((VariableSymbol) currentScope.resolve(variableNode.name)).returntype);
        return null;
    }

    @Override
    public T visit(WhileNode whileNode) {
        inloop ++;
        whileNode.cond.accept(this);
        if (whileNode.cond.exprType.getType() != Symbol.Types.BOOL) {
            throw new TypeError("Need a boolean expression but got a : "+whileNode.cond.exprType.toString());
        }
        whileNode.scope = new LocalScope("whileScope", currentScope);
        currentScope = whileNode.scope;
        newBlockScope = false;
        whileNode.body.accept(this);
        newBlockScope = true;
        currentScope = currentScope.getEnclosingScope();
        inloop --;
        return null;
    }
}
