package Symbols;

import AST.Type;

public interface Scope {
//    Map<String, Symbol> symbols = new HashMap<String, Symbol>();
    public String getScopeName();       // do I have a name?
    public Scope getEnclosingScope();   // am I nested in another?
    public void define(String name, Symbol symbol);     // define sym in this scope
    public Symbol resolve(String name); // look up name in scope
    public Symbol resolve(Type type);
}
