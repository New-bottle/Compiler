package AST;

public class ExprStmtNode extends StmtNode {
    public ExprNode expr;
    public ExprStmtNode(ExprNode expr) {
        this.expr = expr;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
