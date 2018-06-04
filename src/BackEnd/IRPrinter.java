package BackEnd;

import IR.*;

public class IRPrinter implements IRVisitor {
    private void printnext(IRInstruction irInstruction) {
        if (irInstruction.next != null)
            irInstruction.next.accept(this);
    }
    @Override
    public void visit(BinaryOperation binaryOperation) {
        System.out.println(binaryOperation.toString());
        printnext(binaryOperation);
    }

    @Override
    public void visit(Branch branch) {
        System.out.println(branch.toString());
        printnext(branch);
    }

    @Override
    public void visit(BranchInstruction branchInstruction) {

    }

    @Override
    public void visit(Function function) {

    }

    @Override
    public void visit(IntValue intValue) {

    }

    @Override
    public void visit(IRBaseClass irBaseClass) {

    }

    @Override
    public void visit(IRInstruction irInstruction) {
        if (irInstruction == null) return;
        if (irInstruction.next != null)
            irInstruction.next.accept(this);
    }

    @Override
    public void visit(Jump jump) {

    }

    @Override
    public void visit(Label label) {
        System.out.println(label.toString());
        printnext(label);
    }

    @Override
    public void visit(Register register) {

    }

    @Override
    public void visit(UnaryOperation unaryOperation) {

    }

    @Override
    public void visit(VirtualRegister virtualRegister) {

    }
}
