// Generated from C:/Users/joens/source/repos/p4\CANN.g4 by ANTLR 4.9.2
package gen;
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
		T__17=18, T__18=19, T__19=20, IMPORT=21, REAL_NUMERAL=22, INTEGER_NUMERAL=23, 
		SIMPLE_TYPE=24, R=25, Z=26, N=27, BOOL=28, MTRX=29, VEC=30, STRING=31, 
		BOOL_VALUE=32, STRING_VALUE=33, ID=34, LINE_COMMENT=35, COMPAREOP=36, 
		EQUALS=37, LOGIC_OP=38, NOT=39, DOT=40, LEFTBRACKET=41, RIGHTBRACKET=42, 
		LEFTCURLY=43, RIGHTCURLY=44, LEFTPAREN=45, RIGHTPAREN=46, COMMA=47, WHITESPACE=48, 
		LESS_THAN=49, LESS_THAN_OR_EQUALS=50, GREATER_THAN=51, GREATER_THAN_OR_EQUALS=52, 
		NOT_EQUALS=53, COLON=54, DOUBLECOLON=55, ACTIVATION_FUNC=56;
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
			"T__17", "T__18", "T__19", "IMPORT", "REAL_NUMERAL", "INTEGER_NUMERAL", 
			"SIMPLE_TYPE", "R", "Z", "N", "BOOL", "MTRX", "VEC", "STRING", "BOOL_VALUE", 
			"STRING_VALUE", "ID", "LINE_COMMENT", "COMPAREOP", "EQUALS", "LOGIC_OP", 
			"NOT", "DOT", "LEFTBRACKET", "RIGHTBRACKET", "LEFTCURLY", "RIGHTCURLY", 
			"LEFTPAREN", "RIGHTPAREN", "COMMA", "WHITESPACE", "LESS_THAN", "LESS_THAN_OR_EQUALS", 
			"GREATER_THAN", "GREATER_THAN_OR_EQUALS", "NOT_EQUALS", "COLON", "DOUBLECOLON", 
			"ACTIVATION_FUNC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'-'", "'*'", "'/'", "'+'", "'hada'", "'neunet'", "'loadTrainData'", 
			"'loadTestData'", "'train'", "'test'", "'export'", "'Dimensions'", "'Transpose'", 
			"'Size'", "'if'", "'while'", "'loop'", "'from'", "'to'", "'import'", 
			null, null, null, "'real'", "'int'", "'nat'", "'bool'", "'mtrx'", "'vec'", 
			"'string'", null, null, null, null, "'=='", "':='", null, "'!'", "'.'", 
			"'['", "']'", "'{'", "'}'", "'('", "')'", "','", null, "'<'", "'<='", 
			"'>'", "'>='", "'!='", "':'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "IMPORT", "REAL_NUMERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0193\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\6\27\u00f1\n\27\r\27"+
		"\16\27\u00f2\3\30\3\30\3\30\7\30\u00f8\n\30\f\30\16\30\u00fb\13\30\5\30"+
		"\u00fd\n\30\3\31\3\31\3\31\3\31\5\31\u0103\n\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\5!\u0130\n!\3\"\3\"\7\"\u0134\n\"\f\"\16\"\u0137"+
		"\13\"\3\"\3\"\3#\6#\u013c\n#\r#\16#\u013d\3$\3$\3$\3$\3$\7$\u0145\n$\f"+
		"$\16$\u0148\13$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\5\'\u0156\n\'"+
		"\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\6\61\u016b"+
		"\n\61\r\61\16\61\u016c\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\38\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\59\u0192\n9\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:\3\2\b\3\2\62;\3\2\63;\4\2"+
		"\f\f$$\5\2C\\aac|\5\2\f\f\17\17\"\"\5\2\13\f\17\17\"\"\2\u01a0\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7w\3\2\2\2\ty\3\2\2\2\13{\3\2"+
		"\2\2\r}\3\2\2\2\17\u0082\3\2\2\2\21\u0089\3\2\2\2\23\u0097\3\2\2\2\25"+
		"\u00a4\3\2\2\2\27\u00aa\3\2\2\2\31\u00af\3\2\2\2\33\u00b6\3\2\2\2\35\u00c1"+
		"\3\2\2\2\37\u00cb\3\2\2\2!\u00d0\3\2\2\2#\u00d3\3\2\2\2%\u00d9\3\2\2\2"+
		"\'\u00de\3\2\2\2)\u00e3\3\2\2\2+\u00e6\3\2\2\2-\u00ed\3\2\2\2/\u00fc\3"+
		"\2\2\2\61\u0102\3\2\2\2\63\u0104\3\2\2\2\65\u0109\3\2\2\2\67\u010d\3\2"+
		"\2\29\u0111\3\2\2\2;\u0116\3\2\2\2=\u011b\3\2\2\2?\u011f\3\2\2\2A\u012f"+
		"\3\2\2\2C\u0131\3\2\2\2E\u013b\3\2\2\2G\u013f\3\2\2\2I\u014b\3\2\2\2K"+
		"\u014e\3\2\2\2M\u0155\3\2\2\2O\u0157\3\2\2\2Q\u0159\3\2\2\2S\u015b\3\2"+
		"\2\2U\u015d\3\2\2\2W\u015f\3\2\2\2Y\u0161\3\2\2\2[\u0163\3\2\2\2]\u0165"+
		"\3\2\2\2_\u0167\3\2\2\2a\u016a\3\2\2\2c\u0170\3\2\2\2e\u0172\3\2\2\2g"+
		"\u0175\3\2\2\2i\u0177\3\2\2\2k\u017a\3\2\2\2m\u017d\3\2\2\2o\u017f\3\2"+
		"\2\2q\u0191\3\2\2\2st\7=\2\2t\4\3\2\2\2uv\7/\2\2v\6\3\2\2\2wx\7,\2\2x"+
		"\b\3\2\2\2yz\7\61\2\2z\n\3\2\2\2{|\7-\2\2|\f\3\2\2\2}~\7j\2\2~\177\7c"+
		"\2\2\177\u0080\7f\2\2\u0080\u0081\7c\2\2\u0081\16\3\2\2\2\u0082\u0083"+
		"\7p\2\2\u0083\u0084\7g\2\2\u0084\u0085\7w\2\2\u0085\u0086\7p\2\2\u0086"+
		"\u0087\7g\2\2\u0087\u0088\7v\2\2\u0088\20\3\2\2\2\u0089\u008a\7n\2\2\u008a"+
		"\u008b\7q\2\2\u008b\u008c\7c\2\2\u008c\u008d\7f\2\2\u008d\u008e\7V\2\2"+
		"\u008e\u008f\7t\2\2\u008f\u0090\7c\2\2\u0090\u0091\7k\2\2\u0091\u0092"+
		"\7p\2\2\u0092\u0093\7F\2\2\u0093\u0094\7c\2\2\u0094\u0095\7v\2\2\u0095"+
		"\u0096\7c\2\2\u0096\22\3\2\2\2\u0097\u0098\7n\2\2\u0098\u0099\7q\2\2\u0099"+
		"\u009a\7c\2\2\u009a\u009b\7f\2\2\u009b\u009c\7V\2\2\u009c\u009d\7g\2\2"+
		"\u009d\u009e\7u\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7F\2\2\u00a0\u00a1"+
		"\7c\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7c\2\2\u00a3\24\3\2\2\2\u00a4\u00a5"+
		"\7v\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00a9\7p\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7u\2\2\u00ad\u00ae\7v\2\2\u00ae\30\3\2\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\u00b1\7z\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7t\2\2"+
		"\u00b4\u00b5\7v\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7F\2\2\u00b7\u00b8\7"+
		"k\2\2\u00b8\u00b9\7o\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc"+
		"\7u\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7p\2\2\u00bf"+
		"\u00c0\7u\2\2\u00c0\34\3\2\2\2\u00c1\u00c2\7V\2\2\u00c2\u00c3\7t\2\2\u00c3"+
		"\u00c4\7c\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7r\2\2"+
		"\u00c7\u00c8\7q\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca\36\3\2"+
		"\2\2\u00cb\u00cc\7U\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7|\2\2\u00ce\u00cf"+
		"\7g\2\2\u00cf \3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7h\2\2\u00d2\"\3"+
		"\2\2\2\u00d3\u00d4\7y\2\2\u00d4\u00d5\7j\2\2\u00d5\u00d6\7k\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7\u00d8\7g\2\2\u00d8$\3\2\2\2\u00d9\u00da\7n\2\2\u00da"+
		"\u00db\7q\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7r\2\2\u00dd&\3\2\2\2\u00de"+
		"\u00df\7h\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7o\2\2"+
		"\u00e2(\3\2\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7q\2\2\u00e5*\3\2\2\2\u00e6"+
		"\u00e7\7k\2\2\u00e7\u00e8\7o\2\2\u00e8\u00e9\7r\2\2\u00e9\u00ea\7q\2\2"+
		"\u00ea\u00eb\7t\2\2\u00eb\u00ec\7v\2\2\u00ec,\3\2\2\2\u00ed\u00ee\5/\30"+
		"\2\u00ee\u00f0\7\60\2\2\u00ef\u00f1\t\2\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3.\3\2\2\2"+
		"\u00f4\u00fd\7\62\2\2\u00f5\u00f9\t\3\2\2\u00f6\u00f8\t\2\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00f5\3\2"+
		"\2\2\u00fd\60\3\2\2\2\u00fe\u0103\5\63\32\2\u00ff\u0103\5\67\34\2\u0100"+
		"\u0103\5\65\33\2\u0101\u0103\59\35\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3"+
		"\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\62\3\2\2\2\u0104"+
		"\u0105\7t\2\2\u0105\u0106\7g\2\2\u0106\u0107\7c\2\2\u0107\u0108\7n\2\2"+
		"\u0108\64\3\2\2\2\u0109\u010a\7k\2\2\u010a\u010b\7p\2\2\u010b\u010c\7"+
		"v\2\2\u010c\66\3\2\2\2\u010d\u010e\7p\2\2\u010e\u010f\7c\2\2\u010f\u0110"+
		"\7v\2\2\u01108\3\2\2\2\u0111\u0112\7d\2\2\u0112\u0113\7q\2\2\u0113\u0114"+
		"\7q\2\2\u0114\u0115\7n\2\2\u0115:\3\2\2\2\u0116\u0117\7o\2\2\u0117\u0118"+
		"\7v\2\2\u0118\u0119\7t\2\2\u0119\u011a\7z\2\2\u011a<\3\2\2\2\u011b\u011c"+
		"\7x\2\2\u011c\u011d\7g\2\2\u011d\u011e\7e\2\2\u011e>\3\2\2\2\u011f\u0120"+
		"\7u\2\2\u0120\u0121\7v\2\2\u0121\u0122\7t\2\2\u0122\u0123\7k\2\2\u0123"+
		"\u0124\7p\2\2\u0124\u0125\7i\2\2\u0125@\3\2\2\2\u0126\u0127\7v\2\2\u0127"+
		"\u0128\7t\2\2\u0128\u0129\7w\2\2\u0129\u0130\7g\2\2\u012a\u012b\7h\2\2"+
		"\u012b\u012c\7c\2\2\u012c\u012d\7n\2\2\u012d\u012e\7u\2\2\u012e\u0130"+
		"\7g\2\2\u012f\u0126\3\2\2\2\u012f\u012a\3\2\2\2\u0130B\3\2\2\2\u0131\u0135"+
		"\7$\2\2\u0132\u0134\n\4\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0138\u0139\7$\2\2\u0139D\3\2\2\2\u013a\u013c\t\5\2\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"F\3\2\2\2\u013f\u0140\7\61\2\2\u0140\u0141\7\"\2\2\u0141\u0142\7\61\2"+
		"\2\u0142\u0146\3\2\2\2\u0143\u0145\n\6\2\2\u0144\u0143\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014a\b$\2\2\u014aH\3\2\2\2\u014b\u014c\7?\2\2\u014c"+
		"\u014d\7?\2\2\u014dJ\3\2\2\2\u014e\u014f\7<\2\2\u014f\u0150\7?\2\2\u0150"+
		"L\3\2\2\2\u0151\u0152\7(\2\2\u0152\u0156\7(\2\2\u0153\u0154\7~\2\2\u0154"+
		"\u0156\7~\2\2\u0155\u0151\3\2\2\2\u0155\u0153\3\2\2\2\u0156N\3\2\2\2\u0157"+
		"\u0158\7#\2\2\u0158P\3\2\2\2\u0159\u015a\7\60\2\2\u015aR\3\2\2\2\u015b"+
		"\u015c\7]\2\2\u015cT\3\2\2\2\u015d\u015e\7_\2\2\u015eV\3\2\2\2\u015f\u0160"+
		"\7}\2\2\u0160X\3\2\2\2\u0161\u0162\7\177\2\2\u0162Z\3\2\2\2\u0163\u0164"+
		"\7*\2\2\u0164\\\3\2\2\2\u0165\u0166\7+\2\2\u0166^\3\2\2\2\u0167\u0168"+
		"\7.\2\2\u0168`\3\2\2\2\u0169\u016b\t\7\2\2\u016a\u0169\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u016f\b\61\2\2\u016fb\3\2\2\2\u0170\u0171\7>\2\2\u0171d\3\2\2\2\u0172"+
		"\u0173\7>\2\2\u0173\u0174\7?\2\2\u0174f\3\2\2\2\u0175\u0176\7@\2\2\u0176"+
		"h\3\2\2\2\u0177\u0178\7@\2\2\u0178\u0179\7?\2\2\u0179j\3\2\2\2\u017a\u017b"+
		"\7#\2\2\u017b\u017c\7?\2\2\u017cl\3\2\2\2\u017d\u017e\7<\2\2\u017en\3"+
		"\2\2\2\u017f\u0180\7<\2\2\u0180\u0181\7<\2\2\u0181p\3\2\2\2\u0182\u0183"+
		"\7t\2\2\u0183\u0184\7g\2\2\u0184\u0185\7n\2\2\u0185\u0192\7w\2\2\u0186"+
		"\u0187\7u\2\2\u0187\u0188\7k\2\2\u0188\u0189\7i\2\2\u0189\u018a\7o\2\2"+
		"\u018a\u018b\7q\2\2\u018b\u018c\7k\2\2\u018c\u0192\7f\2\2\u018d\u018e"+
		"\7v\2\2\u018e\u018f\7c\2\2\u018f\u0190\7p\2\2\u0190\u0192\7j\2\2\u0191"+
		"\u0182\3\2\2\2\u0191\u0186\3\2\2\2\u0191\u018d\3\2\2\2\u0192r\3\2\2\2"+
		"\16\2\u00f2\u00f9\u00fc\u0102\u012f\u0135\u013d\u0146\u0155\u016c\u0191"+
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