package Symbols;

import CompilerOptions.CompilerOptions;

public class ArraySymbol extends TypeSymbol {
    public TypeSymbol returntype;
    public SymbolTable members;
    public ArraySymbol(TypeSymbol returntype) {
        this.returntype = returntype;
        this.type = Types.ARRAY;

        this.members = new SymbolTable(null);
        FunctionTypeSymbol size = new FunctionTypeSymbol(new BuiltInTypeSymbol(Types.INT), "size");
        this.members.define("size", size);
    }

    @Override
    public String toString() {
        return "<ArrayType: " + returntype.toString() + ">";
    }

    @Override
    public int getRegisterSize() {
        return CompilerOptions.getSizePointer();
    }

    @Override
    public int getMemorySize() {
        return CompilerOptions.getSizePointer();
    }
}
