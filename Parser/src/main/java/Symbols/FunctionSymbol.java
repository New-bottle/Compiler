package Symbols;


import java.util.HashMap;
import java.util.Map;

public class FunctionSymbol extends Symbol implements Scope {
    Map<String, Symbol> symbols = new HashMap<String, Symbol>();
    Scope enclosingScope;
    public FunctionSymbol(String name, Scope enclosingScope) {
        super(name);
        this.enclosingScope = enclosingScope;
    }


    public String getScopeName() { return this.name; }
    public Scope getEnclosingScope() { return this.enclosingScope; }
    public void define(Symbol sym) { symbols.put(sym.name, sym); }
    public Symbol resolve(String name) { return symbols.get(name); }

    public String toString() { return super.toString()+"--"+getScopeName()+":"+symbols; }
}
