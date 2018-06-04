package IR;

public class Jump extends BranchInstruction {
    private Label target;
    public Jump(Label target) {
        this.target = target;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
