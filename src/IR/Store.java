package IR;

public class Store extends IRInstruction {
    private int size;
    public IntValue address;
    public int offset;
    private IntValue value;
    public boolean isStaticData;

    public Store(IntValue value, int size, IntValue address, int offset) {
        this.size = size;
        this.address = address;
        this.offset = offset;
        this.value = value;
        this.isStaticData = false;
    }

    public Store(IntValue value, int size, StaticData address) {
        this(value, size, address, 0);
        isStaticData = true;
    }
    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "[Store] :" + size + " (" + address + '+' + offset + ") = " + value + "; " + isStaticData;
    }
}
