package AST;

public class UnaryExprNode extends UnaryOpNode {
    public UnaryOp op;
    public ExprNode expr;

    public UnaryExprNode(UnaryOp op, ExprNode expr) {
        this.op = op;
        this.expr = expr;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
