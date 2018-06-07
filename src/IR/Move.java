package IR;

public class Move extends IRInstruction {
    private Register dest;
    private IntValue source;

    public Move(Register dest, IntValue source) {
        this.dest = dest;
        this.source = source;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Move : " + dest.toString() + " <= " + source.toString();
    }
}
