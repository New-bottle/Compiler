package IR;

public class UnaryOperation extends IRInstruction {
    public enum UnaryOp {
        NEG, NOT
    }

    private Register dest;
    private UnaryOp op;
    private IntValue operand;

    public UnaryOperation(Register dest, UnaryOp op, IntValue operand) {
        this.dest = dest;
        this.op = op;
        this.operand = operand;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "<Unary : " + dest.toString() + ' ' + op.toString() + ' ' + operand.toString();
    }
}
