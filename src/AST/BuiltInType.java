package AST;

import Symbols.Symbol;
import CompilerOptions.CompilerOptions;

public class BuiltInType extends Type {
    private Symbol.Types type;

    public BuiltInType(Symbol.Types type) {
        this.type = type;
    }

    @Override
    public Symbol.Types getType() {
        return type;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }

    @Override
    public int getRegisterSize() {
        switch (type) {
            case INT: return CompilerOptions.getSizeInt();
            case BOOL: return CompilerOptions.getSizeBool();
            default: return CompilerOptions.getSizePointer();
        }
    }
}
