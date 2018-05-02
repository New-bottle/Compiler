package AST;

public class PostOpNode extends UnaryOpNode {
    public UnaryOp op;
    public ExprNode expr;
    public PostOpNode(ExprNode expr, UnaryOp op) {
        this.expr = expr;
        this.op = op;
        this.isLvalue = false;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
