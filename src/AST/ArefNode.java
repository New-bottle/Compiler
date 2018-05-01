package AST;

// array ref : a[i]
public class ArefNode extends LHSNode {
    public String name;
    public ExprNode iter;
    public ArefNode(String name, ExprNode iter) {
        this.name = name;
        this.iter = iter;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
