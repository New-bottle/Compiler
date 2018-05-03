package AST;

import Symbols.Symbol;

public class ArrayType extends Type {
    public Type baseType;

    public ArrayType(Type baseType) {
        this.baseType = baseType;
    }

    public Symbol.Types getType() {
        return Symbol.Types.ARRAY;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ArrayType)) return false;
        return this.baseType.equals(((ArrayType)o).baseType);
    }
}
