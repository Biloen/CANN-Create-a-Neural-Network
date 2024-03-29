// Generated from C:/Users/joens/source/repos/p4\CANN.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CANNLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, IMPORT=20, REAL_NUMERAL=21, INTEGER_NUMERAL=22, SIMPLE_TYPE=23, 
		R=24, Z=25, N=26, BOOL=27, MTRX=28, VEC=29, STRING=30, BOOL_VALUE=31, 
		STRING_VALUE=32, ID=33, LINE_COMMENT=34, COMPAREOP=35, EQUALS=36, LOGIC_OP=37, 
		NOT=38, DOT=39, LEFTBRACKET=40, RIGHTBRACKET=41, LEFTCURLY=42, RIGHTCURLY=43, 
		LEFTPAREN=44, RIGHTPAREN=45, COMMA=46, WHITESPACE=47, LESS_THAN=48, LESS_THAN_OR_EQUALS=49, 
		GREATER_THAN=50, GREATER_THAN_OR_EQUALS=51, NOT_EQUALS=52, COLON=53, DOUBLECOLON=54, 
		ACTIVATION_FUNC=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "IMPORT", "REAL_NUMERAL", "INTEGER_NUMERAL", "SIMPLE_TYPE", 
			"R", "Z", "N", "BOOL", "MTRX", "VEC", "STRING", "BOOL_VALUE", "STRING_VALUE", 
			"ID", "LINE_COMMENT", "COMPAREOP", "EQUALS", "LOGIC_OP", "NOT", "DOT", 
			"LEFTBRACKET", "RIGHTBRACKET", "LEFTCURLY", "RIGHTCURLY", "LEFTPAREN", 
			"RIGHTPAREN", "COMMA", "WHITESPACE", "LESS_THAN", "LESS_THAN_OR_EQUALS", 
			"GREATER_THAN", "GREATER_THAN_OR_EQUALS", "NOT_EQUALS", "COLON", "DOUBLECOLON", 
			"ACTIVATION_FUNC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'-'", "'*'", "'/'", "'+'", "'hada'", "'neunet'", "'loadData'", 
			"'train'", "'test'", "'export'", "'Dimensions'", "'Transpose'", "'Size'", 
			"'if'", "'while'", "'loop'", "'from'", "'to'", "'import'", null, null, 
			null, "'real'", "'int'", "'nat'", "'bool'", "'mtrx'", "'vec'", "'string'", 
			null, null, null, null, "'=='", "':='", null, "'!'", "'.'", "'['", "']'", 
			"'{'", "'}'", "'('", "')'", "','", null, "'<'", "'<='", "'>'", "'>='", 
			"'!='", "':'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "IMPORT", "REAL_NUMERAL", 
			"INTEGER_NUMERAL", "SIMPLE_TYPE", "R", "Z", "N", "BOOL", "MTRX", "VEC", 
			"STRING", "BOOL_VALUE", "STRING_VALUE", "ID", "LINE_COMMENT", "COMPAREOP", 
			"EQUALS", "LOGIC_OP", "NOT", "DOT", "LEFTBRACKET", "RIGHTBRACKET", "LEFTCURLY", 
			"RIGHTCURLY", "LEFTPAREN", "RIGHTPAREN", "COMMA", "WHITESPACE", "LESS_THAN", 
			"LESS_THAN_OR_EQUALS", "GREATER_THAN", "GREATER_THAN_OR_EQUALS", "NOT_EQUALS", 
			"COLON", "DOUBLECOLON", "ACTIVATION_FUNC"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public CANNLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CANN.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u017f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\6\26\u00dd\n\26\r\26\16\26\u00de\3\27\3"+
		"\27\3\27\7\27\u00e4\n\27\f\27\16\27\u00e7\13\27\5\27\u00e9\n\27\3\30\3"+
		"\30\3\30\3\30\5\30\u00ef\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \5 \u011c\n \3!\3!\7!\u0120\n!\f!\16!\u0123\13!\3!\3"+
		"!\3\"\6\"\u0128\n\"\r\"\16\"\u0129\3#\3#\3#\3#\3#\7#\u0131\n#\f#\16#\u0134"+
		"\13#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\5&\u0142\n&\3\'\3\'\3(\3(\3)"+
		"\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\6\60\u0157\n\60\r\60\16\60"+
		"\u0158\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\58\u017e\n8\2\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9\3\2\b\3\2\62;\3\2\63;\4\2\f\f$$\5\2C\\aac"+
		"|\5\2\f\f\17\17\"\"\5\2\13\f\17\17\"\"\2\u018c\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2"+
		"\5s\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2\17\u0080\3\2"+
		"\2\2\21\u0087\3\2\2\2\23\u0090\3\2\2\2\25\u0096\3\2\2\2\27\u009b\3\2\2"+
		"\2\31\u00a2\3\2\2\2\33\u00ad\3\2\2\2\35\u00b7\3\2\2\2\37\u00bc\3\2\2\2"+
		"!\u00bf\3\2\2\2#\u00c5\3\2\2\2%\u00ca\3\2\2\2\'\u00cf\3\2\2\2)\u00d2\3"+
		"\2\2\2+\u00d9\3\2\2\2-\u00e8\3\2\2\2/\u00ee\3\2\2\2\61\u00f0\3\2\2\2\63"+
		"\u00f5\3\2\2\2\65\u00f9\3\2\2\2\67\u00fd\3\2\2\29\u0102\3\2\2\2;\u0107"+
		"\3\2\2\2=\u010b\3\2\2\2?\u011b\3\2\2\2A\u011d\3\2\2\2C\u0127\3\2\2\2E"+
		"\u012b\3\2\2\2G\u0137\3\2\2\2I\u013a\3\2\2\2K\u0141\3\2\2\2M\u0143\3\2"+
		"\2\2O\u0145\3\2\2\2Q\u0147\3\2\2\2S\u0149\3\2\2\2U\u014b\3\2\2\2W\u014d"+
		"\3\2\2\2Y\u014f\3\2\2\2[\u0151\3\2\2\2]\u0153\3\2\2\2_\u0156\3\2\2\2a"+
		"\u015c\3\2\2\2c\u015e\3\2\2\2e\u0161\3\2\2\2g\u0163\3\2\2\2i\u0166\3\2"+
		"\2\2k\u0169\3\2\2\2m\u016b\3\2\2\2o\u017d\3\2\2\2qr\7=\2\2r\4\3\2\2\2"+
		"st\7/\2\2t\6\3\2\2\2uv\7,\2\2v\b\3\2\2\2wx\7\61\2\2x\n\3\2\2\2yz\7-\2"+
		"\2z\f\3\2\2\2{|\7j\2\2|}\7c\2\2}~\7f\2\2~\177\7c\2\2\177\16\3\2\2\2\u0080"+
		"\u0081\7p\2\2\u0081\u0082\7g\2\2\u0082\u0083\7w\2\2\u0083\u0084\7p\2\2"+
		"\u0084\u0085\7g\2\2\u0085\u0086\7v\2\2\u0086\20\3\2\2\2\u0087\u0088\7"+
		"n\2\2\u0088\u0089\7q\2\2\u0089\u008a\7c\2\2\u008a\u008b\7f\2\2\u008b\u008c"+
		"\7F\2\2\u008c\u008d\7c\2\2\u008d\u008e\7v\2\2\u008e\u008f\7c\2\2\u008f"+
		"\22\3\2\2\2\u0090\u0091\7v\2\2\u0091\u0092\7t\2\2\u0092\u0093\7c\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095\24\3\2\2\2\u0096\u0097\7v\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\26\3\2\2\2\u009b"+
		"\u009c\7g\2\2\u009c\u009d\7z\2\2\u009d\u009e\7r\2\2\u009e\u009f\7q\2\2"+
		"\u009f\u00a0\7t\2\2\u00a0\u00a1\7v\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7"+
		"F\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7"+
		"\7p\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7q\2\2\u00aa"+
		"\u00ab\7p\2\2\u00ab\u00ac\7u\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7V\2\2\u00ae"+
		"\u00af\7t\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7u\2\2"+
		"\u00b2\u00b3\7r\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6"+
		"\7g\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7U\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba"+
		"\7|\2\2\u00ba\u00bb\7g\2\2\u00bb\36\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be"+
		"\7h\2\2\u00be \3\2\2\2\u00bf\u00c0\7y\2\2\u00c0\u00c1\7j\2\2\u00c1\u00c2"+
		"\7k\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7g\2\2\u00c4\"\3\2\2\2\u00c5\u00c6"+
		"\7n\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7r\2\2\u00c9"+
		"$\3\2\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7q\2\2\u00cd"+
		"\u00ce\7o\2\2\u00ce&\3\2\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7q\2\2\u00d1"+
		"(\3\2\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7o\2\2\u00d4\u00d5\7r\2\2\u00d5"+
		"\u00d6\7q\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7v\2\2\u00d8*\3\2\2\2\u00d9"+
		"\u00da\5-\27\2\u00da\u00dc\7\60\2\2\u00db\u00dd\t\2\2\2\u00dc\u00db\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		",\3\2\2\2\u00e0\u00e9\7\62\2\2\u00e1\u00e5\t\3\2\2\u00e2\u00e4\t\2\2\2"+
		"\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8"+
		"\u00e1\3\2\2\2\u00e9.\3\2\2\2\u00ea\u00ef\5\61\31\2\u00eb\u00ef\5\65\33"+
		"\2\u00ec\u00ef\5\63\32\2\u00ed\u00ef\5\67\34\2\u00ee\u00ea\3\2\2\2\u00ee"+
		"\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\60\3\2\2"+
		"\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4"+
		"\7n\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8"+
		"\7v\2\2\u00f8\64\3\2\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc"+
		"\7v\2\2\u00fc\66\3\2\2\2\u00fd\u00fe\7d\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100"+
		"\7q\2\2\u0100\u0101\7n\2\2\u01018\3\2\2\2\u0102\u0103\7o\2\2\u0103\u0104"+
		"\7v\2\2\u0104\u0105\7t\2\2\u0105\u0106\7z\2\2\u0106:\3\2\2\2\u0107\u0108"+
		"\7x\2\2\u0108\u0109\7g\2\2\u0109\u010a\7e\2\2\u010a<\3\2\2\2\u010b\u010c"+
		"\7u\2\2\u010c\u010d\7v\2\2\u010d\u010e\7t\2\2\u010e\u010f\7k\2\2\u010f"+
		"\u0110\7p\2\2\u0110\u0111\7i\2\2\u0111>\3\2\2\2\u0112\u0113\7v\2\2\u0113"+
		"\u0114\7t\2\2\u0114\u0115\7w\2\2\u0115\u011c\7g\2\2\u0116\u0117\7h\2\2"+
		"\u0117\u0118\7c\2\2\u0118\u0119\7n\2\2\u0119\u011a\7u\2\2\u011a\u011c"+
		"\7g\2\2\u011b\u0112\3\2\2\2\u011b\u0116\3\2\2\2\u011c@\3\2\2\2\u011d\u0121"+
		"\7$\2\2\u011e\u0120\n\4\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0124\u0125\7$\2\2\u0125B\3\2\2\2\u0126\u0128\t\5\2\2\u0127\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"D\3\2\2\2\u012b\u012c\7\61\2\2\u012c\u012d\7\"\2\2\u012d\u012e\7\61\2"+
		"\2\u012e\u0132\3\2\2\2\u012f\u0131\n\6\2\2\u0130\u012f\3\2\2\2\u0131\u0134"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0136\b#\2\2\u0136F\3\2\2\2\u0137\u0138\7?\2\2\u0138"+
		"\u0139\7?\2\2\u0139H\3\2\2\2\u013a\u013b\7<\2\2\u013b\u013c\7?\2\2\u013c"+
		"J\3\2\2\2\u013d\u013e\7(\2\2\u013e\u0142\7(\2\2\u013f\u0140\7~\2\2\u0140"+
		"\u0142\7~\2\2\u0141\u013d\3\2\2\2\u0141\u013f\3\2\2\2\u0142L\3\2\2\2\u0143"+
		"\u0144\7#\2\2\u0144N\3\2\2\2\u0145\u0146\7\60\2\2\u0146P\3\2\2\2\u0147"+
		"\u0148\7]\2\2\u0148R\3\2\2\2\u0149\u014a\7_\2\2\u014aT\3\2\2\2\u014b\u014c"+
		"\7}\2\2\u014cV\3\2\2\2\u014d\u014e\7\177\2\2\u014eX\3\2\2\2\u014f\u0150"+
		"\7*\2\2\u0150Z\3\2\2\2\u0151\u0152\7+\2\2\u0152\\\3\2\2\2\u0153\u0154"+
		"\7.\2\2\u0154^\3\2\2\2\u0155\u0157\t\7\2\2\u0156\u0155\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\b\60\2\2\u015b`\3\2\2\2\u015c\u015d\7>\2\2\u015db\3\2\2\2\u015e"+
		"\u015f\7>\2\2\u015f\u0160\7?\2\2\u0160d\3\2\2\2\u0161\u0162\7@\2\2\u0162"+
		"f\3\2\2\2\u0163\u0164\7@\2\2\u0164\u0165\7?\2\2\u0165h\3\2\2\2\u0166\u0167"+
		"\7#\2\2\u0167\u0168\7?\2\2\u0168j\3\2\2\2\u0169\u016a\7<\2\2\u016al\3"+
		"\2\2\2\u016b\u016c\7<\2\2\u016c\u016d\7<\2\2\u016dn\3\2\2\2\u016e\u016f"+
		"\7t\2\2\u016f\u0170\7g\2\2\u0170\u0171\7n\2\2\u0171\u017e\7w\2\2\u0172"+
		"\u0173\7u\2\2\u0173\u0174\7k\2\2\u0174\u0175\7i\2\2\u0175\u0176\7o\2\2"+
		"\u0176\u0177\7q\2\2\u0177\u0178\7k\2\2\u0178\u017e\7f\2\2\u0179\u017a"+
		"\7v\2\2\u017a\u017b\7c\2\2\u017b\u017c\7p\2\2\u017c\u017e\7j\2\2\u017d"+
		"\u016e\3\2\2\2\u017d\u0172\3\2\2\2\u017d\u0179\3\2\2\2\u017ep\3\2\2\2"+
		"\16\2\u00de\u00e5\u00e8\u00ee\u011b\u0121\u0129\u0132\u0141\u0158\u017d"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}