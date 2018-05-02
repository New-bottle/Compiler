package Symbols;

public class ArraySymbol extends TypeSymbol {
    TypeSymbol returntype;
    public ArraySymbol(TypeSymbol returntype) {
        this.returntype = returntype;
        this.type = Types.ARRAY;
    }
}
