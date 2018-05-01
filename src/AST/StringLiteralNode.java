package AST;

public class StringLiteralNode extends LiteralNode {
    public String name;
    public StringLiteralNode(String name) {
        this.name = name;
    }
    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
