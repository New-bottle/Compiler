import AST.*;
import Symbols.*;

public class RefPhase<T> implements ASTVisitor<T> {
    public Scope currentScope;

    public RefPhase (Scope currentScope) {
        this.currentScope = currentScope;
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
    public T visit(BreakNode breakNode) {
        return null;
    }

    @Override
    public T visit(BuiltInType builtInType) {
        return null;
    }

    @Override
    public T visit(ClassNode classNode) {
        currentScope = classNode.scope;

        currentScope = currentScope.getEnclosingScope();
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
    public T visit(TypeDefinition typeDefinition) {
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
