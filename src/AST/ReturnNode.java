package AST;

public class ReturnNode extends StmtNode {
    public ExprNode expr;

    public ReturnNode(ExprNode expr) {
        this.expr = expr;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
