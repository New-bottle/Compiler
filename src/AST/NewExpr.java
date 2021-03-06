package AST;

import java.util.List;

public class NewExpr extends ExprNode {
    public Type type;
    public List<ExprNode> dim;
    public List<SourcePosition> posDim;

    public NewExpr(Type type, List<ExprNode> dim, List<SourcePosition> posDim) {
        this.type = type;
        this.dim = dim;
        this.posDim = posDim;
        if (dim != null)
            for (int i = 0; i < dim.size(); i++) {
                type = new ArrayType(type);
            }
        this.exprType = type;
    }

    @Override
    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
