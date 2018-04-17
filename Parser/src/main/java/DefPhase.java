import Symbols.GlobalScope;
import Symbols.Scope;
import Symbols.Symbol;
import Symbols.VariableSymbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class DefPhase extends grammarsBaseListener {
    void saveScope (ParserRuleContext ctx, Scope s) { scopes.put(ctx, s); }
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;

    Scope currentScope;

    void defineVar(Token typeCtx, Token nameToken) {
        String typeTokenType = typeCtx.getText();
        Symbols.Type type = CheckSymbols.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var);
    }

    @Override
    public void enterProg(grammarsParser.ProgContext ctx) {
        globals = new GlobalScope(null);
        currentScope = globals;
    }

    @Override
    public void exitProg(grammarsParser.ProgContext ctx) {
        System.out.println(globals);
//        super.exitProg(ctx);
    }

    @Override
    public void enterVarDecl(grammarsParser.VarDeclContext ctx) {
        defineVar(ctx.type, ctx.id);
    }
    @Override
    public void enterFuncDecl(grammarsParser.FuncDeclContext ctx) {
        String name = ctx.id.getText();
        int typeTokenType = ctx.type.getType();
        System.out.println(name);
        System.out.println(typeTokenType);
    }
    @Override
    public void enterBlock(grammarsParser.BlockContext ctx) {
    }
}
