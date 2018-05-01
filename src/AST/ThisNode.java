package AST;

public class ThisNode extends ExprNode {
    @Override
    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
