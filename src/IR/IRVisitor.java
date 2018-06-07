package IR;

public interface IRVisitor {
    void visit(BinaryOperation binaryOperation);
    void visit(Branch branch);
    void visit(BranchInstruction branchInstruction);
    void visit(Function function);
    void visit(IntComparison intComparison);
    void visit(IntImmediate intImmediate);
    void visit(IntValue intValue);
    void visit(IRBaseClass irBaseClass);
    void visit(IRInstruction irInstruction);
    void visit(IRRoot irRoot);
    void visit(Jump jump);
    void visit(Label label);
    void visit(Load load);
    void visit(Move move);
    void visit(Register register);
    void visit(Store store);
    void visit(UnaryOperation unaryOperation);
    void visit(VirtualRegister virtualRegister);
}
