package AST;

import Symbols.Symbol;

import java.math.BigInteger;

public class IntegerLiteralNode extends LiteralNode {
    public String name;
    public BigInteger val;
    public IntegerLiteralNode(String name) {
        this.name = name;
        val = BigInteger.valueOf(Long.parseLong(name));
        this.exprType = new BuiltInType(Symbol.Types.INT);
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
