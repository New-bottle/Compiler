package Symbols;

import AST.*;

import java.util.HashMap;
import java.util.Map;
import Exception.*;

public class SymbolTable implements Scope {
    Map<String, Symbol> symbols = new HashMap<String, Symbol>();
    private Scope enclosingScope;
    private int offset = 0;

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
        offset += sym.getRegisterSize();
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

    @Override
    public Symbol find(String name) {
        if (symbols.containsKey(name)) return symbols.get(name);
        else throw new MemberError("Don't have member : "+ name);
    }

    public int getSize() {
        return offset;
    }
    public String toString() { return getScopeName()+":"+symbols; }
}
