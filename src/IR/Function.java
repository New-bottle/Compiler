package IR;

import Symbols.FunctionTypeSymbol;

import java.util.ArrayList;
import java.util.List;

public class Function extends IRBaseClass {
    public List<VirtualRegister> argVarRegList = new ArrayList<>();
    private String name;
    private FunctionTypeSymbol type;
    private int retSize;

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
