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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, BOOL_ID=9, 
		INT_ID=10, STR_ID=11, VOID_ID=12, NULL_ID=13, TRUE_VAL=14, FALSE_VAL=15, 
		IF_ID=16, FOR_ID=17, WHILE_ID=18, BREAK_ID=19, CONT_ID=20, RET_ID=21, 
		NEW_ID=22, CLASS_DEC=23, THIS_ID=24, ID=25, INT=26, STRING=27, LINE_COMMENT=28, 
		BlockComment=29, WS=30, NEWLINE=31, MUL=32, DIV=33, ADD=34, SUB=35, MOD=36, 
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
		null, "'('", "')'", "','", "';'", "'{'", "'}'", "'else'", "'.'", "'bool'", 
		"'int'", "'string'", "'void'", "'null'", "'true'", "'false'", "'if'", 
		"'for'", "'while'", "'break'", "'continue'", "'return'", "'new'", "'class'", 
		"'this'", null, null, null, null, null, null, null, "'*'", "'/'", "'+'", 
		"'-'", "'%'", "'^'", "'&'", "'|'", "'&&'", "'||'", "'!'", "'~'", "'='", 
		"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'<<'", "'>>'", "'++'", 
		"'--'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "BOOL_ID", "INT_ID", 
		"STR_ID", "VOID_ID", "NULL_ID", "TRUE_VAL", "FALSE_VAL", "IF_ID", "FOR_ID", 
		"WHILE_ID", "BREAK_ID", "CONT_ID", "RET_ID", "NEW_ID", "CLASS_DEC", "THIS_ID", 
		"ID", "INT", "STRING", "LINE_COMMENT", "BlockComment", "WS", "NEWLINE", 
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
			setState(57);
			parameter();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(58);
				match(T__2);
				setState(59);
				parameter();
				}
				}
				setState(64);
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
			setState(65);
			typeSpecifier(0);
			setState(66);
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
			setState(68);
			typeSpecifier(0);
			setState(69);
			match(ID);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(70);
				match(ASSIGN);
				setState(71);
				expr(0);
				}
			}

			setState(74);
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
			setState(76);
			match(CLASS_DEC);
			setState(77);
			match(ID);
			setState(78);
			match(T__4);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID) | (1L << ID))) != 0)) {
				{
				{
				setState(79);
				classStat();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new MembervarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				varDecl();
				}
				break;
			case 2:
				_localctx = new MemberfuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				funcDecl();
				}
				break;
			case 3:
				_localctx = new ConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(ID);
				setState(90);
				match(T__0);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID) | (1L << ID))) != 0)) {
					{
					setState(91);
					parameterList();
					}
				}

				setState(94);
				match(T__1);
				setState(95);
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
			setState(98);
			match(T__4);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID) | (1L << IF_ID) | (1L << FOR_ID) | (1L << WHILE_ID) | (1L << BREAK_ID) | (1L << CONT_ID) | (1L << RET_ID) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
				{
				{
				setState(99);
				stat();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				blockStatement();
				}
				break;
			case 2:
				_localctx = new VarstmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				varDecl();
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				ifStat();
				}
				break;
			case 4:
				_localctx = new JumpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				jumpStatement();
				}
				break;
			case 5:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				forStat();
				}
				break;
			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				whileStat();
				}
				break;
			case 7:
				_localctx = new SingleexprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(113);
					expr(0);
					}
				}

				setState(116);
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
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONT_ID:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(CONT_ID);
				setState(120);
				match(T__3);
				}
				break;
			case BREAK_ID:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(BREAK_ID);
				setState(122);
				match(T__3);
				}
				break;
			case RET_ID:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(RET_ID);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(124);
					expr(0);
					}
				}

				setState(127);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				((NonArrayTypeSpecifierContext)_localctx).type = match(INT_ID);
				}
				break;
			case BOOL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				((NonArrayTypeSpecifierContext)_localctx).type = match(BOOL_ID);
				}
				break;
			case STR_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				((NonArrayTypeSpecifierContext)_localctx).type = match(STR_ID);
				}
				break;
			case VOID_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				((NonArrayTypeSpecifierContext)_localctx).type = match(VOID_ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
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

			setState(138);
			nonArrayTypeSpecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
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
					setState(140);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(141);
					match(LBracket);
					setState(142);
					match(RBracket);
					}
					} 
				}
				setState(147);
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
			setState(148);
			match(IF_ID);
			setState(149);
			match(T__0);
			setState(150);
			expr(0);
			setState(151);
			match(T__1);
			setState(152);
			stat();
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(153);
				match(T__6);
				setState(154);
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
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(FOR_ID);
				setState(158);
				match(T__0);
				setState(159);
				((ForStatContext)_localctx).declinit = varDecl();
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(160);
					((ForStatContext)_localctx).cond = expr(0);
					}
				}

				setState(163);
				match(T__3);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(164);
					((ForStatContext)_localctx).iter = expr(0);
					}
				}

				setState(167);
				match(T__1);
				setState(168);
				stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(FOR_ID);
				setState(171);
				match(T__0);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(172);
					((ForStatContext)_localctx).init = expr(0);
					}
				}

				setState(175);
				match(T__3);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(176);
					((ForStatContext)_localctx).cond = expr(0);
					}
				}

				setState(179);
				match(T__3);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(180);
					((ForStatContext)_localctx).iter = expr(0);
					}
				}

				setState(183);
				match(T__1);
				setState(184);
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
			setState(187);
			match(WHILE_ID);
			setState(188);
			match(T__0);
			setState(189);
			expr(0);
			setState(190);
			match(T__1);
			setState(191);
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
			setState(193);
			expr(0);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(194);
					match(T__2);
					setState(195);
					expr(0);
					}
					} 
				}
				setState(200);
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
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(202);
				match(ID);
				setState(203);
				match(T__0);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
					{
					setState(204);
					exprList();
					}
				}

				setState(207);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
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
				setState(209);
				expr(21);
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
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
				setState(211);
				expr(20);
				}
				break;
			case 4:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
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
				setState(213);
				expr(19);
				}
				break;
			case 5:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(NEW_ID);
				setState(215);
				creator();
				}
				break;
			case 6:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new ThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(THIS_ID);
				}
				break;
			case 8:
				{
				_localctx = new CONSTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(INT);
				}
				break;
			case 9:
				{
				_localctx = new STRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(T__0);
				setState(221);
				expr(0);
				setState(222);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(280);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(227);
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
						setState(228);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(230);
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
						setState(231);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(232);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(233);
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
						setState(234);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(236);
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
						setState(237);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(239);
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
						setState(240);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(242);
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
						setState(243);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(245);
						((BinaryExprContext)_localctx).op = match(AND);
						setState(246);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(248);
						((BinaryExprContext)_localctx).op = match(XOR);
						setState(249);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(251);
						((BinaryExprContext)_localctx).op = match(OR);
						setState(252);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(254);
						((BinaryExprContext)_localctx).op = match(LAND);
						setState(255);
						expr(9);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(257);
						((BinaryExprContext)_localctx).op = match(LOR);
						setState(258);
						expr(8);
						}
						break;
					case 12:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(260);
						((BinaryExprContext)_localctx).op = match(ASSIGN);
						setState(261);
						expr(6);
						}
						break;
					case 13:
						{
						_localctx = new PostfixIncDecContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(263);
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
						setState(264);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(265);
						match(LBracket);
						setState(266);
						expr(0);
						setState(267);
						match(RBracket);
						}
						break;
					case 15:
						{
						_localctx = new MemberAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(270);
						match(T__7);
						setState(271);
						match(ID);
						}
						break;
					case 16:
						{
						_localctx = new MemberFuncAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(272);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(273);
						match(T__7);
						setState(274);
						match(ID);
						setState(275);
						match(T__0);
						setState(277);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << DADD) | (1L << DSUB))) != 0)) {
							{
							setState(276);
							exprList();
							}
						}

						setState(279);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(284);
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
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new CreatorNonArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				nonArrayTypeSpecifier();
				}
				break;
			case 2:
				_localctx = new CreatorArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
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
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(295);
						match(LBracket);
						setState(296);
						match(RBracket);
						}
						} 
					}
					setState(301);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new CreatorErrorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				nonArrayTypeSpecifier();
				setState(307); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(303);
						match(LBracket);
						setState(304);
						expr(0);
						setState(305);
						match(RBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(309); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(313); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(311);
						match(LBracket);
						setState(312);
						match(RBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(315); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0142\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\3\3\5\3\61\n\3\3\4"+
		"\3\4\3\4\3\4\5\4\67\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7K\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bS\n"+
		"\b\f\b\16\bV\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\t\3\t\5\tc\n"+
		"\t\3\n\3\n\7\ng\n\n\f\n\16\nj\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13u\n\13\3\13\5\13x\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0080"+
		"\n\f\3\f\5\f\u0083\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u008a\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u0092\n\16\f\16\16\16\u0095\13\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u009e\n\17\3\20\3\20\3\20\3\20\5\20\u00a4\n"+
		"\20\3\20\3\20\5\20\u00a8\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b0"+
		"\n\20\3\20\3\20\5\20\u00b4\n\20\3\20\3\20\5\20\u00b8\n\20\3\20\3\20\5"+
		"\20\u00bc\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u00c7"+
		"\n\22\f\22\16\22\u00ca\13\22\3\23\3\23\3\23\3\23\5\23\u00d0\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00e3\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0118\n\23\3\23\7\23\u011b\n\23\f\23\16\23\u011e\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\6\24\u0126\n\24\r\24\16\24\u0127\3\24\3\24\7\24\u012c"+
		"\n\24\f\24\16\24\u012f\13\24\3\24\3\24\3\24\3\24\3\24\6\24\u0136\n\24"+
		"\r\24\16\24\u0137\3\24\3\24\6\24\u013c\n\24\r\24\16\24\u013d\5\24\u0140"+
		"\n\24\3\24\3\u00c8\4\32$\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&\2\n\3\2\678\3\2$%\3\2,-\4\2\"#&&\3\2\65\66\3\2\61\62\3\2\63\64\3\2"+
		"/\60\2\u0171\2)\3\2\2\2\4\60\3\2\2\2\6\62\3\2\2\2\b;\3\2\2\2\nC\3\2\2"+
		"\2\fF\3\2\2\2\16N\3\2\2\2\20b\3\2\2\2\22d\3\2\2\2\24w\3\2\2\2\26\u0082"+
		"\3\2\2\2\30\u0089\3\2\2\2\32\u008b\3\2\2\2\34\u0096\3\2\2\2\36\u00bb\3"+
		"\2\2\2 \u00bd\3\2\2\2\"\u00c3\3\2\2\2$\u00e2\3\2\2\2&\u013f\3\2\2\2(*"+
		"\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-\61\5\6\4"+
		"\2.\61\5\f\7\2/\61\5\16\b\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\5\3"+
		"\2\2\2\62\63\5\32\16\2\63\64\7\33\2\2\64\66\7\3\2\2\65\67\5\b\5\2\66\65"+
		"\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\4\2\29:\5\22\n\2:\7\3\2\2\2;@\5"+
		"\n\6\2<=\7\5\2\2=?\5\n\6\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\t"+
		"\3\2\2\2B@\3\2\2\2CD\5\32\16\2DE\7\33\2\2E\13\3\2\2\2FG\5\32\16\2GJ\7"+
		"\33\2\2HI\7.\2\2IK\5$\23\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\6\2\2M\r"+
		"\3\2\2\2NO\7\31\2\2OP\7\33\2\2PT\7\7\2\2QS\5\20\t\2RQ\3\2\2\2SV\3\2\2"+
		"\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\b\2\2X\17\3\2\2\2Yc\5\f"+
		"\7\2Zc\5\6\4\2[\\\7\33\2\2\\^\7\3\2\2]_\5\b\5\2^]\3\2\2\2^_\3\2\2\2_`"+
		"\3\2\2\2`a\7\4\2\2ac\5\22\n\2bY\3\2\2\2bZ\3\2\2\2b[\3\2\2\2c\21\3\2\2"+
		"\2dh\7\7\2\2eg\5\24\13\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2"+
		"\2\2jh\3\2\2\2kl\7\b\2\2l\23\3\2\2\2mx\5\22\n\2nx\5\f\7\2ox\5\34\17\2"+
		"px\5\26\f\2qx\5\36\20\2rx\5 \21\2su\5$\23\2ts\3\2\2\2tu\3\2\2\2uv\3\2"+
		"\2\2vx\7\6\2\2wm\3\2\2\2wn\3\2\2\2wo\3\2\2\2wp\3\2\2\2wq\3\2\2\2wr\3\2"+
		"\2\2wt\3\2\2\2x\25\3\2\2\2yz\7\26\2\2z\u0083\7\6\2\2{|\7\25\2\2|\u0083"+
		"\7\6\2\2}\177\7\27\2\2~\u0080\5$\23\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\7\6\2\2\u0082y\3\2\2\2\u0082{\3\2\2\2\u0082"+
		"}\3\2\2\2\u0083\27\3\2\2\2\u0084\u008a\7\f\2\2\u0085\u008a\7\13\2\2\u0086"+
		"\u008a\7\r\2\2\u0087\u008a\7\16\2\2\u0088\u008a\7\33\2\2\u0089\u0084\3"+
		"\2\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\31\3\2\2\2\u008b\u008c\b\16\1\2\u008c\u008d\5\30"+
		"\r\2\u008d\u0093\3\2\2\2\u008e\u008f\f\4\2\2\u008f\u0090\79\2\2\u0090"+
		"\u0092\7:\2\2\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\33\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097"+
		"\7\22\2\2\u0097\u0098\7\3\2\2\u0098\u0099\5$\23\2\u0099\u009a\7\4\2\2"+
		"\u009a\u009d\5\24\13\2\u009b\u009c\7\t\2\2\u009c\u009e\5\24\13\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\35\3\2\2\2\u009f\u00a0\7\23\2"+
		"\2\u00a0\u00a1\7\3\2\2\u00a1\u00a3\5\f\7\2\u00a2\u00a4\5$\23\2\u00a3\u00a2"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\7\6\2\2\u00a6"+
		"\u00a8\5$\23\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\7\4\2\2\u00aa\u00ab\5\24\13\2\u00ab\u00bc\3\2\2\2\u00ac"+
		"\u00ad\7\23\2\2\u00ad\u00af\7\3\2\2\u00ae\u00b0\5$\23\2\u00af\u00ae\3"+
		"\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\7\6\2\2\u00b2"+
		"\u00b4\5$\23\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b7\7\6\2\2\u00b6\u00b8\5$\23\2\u00b7\u00b6\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\4\2\2\u00ba\u00bc\5\24"+
		"\13\2\u00bb\u009f\3\2\2\2\u00bb\u00ac\3\2\2\2\u00bc\37\3\2\2\2\u00bd\u00be"+
		"\7\24\2\2\u00be\u00bf\7\3\2\2\u00bf\u00c0\5$\23\2\u00c0\u00c1\7\4\2\2"+
		"\u00c1\u00c2\5\24\13\2\u00c2!\3\2\2\2\u00c3\u00c8\5$\23\2\u00c4\u00c5"+
		"\7\5\2\2\u00c5\u00c7\5$\23\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9#\3\2\2\2\u00ca\u00c8\3\2\2\2"+
		"\u00cb\u00cc\b\23\1\2\u00cc\u00cd\7\33\2\2\u00cd\u00cf\7\3\2\2\u00ce\u00d0"+
		"\5\"\22\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2"+
		"\u00d1\u00e3\7\4\2\2\u00d2\u00d3\t\2\2\2\u00d3\u00e3\5$\23\27\u00d4\u00d5"+
		"\t\3\2\2\u00d5\u00e3\5$\23\26\u00d6\u00d7\t\4\2\2\u00d7\u00e3\5$\23\25"+
		"\u00d8\u00d9\7\30\2\2\u00d9\u00e3\5&\24\2\u00da\u00e3\7\33\2\2\u00db\u00e3"+
		"\7\32\2\2\u00dc\u00e3\7\34\2\2\u00dd\u00e3\7\35\2\2\u00de\u00df\7\3\2"+
		"\2\u00df\u00e0\5$\23\2\u00e0\u00e1\7\4\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00cb"+
		"\3\2\2\2\u00e2\u00d2\3\2\2\2\u00e2\u00d4\3\2\2\2\u00e2\u00d6\3\2\2\2\u00e2"+
		"\u00d8\3\2\2\2\u00e2\u00da\3\2\2\2\u00e2\u00db\3\2\2\2\u00e2\u00dc\3\2"+
		"\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3\u011c\3\2\2\2\u00e4"+
		"\u00e5\f\23\2\2\u00e5\u00e6\t\5\2\2\u00e6\u011b\5$\23\24\u00e7\u00e8\f"+
		"\22\2\2\u00e8\u00e9\t\3\2\2\u00e9\u011b\5$\23\23\u00ea\u00eb\f\21\2\2"+
		"\u00eb\u00ec\t\6\2\2\u00ec\u011b\5$\23\22\u00ed\u00ee\f\20\2\2\u00ee\u00ef"+
		"\t\7\2\2\u00ef\u011b\5$\23\21\u00f0\u00f1\f\17\2\2\u00f1\u00f2\t\b\2\2"+
		"\u00f2\u011b\5$\23\20\u00f3\u00f4\f\16\2\2\u00f4\u00f5\t\t\2\2\u00f5\u011b"+
		"\5$\23\17\u00f6\u00f7\f\r\2\2\u00f7\u00f8\7(\2\2\u00f8\u011b\5$\23\16"+
		"\u00f9\u00fa\f\f\2\2\u00fa\u00fb\7\'\2\2\u00fb\u011b\5$\23\r\u00fc\u00fd"+
		"\f\13\2\2\u00fd\u00fe\7)\2\2\u00fe\u011b\5$\23\f\u00ff\u0100\f\n\2\2\u0100"+
		"\u0101\7*\2\2\u0101\u011b\5$\23\13\u0102\u0103\f\t\2\2\u0103\u0104\7+"+
		"\2\2\u0104\u011b\5$\23\n\u0105\u0106\f\b\2\2\u0106\u0107\7.\2\2\u0107"+
		"\u011b\5$\23\b\u0108\u0109\f\34\2\2\u0109\u011b\t\2\2\2\u010a\u010b\f"+
		"\32\2\2\u010b\u010c\79\2\2\u010c\u010d\5$\23\2\u010d\u010e\7:\2\2\u010e"+
		"\u011b\3\2\2\2\u010f\u0110\f\31\2\2\u0110\u0111\7\n\2\2\u0111\u011b\7"+
		"\33\2\2\u0112\u0113\f\30\2\2\u0113\u0114\7\n\2\2\u0114\u0115\7\33\2\2"+
		"\u0115\u0117\7\3\2\2\u0116\u0118\5\"\22\2\u0117\u0116\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\7\4\2\2\u011a\u00e4\3\2\2\2\u011a"+
		"\u00e7\3\2\2\2\u011a\u00ea\3\2\2\2\u011a\u00ed\3\2\2\2\u011a\u00f0\3\2"+
		"\2\2\u011a\u00f3\3\2\2\2\u011a\u00f6\3\2\2\2\u011a\u00f9\3\2\2\2\u011a"+
		"\u00fc\3\2\2\2\u011a\u00ff\3\2\2\2\u011a\u0102\3\2\2\2\u011a\u0105\3\2"+
		"\2\2\u011a\u0108\3\2\2\2\u011a\u010a\3\2\2\2\u011a\u010f\3\2\2\2\u011a"+
		"\u0112\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d%\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0140\5\30\r\2\u0120\u0125"+
		"\5\30\r\2\u0121\u0122\79\2\2\u0122\u0123\5$\23\2\u0123\u0124\7:\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u0121\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u012d\3\2\2\2\u0129\u012a\79\2\2\u012a"+
		"\u012c\7:\2\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u0140\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0135\5\30\r\2\u0131\u0132\79\2\2\u0132\u0133\5$\23\2\u0133\u0134\7:"+
		"\2\2\u0134\u0136\3\2\2\2\u0135\u0131\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u013a\79"+
		"\2\2\u013a\u013c\7:\2\2\u013b\u0139\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u011f\3\2"+
		"\2\2\u013f\u0120\3\2\2\2\u013f\u0130\3\2\2\2\u0140\'\3\2\2\2#+\60\66@"+
		"JT^bhtw\177\u0082\u0089\u0093\u009d\u00a3\u00a7\u00af\u00b3\u00b7\u00bb"+
		"\u00c8\u00cf\u00e2\u0117\u011a\u011c\u0127\u012d\u0137\u013d\u013f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}