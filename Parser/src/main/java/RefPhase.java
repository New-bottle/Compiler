import Symbols.FunctionSymbol;
import Symbols.GlobalScope;
import Symbols.Scope;
import Symbols.Symbol;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class RefPhase extends grammarsBaseListener {
    ParseTreeProperty<Scope> scopes;
    GlobalScope globals;
    Scope currentScope;

    public RefPhase (GlobalScope globals, ParseTreeProperty<Scope> scopes) {
        this.scopes = scopes;
        this.globals = globals;
    }
    @Override
    public void enterProg (grammarsParser.ProgContext ctx) {
        currentScope = globals;
    }
    @Override
    public void enterFuncDecl(grammarsParser.FuncDeclContext ctx) {
        currentScope = scopes.get(ctx);
    }
    @Override
    public void exitFuncDecl(grammarsParser.FuncDeclContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }
    @Override
    public void enterBlock(grammarsParser.BlockContext ctx) {
        currentScope = scopes.get(ctx);
    }
    @Override
    public void exitBlock(grammarsParser.BlockContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void exitVar(grammarsParser.VarContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if (var == null) {
            CheckSymbols.error(ctx.ID().getSymbol(), "no such variable: "+name);
        }
        if (var instanceof FunctionSymbol) {
            CheckSymbols.error(ctx.ID().getSymbol(), name+" is not a variable");
        }
    }
}
