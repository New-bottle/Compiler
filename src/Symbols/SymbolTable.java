package Symbols;

import AST.ClassType;
import AST.Type;

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
        define("INT", new BuiltInTypeSymbol(Symbol.Types.INT));
        define("BOOL", new BuiltInTypeSymbol(Symbol.Types.BOOL));
        define("STRING", new BuiltInTypeSymbol(Symbol.Types.STRING));
        define("VOID", new BuiltInTypeSymbol(Symbol.Types.VOID));
    }
    // Satisfy Scope interface
    public String getScopeName() { return "global"; }
    public Scope getEnclosingScope() { return enclosingScope; }
    public void define(String name, Symbol sym) {
        if (symbols.containsKey(name)) {
            throw new RuntimeException("Symbol name has been used."); // TODO RE or ParseError?
        }
        symbols.put(name, sym);
    }
    public Symbol resolve(String name) {
        if (symbols.containsKey(name)) return symbols.get(name);
        else if (enclosingScope != null) return enclosingScope.resolve(name);
        else throw new RuntimeException("Not have this symbol.");
    }

    @Override
    public Symbol resolve(Type type) {
        if (type.getType() == Symbol.Types.STRUCT) {
            return resolve(((ClassType)type).name);
        } else {
            return resolve(type.getType().name());
        }
    }

    public String toString() { return getScopeName()+":"+symbols; }
}
