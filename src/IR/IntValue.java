package IR;

public abstract class IntValue extends IRBaseClass {
    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
