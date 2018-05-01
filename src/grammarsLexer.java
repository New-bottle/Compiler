// Generated from /home/yanhongyu/Git/homework/Compiler/src/grammars.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarsLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"BOOL_ID", "INT_ID", "STR_ID", "VOID_ID", "NULL_ID", "TRUE_VAL", "FALSE_VAL", 
		"IF_ID", "FOR_ID", "WHILE_ID", "BREAK_ID", "CONT_ID", "RET_ID", "NEW_ID", 
		"CLASS_DEC", "THIS_ID", "ID", "ID_LETTER", "UDL", "INT", "DIGIT", "STRING", 
		"ESC", "LINE_COMMENT", "WS", "NEWLINE", "MUL", "DIV", "ADD", "SUB", "MOD", 
		"XOR", "AND", "OR", "LAND", "LOR", "NOT", "BNOT", "ASSIGN", "EQ", "NE", 
		"LT", "GT", "LE", "GE", "SHL", "SHR", "DADD", "DSUB", "LBracket", "RBracket"
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


	public grammarsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammars.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0163\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00ef\n\33\f\33"+
		"\16\33\u00f2\13\33\3\34\3\34\3\35\3\35\3\36\6\36\u00f9\n\36\r\36\16\36"+
		"\u00fa\3\37\3\37\3 \3 \3 \7 \u0102\n \f \16 \u0105\13 \3 \3 \3!\3!\3!"+
		"\3!\5!\u010d\n!\3\"\3\"\3\"\3\"\7\"\u0113\n\"\f\"\16\"\u0116\13\"\3\""+
		"\3\"\3\"\3\"\3#\6#\u011d\n#\r#\16#\u011e\3#\3#\3$\5$\u0124\n$\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;"+
		"\3<\3<\3=\3=\4\u0103\u0114\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\29\2;\35=\2?\36A\2C\37E G!I\"K#M$O%Q&S\'U(W)Y*[+],"+
		"_-a.c/e\60g\61i\62k\63m\64o\65q\66s\67u8w9y:\3\2\5\4\2C\\c|\3\2\62;\5"+
		"\2\13\f\17\17\"\"\2\u0168\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2;\3"+
		"\2\2\2\2?\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5}\3\2\2\2\7"+
		"\177\3\2\2\2\t\u0081\3\2\2\2\13\u0083\3\2\2\2\r\u0085\3\2\2\2\17\u008a"+
		"\3\2\2\2\21\u008f\3\2\2\2\23\u0091\3\2\2\2\25\u0093\3\2\2\2\27\u0098\3"+
		"\2\2\2\31\u009c\3\2\2\2\33\u00a3\3\2\2\2\35\u00a8\3\2\2\2\37\u00ad\3\2"+
		"\2\2!\u00b2\3\2\2\2#\u00b8\3\2\2\2%\u00bb\3\2\2\2\'\u00bf\3\2\2\2)\u00c5"+
		"\3\2\2\2+\u00cb\3\2\2\2-\u00d4\3\2\2\2/\u00db\3\2\2\2\61\u00df\3\2\2\2"+
		"\63\u00e5\3\2\2\2\65\u00ea\3\2\2\2\67\u00f3\3\2\2\29\u00f5\3\2\2\2;\u00f8"+
		"\3\2\2\2=\u00fc\3\2\2\2?\u00fe\3\2\2\2A\u010c\3\2\2\2C\u010e\3\2\2\2E"+
		"\u011c\3\2\2\2G\u0123\3\2\2\2I\u0127\3\2\2\2K\u0129\3\2\2\2M\u012b\3\2"+
		"\2\2O\u012d\3\2\2\2Q\u012f\3\2\2\2S\u0131\3\2\2\2U\u0133\3\2\2\2W\u0135"+
		"\3\2\2\2Y\u0137\3\2\2\2[\u013a\3\2\2\2]\u013d\3\2\2\2_\u013f\3\2\2\2a"+
		"\u0141\3\2\2\2c\u0143\3\2\2\2e\u0146\3\2\2\2g\u0149\3\2\2\2i\u014b\3\2"+
		"\2\2k\u014d\3\2\2\2m\u0150\3\2\2\2o\u0153\3\2\2\2q\u0156\3\2\2\2s\u0159"+
		"\3\2\2\2u\u015c\3\2\2\2w\u015f\3\2\2\2y\u0161\3\2\2\2{|\7*\2\2|\4\3\2"+
		"\2\2}~\7+\2\2~\6\3\2\2\2\177\u0080\7=\2\2\u0080\b\3\2\2\2\u0081\u0082"+
		"\7}\2\2\u0082\n\3\2\2\2\u0083\u0084\7\177\2\2\u0084\f\3\2\2\2\u0085\u0086"+
		"\7v\2\2\u0086\u0087\7j\2\2\u0087\u0088\7g\2\2\u0088\u0089\7p\2\2\u0089"+
		"\16\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d"+
		"\u008e\7g\2\2\u008e\20\3\2\2\2\u008f\u0090\7.\2\2\u0090\22\3\2\2\2\u0091"+
		"\u0092\7\60\2\2\u0092\24\3\2\2\2\u0093\u0094\7d\2\2\u0094\u0095\7q\2\2"+
		"\u0095\u0096\7q\2\2\u0096\u0097\7n\2\2\u0097\26\3\2\2\2\u0098\u0099\7"+
		"k\2\2\u0099\u009a\7p\2\2\u009a\u009b\7v\2\2\u009b\30\3\2\2\2\u009c\u009d"+
		"\7u\2\2\u009d\u009e\7v\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7k\2\2\u00a0"+
		"\u00a1\7p\2\2\u00a1\u00a2\7i\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\7x\2\2\u00a4"+
		"\u00a5\7q\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7f\2\2\u00a7\34\3\2\2\2\u00a8"+
		"\u00a9\7p\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7n\2\2"+
		"\u00ac\36\3\2\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7"+
		"w\2\2\u00b0\u00b1\7g\2\2\u00b1 \3\2\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4"+
		"\7c\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7"+
		"\"\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7h\2\2\u00ba$\3\2\2\2\u00bb"+
		"\u00bc\7h\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7t\2\2\u00be&\3\2\2\2\u00bf"+
		"\u00c0\7y\2\2\u00c0\u00c1\7j\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7n\2\2"+
		"\u00c3\u00c4\7g\2\2\u00c4(\3\2\2\2\u00c5\u00c6\7d\2\2\u00c6\u00c7\7t\2"+
		"\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7m\2\2\u00ca*\3\2"+
		"\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf"+
		"\7v\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7w\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3,\3\2\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\u00d7\7v\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7p\2\2"+
		"\u00da.\3\2\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7y\2"+
		"\2\u00de\60\3\2\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2"+
		"\7c\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7u\2\2\u00e4\62\3\2\2\2\u00e5\u00e6"+
		"\7v\2\2\u00e6\u00e7\7j\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7u\2\2\u00e9"+
		"\64\3\2\2\2\u00ea\u00f0\5\67\34\2\u00eb\u00ef\5\67\34\2\u00ec\u00ef\5"+
		"=\37\2\u00ed\u00ef\59\35\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\66\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\t\2\2\2\u00f48\3"+
		"\2\2\2\u00f5\u00f6\7a\2\2\u00f6:\3\2\2\2\u00f7\u00f9\t\3\2\2\u00f8\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"<\3\2\2\2\u00fc\u00fd\t\3\2\2\u00fd>\3\2\2\2\u00fe\u0103\7$\2\2\u00ff"+
		"\u0102\5A!\2\u0100\u0102\13\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2"+
		"\2\2\u0102\u0105\3\2\2\2\u0103\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7$\2\2\u0107@\3\2\2\2\u0108"+
		"\u0109\7^\2\2\u0109\u010d\7$\2\2\u010a\u010b\7^\2\2\u010b\u010d\7^\2\2"+
		"\u010c\u0108\3\2\2\2\u010c\u010a\3\2\2\2\u010dB\3\2\2\2\u010e\u010f\7"+
		"\61\2\2\u010f\u0110\7\61\2\2\u0110\u0114\3\2\2\2\u0111\u0113\13\2\2\2"+
		"\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0115\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7\f\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\b\"\2\2\u011aD\3\2\2\2\u011b\u011d\t\4\2\2"+
		"\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\b#\2\2\u0121F\3\2\2\2\u0122\u0124"+
		"\7\17\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2"+
		"\u0125\u0126\7\f\2\2\u0126H\3\2\2\2\u0127\u0128\7,\2\2\u0128J\3\2\2\2"+
		"\u0129\u012a\7\61\2\2\u012aL\3\2\2\2\u012b\u012c\7-\2\2\u012cN\3\2\2\2"+
		"\u012d\u012e\7/\2\2\u012eP\3\2\2\2\u012f\u0130\7\'\2\2\u0130R\3\2\2\2"+
		"\u0131\u0132\7`\2\2\u0132T\3\2\2\2\u0133\u0134\7(\2\2\u0134V\3\2\2\2\u0135"+
		"\u0136\7~\2\2\u0136X\3\2\2\2\u0137\u0138\7(\2\2\u0138\u0139\7(\2\2\u0139"+
		"Z\3\2\2\2\u013a\u013b\7~\2\2\u013b\u013c\7~\2\2\u013c\\\3\2\2\2\u013d"+
		"\u013e\7#\2\2\u013e^\3\2\2\2\u013f\u0140\7\u0080\2\2\u0140`\3\2\2\2\u0141"+
		"\u0142\7?\2\2\u0142b\3\2\2\2\u0143\u0144\7?\2\2\u0144\u0145\7?\2\2\u0145"+
		"d\3\2\2\2\u0146\u0147\7#\2\2\u0147\u0148\7?\2\2\u0148f\3\2\2\2\u0149\u014a"+
		"\7>\2\2\u014ah\3\2\2\2\u014b\u014c\7@\2\2\u014cj\3\2\2\2\u014d\u014e\7"+
		">\2\2\u014e\u014f\7?\2\2\u014fl\3\2\2\2\u0150\u0151\7@\2\2\u0151\u0152"+
		"\7?\2\2\u0152n\3\2\2\2\u0153\u0154\7>\2\2\u0154\u0155\7>\2\2\u0155p\3"+
		"\2\2\2\u0156\u0157\7@\2\2\u0157\u0158\7@\2\2\u0158r\3\2\2\2\u0159\u015a"+
		"\7-\2\2\u015a\u015b\7-\2\2\u015bt\3\2\2\2\u015c\u015d\7/\2\2\u015d\u015e"+
		"\7/\2\2\u015ev\3\2\2\2\u015f\u0160\7]\2\2\u0160x\3\2\2\2\u0161\u0162\7"+
		"_\2\2\u0162z\3\2\2\2\f\2\u00ee\u00f0\u00fa\u0101\u0103\u010c\u0114\u011e"+
		"\u0123\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}