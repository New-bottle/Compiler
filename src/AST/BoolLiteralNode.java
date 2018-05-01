package AST;

public class BoolLiteralNode extends LiteralNode{
    public String name;
    public boolean val;
    public BoolLiteralNode(String s) {
        this.name = s;
        val = (s == "true");
    }

    @Override
    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
