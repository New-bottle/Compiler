package Symbols;

import CompilerOptions.CompilerOptions;

import java.util.ArrayList;
import java.util.List;

public class FunctionTypeSymbol extends TypeSymbol {
    public TypeSymbol returnType;
    public String name;
    public List<TypeSymbol> argTypes = new ArrayList<>();
    public List<String> argNames = new ArrayList<>();

    public FunctionTypeSymbol(TypeSymbol returnType, String name) {
        this.returnType = returnType;
        this.name = name;
        this.type = Types.FUNCTION;
    }

    public void addArg(TypeSymbol type, String name) {
        argTypes.add(type);
        argNames.add(name);
    }

    @Override
    public String toString() {
        return "<FunctionType : " + name + ">";
    }

    @Override
    public int getRegisterSize() {
        return 0;
    }

    @Override
    public int getMemorySize() {
        return 0;
    }
}
