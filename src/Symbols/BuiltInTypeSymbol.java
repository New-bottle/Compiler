package Symbols;

import CompilerOptions.CompilerOptions;

public class BuiltInTypeSymbol extends TypeSymbol {
    public BuiltInTypeSymbol(Types type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "<BuiltInTypeSymbol: " + this.type.name() + ">";
    }

    @Override
    public int getRegisterSize() {
        switch (type) {
            case INT: return CompilerOptions.getSizeInt();
            case BOOL: return CompilerOptions.getSizeBool();
            default: return CompilerOptions.getSizePointer();
        }
    }

    @Override
    public int getMemorySize() {
        return getRegisterSize();
    }
}
