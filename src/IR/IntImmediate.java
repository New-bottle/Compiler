package IR;

public class IntImmediate extends IntValue {
    private int value;

    public IntImmediate (int value) {
        this.value = value;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    public int getValue() {
        return value;
    }
}
