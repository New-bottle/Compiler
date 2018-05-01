package AST;

public class BreakNode extends StmtNode {
    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
