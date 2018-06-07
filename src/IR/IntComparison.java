package IR;

public class IntComparison extends IRInstruction {
    public enum Condition {
        EQ, NE, GT, GE, LT, LE
    }
    private Register dest;
    private Condition cond;
    private IntValue lhs;
    private IntValue rhs;

    public IntComparison(Register dest, Condition cond, IntValue lhs, IntValue rhs) {
        super();
        this.dest = dest;
        this.cond = cond;
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
                + cond.toString() + ' '
                + rhs.toString();
    }
}
