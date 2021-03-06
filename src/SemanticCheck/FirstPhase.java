package SemanticCheck;

import AST.*;
import Symbols.*;

public class FirstPhase<T> implements ASTVisitor<T> {
    public Scope currentScope;

    public FirstPhase(Scope currentScope) {
        this.currentScope = currentScope;
    }

    @Override
    public T visit(AST node) {
        for (int i = 0; i < node.classes.size(); i++) {
            visit(node.classes.get(i));
        }
        for (int i = 0; i < node.funcs.size(); i++) {
            visit(node.funcs.get(i));
        }
        return null;
    }

    @Override
    public T visit(ArefNode arefNode) {
        return null;
    }

    @Override
    public T visit(ArrayType arrayType) {
        return null;
    }

    @Override
    public T visit(BinaryOpNode binaryOpNode) {
        return null;
    }

    @Override
    public T visit(BlockNode blockNode) {
        return null;
    }

    @Override
    public T visit(BoolLiteralNode boolLiteralNode) {
        return null;
    }

    @Override
    public T visit(BreakNode breakNode) {
        return null;
    }

    @Override
    public T visit(BuiltInType builtInType) {
        return null;
    }

    @Override
    public T visit(ClassNode classNode) {
        currentScope.define(classNode.name, new ClassTypeSymbol(classNode.name));
        return null;
    }

    @Override
    public T visit(ClassType classType) {
        return null;
    }

    @Override
    public T visit(ContinueNode continueNode) {
        return null;
    }

    @Override
    public T visit(ExprNode exprNode) {
        return null;
    }

    @Override
    public T visit(ExprStmtNode exprStmtNode) {
        return null;
    }

    @Override
    public T visit(ForNode forNode) {
        return null;
    }

    @Override
    public T visit(FuncDeclNode funcDeclNode) {
        TypeSymbol returnTypeSymbol = (TypeSymbol) currentScope.resolve(funcDeclNode.type);
//        TypeSymbol returnTypeSymbol = (TypeSymbol) funcDeclNode.type.accept(this);
        FunctionTypeSymbol funcSymbol = new FunctionTypeSymbol(returnTypeSymbol, funcDeclNode.name);
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
        currentScope = currentScope.getEnclosingScope();
        currentScope.define(funcDeclNode.name, funcSymbol);
        return null;
    }

    @Override
    public T visit(FunctionCallNode functionCallNode) {
        return null;
    }

    @Override
    public T visit(FunctionType functionType) {
        return null;
    }

    @Override
    public T visit(IfNode ifNode) {
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
        return null;
    }

    @Override
    public T visit(MemberFuncNode memberFuncNode) {
        return null;
    }

    @Override
    public T visit(NewExpr newExpr) {
        return null;
    }

    @Override
    public T visit(NullNode nullNode) {
        return null;
    }

    @Override
    public T visit(PostOpNode postOpNode) {
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
    public T visit(UnaryExprNode unaryExprNode) {
        return null;
    }

    @Override
    public T visit(VariableDecl variableDecl) {
        return null;
    }

    @Override
    public T visit(VariableNode variableNode) {
        return null;
    }

    @Override
    public T visit(WhileNode whileNode) {
        return null;
    }
}
