package Symbols;

import AST.*;
import com.sun.xml.internal.bind.v2.model.core.BuiltinLeafInfo;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable implements Scope {
    Map<String, Symbol> symbols = new HashMap<String, Symbol>();
    private Scope enclosingScope;
    public SymbolTable(Scope enclosingScope) {
        this.enclosingScope = enclosingScope;
    }
    // Satisfy Scope interface
    public String getScopeName() { return "global"; }
    public Scope getEnclosingScope() { return enclosingScope; }
    public void define(String name, Symbol sym) {
        if (symbols.containsKey(name)) {
            throw new RuntimeException("Symbol name has been used : " + name); // TODO RE or ParseError?
        }
        symbols.put(name, sym);
    }
    public Symbol resolve(String name) {
        if (symbols.containsKey(name)) return symbols.get(name);
        else if (enclosingScope != null) return enclosingScope.resolve(name);
        else throw new RuntimeException("Not have this symbol : " + name);
    }

    @Override
    public Symbol resolve(Type type) {
        if (type.getType() == Symbol.Types.STRUCT) {
            return resolve(((ClassType)type).name);
        } else if (type.getType() == Symbol.Types.ARRAY){
            return new ArraySymbol((TypeSymbol)resolve(((ArrayType)type).baseType));
        } else {
            return resolve(type.getType().name());
        }
    }

    public String toString() { return getScopeName()+":"+symbols; }
}
