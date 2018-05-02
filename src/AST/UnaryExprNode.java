package AST;

public class UnaryExprNode extends UnaryOpNode {
    public UnaryOp op;
    public ExprNode expr;

    public UnaryExprNode(UnaryOp op, ExprNode expr) {
        this.op = op;
        this.expr = expr;
        if (op == UnaryOp.ADD || op == UnaryOp.SUB) this.isLvalue = true;
        else this.isLvalue = false;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
