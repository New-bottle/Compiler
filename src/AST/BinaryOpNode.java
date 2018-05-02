package AST;

public class BinaryOpNode extends ExprNode {

    public enum BinaryOp {
        ASSIGN,
        LOR, LAND,
        OR, AND, XOR,
        EQ, NE, LT, GT, LE, GE,
        SHL, SHR,
        ADD, SUB,
        MUL, DIV, MOD
    }

    public final BinaryOp op;
    public ExprNode left, right;
    public Type type;

    public BinaryOpNode(BinaryOp op, ExprNode left, ExprNode right) {
        this.op = op;
        this.left = left;
        this.right = right;
        if (op == BinaryOp.ASSIGN) this.isLvalue = true;
        else this.isLvalue = false;
    }


    public Type type() {
        return (type != null) ? type : left.exprType;
    }

    @Override
    public Object accept(ASTVisitor visitor) { visitor.visit(this);
        return null;
    }
}
