package AST;

import Symbols.Symbol;

public class StringLiteralNode extends LiteralNode {
    public String name;
    public StringLiteralNode(String name) {
        this.name = name;
        this.exprType = new BuiltInType(Symbol.Types.STRING);
    }
    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
