// Generated from /home/yanhongyu/Git/homework/Compiler/Parser/src/main/java/grammars.g4 by ANTLR 4.7
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, BOOL_ID=24, 
		INT_ID=25, STR_ID=26, VOID_ID=27, NULL_ID=28, TRUE_VAL=29, FALSE_VAL=30, 
		IF_ID=31, FOR_ID=32, WHILE_ID=33, BREAK_ID=34, CONT_ID=35, RET_ID=36, 
		NEW_ID=37, CLASS_DEC=38, THIS_ID=39, ID=40, INT=41, STRING=42, LINE_COMMENT=43, 
		WS=44, NEWLINE=45, MUL=46, DIV=47, ADD=48, SUB=49, POW=50, AND=51, OR=52, 
		LAND=53, LOR=54, NOT=55, LNOT=56;
	public static final int
		RULE_prog = 0, RULE_comp = 1, RULE_funcDecl = 2, RULE_parameterList = 3, 
		RULE_parameter = 4, RULE_varDecl = 5, RULE_classDecl = 6, RULE_classStat = 7, 
		RULE_block = 8, RULE_stat = 9, RULE_type = 10, RULE_builtInType = 11, 
		RULE_userType = 12, RULE_arrayType = 13, RULE_ifStat = 14, RULE_returnStat = 15, 
		RULE_forStat = 16, RULE_whileStat = 17, RULE_exprList = 18, RULE_expr = 19, 
		RULE_creator = 20;
	public static final String[] ruleNames = {
		"prog", "comp", "funcDecl", "parameterList", "parameter", "varDecl", "classDecl", 
		"classStat", "block", "stat", "type", "builtInType", "userType", "arrayType", 
		"ifStat", "returnStat", "forStat", "whileStat", "exprList", "expr", "creator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'='", "';'", "'{'", "'}'", "'['", "']'", "'then'", 
		"'else'", "','", "'++'", "'--'", "'.'", "'%'", "'<<'", "'>>'", "'<'", 
		"'>'", "'<='", "'>='", "'=='", "'!='", "'bool'", "'int'", "'string'", 
		"'void'", "'null'", "'true'", "'false'", "'if'", "'for'", "'while'", "'break'", 
		"'continue'", "'return'", "'new'", "'class'", "'this'", null, null, null, 
		null, null, null, "'*'", "'/'", "'+'", "'-'", "'^'", "'&'", "'|'", "'&&'", 
		"'||'", "'!'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"BOOL_ID", "INT_ID", "STR_ID", "VOID_ID", "NULL_ID", "TRUE_VAL", "FALSE_VAL", 
		"IF_ID", "FOR_ID", "WHILE_ID", "BREAK_ID", "CONT_ID", "RET_ID", "NEW_ID", 
		"CLASS_DEC", "THIS_ID", "ID", "INT", "STRING", "LINE_COMMENT", "WS", "NEWLINE", 
		"MUL", "DIV", "ADD", "SUB", "POW", "AND", "OR", "LAND", "LOR", "NOT", 
		"LNOT"
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				comp();
				}
				}
				setState(45); 
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
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comp);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				funcDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				varDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
			setState(52);
			type();
			setState(53);
			match(ID);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(54);
				parameterList();
				}
			}

			setState(57);
			block();
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
			match(T__0);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				parameter();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID) | (1L << ID))) != 0) );
			setState(65);
			match(T__1);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			type();
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			type();
			setState(71);
			match(ID);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(72);
				match(T__2);
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
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ClassStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitClassStat(this);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				funcDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(ID);
				setState(92);
				match(T__0);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(93);
					parameterList();
					}
				}

				setState(96);
				match(T__1);
				setState(97);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__4);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID) | (1L << IF_ID) | (1L << FOR_ID) | (1L << WHILE_ID) | (1L << RET_ID) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << NEWLINE) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << LNOT))) != 0)) {
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(grammarsParser.NEWLINE, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stat);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				varDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				ifStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				returnStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				forStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				whileStat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				expr(0);
				setState(116);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				match(NEWLINE);
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

	public static class TypeContext extends ParserRuleContext {
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(121);
				builtInType();
				}
				break;
			case 2:
				{
				setState(122);
				arrayType();
				}
				break;
			case 3:
				{
				setState(123);
				userType();
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

	public static class BuiltInTypeContext extends ParserRuleContext {
		public TerminalNode BOOL_ID() { return getToken(grammarsParser.BOOL_ID, 0); }
		public TerminalNode INT_ID() { return getToken(grammarsParser.INT_ID, 0); }
		public TerminalNode STR_ID() { return getToken(grammarsParser.STR_ID, 0); }
		public TerminalNode VOID_ID() { return getToken(grammarsParser.VOID_ID, 0); }
		public BuiltInTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitBuiltInType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInTypeContext builtInType() throws RecognitionException {
		BuiltInTypeContext _localctx = new BuiltInTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_builtInType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << VOID_ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UserTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public UserTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitUserType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserTypeContext userType() throws RecognitionException {
		UserTypeContext _localctx = new UserTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_userType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_ID:
			case INT_ID:
			case STR_ID:
			case VOID_ID:
				{
				setState(130);
				builtInType();
				}
				break;
			case ID:
				{
				setState(131);
				userType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				match(T__6);
				setState(135);
				match(T__7);
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
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
		enterRule(_localctx, 28, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IF_ID);
			setState(141);
			expr(0);
			setState(142);
			match(T__8);
			setState(143);
			stat();
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(144);
				match(T__9);
				setState(145);
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

	public static class ReturnStatContext extends ParserRuleContext {
		public TerminalNode RET_ID() { return getToken(grammarsParser.RET_ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(RET_ID);
			setState(149);
			expr(0);
			setState(150);
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

	public static class ForStatContext extends ParserRuleContext {
		public TerminalNode FOR_ID() { return getToken(grammarsParser.FOR_ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 32, RULE_forStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(FOR_ID);
			setState(153);
			match(T__0);
			setState(154);
			expr(0);
			setState(155);
			match(T__3);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__11) | (1L << T__12) | (1L << NEW_ID) | (1L << THIS_ID) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << LNOT))) != 0)) {
				{
				setState(156);
				expr(0);
				}
			}

			setState(159);
			match(T__3);
			setState(160);
			expr(0);
			setState(161);
			match(T__1);
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(162);
				stat();
				}
				break;
			case 2:
				{
				setState(163);
				block();
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

	public static class WhileStatContext extends ParserRuleContext {
		public TerminalNode WHILE_ID() { return getToken(grammarsParser.WHILE_ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 34, RULE_whileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(WHILE_ID);
			setState(167);
			match(T__0);
			setState(168);
			expr(0);
			setState(169);
			match(T__1);
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(170);
				stat();
				}
				break;
			case 2:
				{
				setState(171);
				block();
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
		enterRule(_localctx, 36, RULE_exprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			expr(0);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(175);
					match(T__10);
					setState(176);
					expr(0);
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public List<ExprListContext> exprList() {
			return getRuleContexts(ExprListContext.class);
		}
		public ExprListContext exprList(int i) {
			return getRuleContext(ExprListContext.class,i);
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
		public List<ExprListContext> exprList() {
			return getRuleContexts(ExprListContext.class);
		}
		public ExprListContext exprList(int i) {
			return getRuleContext(ExprListContext.class,i);
		}
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
	public static class PrevfixIncDecContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrevfixIncDecContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitPrevfixIncDec(this);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new PrevfixIncDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(183);
				((PrevfixIncDecContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
					((PrevfixIncDecContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				expr(26);
				}
				break;
			case 2:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(ID);
				setState(186);
				match(T__0);
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(187);
						exprList();
						}
						} 
					}
					setState(192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(193);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(195);
				expr(21);
				}
				break;
			case 4:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
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
				setState(197);
				expr(20);
				}
				break;
			case 5:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==LNOT) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(199);
				expr(19);
				}
				break;
			case 6:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(NEW_ID);
				setState(201);
				creator();
				}
				break;
			case 7:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new ThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(THIS_ID);
				}
				break;
			case 9:
				{
				_localctx = new CONSTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(INT);
				}
				break;
			case 10:
				{
				_localctx = new STRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(STRING);
				}
				break;
			case 11:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(T__0);
				setState(207);
				expr(0);
				setState(208);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(213);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << MUL) | (1L << DIV))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(214);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(216);
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
						setState(217);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(219);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(220);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(222);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(223);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(225);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(228);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(231);
						((BinaryExprContext)_localctx).op = match(AND);
						setState(232);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(234);
						((BinaryExprContext)_localctx).op = match(POW);
						setState(235);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(237);
						((BinaryExprContext)_localctx).op = match(OR);
						setState(238);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(240);
						((BinaryExprContext)_localctx).op = match(LAND);
						setState(241);
						expr(9);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(243);
						((BinaryExprContext)_localctx).op = match(LOR);
						setState(244);
						expr(8);
						}
						break;
					case 12:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(246);
						((BinaryExprContext)_localctx).op = match(T__2);
						setState(247);
						expr(6);
						}
						break;
					case 13:
						{
						_localctx = new PostfixIncDecContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(249);
						((PostfixIncDecContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
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
						setState(250);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(251);
						match(T__6);
						setState(252);
						expr(0);
						setState(253);
						match(T__7);
						}
						break;
					case 15:
						{
						_localctx = new MemberAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(256);
						match(T__13);
						setState(257);
						match(ID);
						}
						break;
					case 16:
						{
						_localctx = new MemberAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(258);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(259);
						match(T__13);
						setState(260);
						match(ID);
						setState(261);
						match(T__0);
						setState(265);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1+1 ) {
								{
								{
								setState(262);
								exprList();
								}
								} 
							}
							setState(267);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						}
						setState(268);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(273);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_creator);
		try {
			int _alt;
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(ID);
				setState(276);
				match(T__6);
				setState(277);
				expr(0);
				setState(278);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(ID);
				setState(285); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(281);
						match(T__6);
						setState(282);
						expr(0);
						setState(283);
						match(T__7);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(287); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				match(ID);
				setState(294); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(290);
						match(T__6);
						setState(291);
						expr(0);
						setState(292);
						match(T__7);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(296); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(298);
						match(T__6);
						setState(299);
						match(T__7);
						}
						} 
					}
					setState(304);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
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
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
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
			return precpred(_ctx, 27);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 23);
		case 15:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0136\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2\16\2/\3\3\3"+
		"\3\3\3\5\3\65\n\3\3\4\3\4\3\4\5\4:\n\4\3\4\3\4\3\5\3\5\6\5@\n\5\r\5\16"+
		"\5A\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7M\n\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\7\bU\n\b\f\b\16\bX\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\ta\n\t\3\t\3"+
		"\t\5\te\n\t\3\n\3\n\7\ni\n\n\f\n\16\nl\13\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13z\n\13\3\f\3\f\3\f\5\f\177\n\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\5\17\u0087\n\17\3\17\3\17\6\17\u008b\n\17\r\17"+
		"\16\17\u008c\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0095\n\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00a0\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00a7\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00af\n\23\3"+
		"\24\3\24\3\24\7\24\u00b4\n\24\f\24\16\24\u00b7\13\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\7\25\u00bf\n\25\f\25\16\25\u00c2\13\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u00d5\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u010a"+
		"\n\25\f\25\16\25\u010d\13\25\3\25\7\25\u0110\n\25\f\25\16\25\u0113\13"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u0120"+
		"\n\26\r\26\16\26\u0121\3\26\3\26\3\26\3\26\3\26\6\26\u0129\n\26\r\26\16"+
		"\26\u012a\3\26\3\26\7\26\u012f\n\26\f\26\16\26\u0132\13\26\5\26\u0134"+
		"\n\26\3\26\5\u00b5\u00c0\u010b\3(\27\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*\2\13\3\2\32\35\3\2\16\17\3\2\62\63\3\29:\4\2\21\21\60\61"+
		"\3\2\22\23\3\2\24\25\3\2\26\27\3\2\30\31\2\u015d\2-\3\2\2\2\4\64\3\2\2"+
		"\2\6\66\3\2\2\2\b=\3\2\2\2\nE\3\2\2\2\fH\3\2\2\2\16P\3\2\2\2\20d\3\2\2"+
		"\2\22f\3\2\2\2\24y\3\2\2\2\26~\3\2\2\2\30\u0080\3\2\2\2\32\u0082\3\2\2"+
		"\2\34\u0086\3\2\2\2\36\u008e\3\2\2\2 \u0096\3\2\2\2\"\u009a\3\2\2\2$\u00a8"+
		"\3\2\2\2&\u00b0\3\2\2\2(\u00d4\3\2\2\2*\u0133\3\2\2\2,.\5\4\3\2-,\3\2"+
		"\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61\65\5\6\4\2\62\65"+
		"\5\f\7\2\63\65\5\16\b\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\5"+
		"\3\2\2\2\66\67\5\26\f\2\679\7*\2\28:\5\b\5\298\3\2\2\29:\3\2\2\2:;\3\2"+
		"\2\2;<\5\22\n\2<\7\3\2\2\2=?\7\3\2\2>@\5\n\6\2?>\3\2\2\2@A\3\2\2\2A?\3"+
		"\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\4\2\2D\t\3\2\2\2EF\5\26\f\2FG\7*\2\2G\13"+
		"\3\2\2\2HI\5\26\f\2IL\7*\2\2JK\7\5\2\2KM\5(\25\2LJ\3\2\2\2LM\3\2\2\2M"+
		"N\3\2\2\2NO\7\6\2\2O\r\3\2\2\2PQ\7(\2\2QR\7*\2\2RV\7\7\2\2SU\5\20\t\2"+
		"TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\b\2\2"+
		"Z\17\3\2\2\2[e\5\f\7\2\\e\5\6\4\2]^\7*\2\2^`\7\3\2\2_a\5\b\5\2`_\3\2\2"+
		"\2`a\3\2\2\2ab\3\2\2\2bc\7\4\2\2ce\5\22\n\2d[\3\2\2\2d\\\3\2\2\2d]\3\2"+
		"\2\2e\21\3\2\2\2fj\7\7\2\2gi\5\24\13\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2j"+
		"k\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\b\2\2n\23\3\2\2\2oz\5\22\n\2pz\5\f\7"+
		"\2qz\5\36\20\2rz\5 \21\2sz\5\"\22\2tz\5$\23\2uv\5(\25\2vw\7\6\2\2wz\3"+
		"\2\2\2xz\7/\2\2yo\3\2\2\2yp\3\2\2\2yq\3\2\2\2yr\3\2\2\2ys\3\2\2\2yt\3"+
		"\2\2\2yu\3\2\2\2yx\3\2\2\2z\25\3\2\2\2{\177\5\30\r\2|\177\5\34\17\2}\177"+
		"\5\32\16\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\27\3\2\2\2\u0080\u0081\t"+
		"\2\2\2\u0081\31\3\2\2\2\u0082\u0083\7*\2\2\u0083\33\3\2\2\2\u0084\u0087"+
		"\5\30\r\2\u0085\u0087\5\32\16\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2"+
		"\2\u0087\u008a\3\2\2\2\u0088\u0089\7\t\2\2\u0089\u008b\7\n\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\35\3\2\2\2\u008e\u008f\7!\2\2\u008f\u0090\5(\25\2\u0090\u0091\7\13\2"+
		"\2\u0091\u0094\5\24\13\2\u0092\u0093\7\f\2\2\u0093\u0095\5\24\13\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\37\3\2\2\2\u0096\u0097\7&\2\2"+
		"\u0097\u0098\5(\25\2\u0098\u0099\7\6\2\2\u0099!\3\2\2\2\u009a\u009b\7"+
		"\"\2\2\u009b\u009c\7\3\2\2\u009c\u009d\5(\25\2\u009d\u009f\7\6\2\2\u009e"+
		"\u00a0\5(\25\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a3\5(\25\2\u00a3\u00a6\7\4\2\2\u00a4"+
		"\u00a7\5\24\13\2\u00a5\u00a7\5\22\n\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7#\3\2\2\2\u00a8\u00a9\7#\2\2\u00a9\u00aa\7\3\2\2\u00aa\u00ab"+
		"\5(\25\2\u00ab\u00ae\7\4\2\2\u00ac\u00af\5\24\13\2\u00ad\u00af\5\22\n"+
		"\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af%\3\2\2\2\u00b0\u00b5"+
		"\5(\25\2\u00b1\u00b2\7\r\2\2\u00b2\u00b4\5(\25\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\'\3\2\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b8\u00b9\b\25\1\2\u00b9\u00ba\t\3\2\2\u00ba\u00d5"+
		"\5(\25\34\u00bb\u00bc\7*\2\2\u00bc\u00c0\7\3\2\2\u00bd\u00bf\5&\24\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00d5\7\4\2\2\u00c4"+
		"\u00c5\t\3\2\2\u00c5\u00d5\5(\25\27\u00c6\u00c7\t\4\2\2\u00c7\u00d5\5"+
		"(\25\26\u00c8\u00c9\t\5\2\2\u00c9\u00d5\5(\25\25\u00ca\u00cb\7\'\2\2\u00cb"+
		"\u00d5\5*\26\2\u00cc\u00d5\7*\2\2\u00cd\u00d5\7)\2\2\u00ce\u00d5\7+\2"+
		"\2\u00cf\u00d5\7,\2\2\u00d0\u00d1\7\3\2\2\u00d1\u00d2\5(\25\2\u00d2\u00d3"+
		"\7\4\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00b8\3\2\2\2\u00d4\u00bb\3\2\2\2\u00d4"+
		"\u00c4\3\2\2\2\u00d4\u00c6\3\2\2\2\u00d4\u00c8\3\2\2\2\u00d4\u00ca\3\2"+
		"\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4"+
		"\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5\u0111\3\2\2\2\u00d6\u00d7\f\23"+
		"\2\2\u00d7\u00d8\t\6\2\2\u00d8\u0110\5(\25\24\u00d9\u00da\f\22\2\2\u00da"+
		"\u00db\t\4\2\2\u00db\u0110\5(\25\23\u00dc\u00dd\f\21\2\2\u00dd\u00de\t"+
		"\7\2\2\u00de\u0110\5(\25\22\u00df\u00e0\f\20\2\2\u00e0\u00e1\t\b\2\2\u00e1"+
		"\u0110\5(\25\21\u00e2\u00e3\f\17\2\2\u00e3\u00e4\t\t\2\2\u00e4\u0110\5"+
		"(\25\20\u00e5\u00e6\f\16\2\2\u00e6\u00e7\t\n\2\2\u00e7\u0110\5(\25\17"+
		"\u00e8\u00e9\f\r\2\2\u00e9\u00ea\7\65\2\2\u00ea\u0110\5(\25\16\u00eb\u00ec"+
		"\f\f\2\2\u00ec\u00ed\7\64\2\2\u00ed\u0110\5(\25\r\u00ee\u00ef\f\13\2\2"+
		"\u00ef\u00f0\7\66\2\2\u00f0\u0110\5(\25\f\u00f1\u00f2\f\n\2\2\u00f2\u00f3"+
		"\7\67\2\2\u00f3\u0110\5(\25\13\u00f4\u00f5\f\t\2\2\u00f5\u00f6\78\2\2"+
		"\u00f6\u0110\5(\25\n\u00f7\u00f8\f\b\2\2\u00f8\u00f9\7\5\2\2\u00f9\u0110"+
		"\5(\25\b\u00fa\u00fb\f\35\2\2\u00fb\u0110\t\3\2\2\u00fc\u00fd\f\32\2\2"+
		"\u00fd\u00fe\7\t\2\2\u00fe\u00ff\5(\25\2\u00ff\u0100\7\n\2\2\u0100\u0110"+
		"\3\2\2\2\u0101\u0102\f\31\2\2\u0102\u0103\7\20\2\2\u0103\u0110\7*\2\2"+
		"\u0104\u0105\f\30\2\2\u0105\u0106\7\20\2\2\u0106\u0107\7*\2\2\u0107\u010b"+
		"\7\3\2\2\u0108\u010a\5&\24\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e\u0110\7\4\2\2\u010f\u00d6\3\2\2\2\u010f\u00d9\3\2\2\2\u010f"+
		"\u00dc\3\2\2\2\u010f\u00df\3\2\2\2\u010f\u00e2\3\2\2\2\u010f\u00e5\3\2"+
		"\2\2\u010f\u00e8\3\2\2\2\u010f\u00eb\3\2\2\2\u010f\u00ee\3\2\2\2\u010f"+
		"\u00f1\3\2\2\2\u010f\u00f4\3\2\2\2\u010f\u00f7\3\2\2\2\u010f\u00fa\3\2"+
		"\2\2\u010f\u00fc\3\2\2\2\u010f\u0101\3\2\2\2\u010f\u0104\3\2\2\2\u0110"+
		"\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112)\3\2\2\2"+
		"\u0113\u0111\3\2\2\2\u0114\u0134\7*\2\2\u0115\u0116\7*\2\2\u0116\u0117"+
		"\7\t\2\2\u0117\u0118\5(\25\2\u0118\u0119\7\n\2\2\u0119\u0134\3\2\2\2\u011a"+
		"\u011f\7*\2\2\u011b\u011c\7\t\2\2\u011c\u011d\5(\25\2\u011d\u011e\7\n"+
		"\2\2\u011e\u0120\3\2\2\2\u011f\u011b\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0134\3\2\2\2\u0123\u0128\7*"+
		"\2\2\u0124\u0125\7\t\2\2\u0125\u0126\5(\25\2\u0126\u0127\7\n\2\2\u0127"+
		"\u0129\3\2\2\2\u0128\u0124\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u0130\3\2\2\2\u012c\u012d\7\t\2\2\u012d"+
		"\u012f\7\n\2\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0114\3\2\2\2\u0133\u0115\3\2\2\2\u0133\u011a\3\2\2\2\u0133\u0123\3\2"+
		"\2\2\u0134+\3\2\2\2\35/\649ALV`djy~\u0086\u008c\u0094\u009f\u00a6\u00ae"+
		"\u00b5\u00c0\u00d4\u010b\u010f\u0111\u0121\u012a\u0130\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}