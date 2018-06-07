package Symbols;

import CompilerOptions.CompilerOptions;

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

    @Override
    public int getRegisterSize() {
        return CompilerOptions.getSizePointer();
    }

    @Override
    public int getMemorySize() {
        return members.getSize();
    }
}
