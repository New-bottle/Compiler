package AST;

import java.util.List;

public class ClassNode extends TypeDefinition {
    public String name;
    public List<VariableDecl> memberv;
    public List<FuncDeclNode> memberf;
    public ClassNode(String name, List<VariableDecl> memberv, List<FuncDeclNode> memberf) {
        this.name = name;
        this.memberv = memberv;
        this.memberf = memberf;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
