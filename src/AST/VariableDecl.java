package AST;

public class VariableDecl extends StmtNode {
    public Type type;
    public String name;
    public ExprNode init;
    public VariableDecl(Type type, String name, ExprNode init) {
        this.type = type;
        this.name = name;
        this.init = init;
    }
    public VariableDecl(Type type, String name) {
        this.type = type;
        this.name = name;
        this.init = null;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
