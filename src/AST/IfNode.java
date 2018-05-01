package AST;

public class IfNode extends StmtNode {
    public ExprNode cond;
    public StmtNode then;
    public StmtNode otherwise;
    public IfNode(ExprNode cond, StmtNode then, StmtNode otherwise) {
        this.cond = cond;
        this.then = then;
        this.otherwise = otherwise;
    }

    @Override
    public Object accept(ASTVisitor visitor) { visitor.visit(this);
        return null;
    }
}
