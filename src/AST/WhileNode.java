package AST;

public class WhileNode extends StmtNode {
    public ExprNode cond;
    public StmtNode body;
    public WhileNode(ExprNode cond, StmtNode body) {
        this.cond = cond;
        this.body = body;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
