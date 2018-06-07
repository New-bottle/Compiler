package Symbols;

public class VariableSymbol extends Symbol {
    public TypeSymbol returntype;
    public String name;
    public VariableSymbol(TypeSymbol returntype, String name) {
        this.returntype = returntype;
        this.name = name;
        this.type = Types.NULL;
    }

    @Override
    public int getRegisterSize() {
        return -1;
    }

    @Override
    public int getMemorySize() {
        return -1;
    }
}
