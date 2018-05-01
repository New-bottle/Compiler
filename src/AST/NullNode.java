package AST;

public class NullNode extends LiteralNode {
    public String name;
    public NullNode() {
        this.name = "null";
    }

    @Override
    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
