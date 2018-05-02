package AST;

// member of class : s.memb
public class MemberNode extends ExprNode {
    public ExprNode expr;
    public String name;
    public MemberNode(ExprNode expr, String name) {
        this.expr = expr;
        this.name = name;
        this.isLvalue = true;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
