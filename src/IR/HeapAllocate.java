package IR;

public class HeapAllocate extends IRInstruction {
    private Register dest;
    private IntValue allocSize;

    public HeapAllocate(VirtualRegister dest, IntValue allocSize) {
        this.dest = dest;
        this.allocSize = allocSize;
    }
    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "[Heap Allocate] :" + dest.toString() + ' ' + allocSize.toString();
    }
}
