package AST;

abstract public class UnaryOpNode extends ExprNode {
    public enum UnaryOp {
        ADD, SUB, POS, NEG, LNOT, BNOT
    }
}
