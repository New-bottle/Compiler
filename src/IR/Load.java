package IR;

public class Load extends IRInstruction {
    private Register dest;
    private int size;
    public IntValue address;
    public int offset;
    public boolean isStaticData;
    public boolean isLoadAddress;

    public Load(Register dest, int size, IntValue address, int offset) {
        this.dest = dest;
        this.size = size;
        this.address = address;
        this.offset = offset;
        this.isStaticData = false;
    }
    public Load(Register dest, int size, StaticData address, boolean isLoadAddress) {
        this(dest, size, address, 0);
        this.isLoadAddress = isLoadAddress;
        isStaticData = true;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    public int getSize() {
        return size;
    }
}
