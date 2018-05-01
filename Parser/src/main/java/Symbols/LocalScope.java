package Symbols;

public class LocalScope extends SymbolTable {
    private String name;
    public LocalScope(String name, Scope enclosingScope) {
        super(enclosingScope);
        this.name = name;
        initTypeSystem();
    }

    @Override
    public String getScopeName() {
        return this.name;
    }
}
