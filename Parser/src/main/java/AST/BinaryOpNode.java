package AST;

public class BinaryOpNode extends ExprNode {
    public BinaryOpNode(ExprNode left, Token addToken, ExprNode right) {
        super(addToken);
        addChild(left);
        addChild(right);
    }
}
