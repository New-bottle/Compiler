// Generated from /home/yanhongyu/Git/homework/Compiler/Parser/src/main/java/grammars.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammarsParser}.
 */
public interface grammarsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammarsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(grammarsParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(grammarsParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(grammarsParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(grammarsParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(grammarsParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(grammarsParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(grammarsParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(grammarsParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#formalparameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalparameter(grammarsParser.FormalparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#formalparameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalparameter(grammarsParser.FormalparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#builtinFuncDecl}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinFuncDecl(grammarsParser.BuiltinFuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#builtinFuncDecl}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinFuncDecl(grammarsParser.BuiltinFuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#exFuncDecl}.
	 * @param ctx the parse tree
	 */
	void enterExFuncDecl(grammarsParser.ExFuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#exFuncDecl}.
	 * @param ctx the parse tree
	 */
	void exitExFuncDecl(grammarsParser.ExFuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(grammarsParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(grammarsParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#builtinVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinVarDecl(grammarsParser.BuiltinVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#builtinVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinVarDecl(grammarsParser.BuiltinVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#exVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterExVarDecl(grammarsParser.ExVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#exVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitExVarDecl(grammarsParser.ExVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#varStat}.
	 * @param ctx the parse tree
	 */
	void enterVarStat(grammarsParser.VarStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#varStat}.
	 * @param ctx the parse tree
	 */
	void exitVarStat(grammarsParser.VarStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(grammarsParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(grammarsParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(grammarsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(grammarsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(grammarsParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(grammarsParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(grammarsParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(grammarsParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(grammarsParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(grammarsParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(grammarsParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(grammarsParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(grammarsParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(grammarsParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#classStat}.
	 * @param ctx the parse tree
	 */
	void enterClassStat(grammarsParser.ClassStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#classStat}.
	 * @param ctx the parse tree
	 */
	void exitClassStat(grammarsParser.ClassStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(grammarsParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(grammarsParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(grammarsParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(grammarsParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code New}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNew(grammarsParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code New}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNew(grammarsParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(grammarsParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(grammarsParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(grammarsParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(grammarsParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(grammarsParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(grammarsParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code this}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterThis(grammarsParser.ThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code this}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitThis(grammarsParser.ThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Index}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndex(grammarsParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndex(grammarsParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixIncDec}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixIncDec(grammarsParser.PostfixIncDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixIncDec}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixIncDec(grammarsParser.PostfixIncDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(grammarsParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(grammarsParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STR}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSTR(grammarsParser.STRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STR}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSTR(grammarsParser.STRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAccess}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(grammarsParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAccess}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(grammarsParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONST}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCONST(grammarsParser.CONSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONST}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCONST(grammarsParser.CONSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrevfixIncDec}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrevfixIncDec(grammarsParser.PrevfixIncDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrevfixIncDec}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrevfixIncDec(grammarsParser.PrevfixIncDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(grammarsParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(grammarsParser.CreatorContext ctx);
}