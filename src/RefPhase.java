import AST.*;
import Symbols.*;
import Exception.*;

import static Symbols.Symbol.getType;

public class RefPhase<T> implements ASTVisitor<T> {
    public Scope currentScope;
    public int inloop;

    public RefPhase (Scope currentScope) {
        this.currentScope = currentScope;
        inloop = 0;
    }

    @Override
    public T visit(AST node) {
        for (int i = 0; i < node.classes.size(); i++) {
            visit(node.classes.get(i));
        }
        for (int i = 0; i < node.vars.size(); i++) {
            visit(node.vars.get(i));
        }
        for (int i = 0; i < node.funcs.size(); i++) {
            visit(node.funcs.get(i));
        }
        return null;
    }

    @Override
    public T visit(ArefNode arefNode) {
        TypeSymbol typeSymbol = (TypeSymbol) currentScope.resolve(arefNode.name.exprType);
        return null;
    }

    @Override
    public T visit(ArrayType arrayType) {
        currentScope.resolve(arrayType.baseType);
        return null;
    }

    @Override
    public T visit(BinaryOpNode binaryOpNode) {
        binaryOpNode.left.accept(this);
        binaryOpNode.right.accept(this);
        if (!binaryOpNode.left.exprType.equals(binaryOpNode.right.exprType)) {
            String err = '(' + binaryOpNode.left.exprType.getType().name() + " "
                    + binaryOpNode.right.exprType.getType().name() + ')';
            throw new TypeError("BinaryOp : " + err);
        }
        if (!binaryOpNode.left.exprType.equals(Symbol.Types.INT) &&
                !binaryOpNode.left.exprType.equals(Symbol.Types.STRING) &&
                !binaryOpNode.left.exprType.equals(Symbol.Types.BOOL)) {
            throw new TypeError("BinaryOp computing non-builtin type.");
        }
        binaryOpNode.exprType = binaryOpNode.left.exprType;
        return null;
    }

    @Override
    public T visit(BlockNode blockNode) {
        for (int i = 0; i < blockNode.stmts.size(); i++) {
            blockNode.stmts.get(i).accept(this);
        }
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
        ClassTypeSymbol classTypeSymbol =
                (ClassTypeSymbol) currentScope.resolve(classNode.name);
//        classTypeSymbol.members = classNode.scope;
        classNode.scope = new LocalScope(classNode.name, currentScope);
        currentScope = classNode.scope;

        for (int i = 0; i < classNode.memberv.size(); i++) {
            classNode.memberv.get(i).accept(this);
        }
        for (int i = 0; i < classNode.memberf.size(); i++) {
            classNode.memberf.get(i).accept(this);
        }
        currentScope = currentScope.getEnclosingScope();
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
        exprStmtNode.expr.accept(this);
        return null;
    }

    @Override
    public T visit(ForNode forNode) {
        if (forNode.initWithDecl != null) visit(forNode.initWithDecl);
        else visit(forNode.init);
        inloop ++;
        visit(forNode.cond);
        visit(forNode.iter);
        visit(forNode.body);
        inloop --;
        return null;
    }

    @Override
    public T visit(FuncDeclNode funcDeclNode) {
        if (currentScope.getEnclosingScope() != null) { // class member func
            TypeSymbol returnTypeSymbol = (TypeSymbol) currentScope.resolve(funcDeclNode.type);
            FunctionTypeSymbol funcSymbol = new FunctionTypeSymbol(returnTypeSymbol, funcDeclNode.name);
            currentScope.define(funcDeclNode.name, funcSymbol);
        }
        FunctionTypeSymbol funcSymbol =
                (FunctionTypeSymbol)currentScope.resolve(funcDeclNode.name);
        funcDeclNode.scope = new LocalScope(funcDeclNode.name, currentScope);
        currentScope = funcDeclNode.scope;
        if (funcDeclNode.parameters != null) {
            for (int i = 0; i < funcDeclNode.parameters.size(); i++) {
                VariableDecl vard = funcDeclNode.parameters.get(i);
                TypeSymbol typeSymbol = (TypeSymbol) currentScope.resolve(vard.type);
                currentScope.define(vard.name, typeSymbol);
                funcSymbol.addArg(typeSymbol, vard.name);
            }
        }

        funcDeclNode.body.accept(this);
        currentScope = currentScope.getEnclosingScope();
        return null;
    }

    @Override
    public T visit(FunctionCallNode functionCallNode) {
        if (currentScope.resolve(functionCallNode.name) == null) {
            throw new RuntimeException("FunctionCall failed: No such symbol.");
        }
        if (currentScope.resolve(functionCallNode.name).type != Symbol.Types.FUNCTION) {
            throw new RuntimeException("FunctionCall failed: Symbol is not a function.");
        }
        return null;
    }

    @Override
    public T visit(FunctionType functionType) {
        return null;
    }

    @Override
    public T visit(IfNode ifNode) {
        visit(ifNode.cond);
        if (ifNode.cond.exprType.getType() != Symbol.Types.BOOL) {
            throw new TypeError("Need a boolean expression but got a : "+ifNode.cond.exprType.getType().name());
        }
        visit(ifNode.then);
        visit(ifNode.otherwise);
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
            classTypeSymbol.members.resolve(memberNode.name);
        } catch (RuntimeException e) {
            throw new MemberError(classTypeSymbol.name+" don't have member var " + memberNode.name);
        }
        return null;
    }

    @Override
    public T visit(MemberFuncNode memberFuncNode) {
        ClassTypeSymbol classTypeSymbol =
                (ClassTypeSymbol)currentScope.resolve(memberFuncNode.expr.exprType);
        try {
            classTypeSymbol.members.resolve(memberFuncNode.name);
        } catch (RuntimeException e) {
            throw new MemberError(classTypeSymbol.name+" don't have member func " + memberFuncNode.name);
        }
        return null;
    }

    @Override
    public T visit(NewExpr newExpr) {
        newExpr.type.accept(this);
        return null;
    }

    @Override
    public T visit(PostOpNode postOpNode) {
        visit(postOpNode.expr);
        return null;
    }

    @Override
    public T visit(ReturnNode returnNode) {
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
        return null;
    }

    @Override
    public T visit(TypeDefinition typeDefinition) {
        return null;
    }

    @Override
    public T visit(UnaryExprNode unaryExprNode) {
        visit(unaryExprNode.expr);
        return null;
    }

    @Override
    public T visit(VariableDecl variableDecl) {
        TypeSymbol typeSymbol = (TypeSymbol) currentScope.resolve(variableDecl.type);
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
            throw new TypeError("Need a boolean expression but got a : "+whileNode.cond.exprType.getType().name());
        }
        visit(whileNode.body);
        inloop --;
        return null;
    }
}
