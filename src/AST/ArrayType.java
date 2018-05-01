package AST;

import Symbols.Symbol;

public class ArrayType extends Type {

    public Symbol.Types getType() {
        return Symbol.Types.ARRAY;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
