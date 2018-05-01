package AST;

import Symbols.Symbol;

public class FunctionType extends Type {
    public Symbol.Types getType() {
        return Symbol.Types.FUNCTION;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
