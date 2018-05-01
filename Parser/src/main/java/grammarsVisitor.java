// Generated from /home/yanhongyu/Git/homework/Compiler/Parser/src/main/java/grammars.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link grammarsParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(grammarsParser.CompContext ctx);
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
	 * Visit a parse tree produced by {@link grammarsParser#classStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStat(grammarsParser.ClassStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(grammarsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(grammarsParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(grammarsParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#builtInType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInType(grammarsParser.BuiltInTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#userType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserType(grammarsParser.UserTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(grammarsParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(grammarsParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(grammarsParser.ReturnStatContext ctx);
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
	 * Visit a parse tree produced by the {@code STR}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTR(grammarsParser.STRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAccess}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(grammarsParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONST}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONST(grammarsParser.CONSTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrevfixIncDec}
	 * labeled alternative in {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrevfixIncDec(grammarsParser.PrevfixIncDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(grammarsParser.CreatorContext ctx);
}