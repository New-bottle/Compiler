package AST;

import Symbols.Symbol;

public class StringLiteralNode extends LiteralNode {
    public String name;
    public StringLiteralNode(String name) {
        this.name = name;
        this.exprType = new ClassType("string");
    }
    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
