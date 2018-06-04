package IR;

public class Label extends IRInstruction {
    public String name;
    public Label(String name) {
        this.name = name;
    }
    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return "<Label: " + this.name + ">";
    }
}
