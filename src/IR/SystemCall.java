package IR;

public class SystemCall extends IRInstruction {

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
