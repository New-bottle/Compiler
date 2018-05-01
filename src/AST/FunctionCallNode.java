package AST;

import java.util.List;

// function call expression
public class FunctionCallNode extends ExprNode {
    public String name;
    public List<ExprNode> parameters;

    public FunctionCallNode(String name, List<ExprNode> parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
