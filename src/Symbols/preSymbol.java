package Symbols;

public class preSymbol {
    private Symbol symbol;
    public String name;
    public preSymbol(Symbol symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    public Symbol getSymbol() {
        return this.symbol;
    }
}
