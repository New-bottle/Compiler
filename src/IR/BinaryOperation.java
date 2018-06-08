package IR;

public class BinaryOperation extends IRInstruction {
    public enum BinaryOp {
        ADD, SUB, MUL, DIV, MOD,
        SHL, SHR, AND, OR,  XOR
    }

    private Register dest;
    private BinaryOp op;
    private IntValue lhs;
    private IntValue rhs;

    public BinaryOperation(Register dest, BinaryOp op, IntValue lhs, IntValue rhs) {
        super();
        this.dest = dest;
        this.op = op;
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return dest.toString() + '='
                + lhs.toString() + ' '
                + op.toString() + ' '
                + rhs.toString();
    }
}
