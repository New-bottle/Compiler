package Symbols;

import AST.ArrayType;
import AST.BuiltInType;
import AST.ClassType;
import AST.Type;
import Exception.*;

public abstract class Symbol {

    public enum Types {
        INT, BOOL, STRING, VOID, ARRAY, STRUCT, FUNCTION, NULL
    }
    public Types type;

    static public Type getType(Symbol tmp) {
        switch (tmp.type) {
            case BOOL    :    return new BuiltInType(Types.BOOL);
            case INT     :    return new BuiltInType(Types.INT);
            case STRING  :    return new ClassType("string");
            case ARRAY   :    return new ArrayType(getType(((ArraySymbol)tmp).returntype));
                //throw new TypeError("Array can't be used in expression.");
            case FUNCTION:    return getType(((FunctionTypeSymbol)tmp).returnType);
            case STRUCT  :    return new ClassType(((ClassTypeSymbol)tmp).name);
            case VOID    :    return new BuiltInType(Types.VOID);
            default:
                return getType(((VariableSymbol)tmp).returntype);
//                throw new TypeError("Can't determine the expr's type. No such type.");
        }
    }

    @Override
    public boolean equals(Object o) {
        return type == ((Symbol)o).type;
    }
    //  public abstract String toStructureString (String indent);
//  public abstract boolean isSameType(Symbol rhs);
//  public abstract int getRegisterSize();
//  public abstract int getMemorySize();
//  public abstract boolean isPointerType();
}
