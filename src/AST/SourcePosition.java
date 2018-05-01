package AST;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SourcePosition {
    public final int line;
    public final int column;

    public SourcePosition(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public SourcePosition(Token token) {
        this.line = token.getLine();
        this.column = token.getCharPositionInLine();
    }

    public SourcePosition(ParserRuleContext ctx) {
        this(ctx.start);
    }

    public SourcePosition(TerminalNode term) {
        this(term.getSymbol());
    }

    @Override
    public String toString() {
        return "Line :" + line + " Column :" + column;
    }
}
