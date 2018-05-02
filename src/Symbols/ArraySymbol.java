package Symbols;

public class ArraySymbol extends TypeSymbol {
    public TypeSymbol returntype;
    public ArraySymbol(TypeSymbol returntype) {
        this.returntype = returntype;
        this.type = Types.ARRAY;
    }
}
