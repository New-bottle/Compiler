package IR;

public class IRRoot extends IRInstruction {
    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
