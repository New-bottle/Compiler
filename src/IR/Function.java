package IR;

import AST.FunctionType;
import Symbols.FunctionTypeSymbol;

import java.util.ArrayList;
import java.util.List;

public class Function extends IRBaseClass {
    public List<VirtualRegister> argVarRegList = new ArrayList<>();
    private String name;
    private FunctionTypeSymbol type;
    private int retSize;

    public Function(FunctionTypeSymbol type) {
        this.retSize = type.returnType.getRegisterSize();
        this.name = type.name;
        this.type = type;
    }
    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return name + "(" + type.returnType + ")" ;
    }
}
