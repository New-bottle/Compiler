// Generated from /home/yanhongyu/Git/homework/Compiler/src/grammars.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammarsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammarsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammarsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(grammarsParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalFuncDecl}
	 * labeled alternative in {@link grammarsParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalFuncDecl(grammarsParser.GlobalFuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalVarDecl}
	 * labeled alternative in {@link grammarsParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVarDecl(grammarsParser.GlobalVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalClassDecl}
	 * labeled alternative in {@link grammarsParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalClassDecl(grammarsParser.GlobalClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(grammarsParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(grammarsParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(grammarsParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(grammarsParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(grammarsParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code membervar}
	 * labeled alternative in {@link grammarsParser#classStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembervar(grammarsParser.MembervarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberfunc}
	 * labeled alternative in {@link grammarsParser#classStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberfunc(grammarsParser.MemberfuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constructor}
	 * labeled alternative in {@link grammarsParser#classStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(grammarsParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(grammarsParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link grammarsParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(grammarsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varstmt}
	 * labeled alternative in {@link grammarsParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarstmt(grammarsParser.VarstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link grammarsParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(grammarsParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jump}
	 * labeled alternative in {@link grammarsParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump(grammarsParser.JumpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link grammarsParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(grammarsParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link grammarsParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(grammarsParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleexpr}
	 * labeled alternative in {@link grammarsParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleexpr(grammarsParser.SingleexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue}
	 * labeled alternative in {@link grammarsParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(grammarsParser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code break}
	 * labeled alternative in {@link grammarsParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(grammarsParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link grammarsParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(grammarsParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#nonArrayTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonArrayTypeSpecifier(grammarsParser.NonArrayTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link grammarsParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(grammarsParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonArrayType}
	 * labeled alternative in {@link grammarsParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonArrayType(grammarsParser.NonArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(grammarsParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#forStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(grammarsParser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(grammarsParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(grammarsParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(grammarsParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code New}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(grammarsParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAccess}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(grammarsParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(grammarsParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(grammarsParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(grammarsParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(grammarsParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code this}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis(grammarsParser.ThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(grammarsParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberFuncAccess}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberFuncAccess(grammarsParser.MemberFuncAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixIncDec}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixIncDec(grammarsParser.PostfixIncDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(grammarsParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code creatorError}
	 * labeled alternative in {@link grammarsParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatorError(grammarsParser.CreatorErrorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code creatorArray}
	 * labeled alternative in {@link grammarsParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatorArray(grammarsParser.CreatorArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code creatorFunction}
	 * labeled alternative in {@link grammarsParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatorFunction(grammarsParser.CreatorFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code creatorNonArray}
	 * labeled alternative in {@link grammarsParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatorNonArray(grammarsParser.CreatorNonArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(grammarsParser.ConstantContext ctx);
}