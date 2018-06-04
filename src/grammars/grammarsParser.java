package grammars;// Generated from /home/yanhongyu/Git/homework/Compiler/src/grammars.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, BOOL_ID=9, 
		INT_ID=10, STR_ID=11, VOID_ID=12, NULL_ID=13, IF_ID=14, FOR_ID=15, WHILE_ID=16, 
		BREAK_ID=17, CONT_ID=18, RET_ID=19, NEW_ID=20, CLASS_DEC=21, THIS_ID=22, 
		BoolLiteral=23, ID=24, IntLiteral=25, STRING=26, LINE_COMMENT=27, BlockComment=28, 
		WS=29, NEWLINE=30, MUL=31, DIV=32, ADD=33, SUB=34, MOD=35, XOR=36, AND=37, 
		OR=38, LAND=39, LOR=40, NOT=41, BNOT=42, ASSIGN=43, EQ=44, NE=45, LT=46, 
		GT=47, LE=48, GE=49, SHL=50, SHR=51, DADD=52, DSUB=53, LBracket=54, RBracket=55;
	public static final int
		RULE_prog = 0, RULE_comp = 1, RULE_funcDecl = 2, RULE_parameterList = 3, 
		RULE_parameter = 4, RULE_varDecl = 5, RULE_classDecl = 6, RULE_classStat = 7, 
		RULE_blockStatement = 8, RULE_stat = 9, RULE_jumpStatement = 10, RULE_nonArrayTypeSpecifier = 11, 
		RULE_typeSpecifier = 12, RULE_ifStat = 13, RULE_forStat = 14, RULE_whileStat = 15, 
		RULE_exprList = 16, RULE_expr = 17, RULE_creator = 18, RULE_constant = 19;
	public static final String[] ruleNames = {
		"prog", "comp", "funcDecl", "parameterList", "parameter", "varDecl", "classDecl", 
		"classStat", "blockStatement", "stat", "jumpStatement", "nonArrayTypeSpecifier", 
		"typeSpecifier", "ifStat", "forStat", "whileStat", "exprList", "expr", 
		"creator", "constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "';'", "'{'", "'}'", "'else'", "'.'", "'bool'", 
		"'int'", "'string'", "'void'", "'null'", "'if'", "'for'", "'while'", "'break'", 
		"'continue'", "'return'", "'new'", "'class'", "'this'", null, null, null, 
		null, null, null, null, null, "'*'", "'/'", "'+'", "'-'", "'%'", "'^'", 
		"'&'", "'|'", "'&&'", "'||'", "'!'", "'~'", "'='", "'=='", "'!='", "'<'", 
		"'>'", "'<='", "'>='", "'<<'", "'>>'", "'++'", "'--'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "BOOL_ID", "INT_ID", 
		"STR_ID", "VOID_ID", "NULL_ID", "IF_ID", "FOR_ID", "WHILE_ID", "BREAK_ID", 
		"CONT_ID", "RET_ID", "NEW_ID", "CLASS_DEC", "THIS_ID", "BoolLiteral", 
		"ID", "IntLiteral", "STRING", "LINE_COMMENT", "BlockComment", "WS", "NEWLINE", 
		"MUL", "DIV", "ADD", "SUB", "MOD", "XOR", "AND", "OR", "LAND", "LOR", 
		"NOT", "BNOT", "ASSIGN", "EQ", "NE", "LT", "GT", "LE", "GE", "SHL", "SHR", 
		"DADD", "DSUB", "LBracket", "RBracket"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "grammars/grammars.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammarsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<CompContext> comp() {
			return getRuleContexts(CompContext.class);
		}
		public CompContext comp(int i) {
			return getRuleContext(CompContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				comp();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID) | (1L << CLASS_DEC) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompContext extends ParserRuleContext {
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
	 
		public CompContext() { }
		public void copyFrom(CompContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GlobalClassDeclContext extends CompContext {
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public GlobalClassDeclContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitGlobalClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GlobalVarDeclContext extends CompContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public GlobalVarDeclContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitGlobalVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GlobalFuncDeclContext extends CompContext {
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public GlobalFuncDeclContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitGlobalFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comp);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new GlobalFuncDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				funcDecl();
				}
				break;
			case 2:
				_localctx = new GlobalVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				varDecl();
				}
				break;
			case 3:
				_localctx = new GlobalClassDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				classDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			typeSpecifier(0);
			setState(51);
			match(ID);
			setState(52);
			match(T__0);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID) | (1L << ID))) != 0)) {
				{
				setState(53);
				parameterList();
				}
			}

			setState(56);
			match(T__1);
			setState(57);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			parameter();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(60);
				match(T__2);
				setState(61);
				parameter();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			typeSpecifier(0);
			setState(68);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			typeSpecifier(0);
			setState(71);
			match(ID);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(72);
				match(ASSIGN);
				setState(73);
				expr(0);
				}
			}

			setState(76);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode CLASS_DEC() { return getToken(grammarsParser.CLASS_DEC, 0); }
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public List<ClassStatContext> classStat() {
			return getRuleContexts(ClassStatContext.class);
		}
		public ClassStatContext classStat(int i) {
			return getRuleContext(ClassStatContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(CLASS_DEC);
			setState(79);
			match(ID);
			setState(80);
			match(T__4);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID) | (1L << ID))) != 0)) {
				{
				{
				setState(81);
				classStat();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassStatContext extends ParserRuleContext {
		public ClassStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStat; }
	 
		public ClassStatContext() { }
		public void copyFrom(ClassStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstructorContext extends ClassStatContext {
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorContext(ClassStatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberfuncContext extends ClassStatContext {
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public MemberfuncContext(ClassStatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitMemberfunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MembervarContext extends ClassStatContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public MembervarContext(ClassStatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitMembervar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStatContext classStat() throws RecognitionException {
		ClassStatContext _localctx = new ClassStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classStat);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new MembervarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				varDecl();
				}
				break;
			case 2:
				_localctx = new MemberfuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				funcDecl();
				}
				break;
			case 3:
				_localctx = new ConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(ID);
				setState(92);
				match(T__0);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID) | (1L << ID))) != 0)) {
					{
					setState(93);
					parameterList();
					}
				}

				setState(96);
				match(T__1);
				setState(97);
				blockStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__4);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID) | (1L << NULL_ID) | (1L << IF_ID) | (1L << FOR_ID) | (1L << WHILE_ID) | (1L << BREAK_ID) | (1L << CONT_ID) | (1L << RET_ID) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << BoolLiteral) | (1L << ID) | (1L << IntLiteral) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
				{
				{
				setState(101);
				stat();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleexprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SingleexprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitSingleexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StatContext {
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public ForContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends StatContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public BlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatContext {
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public WhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public IfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarstmtContext extends StatContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public VarstmtContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitVarstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JumpContext extends StatContext {
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public JumpContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitJump(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stat);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				blockStatement();
				}
				break;
			case 2:
				_localctx = new VarstmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				varDecl();
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				ifStat();
				}
				break;
			case 4:
				_localctx = new JumpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				jumpStatement();
				}
				break;
			case 5:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				forStat();
				}
				break;
			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				whileStat();
				}
				break;
			case 7:
				_localctx = new SingleexprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NULL_ID) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << BoolLiteral) | (1L << ID) | (1L << IntLiteral) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(115);
					expr(0);
					}
				}

				setState(118);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	 
		public JumpStatementContext() { }
		public void copyFrom(JumpStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakContext extends JumpStatementContext {
		public TerminalNode BREAK_ID() { return getToken(grammarsParser.BREAK_ID, 0); }
		public BreakContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueContext extends JumpStatementContext {
		public TerminalNode CONT_ID() { return getToken(grammarsParser.CONT_ID, 0); }
		public ContinueContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends JumpStatementContext {
		public TerminalNode RET_ID() { return getToken(grammarsParser.RET_ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jumpStatement);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONT_ID:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(CONT_ID);
				setState(122);
				match(T__3);
				}
				break;
			case BREAK_ID:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(BREAK_ID);
				setState(124);
				match(T__3);
				}
				break;
			case RET_ID:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(RET_ID);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NULL_ID) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << BoolLiteral) | (1L << ID) | (1L << IntLiteral) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(126);
					expr(0);
					}
				}

				setState(129);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonArrayTypeSpecifierContext extends ParserRuleContext {
		public Token type;
		public TerminalNode INT_ID() { return getToken(grammarsParser.INT_ID, 0); }
		public TerminalNode BOOL_ID() { return getToken(grammarsParser.BOOL_ID, 0); }
		public TerminalNode STR_ID() { return getToken(grammarsParser.STR_ID, 0); }
		public TerminalNode VOID_ID() { return getToken(grammarsParser.VOID_ID, 0); }
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public NonArrayTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonArrayTypeSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitNonArrayTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonArrayTypeSpecifierContext nonArrayTypeSpecifier() throws RecognitionException {
		NonArrayTypeSpecifierContext _localctx = new NonArrayTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nonArrayTypeSpecifier);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				((NonArrayTypeSpecifierContext)_localctx).type = match(INT_ID);
				}
				break;
			case BOOL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				((NonArrayTypeSpecifierContext)_localctx).type = match(BOOL_ID);
				}
				break;
			case STR_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				((NonArrayTypeSpecifierContext)_localctx).type = match(STR_ID);
				}
				break;
			case VOID_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				((NonArrayTypeSpecifierContext)_localctx).type = match(VOID_ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				((NonArrayTypeSpecifierContext)_localctx).type = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	 
		public TypeSpecifierContext() { }
		public void copyFrom(TypeSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeContext extends TypeSpecifierContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ArrayTypeContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NonArrayTypeContext extends TypeSpecifierContext {
		public NonArrayTypeSpecifierContext nonArrayTypeSpecifier() {
			return getRuleContext(NonArrayTypeSpecifierContext.class,0);
		}
		public NonArrayTypeContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitNonArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		return typeSpecifier(0);
	}

	private TypeSpecifierContext typeSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, _parentState);
		TypeSpecifierContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_typeSpecifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NonArrayTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(140);
			nonArrayTypeSpecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(new TypeSpecifierContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_typeSpecifier);
					setState(142);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(143);
					match(LBracket);
					setState(144);
					match(RBracket);
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode IF_ID() { return getToken(grammarsParser.IF_ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IF_ID);
			setState(151);
			match(T__0);
			setState(152);
			expr(0);
			setState(153);
			match(T__1);
			setState(154);
			stat();
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(155);
				match(T__6);
				setState(156);
				stat();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatContext extends ParserRuleContext {
		public VarDeclContext declinit;
		public ExprContext cond;
		public ExprContext iter;
		public ExprContext init;
		public TerminalNode FOR_ID() { return getToken(grammarsParser.FOR_ID, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitForStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forStat);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(FOR_ID);
				setState(160);
				match(T__0);
				setState(161);
				((ForStatContext)_localctx).declinit = varDecl();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NULL_ID) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << BoolLiteral) | (1L << ID) | (1L << IntLiteral) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(162);
					((ForStatContext)_localctx).cond = expr(0);
					}
				}

				setState(165);
				match(T__3);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NULL_ID) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << BoolLiteral) | (1L << ID) | (1L << IntLiteral) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(166);
					((ForStatContext)_localctx).iter = expr(0);
					}
				}

				setState(169);
				match(T__1);
				setState(170);
				stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(FOR_ID);
				setState(173);
				match(T__0);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NULL_ID) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << BoolLiteral) | (1L << ID) | (1L << IntLiteral) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(174);
					((ForStatContext)_localctx).init = expr(0);
					}
				}

				setState(177);
				match(T__3);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NULL_ID) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << BoolLiteral) | (1L << ID) | (1L << IntLiteral) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(178);
					((ForStatContext)_localctx).cond = expr(0);
					}
				}

				setState(181);
				match(T__3);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NULL_ID) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << BoolLiteral) | (1L << ID) | (1L << IntLiteral) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(182);
					((ForStatContext)_localctx).iter = expr(0);
					}
				}

				setState(185);
				match(T__1);
				setState(186);
				stat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatContext extends ParserRuleContext {
		public TerminalNode WHILE_ID() { return getToken(grammarsParser.WHILE_ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(WHILE_ID);
			setState(190);
			match(T__0);
			setState(191);
			expr(0);
			setState(192);
			match(T__1);
			setState(193);
			stat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			expr(0);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(196);
					match(T__2);
					setState(197);
					expr(0);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewContext extends ExprContext {
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NewContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberAccessContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public MemberAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExprContext {
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralContext extends ExprContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public LiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisContext extends ExprContext {
		public TerminalNode THIS_ID() { return getToken(grammarsParser.THIS_ID, 0); }
		public ThisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitThis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberFuncAccessContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public MemberFuncAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitMemberFuncAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixIncDecContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PostfixIncDecContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitPostfixIncDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(204);
				match(ID);
				setState(205);
				match(T__0);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NULL_ID) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << BoolLiteral) | (1L << ID) | (1L << IntLiteral) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(206);
					exprList();
					}
				}

				setState(209);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DADD || _la==DSUB) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(211);
				expr(20);
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(213);
				expr(19);
				}
				break;
			case 4:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==BNOT) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(215);
				expr(18);
				}
				break;
			case 5:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(NEW_ID);
				setState(217);
				creator();
				}
				break;
			case 6:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new ThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(THIS_ID);
				}
				break;
			case 8:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				constant();
				}
				break;
			case 9:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(T__0);
				setState(222);
				expr(0);
				setState(223);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(228);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(231);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(232);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(234);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SHL || _la==SHR) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(235);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(237);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LT || _la==GT) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(238);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(240);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LE || _la==GE) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(243);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NE) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(244);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(246);
						((BinaryExprContext)_localctx).op = match(AND);
						setState(247);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(249);
						((BinaryExprContext)_localctx).op = match(XOR);
						setState(250);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(252);
						((BinaryExprContext)_localctx).op = match(OR);
						setState(253);
						expr(9);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(255);
						((BinaryExprContext)_localctx).op = match(LAND);
						setState(256);
						expr(8);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(258);
						((BinaryExprContext)_localctx).op = match(LOR);
						setState(259);
						expr(7);
						}
						break;
					case 12:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(261);
						((BinaryExprContext)_localctx).op = match(ASSIGN);
						setState(262);
						expr(5);
						}
						break;
					case 13:
						{
						_localctx = new PostfixIncDecContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(264);
						((PostfixIncDecContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DADD || _la==DSUB) ) {
							((PostfixIncDecContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 14:
						{
						_localctx = new IndexContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(266);
						match(LBracket);
						setState(267);
						expr(0);
						setState(268);
						match(RBracket);
						}
						break;
					case 15:
						{
						_localctx = new MemberAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(271);
						match(T__7);
						setState(272);
						match(ID);
						}
						break;
					case 16:
						{
						_localctx = new MemberFuncAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(274);
						match(T__7);
						setState(275);
						match(ID);
						setState(276);
						match(T__0);
						setState(278);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NULL_ID) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << BoolLiteral) | (1L << ID) | (1L << IntLiteral) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
							{
							setState(277);
							exprList();
							}
						}

						setState(280);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
	 
		public CreatorContext() { }
		public void copyFrom(CreatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreatorErrorContext extends CreatorContext {
		public NonArrayTypeSpecifierContext nonArrayTypeSpecifier() {
			return getRuleContext(NonArrayTypeSpecifierContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CreatorErrorContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitCreatorError(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreatorNonArrayContext extends CreatorContext {
		public NonArrayTypeSpecifierContext nonArrayTypeSpecifier() {
			return getRuleContext(NonArrayTypeSpecifierContext.class,0);
		}
		public CreatorNonArrayContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitCreatorNonArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreatorArrayContext extends CreatorContext {
		public NonArrayTypeSpecifierContext nonArrayTypeSpecifier() {
			return getRuleContext(NonArrayTypeSpecifierContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CreatorArrayContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitCreatorArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreatorFunctionContext extends CreatorContext {
		public NonArrayTypeSpecifierContext nonArrayTypeSpecifier() {
			return getRuleContext(NonArrayTypeSpecifierContext.class,0);
		}
		public CreatorFunctionContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitCreatorFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_creator);
		try {
			int _alt;
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new CreatorErrorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				nonArrayTypeSpecifier();
				setState(291); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(287);
						match(LBracket);
						setState(288);
						expr(0);
						setState(289);
						match(RBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(293); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(297); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(295);
						match(LBracket);
						setState(296);
						match(RBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(299); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(305); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(301);
						match(LBracket);
						setState(302);
						expr(0);
						setState(303);
						match(RBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(307); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new CreatorArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				nonArrayTypeSpecifier();
				setState(314); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(310);
						match(LBracket);
						setState(311);
						expr(0);
						setState(312);
						match(RBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(316); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(318);
						match(LBracket);
						setState(319);
						match(RBracket);
						}
						} 
					}
					setState(324);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new CreatorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				nonArrayTypeSpecifier();
				setState(326);
				match(T__0);
				setState(327);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new CreatorNonArrayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				nonArrayTypeSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public Token type;
		public TerminalNode IntLiteral() { return getToken(grammarsParser.IntLiteral, 0); }
		public TerminalNode STRING() { return getToken(grammarsParser.STRING, 0); }
		public TerminalNode NULL_ID() { return getToken(grammarsParser.NULL_ID, 0); }
		public TerminalNode BoolLiteral() { return getToken(grammarsParser.BoolLiteral, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constant);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				((ConstantContext)_localctx).type = match(IntLiteral);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				((ConstantContext)_localctx).type = match(STRING);
				}
				break;
			case NULL_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				((ConstantContext)_localctx).type = match(NULL_ID);
				}
				break;
			case BoolLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				((ConstantContext)_localctx).type = match(BoolLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return typeSpecifier_sempred((TypeSpecifierContext)_localctx, predIndex);
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeSpecifier_sempred(TypeSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 25);
		case 14:
			return precpred(_ctx, 23);
		case 15:
			return precpred(_ctx, 22);
		case 16:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0155\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\3\3\3\3\3\5\3"+
		"\63\n\3\3\4\3\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5A\n\5\f\5"+
		"\16\5D\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7M\n\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\7\bU\n\b\f\b\16\bX\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\ta\n\t\3\t\3"+
		"\t\5\te\n\t\3\n\3\n\7\ni\n\n\f\n\16\nl\13\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13w\n\13\3\13\5\13z\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0082\n\f\3\f\5\f\u0085\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u0094\n\16\f\16\16\16\u0097\13\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a0\n\17\3\20\3\20\3\20\3\20\5\20"+
		"\u00a6\n\20\3\20\3\20\5\20\u00aa\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u00b2\n\20\3\20\3\20\5\20\u00b6\n\20\3\20\3\20\5\20\u00ba\n\20\3\20"+
		"\3\20\5\20\u00be\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22"+
		"\u00c9\n\22\f\22\16\22\u00cc\13\22\3\23\3\23\3\23\3\23\5\23\u00d2\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00e4\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0119\n\23\3\23\7\23\u011c\n\23\f\23\16\23\u011f\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\6\24\u0126\n\24\r\24\16\24\u0127\3\24\3\24\6\24\u012c"+
		"\n\24\r\24\16\24\u012d\3\24\3\24\3\24\3\24\6\24\u0134\n\24\r\24\16\24"+
		"\u0135\3\24\3\24\3\24\3\24\3\24\6\24\u013d\n\24\r\24\16\24\u013e\3\24"+
		"\3\24\7\24\u0143\n\24\f\24\16\24\u0146\13\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u014d\n\24\3\25\3\25\3\25\3\25\5\25\u0153\n\25\3\25\3\u00ca\4\32"+
		"$\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\n\3\2\66\67\3\2#$"+
		"\3\2+,\4\2!\"%%\3\2\64\65\3\2\60\61\3\2\62\63\3\2./\2\u0187\2+\3\2\2\2"+
		"\4\62\3\2\2\2\6\64\3\2\2\2\b=\3\2\2\2\nE\3\2\2\2\fH\3\2\2\2\16P\3\2\2"+
		"\2\20d\3\2\2\2\22f\3\2\2\2\24y\3\2\2\2\26\u0084\3\2\2\2\30\u008b\3\2\2"+
		"\2\32\u008d\3\2\2\2\34\u0098\3\2\2\2\36\u00bd\3\2\2\2 \u00bf\3\2\2\2\""+
		"\u00c5\3\2\2\2$\u00e3\3\2\2\2&\u014c\3\2\2\2(\u0152\3\2\2\2*,\5\4\3\2"+
		"+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/\63\5\6\4\2\60\63"+
		"\5\f\7\2\61\63\5\16\b\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\5\3"+
		"\2\2\2\64\65\5\32\16\2\65\66\7\32\2\2\668\7\3\2\2\679\5\b\5\28\67\3\2"+
		"\2\289\3\2\2\29:\3\2\2\2:;\7\4\2\2;<\5\22\n\2<\7\3\2\2\2=B\5\n\6\2>?\7"+
		"\5\2\2?A\5\n\6\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\t\3\2\2\2DB"+
		"\3\2\2\2EF\5\32\16\2FG\7\32\2\2G\13\3\2\2\2HI\5\32\16\2IL\7\32\2\2JK\7"+
		"-\2\2KM\5$\23\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\6\2\2O\r\3\2\2\2PQ\7"+
		"\27\2\2QR\7\32\2\2RV\7\7\2\2SU\5\20\t\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2"+
		"VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\b\2\2Z\17\3\2\2\2[e\5\f\7\2\\e\5\6"+
		"\4\2]^\7\32\2\2^`\7\3\2\2_a\5\b\5\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7"+
		"\4\2\2ce\5\22\n\2d[\3\2\2\2d\\\3\2\2\2d]\3\2\2\2e\21\3\2\2\2fj\7\7\2\2"+
		"gi\5\24\13\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2"+
		"\2mn\7\b\2\2n\23\3\2\2\2oz\5\22\n\2pz\5\f\7\2qz\5\34\17\2rz\5\26\f\2s"+
		"z\5\36\20\2tz\5 \21\2uw\5$\23\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xz\7\6\2"+
		"\2yo\3\2\2\2yp\3\2\2\2yq\3\2\2\2yr\3\2\2\2ys\3\2\2\2yt\3\2\2\2yv\3\2\2"+
		"\2z\25\3\2\2\2{|\7\24\2\2|\u0085\7\6\2\2}~\7\23\2\2~\u0085\7\6\2\2\177"+
		"\u0081\7\25\2\2\u0080\u0082\5$\23\2\u0081\u0080\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\7\6\2\2\u0084{\3\2\2\2\u0084}\3"+
		"\2\2\2\u0084\177\3\2\2\2\u0085\27\3\2\2\2\u0086\u008c\7\f\2\2\u0087\u008c"+
		"\7\13\2\2\u0088\u008c\7\r\2\2\u0089\u008c\7\16\2\2\u008a\u008c\7\32\2"+
		"\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008a\3\2\2\2\u008c\31\3\2\2\2\u008d\u008e\b\16\1\2\u008e"+
		"\u008f\5\30\r\2\u008f\u0095\3\2\2\2\u0090\u0091\f\4\2\2\u0091\u0092\7"+
		"8\2\2\u0092\u0094\79\2\2\u0093\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\33\3\2\2\2\u0097\u0095\3\2\2"+
		"\2\u0098\u0099\7\20\2\2\u0099\u009a\7\3\2\2\u009a\u009b\5$\23\2\u009b"+
		"\u009c\7\4\2\2\u009c\u009f\5\24\13\2\u009d\u009e\7\t\2\2\u009e\u00a0\5"+
		"\24\13\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\35\3\2\2\2\u00a1"+
		"\u00a2\7\21\2\2\u00a2\u00a3\7\3\2\2\u00a3\u00a5\5\f\7\2\u00a4\u00a6\5"+
		"$\23\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\7\6\2\2\u00a8\u00aa\5$\23\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\4\2\2\u00ac\u00ad\5\24\13\2\u00ad"+
		"\u00be\3\2\2\2\u00ae\u00af\7\21\2\2\u00af\u00b1\7\3\2\2\u00b0\u00b2\5"+
		"$\23\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b5\7\6\2\2\u00b4\u00b6\5$\23\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\7\6\2\2\u00b8\u00ba\5$\23\2\u00b9"+
		"\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\4"+
		"\2\2\u00bc\u00be\5\24\13\2\u00bd\u00a1\3\2\2\2\u00bd\u00ae\3\2\2\2\u00be"+
		"\37\3\2\2\2\u00bf\u00c0\7\22\2\2\u00c0\u00c1\7\3\2\2\u00c1\u00c2\5$\23"+
		"\2\u00c2\u00c3\7\4\2\2\u00c3\u00c4\5\24\13\2\u00c4!\3\2\2\2\u00c5\u00ca"+
		"\5$\23\2\u00c6\u00c7\7\5\2\2\u00c7\u00c9\5$\23\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb#\3\2\2\2"+
		"\u00cc\u00ca\3\2\2\2\u00cd\u00ce\b\23\1\2\u00ce\u00cf\7\32\2\2\u00cf\u00d1"+
		"\7\3\2\2\u00d0\u00d2\5\"\22\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d3\u00e4\7\4\2\2\u00d4\u00d5\t\2\2\2\u00d5\u00e4"+
		"\5$\23\26\u00d6\u00d7\t\3\2\2\u00d7\u00e4\5$\23\25\u00d8\u00d9\t\4\2\2"+
		"\u00d9\u00e4\5$\23\24\u00da\u00db\7\26\2\2\u00db\u00e4\5&\24\2\u00dc\u00e4"+
		"\7\32\2\2\u00dd\u00e4\7\30\2\2\u00de\u00e4\5(\25\2\u00df\u00e0\7\3\2\2"+
		"\u00e0\u00e1\5$\23\2\u00e1\u00e2\7\4\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00cd"+
		"\3\2\2\2\u00e3\u00d4\3\2\2\2\u00e3\u00d6\3\2\2\2\u00e3\u00d8\3\2\2\2\u00e3"+
		"\u00da\3\2\2\2\u00e3\u00dc\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00de\3\2"+
		"\2\2\u00e3\u00df\3\2\2\2\u00e4\u011d\3\2\2\2\u00e5\u00e6\f\22\2\2\u00e6"+
		"\u00e7\t\5\2\2\u00e7\u011c\5$\23\23\u00e8\u00e9\f\21\2\2\u00e9\u00ea\t"+
		"\3\2\2\u00ea\u011c\5$\23\22\u00eb\u00ec\f\20\2\2\u00ec\u00ed\t\6\2\2\u00ed"+
		"\u011c\5$\23\21\u00ee\u00ef\f\17\2\2\u00ef\u00f0\t\7\2\2\u00f0\u011c\5"+
		"$\23\20\u00f1\u00f2\f\16\2\2\u00f2\u00f3\t\b\2\2\u00f3\u011c\5$\23\17"+
		"\u00f4\u00f5\f\r\2\2\u00f5\u00f6\t\t\2\2\u00f6\u011c\5$\23\16\u00f7\u00f8"+
		"\f\f\2\2\u00f8\u00f9\7\'\2\2\u00f9\u011c\5$\23\r\u00fa\u00fb\f\13\2\2"+
		"\u00fb\u00fc\7&\2\2\u00fc\u011c\5$\23\f\u00fd\u00fe\f\n\2\2\u00fe\u00ff"+
		"\7(\2\2\u00ff\u011c\5$\23\13\u0100\u0101\f\t\2\2\u0101\u0102\7)\2\2\u0102"+
		"\u011c\5$\23\n\u0103\u0104\f\b\2\2\u0104\u0105\7*\2\2\u0105\u011c\5$\23"+
		"\t\u0106\u0107\f\7\2\2\u0107\u0108\7-\2\2\u0108\u011c\5$\23\7\u0109\u010a"+
		"\f\33\2\2\u010a\u011c\t\2\2\2\u010b\u010c\f\31\2\2\u010c\u010d\78\2\2"+
		"\u010d\u010e\5$\23\2\u010e\u010f\79\2\2\u010f\u011c\3\2\2\2\u0110\u0111"+
		"\f\30\2\2\u0111\u0112\7\n\2\2\u0112\u011c\7\32\2\2\u0113\u0114\f\27\2"+
		"\2\u0114\u0115\7\n\2\2\u0115\u0116\7\32\2\2\u0116\u0118\7\3\2\2\u0117"+
		"\u0119\5\"\22\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3"+
		"\2\2\2\u011a\u011c\7\4\2\2\u011b\u00e5\3\2\2\2\u011b\u00e8\3\2\2\2\u011b"+
		"\u00eb\3\2\2\2\u011b\u00ee\3\2\2\2\u011b\u00f1\3\2\2\2\u011b\u00f4\3\2"+
		"\2\2\u011b\u00f7\3\2\2\2\u011b\u00fa\3\2\2\2\u011b\u00fd\3\2\2\2\u011b"+
		"\u0100\3\2\2\2\u011b\u0103\3\2\2\2\u011b\u0106\3\2\2\2\u011b\u0109\3\2"+
		"\2\2\u011b\u010b\3\2\2\2\u011b\u0110\3\2\2\2\u011b\u0113\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e%\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\u0120\u0125\5\30\r\2\u0121\u0122\78\2\2\u0122\u0123"+
		"\5$\23\2\u0123\u0124\79\2\2\u0124\u0126\3\2\2\2\u0125\u0121\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u012a\78\2\2\u012a\u012c\79\2\2\u012b\u0129\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0133\3\2\2\2\u012f"+
		"\u0130\78\2\2\u0130\u0131\5$\23\2\u0131\u0132\79\2\2\u0132\u0134\3\2\2"+
		"\2\u0133\u012f\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u014d\3\2\2\2\u0137\u013c\5\30\r\2\u0138\u0139\78\2\2\u0139"+
		"\u013a\5$\23\2\u013a\u013b\79\2\2\u013b\u013d\3\2\2\2\u013c\u0138\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0144\3\2\2\2\u0140\u0141\78\2\2\u0141\u0143\79\2\2\u0142\u0140\3\2\2"+
		"\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u014d"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\5\30\r\2\u0148\u0149\7\3\2\2"+
		"\u0149\u014a\7\4\2\2\u014a\u014d\3\2\2\2\u014b\u014d\5\30\r\2\u014c\u0120"+
		"\3\2\2\2\u014c\u0137\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u014b\3\2\2\2\u014d"+
		"\'\3\2\2\2\u014e\u0153\7\33\2\2\u014f\u0153\7\34\2\2\u0150\u0153\7\17"+
		"\2\2\u0151\u0153\7\31\2\2\u0152\u014e\3\2\2\2\u0152\u014f\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153)\3\2\2\2%-\628BLV`djvy\u0081"+
		"\u0084\u008b\u0095\u009f\u00a5\u00a9\u00b1\u00b5\u00b9\u00bd\u00ca\u00d1"+
		"\u00e3\u0118\u011b\u011d\u0127\u012d\u0135\u013e\u0144\u014c\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}