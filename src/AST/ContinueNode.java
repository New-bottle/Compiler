package AST;

public class ContinueNode extends StmtNode {
    public ContinueNode() {}

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
