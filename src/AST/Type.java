package AST;

import Symbols.*;
import Exception.TypeError;

public abstract class Type extends Node {
    public abstract Symbol.Types getType();

    static public Type getType(TypeSymbol typeSymbol) {
        if (typeSymbol instanceof BuiltInTypeSymbol) return new BuiltInType(typeSymbol.type);
        if (typeSymbol instanceof ArraySymbol) return new ArrayType(getType(((ArraySymbol)typeSymbol).returntype));
        if (typeSymbol instanceof ClassTypeSymbol) {
            if (((ClassTypeSymbol) typeSymbol).name.equals("string")) return new BuiltInType(Symbol.Types.STRING);
            else return new ClassType(((ClassTypeSymbol) typeSymbol).name);
        }
        throw new TypeError("Can't resolve typeSymbol");
    }

    public abstract int getRegisterSize();

    @Override
    public boolean equals(Object o) {
        if (o instanceof ClassType && this instanceof ClassType) {
            return ((ClassType)this).name.equals(((ClassType)o).name);
        }
        return ((Type)o).getType() == getType();
    }
}
