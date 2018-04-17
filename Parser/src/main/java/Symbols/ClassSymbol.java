package Symbols;

public class ClassSymbol extends ScopedSymbol implements Type {
    public String getScopeName() {
        return super.getName();
    }

    public Scope getEnclosingScope() {
        return ;
    }

    public void define(Symbol sym) {

    }

    public Symbol resolve(String name) {
        return null;
    }
}
