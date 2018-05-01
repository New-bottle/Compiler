package Symbols;

public class BuiltInTypeSymbol extends TypeSymbol {
    public BuiltInTypeSymbol(Types type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "<BuiltInTypeSymbol: " + this.type.name() + ">";
    }
}
