package AST;

import Symbols.Symbol;

public class NullNode extends LiteralNode {
    public String name;
    public NullNode() {
        this.name = "null";
        this.exprType = new BuiltInType(Symbol.Types.NULL);
    }

    @Override
    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
