package Symbols;

public abstract class Symbol {

    public enum Types {
        INT, BOOL, STRING, VOID, ARRAY, STRUCT, FUNCTION, NULL
    }
    public Types type;
//  public abstract String toStructureString (String indent);
//  public abstract boolean isSameType(Symbol rhs);
//  public abstract int getRegisterSize();
//  public abstract int getMemorySize();
//  public abstract boolean isPointerType();
}
