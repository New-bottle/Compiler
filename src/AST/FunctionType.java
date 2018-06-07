package AST;

import Symbols.Symbol;
import CompilerOptions.CompilerOptions;

public class FunctionType extends Type {
    public Symbol.Types getType() {
        return Symbol.Types.FUNCTION;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }

    @Override
    public int getRegisterSize() {
        return CompilerOptions.getSizePointer();
    }
}
