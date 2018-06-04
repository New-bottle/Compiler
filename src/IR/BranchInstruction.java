package IR;

public class BranchInstruction extends IRInstruction {
    public BranchInstruction(IRInstruction prev, IRInstruction next) {
        super(prev, next);
    }

    public BranchInstruction() {}

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
