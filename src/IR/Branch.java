package IR;

public class Branch extends BranchInstruction {
    private IntValue cond;
    private Label then;
    private Label otherwise;

    public Branch(IntValue cond, Label then, Label otherwise) {
        this.cond = cond;
        this.then = then;
        this.otherwise = otherwise;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
