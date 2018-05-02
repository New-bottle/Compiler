package Symbols;

public class ClassTypeSymbol extends TypeSymbol {
    public String name;
    public SymbolTable members;

    public ClassTypeSymbol(String name) {
        this.type = Types.STRUCT;
        this.name = name;
        this.members = null;
    }
    @Override
    public String toString() {
        return "<ClassTypeSymbol :" + this.name + ">";
    }
}
