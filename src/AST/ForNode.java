package AST;

public class ForNode extends StmtNode{
    public ExprNode init;
    public VariableDecl initWithDecl;
    public ExprNode cond;
    public ExprNode iter;
    public StmtNode body;

    public ForNode(ExprNode init, VariableDecl initWithDecl, ExprNode cond, ExprNode iter, StmtNode body) {
        this.init = init;
        this.initWithDecl = initWithDecl;
        this.cond = cond;
        this.iter = iter;
        this.body = body;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
