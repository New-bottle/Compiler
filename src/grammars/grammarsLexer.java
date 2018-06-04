package grammars;// Generated from /home/yanhongyu/Git/homework/Compiler/src/grammars.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarsLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "BOOL_ID", 
		"INT_ID", "STR_ID", "VOID_ID", "NULL_ID", "TRUE_VAL", "FALSE_VAL", "IF_ID", 
		"FOR_ID", "WHILE_ID", "BREAK_ID", "CONT_ID", "RET_ID", "NEW_ID", "CLASS_DEC", 
		"THIS_ID", "BoolLiteral", "ID", "ID_LETTER", "UDL", "NonZeroDigit", "IntLiteral", 
		"DIGIT", "STRING", "ESC", "LINE_COMMENT", "BlockComment", "WS", "NEWLINE", 
		"MUL", "DIV", "ADD", "SUB", "MOD", "XOR", "AND", "OR", "LAND", "LOR", 
		"NOT", "BNOT", "ASSIGN", "EQ", "NE", "LT", "GT", "LE", "GE", "SHL", "SHR", 
		"DADD", "DSUB", "LBracket", "RBracket"
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


	public grammarsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammars/grammars.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u017b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\5\32\u00ec\n\32\3\33\3\33\3\33\3\33\7\33\u00f2"+
		"\n\33\f\33\16\33\u00f5\13\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\7"+
		"\37\u00ff\n\37\f\37\16\37\u0102\13\37\3\37\5\37\u0105\n\37\3 \3 \3!\3"+
		"!\3!\7!\u010c\n!\f!\16!\u010f\13!\3!\3!\3\"\3\"\3\"\3\"\5\"\u0117\n\""+
		"\3#\3#\3#\3#\7#\u011d\n#\f#\16#\u0120\13#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u012a"+
		"\n$\f$\16$\u012d\13$\3$\3$\3$\3$\3$\3%\6%\u0135\n%\r%\16%\u0136\3%\3%"+
		"\3&\5&\u013c\n&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3"+
		";\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\5\u010d\u011e\u012b\2@\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37\2!\20#\21%\22"+
		"\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\29\2;\2=\33?\2A\34C\2E\35G"+
		"\36I\37K M!O\"Q#S$U%W&Y\'[(])_*a+c,e-g.i/k\60m\61o\62q\63s\64u\65w\66"+
		"y\67{8}9\3\2\6\4\2C\\c|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\2\u0180\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2=\3\2\2\2\2A\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\3\177\3\2\2\2\5\u0081\3\2\2\2\7\u0083\3\2\2\2\t\u0085\3\2\2\2\13"+
		"\u0087\3\2\2\2\r\u0089\3\2\2\2\17\u008b\3\2\2\2\21\u0090\3\2\2\2\23\u0092"+
		"\3\2\2\2\25\u0097\3\2\2\2\27\u009b\3\2\2\2\31\u00a2\3\2\2\2\33\u00a7\3"+
		"\2\2\2\35\u00ac\3\2\2\2\37\u00b1\3\2\2\2!\u00b7\3\2\2\2#\u00ba\3\2\2\2"+
		"%\u00be\3\2\2\2\'\u00c4\3\2\2\2)\u00ca\3\2\2\2+\u00d3\3\2\2\2-\u00da\3"+
		"\2\2\2/\u00de\3\2\2\2\61\u00e4\3\2\2\2\63\u00eb\3\2\2\2\65\u00ed\3\2\2"+
		"\2\67\u00f6\3\2\2\29\u00f8\3\2\2\2;\u00fa\3\2\2\2=\u0104\3\2\2\2?\u0106"+
		"\3\2\2\2A\u0108\3\2\2\2C\u0116\3\2\2\2E\u0118\3\2\2\2G\u0125\3\2\2\2I"+
		"\u0134\3\2\2\2K\u013b\3\2\2\2M\u013f\3\2\2\2O\u0141\3\2\2\2Q\u0143\3\2"+
		"\2\2S\u0145\3\2\2\2U\u0147\3\2\2\2W\u0149\3\2\2\2Y\u014b\3\2\2\2[\u014d"+
		"\3\2\2\2]\u014f\3\2\2\2_\u0152\3\2\2\2a\u0155\3\2\2\2c\u0157\3\2\2\2e"+
		"\u0159\3\2\2\2g\u015b\3\2\2\2i\u015e\3\2\2\2k\u0161\3\2\2\2m\u0163\3\2"+
		"\2\2o\u0165\3\2\2\2q\u0168\3\2\2\2s\u016b\3\2\2\2u\u016e\3\2\2\2w\u0171"+
		"\3\2\2\2y\u0174\3\2\2\2{\u0177\3\2\2\2}\u0179\3\2\2\2\177\u0080\7*\2\2"+
		"\u0080\4\3\2\2\2\u0081\u0082\7+\2\2\u0082\6\3\2\2\2\u0083\u0084\7.\2\2"+
		"\u0084\b\3\2\2\2\u0085\u0086\7=\2\2\u0086\n\3\2\2\2\u0087\u0088\7}\2\2"+
		"\u0088\f\3\2\2\2\u0089\u008a\7\177\2\2\u008a\16\3\2\2\2\u008b\u008c\7"+
		"g\2\2\u008c\u008d\7n\2\2\u008d\u008e\7u\2\2\u008e\u008f\7g\2\2\u008f\20"+
		"\3\2\2\2\u0090\u0091\7\60\2\2\u0091\22\3\2\2\2\u0092\u0093\7d\2\2\u0093"+
		"\u0094\7q\2\2\u0094\u0095\7q\2\2\u0095\u0096\7n\2\2\u0096\24\3\2\2\2\u0097"+
		"\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a\7v\2\2\u009a\26\3\2\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e\u009f\7k\2\2"+
		"\u009f\u00a0\7p\2\2\u00a0\u00a1\7i\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7"+
		"x\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7f\2\2\u00a6\32"+
		"\3\2\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7n\2\2\u00aa"+
		"\u00ab\7n\2\2\u00ab\34\3\2\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7t\2\2\u00ae"+
		"\u00af\7w\2\2\u00af\u00b0\7g\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7h\2\2\u00b2"+
		"\u00b3\7c\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7g\2\2"+
		"\u00b6 \3\2\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7h\2\2\u00b9\"\3\2\2\2"+
		"\u00ba\u00bb\7h\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7t\2\2\u00bd$\3\2\2"+
		"\2\u00be\u00bf\7y\2\2\u00bf\u00c0\7j\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2"+
		"\7n\2\2\u00c2\u00c3\7g\2\2\u00c3&\3\2\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6"+
		"\7t\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7m\2\2\u00c9"+
		"(\3\2\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7p\2\2\u00cd"+
		"\u00ce\7v\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7w\2\2"+
		"\u00d1\u00d2\7g\2\2\u00d2*\3\2\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7g\2"+
		"\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9"+
		"\7p\2\2\u00d9,\3\2\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd"+
		"\7y\2\2\u00dd.\3\2\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1"+
		"\7c\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7u\2\2\u00e3\60\3\2\2\2\u00e4\u00e5"+
		"\7v\2\2\u00e5\u00e6\7j\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7u\2\2\u00e8"+
		"\62\3\2\2\2\u00e9\u00ec\5\35\17\2\u00ea\u00ec\5\37\20\2\u00eb\u00e9\3"+
		"\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\64\3\2\2\2\u00ed\u00f3\5\67\34\2\u00ee"+
		"\u00f2\5\67\34\2\u00ef\u00f2\5? \2\u00f0\u00f2\59\35\2\u00f1\u00ee\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\66\3\2\2\2\u00f5\u00f3\3\2\2"+
		"\2\u00f6\u00f7\t\2\2\2\u00f78\3\2\2\2\u00f8\u00f9\7a\2\2\u00f9:\3\2\2"+
		"\2\u00fa\u00fb\t\3\2\2\u00fb<\3\2\2\2\u00fc\u0100\5;\36\2\u00fd\u00ff"+
		"\5? \2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0105\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\7\62"+
		"\2\2\u0104\u00fc\3\2\2\2\u0104\u0103\3\2\2\2\u0105>\3\2\2\2\u0106\u0107"+
		"\t\4\2\2\u0107@\3\2\2\2\u0108\u010d\7$\2\2\u0109\u010c\5C\"\2\u010a\u010c"+
		"\13\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2"+
		"\u010d\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u0110\u0111\7$\2\2\u0111B\3\2\2\2\u0112\u0113\7^\2\2\u0113\u0117"+
		"\7$\2\2\u0114\u0115\7^\2\2\u0115\u0117\7^\2\2\u0116\u0112\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117D\3\2\2\2\u0118\u0119\7\61\2\2\u0119\u011a\7\61\2"+
		"\2\u011a\u011e\3\2\2\2\u011b\u011d\13\2\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7\f\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\b#\2\2\u0124F\3\2\2\2\u0125\u0126\7\61\2\2\u0126\u0127\7,\2\2\u0127"+
		"\u012b\3\2\2\2\u0128\u012a\13\2\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3"+
		"\2\2\2\u012b\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u012f\7,\2\2\u012f\u0130\7\61\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0132\b$\2\2\u0132H\3\2\2\2\u0133\u0135\t\5\2\2\u0134\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\b%\2\2\u0139J\3\2\2\2\u013a\u013c\7\17\2\2"+
		"\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e"+
		"\7\f\2\2\u013eL\3\2\2\2\u013f\u0140\7,\2\2\u0140N\3\2\2\2\u0141\u0142"+
		"\7\61\2\2\u0142P\3\2\2\2\u0143\u0144\7-\2\2\u0144R\3\2\2\2\u0145\u0146"+
		"\7/\2\2\u0146T\3\2\2\2\u0147\u0148\7\'\2\2\u0148V\3\2\2\2\u0149\u014a"+
		"\7`\2\2\u014aX\3\2\2\2\u014b\u014c\7(\2\2\u014cZ\3\2\2\2\u014d\u014e\7"+
		"~\2\2\u014e\\\3\2\2\2\u014f\u0150\7(\2\2\u0150\u0151\7(\2\2\u0151^\3\2"+
		"\2\2\u0152\u0153\7~\2\2\u0153\u0154\7~\2\2\u0154`\3\2\2\2\u0155\u0156"+
		"\7#\2\2\u0156b\3\2\2\2\u0157\u0158\7\u0080\2\2\u0158d\3\2\2\2\u0159\u015a"+
		"\7?\2\2\u015af\3\2\2\2\u015b\u015c\7?\2\2\u015c\u015d\7?\2\2\u015dh\3"+
		"\2\2\2\u015e\u015f\7#\2\2\u015f\u0160\7?\2\2\u0160j\3\2\2\2\u0161\u0162"+
		"\7>\2\2\u0162l\3\2\2\2\u0163\u0164\7@\2\2\u0164n\3\2\2\2\u0165\u0166\7"+
		">\2\2\u0166\u0167\7?\2\2\u0167p\3\2\2\2\u0168\u0169\7@\2\2\u0169\u016a"+
		"\7?\2\2\u016ar\3\2\2\2\u016b\u016c\7>\2\2\u016c\u016d\7>\2\2\u016dt\3"+
		"\2\2\2\u016e\u016f\7@\2\2\u016f\u0170\7@\2\2\u0170v\3\2\2\2\u0171\u0172"+
		"\7-\2\2\u0172\u0173\7-\2\2\u0173x\3\2\2\2\u0174\u0175\7/\2\2\u0175\u0176"+
		"\7/\2\2\u0176z\3\2\2\2\u0177\u0178\7]\2\2\u0178|\3\2\2\2\u0179\u017a\7"+
		"_\2\2\u017a~\3\2\2\2\17\2\u00eb\u00f1\u00f3\u0100\u0104\u010b\u010d\u0116"+
		"\u011e\u012b\u0136\u013b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}