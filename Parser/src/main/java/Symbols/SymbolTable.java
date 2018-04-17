package Symbols;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable implements Scope {
    Map<String, Symbol> symbols = new HashMap<String, Symbol>();
    private Scope enclosingScope;
    public SymbolTable(Scope enclosingScope) {
        this.enclosingScope = enclosingScope;
        initTypeSystem();
    }
    protected void initTypeSystem() {
        define(new BuiltInTypeSymbol("int"));
        define(new BuiltInTypeSymbol("bool"));
        define(new BuiltInTypeSymbol("string"));
//        define(new BuiltInTypeSymbol("void")); // TODO
    }
    // Satisfy Scope interface
    public String getScopeName() { return "global"; }
    public Scope getEnclosingScope() { return enclosingScope; }
    public void define(Symbol sym) { symbols.put(sym.name, sym); }
    public Symbol resolve(String name) { return symbols.get(name); }

    public String toString() { return getScopeName()+":"+symbols; }
}
