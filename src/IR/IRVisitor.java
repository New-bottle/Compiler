package IR;

public interface IRVisitor {
    void visit(BinaryOperation binaryOperation);
    void visit(Branch branch);
    void visit(BranchInstruction branchInstruction);
    void visit(Function function);
    void visit(IntValue intValue);
    void visit(IRBaseClass irBaseClass);
    void visit(IRInstruction irInstruction);
    void visit(Jump jump);
    void visit(Label label);
    void visit(Register register);
    void visit(UnaryOperation unaryOperation);
    void visit(VirtualRegister virtualRegister);
}
