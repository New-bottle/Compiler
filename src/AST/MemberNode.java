package AST;

// member of class : s.memb
public class MemberNode extends LHSNode {
    public ExprNode expr;
    public String name;
    public MemberNode(ExprNode expr, String name) {
        this.expr = expr;
        this.name = name;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
