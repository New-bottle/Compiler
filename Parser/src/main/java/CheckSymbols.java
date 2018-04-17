import Symbols.Type;
import org.antlr.v4.runtime.Token;

public class CheckSymbols {
    public static void error(Token symbol, String s) {
        System.out.println(symbol.toString());
        System.out.println(s);
    }

    public static Type getType(String typeTokenType) {
    }
}
