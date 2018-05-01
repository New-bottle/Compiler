package Symbols;

import java.util.*;

public class GlobalScope extends SymbolTable {
    public GlobalScope(Scope enclosingScope) {
        super(enclosingScope);
        initTypeSystem();
    }
}
