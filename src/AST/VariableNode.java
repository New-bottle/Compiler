package AST;

// variable expression
public class VariableNode extends ExprNode {
    public String name;
    public VariableNode (String name) {
        this.name = name;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
