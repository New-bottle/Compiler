package AST;

import IR.IntValue;
import IR.Label;

public abstract class ExprNode extends Node {
    public Type exprType;
    public boolean isLvalue;

    public Label ifTrue;
    public Label ifFalse;

    public IntValue intValue;
    public IntValue addressValue;
    public int addressOffset;
}
