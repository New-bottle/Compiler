package AST;

import Symbols.Symbol;

public abstract class Type extends Node {
    public abstract Symbol.Types getType();

    @Override
    public boolean equals(Object o) {
        return ((Type)o).getType() == getType();
    }
}
