package AST;

import Symbols.Symbol;

public abstract class Type extends Node {
    public abstract Symbol.Types getType();

    public boolean equals(Type rhs) {
        return getType() == rhs.getType();
    }
}
