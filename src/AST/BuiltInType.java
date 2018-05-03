package AST;

import Symbols.Symbol;

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
}
