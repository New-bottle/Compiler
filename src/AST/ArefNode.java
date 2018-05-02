package AST;

// array ref : a[i]
public class ArefNode extends ExprNode {
    public ExprNode name;
    public ExprNode iter;
    public ArefNode(ExprNode name, ExprNode iter) {
        this.name = name;
        this.iter = iter;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
