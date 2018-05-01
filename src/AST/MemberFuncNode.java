package AST;

import java.util.List;

// member of class : s.memb()
public class MemberFuncNode extends ExprNode {
    public ExprNode expr;
    public String name;
    public List<ExprNode> parameters;
    public MemberFuncNode(ExprNode expr, String name) {
        this.expr = expr;
        this.name = name;
        this.parameters = null;
    }
    public MemberFuncNode(ExprNode expr, String name, List<ExprNode> parameters) {
        this.expr = expr;
        this.name = name;
        this.parameters = parameters;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
