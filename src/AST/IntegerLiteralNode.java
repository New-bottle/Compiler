package AST;

public class IntegerLiteralNode extends LiteralNode {
    public String name;
    public int val;
    public IntegerLiteralNode(String name) {
        this.name = name;
        val = Integer.valueOf(name);
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
