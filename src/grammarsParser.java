// Generated from /home/yanhongyu/Git/homework/Compiler/src/grammars.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		BOOL_ID=10, INT_ID=11, STR_ID=12, VOID_ID=13, NULL_ID=14, TRUE_VAL=15, 
		FALSE_VAL=16, IF_ID=17, FOR_ID=18, WHILE_ID=19, BREAK_ID=20, CONT_ID=21, 
		RET_ID=22, NEW_ID=23, CLASS_DEC=24, THIS_ID=25, ID=26, INT=27, STRING=28, 
		LINE_COMMENT=29, WS=30, NEWLINE=31, MUL=32, DIV=33, ADD=34, SUB=35, MOD=36, 
		XOR=37, AND=38, OR=39, LAND=40, LOR=41, NOT=42, BNOT=43, ASSIGN=44, EQ=45, 
		NE=46, LT=47, GT=48, LE=49, GE=50, SHL=51, SHR=52, DADD=53, DSUB=54, LBracket=55, 
		RBracket=56;
	public static final int
		RULE_prog = 0, RULE_comp = 1, RULE_funcDecl = 2, RULE_parameterList = 3, 
		RULE_parameter = 4, RULE_varDecl = 5, RULE_classDecl = 6, RULE_classStat = 7, 
		RULE_blockStatement = 8, RULE_stat = 9, RULE_jumpStatement = 10, RULE_nonArrayTypeSpecifier = 11, 
		RULE_typeSpecifier = 12, RULE_ifStat = 13, RULE_forStat = 14, RULE_whileStat = 15, 
		RULE_exprList = 16, RULE_expr = 17, RULE_creator = 18;
	public static final String[] ruleNames = {
		"prog", "comp", "funcDecl", "parameterList", "parameter", "varDecl", "classDecl", 
		"classStat", "blockStatement", "stat", "jumpStatement", "nonArrayTypeSpecifier", 
		"typeSpecifier", "ifStat", "forStat", "whileStat", "exprList", "expr", 
		"creator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "';'", "'{'", "'}'", "'then'", "'else'", "','", "'.'", 
		"'bool'", "'int'", "'string'", "'void'", "'null'", "'true'", "'false'", 
		"'if'", "'for'", "'while'", "'break'", "'continue'", "'return'", "'new'", 
		"'class'", "'this'", null, null, null, null, null, null, "'*'", "'/'", 
		"'+'", "'-'", "'%'", "'^'", "'&'", "'|'", "'&&'", "'||'", "'!'", "'~'", 
		"'='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'<<'", "'>>'", "'++'", 
		"'--'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "BOOL_ID", 
		"INT_ID", "STR_ID", "VOID_ID", "NULL_ID", "TRUE_VAL", "FALSE_VAL", "IF_ID", 
		"FOR_ID", "WHILE_ID", "BREAK_ID", "CONT_ID", "RET_ID", "NEW_ID", "CLASS_DEC", 
		"THIS_ID", "ID", "INT", "STRING", "LINE_COMMENT", "WS", "NEWLINE", "MUL", 
		"DIV", "ADD", "SUB", "MOD", "XOR", "AND", "OR", "LAND", "LOR", "NOT", 
		"BNOT", "ASSIGN", "EQ", "NE", "LT", "GT", "LE", "GE", "SHL", "SHR", "DADD", 
		"DSUB", "LBracket", "RBracket"
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
	public String getGrammarFileName() { return "grammars.g4"; }

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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				comp();
				}
				}
				setState(41); 
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new GlobalFuncDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				funcDecl();
				}
				break;
			case 2:
				_localctx = new GlobalVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				varDecl();
				}
				break;
			case 3:
				_localctx = new GlobalClassDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
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
			setState(48);
			typeSpecifier(0);
			setState(49);
			match(ID);
			setState(50);
			match(T__0);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID) | (1L << ID))) != 0)) {
				{
				setState(51);
				parameterList();
				}
			}

			setState(54);
			match(T__1);
			setState(55);
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
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				parameter();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID) | (1L << ID))) != 0) );
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
			setState(62);
			typeSpecifier(0);
			setState(63);
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
			setState(65);
			typeSpecifier(0);
			setState(66);
			match(ID);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(67);
				match(ASSIGN);
				setState(68);
				expr(0);
				}
			}

			setState(71);
			match(T__2);
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
			setState(73);
			match(CLASS_DEC);
			setState(74);
			match(ID);
			setState(75);
			match(T__3);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID) | (1L << ID))) != 0)) {
				{
				{
				setState(76);
				classStat();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(T__4);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new MembervarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				varDecl();
				}
				break;
			case 2:
				_localctx = new MemberfuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				funcDecl();
				}
				break;
			case 3:
				_localctx = new ConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(ID);
				setState(87);
				match(T__0);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID) | (1L << ID))) != 0)) {
					{
					setState(88);
					parameterList();
					}
				}

				setState(91);
				match(T__1);
				setState(92);
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
			setState(95);
			match(T__3);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID) | (1L << IF_ID) | (1L << FOR_ID) | (1L << WHILE_ID) | (1L << BREAK_ID) | (1L << CONT_ID) | (1L << RET_ID) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
				{
				{
				setState(96);
				stat();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(T__4);
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				blockStatement();
				}
				break;
			case 2:
				_localctx = new VarstmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				varDecl();
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				ifStat();
				}
				break;
			case 4:
				_localctx = new JumpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				jumpStatement();
				}
				break;
			case 5:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				forStat();
				}
				break;
			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				whileStat();
				}
				break;
			case 7:
				_localctx = new SingleexprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(110);
					expr(0);
					}
				}

				setState(113);
				match(T__2);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONT_ID:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(CONT_ID);
				setState(117);
				match(T__2);
				}
				break;
			case BREAK_ID:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(BREAK_ID);
				setState(119);
				match(T__2);
				}
				break;
			case RET_ID:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(RET_ID);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(121);
					expr(0);
					}
				}

				setState(124);
				match(T__2);
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				((NonArrayTypeSpecifierContext)_localctx).type = match(INT_ID);
				}
				break;
			case BOOL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				((NonArrayTypeSpecifierContext)_localctx).type = match(BOOL_ID);
				}
				break;
			case STR_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				((NonArrayTypeSpecifierContext)_localctx).type = match(STR_ID);
				}
				break;
			case VOID_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				((NonArrayTypeSpecifierContext)_localctx).type = match(VOID_ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
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

			setState(135);
			nonArrayTypeSpecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
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
					setState(137);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(138);
					match(LBracket);
					setState(139);
					match(RBracket);
					}
					} 
				}
				setState(144);
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
			setState(145);
			match(IF_ID);
			setState(146);
			expr(0);
			setState(147);
			match(T__5);
			setState(148);
			stat();
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(149);
				match(T__6);
				setState(150);
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
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(FOR_ID);
				setState(154);
				match(T__0);
				setState(155);
				((ForStatContext)_localctx).declinit = varDecl();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(156);
					((ForStatContext)_localctx).cond = expr(0);
					}
				}

				setState(159);
				match(T__2);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(160);
					((ForStatContext)_localctx).iter = expr(0);
					}
				}

				setState(163);
				match(T__1);
				setState(164);
				stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(FOR_ID);
				setState(167);
				match(T__0);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(168);
					((ForStatContext)_localctx).init = expr(0);
					}
				}

				setState(171);
				match(T__2);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(172);
					((ForStatContext)_localctx).cond = expr(0);
					}
				}

				setState(175);
				match(T__2);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(176);
					((ForStatContext)_localctx).iter = expr(0);
					}
				}

				setState(179);
				match(T__1);
				setState(180);
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
			setState(183);
			match(WHILE_ID);
			setState(184);
			match(T__0);
			setState(185);
			expr(0);
			setState(186);
			match(T__1);
			setState(187);
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
			setState(189);
			expr(0);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(190);
					match(T__7);
					setState(191);
					expr(0);
					}
					} 
				}
				setState(196);
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
	public static class STRContext extends ExprContext {
		public TerminalNode STRING() { return getToken(grammarsParser.STRING, 0); }
		public STRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitSTR(this);
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
	public static class CONSTContext extends ExprContext {
		public TerminalNode INT() { return getToken(grammarsParser.INT, 0); }
		public CONSTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitCONST(this);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(198);
				match(ID);
				setState(199);
				match(T__0);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(200);
					exprList();
					}
				}

				setState(203);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
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
				setState(205);
				expr(21);
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
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
				setState(207);
				expr(20);
				}
				break;
			case 4:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
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
				setState(209);
				expr(19);
				}
				break;
			case 5:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(NEW_ID);
				setState(211);
				creator();
				}
				break;
			case 6:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new ThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(THIS_ID);
				}
				break;
			case 8:
				{
				_localctx = new CONSTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(INT);
				}
				break;
			case 9:
				{
				_localctx = new STRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(T__0);
				setState(217);
				expr(0);
				setState(218);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(276);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(223);
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
						setState(224);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(226);
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
						setState(227);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(229);
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
						setState(230);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(232);
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
						setState(233);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(235);
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
						setState(236);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(238);
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
						setState(239);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(241);
						((BinaryExprContext)_localctx).op = match(AND);
						setState(242);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(244);
						((BinaryExprContext)_localctx).op = match(XOR);
						setState(245);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(247);
						((BinaryExprContext)_localctx).op = match(OR);
						setState(248);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(250);
						((BinaryExprContext)_localctx).op = match(LAND);
						setState(251);
						expr(9);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(253);
						((BinaryExprContext)_localctx).op = match(LOR);
						setState(254);
						expr(8);
						}
						break;
					case 12:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(256);
						((BinaryExprContext)_localctx).op = match(ASSIGN);
						setState(257);
						expr(6);
						}
						break;
					case 13:
						{
						_localctx = new PostfixIncDecContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(258);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(259);
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
						setState(260);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(261);
						match(LBracket);
						setState(262);
						expr(0);
						setState(263);
						match(RBracket);
						}
						break;
					case 15:
						{
						_localctx = new MemberAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(266);
						match(T__8);
						setState(267);
						match(ID);
						}
						break;
					case 16:
						{
						_localctx = new MemberFuncAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(269);
						match(T__8);
						setState(270);
						match(ID);
						setState(271);
						match(T__0);
						setState(273);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
							{
							setState(272);
							exprList();
							}
						}

						setState(275);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(280);
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

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_creator);
		try {
			int _alt;
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new CreatorNonArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				nonArrayTypeSpecifier();
				}
				break;
			case 2:
				_localctx = new CreatorArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				nonArrayTypeSpecifier();
				setState(287); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(283);
						match(LBracket);
						setState(284);
						expr(0);
						setState(285);
						match(RBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(289); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(291);
						match(LBracket);
						setState(292);
						match(RBracket);
						}
						} 
					}
					setState(297);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new CreatorErrorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				nonArrayTypeSpecifier();
				setState(303); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(299);
						match(LBracket);
						setState(300);
						expr(0);
						setState(301);
						match(RBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(305); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(309); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(307);
						match(LBracket);
						setState(308);
						match(RBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(311); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 26);
		case 14:
			return precpred(_ctx, 24);
		case 15:
			return precpred(_ctx, 23);
		case 16:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\3\3\5\3\61\n\3\3\4"+
		"\3\4\3\4\3\4\5\4\67\n\4\3\4\3\4\3\4\3\5\6\5=\n\5\r\5\16\5>\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\5\7H\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bP\n\b\f\b\16\bS\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\\\n\t\3\t\3\t\5\t`\n\t\3\n\3\n\7\n"+
		"d\n\n\f\n\16\ng\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13r"+
		"\n\13\3\13\5\13u\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f}\n\f\3\f\5\f\u0080\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\5\r\u0087\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u008f\n\16\f\16\16\16\u0092\13\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u009a\n\17\3\20\3\20\3\20\3\20\5\20\u00a0\n\20\3\20\3\20\5\20\u00a4\n"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ac\n\20\3\20\3\20\5\20\u00b0"+
		"\n\20\3\20\3\20\5\20\u00b4\n\20\3\20\3\20\5\20\u00b8\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u00c3\n\22\f\22\16\22\u00c6\13"+
		"\22\3\23\3\23\3\23\3\23\5\23\u00cc\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00df\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0114\n\23\3\23\7\23"+
		"\u0117\n\23\f\23\16\23\u011a\13\23\3\24\3\24\3\24\3\24\3\24\3\24\6\24"+
		"\u0122\n\24\r\24\16\24\u0123\3\24\3\24\7\24\u0128\n\24\f\24\16\24\u012b"+
		"\13\24\3\24\3\24\3\24\3\24\3\24\6\24\u0132\n\24\r\24\16\24\u0133\3\24"+
		"\3\24\6\24\u0138\n\24\r\24\16\24\u0139\5\24\u013c\n\24\3\24\3\u00c4\4"+
		"\32$\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\n\3\2\678\3\2$%"+
		"\3\2,-\4\2\"#&&\3\2\65\66\3\2\61\62\3\2\63\64\3\2/\60\2\u016d\2)\3\2\2"+
		"\2\4\60\3\2\2\2\6\62\3\2\2\2\b<\3\2\2\2\n@\3\2\2\2\fC\3\2\2\2\16K\3\2"+
		"\2\2\20_\3\2\2\2\22a\3\2\2\2\24t\3\2\2\2\26\177\3\2\2\2\30\u0086\3\2\2"+
		"\2\32\u0088\3\2\2\2\34\u0093\3\2\2\2\36\u00b7\3\2\2\2 \u00b9\3\2\2\2\""+
		"\u00bf\3\2\2\2$\u00de\3\2\2\2&\u013b\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2"+
		"\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-\61\5\6\4\2.\61\5\f\7\2/\61\5\16\b"+
		"\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\5\3\2\2\2\62\63\5\32\16\2\63"+
		"\64\7\34\2\2\64\66\7\3\2\2\65\67\5\b\5\2\66\65\3\2\2\2\66\67\3\2\2\2\67"+
		"8\3\2\2\289\7\4\2\29:\5\22\n\2:\7\3\2\2\2;=\5\n\6\2<;\3\2\2\2=>\3\2\2"+
		"\2><\3\2\2\2>?\3\2\2\2?\t\3\2\2\2@A\5\32\16\2AB\7\34\2\2B\13\3\2\2\2C"+
		"D\5\32\16\2DG\7\34\2\2EF\7.\2\2FH\5$\23\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2"+
		"\2IJ\7\5\2\2J\r\3\2\2\2KL\7\32\2\2LM\7\34\2\2MQ\7\6\2\2NP\5\20\t\2ON\3"+
		"\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\7\2\2U\17"+
		"\3\2\2\2V`\5\f\7\2W`\5\6\4\2XY\7\34\2\2Y[\7\3\2\2Z\\\5\b\5\2[Z\3\2\2\2"+
		"[\\\3\2\2\2\\]\3\2\2\2]^\7\4\2\2^`\5\22\n\2_V\3\2\2\2_W\3\2\2\2_X\3\2"+
		"\2\2`\21\3\2\2\2ae\7\6\2\2bd\5\24\13\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2e"+
		"f\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\7\2\2i\23\3\2\2\2ju\5\22\n\2ku\5\f\7"+
		"\2lu\5\34\17\2mu\5\26\f\2nu\5\36\20\2ou\5 \21\2pr\5$\23\2qp\3\2\2\2qr"+
		"\3\2\2\2rs\3\2\2\2su\7\5\2\2tj\3\2\2\2tk\3\2\2\2tl\3\2\2\2tm\3\2\2\2t"+
		"n\3\2\2\2to\3\2\2\2tq\3\2\2\2u\25\3\2\2\2vw\7\27\2\2w\u0080\7\5\2\2xy"+
		"\7\26\2\2y\u0080\7\5\2\2z|\7\30\2\2{}\5$\23\2|{\3\2\2\2|}\3\2\2\2}~\3"+
		"\2\2\2~\u0080\7\5\2\2\177v\3\2\2\2\177x\3\2\2\2\177z\3\2\2\2\u0080\27"+
		"\3\2\2\2\u0081\u0087\7\r\2\2\u0082\u0087\7\f\2\2\u0083\u0087\7\16\2\2"+
		"\u0084\u0087\7\17\2\2\u0085\u0087\7\34\2\2\u0086\u0081\3\2\2\2\u0086\u0082"+
		"\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\31\3\2\2\2\u0088\u0089\b\16\1\2\u0089\u008a\5\30\r\2\u008a\u0090\3\2"+
		"\2\2\u008b\u008c\f\4\2\2\u008c\u008d\79\2\2\u008d\u008f\7:\2\2\u008e\u008b"+
		"\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\33\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\23\2\2\u0094\u0095\5$\23"+
		"\2\u0095\u0096\7\b\2\2\u0096\u0099\5\24\13\2\u0097\u0098\7\t\2\2\u0098"+
		"\u009a\5\24\13\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\35\3\2"+
		"\2\2\u009b\u009c\7\24\2\2\u009c\u009d\7\3\2\2\u009d\u009f\5\f\7\2\u009e"+
		"\u00a0\5$\23\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a3\7\5\2\2\u00a2\u00a4\5$\23\2\u00a3\u00a2\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\4\2\2\u00a6\u00a7\5\24"+
		"\13\2\u00a7\u00b8\3\2\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00ab\7\3\2\2\u00aa"+
		"\u00ac\5$\23\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\7\5\2\2\u00ae\u00b0\5$\23\2\u00af\u00ae\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\7\5\2\2\u00b2\u00b4\5$"+
		"\23\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\7\4\2\2\u00b6\u00b8\5\24\13\2\u00b7\u009b\3\2\2\2\u00b7\u00a8\3"+
		"\2\2\2\u00b8\37\3\2\2\2\u00b9\u00ba\7\25\2\2\u00ba\u00bb\7\3\2\2\u00bb"+
		"\u00bc\5$\23\2\u00bc\u00bd\7\4\2\2\u00bd\u00be\5\24\13\2\u00be!\3\2\2"+
		"\2\u00bf\u00c4\5$\23\2\u00c0\u00c1\7\n\2\2\u00c1\u00c3\5$\23\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"#\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\b\23\1\2\u00c8\u00c9\7\34\2"+
		"\2\u00c9\u00cb\7\3\2\2\u00ca\u00cc\5\"\22\2\u00cb\u00ca\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00df\7\4\2\2\u00ce\u00cf\t\2"+
		"\2\2\u00cf\u00df\5$\23\27\u00d0\u00d1\t\3\2\2\u00d1\u00df\5$\23\26\u00d2"+
		"\u00d3\t\4\2\2\u00d3\u00df\5$\23\25\u00d4\u00d5\7\31\2\2\u00d5\u00df\5"+
		"&\24\2\u00d6\u00df\7\34\2\2\u00d7\u00df\7\33\2\2\u00d8\u00df\7\35\2\2"+
		"\u00d9\u00df\7\36\2\2\u00da\u00db\7\3\2\2\u00db\u00dc\5$\23\2\u00dc\u00dd"+
		"\7\4\2\2\u00dd\u00df\3\2\2\2\u00de\u00c7\3\2\2\2\u00de\u00ce\3\2\2\2\u00de"+
		"\u00d0\3\2\2\2\u00de\u00d2\3\2\2\2\u00de\u00d4\3\2\2\2\u00de\u00d6\3\2"+
		"\2\2\u00de\u00d7\3\2\2\2\u00de\u00d8\3\2\2\2\u00de\u00d9\3\2\2\2\u00de"+
		"\u00da\3\2\2\2\u00df\u0118\3\2\2\2\u00e0\u00e1\f\23\2\2\u00e1\u00e2\t"+
		"\5\2\2\u00e2\u0117\5$\23\24\u00e3\u00e4\f\22\2\2\u00e4\u00e5\t\3\2\2\u00e5"+
		"\u0117\5$\23\23\u00e6\u00e7\f\21\2\2\u00e7\u00e8\t\6\2\2\u00e8\u0117\5"+
		"$\23\22\u00e9\u00ea\f\20\2\2\u00ea\u00eb\t\7\2\2\u00eb\u0117\5$\23\21"+
		"\u00ec\u00ed\f\17\2\2\u00ed\u00ee\t\b\2\2\u00ee\u0117\5$\23\20\u00ef\u00f0"+
		"\f\16\2\2\u00f0\u00f1\t\t\2\2\u00f1\u0117\5$\23\17\u00f2\u00f3\f\r\2\2"+
		"\u00f3\u00f4\7(\2\2\u00f4\u0117\5$\23\16\u00f5\u00f6\f\f\2\2\u00f6\u00f7"+
		"\7\'\2\2\u00f7\u0117\5$\23\r\u00f8\u00f9\f\13\2\2\u00f9\u00fa\7)\2\2\u00fa"+
		"\u0117\5$\23\f\u00fb\u00fc\f\n\2\2\u00fc\u00fd\7*\2\2\u00fd\u0117\5$\23"+
		"\13\u00fe\u00ff\f\t\2\2\u00ff\u0100\7+\2\2\u0100\u0117\5$\23\n\u0101\u0102"+
		"\f\b\2\2\u0102\u0103\7.\2\2\u0103\u0117\5$\23\b\u0104\u0105\f\34\2\2\u0105"+
		"\u0117\t\2\2\2\u0106\u0107\f\32\2\2\u0107\u0108\79\2\2\u0108\u0109\5$"+
		"\23\2\u0109\u010a\7:\2\2\u010a\u0117\3\2\2\2\u010b\u010c\f\31\2\2\u010c"+
		"\u010d\7\13\2\2\u010d\u0117\7\34\2\2\u010e\u010f\f\30\2\2\u010f\u0110"+
		"\7\13\2\2\u0110\u0111\7\34\2\2\u0111\u0113\7\3\2\2\u0112\u0114\5\"\22"+
		"\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117"+
		"\7\4\2\2\u0116\u00e0\3\2\2\2\u0116\u00e3\3\2\2\2\u0116\u00e6\3\2\2\2\u0116"+
		"\u00e9\3\2\2\2\u0116\u00ec\3\2\2\2\u0116\u00ef\3\2\2\2\u0116\u00f2\3\2"+
		"\2\2\u0116\u00f5\3\2\2\2\u0116\u00f8\3\2\2\2\u0116\u00fb\3\2\2\2\u0116"+
		"\u00fe\3\2\2\2\u0116\u0101\3\2\2\2\u0116\u0104\3\2\2\2\u0116\u0106\3\2"+
		"\2\2\u0116\u010b\3\2\2\2\u0116\u010e\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119%\3\2\2\2\u011a\u0118\3\2\2\2"+
		"\u011b\u013c\5\30\r\2\u011c\u0121\5\30\r\2\u011d\u011e\79\2\2\u011e\u011f"+
		"\5$\23\2\u011f\u0120\7:\2\2\u0120\u0122\3\2\2\2\u0121\u011d\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0129\3\2"+
		"\2\2\u0125\u0126\79\2\2\u0126\u0128\7:\2\2\u0127\u0125\3\2\2\2\u0128\u012b"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u013c\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u0131\5\30\r\2\u012d\u012e\79\2\2\u012e\u012f\5$"+
		"\23\2\u012f\u0130\7:\2\2\u0130\u0132\3\2\2\2\u0131\u012d\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0137\3\2"+
		"\2\2\u0135\u0136\79\2\2\u0136\u0138\7:\2\2\u0137\u0135\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b"+
		"\u011b\3\2\2\2\u013b\u011c\3\2\2\2\u013b\u012c\3\2\2\2\u013c\'\3\2\2\2"+
		"#+\60\66>GQ[_eqt|\177\u0086\u0090\u0099\u009f\u00a3\u00ab\u00af\u00b3"+
		"\u00b7\u00c4\u00cb\u00de\u0113\u0116\u0118\u0123\u0129\u0133\u0139\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}