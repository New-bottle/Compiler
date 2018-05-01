package AST;

import java.util.List;

public class FuncDeclNode extends StmtNode {
    public Type type;
    public String name;
    public List<VariableDecl> parameters;
    public StmtNode body;
    public FuncDeclNode(Type type, String name, List<VariableDecl> parameters, StmtNode body) {
        this.type = type;
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
