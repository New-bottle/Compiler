package Symbols;

public class GlobalScope extends SymbolTable {
    public GlobalScope() {
        super(null);
        initTypeSystem();
    }

    public void initTypeSystem() {
        define("INT", new BuiltInTypeSymbol(Symbol.Types.INT));
        define("BOOL", new BuiltInTypeSymbol(Symbol.Types.BOOL));
        define("STRING", new BuiltInTypeSymbol(Symbol.Types.STRING));
        define("VOID", new BuiltInTypeSymbol(Symbol.Types.VOID));
        // Builtin functions
        define("println", new FunctionTypeSymbol(new BuiltInTypeSymbol(Symbol.Types.VOID), "println"));
        define("toString", new FunctionTypeSymbol(new BuiltInTypeSymbol(Symbol.Types.STRING), "toString"));
    }
}
