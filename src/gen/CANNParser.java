// Generated from C:/Users/joens/source/repos/p4\CANN.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CANNParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_stmts = 1, RULE_identifier = 2, RULE_stmt = 3, RULE_declaration = 4, 
		RULE_variabledeclaration = 5, RULE_assignment = 6, RULE_expression = 7, 
		RULE_boolean_expr = 8, RULE_arithmetic_expr = 9, RULE_vector_expr = 10, 
		RULE_vector_val = 11, RULE_nnDimensions = 12, RULE_nndeclaration = 13, 
		RULE_datadeclaration = 14, RULE_vectordeclaration = 15, RULE_matrixdeclaration = 16, 
		RULE_matrx_val = 17, RULE_functionCall = 18, RULE_trainFunction = 19, 
		RULE_testFunction = 20, RULE_importFunction = 21, RULE_exportFunction = 22, 
		RULE_nn = 23, RULE_epoch = 24, RULE_learning_rate = 25, RULE_input = 26, 
		RULE_output = 27, RULE_mathFunctions = 28, RULE_matrix_function = 29, 
		RULE_vector_function = 30, RULE_num = 31, RULE_value = 32, RULE_control_structure = 33, 
		RULE_type = 34, RULE_vectornumeral = 35, RULE_realnumeral = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmts", "identifier", "stmt", "declaration", "variabledeclaration", 
			"assignment", "expression", "boolean_expr", "arithmetic_expr", "vector_expr", 
			"vector_val", "nnDimensions", "nndeclaration", "datadeclaration", "vectordeclaration", 
			"matrixdeclaration", "matrx_val", "functionCall", "trainFunction", "testFunction", 
			"importFunction", "exportFunction", "nn", "epoch", "learning_rate", "input", 
			"output", "mathFunctions", "matrix_function", "vector_function", "num", 
			"value", "control_structure", "type", "vectornumeral", "realnumeral"
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

	@Override
	public String getGrammarFileName() { return "CANN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CANNParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CANNParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			stmts();
			setState(75);
			match(EOF);
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

	public static class StmtsContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << REAL_NUMERAL) | (1L << INTEGER_NUMERAL) | (1L << SIMPLE_TYPE) | (1L << MTRX) | (1L << VEC) | (1L << BOOL_VALUE) | (1L << ID) | (1L << NOT) | (1L << LEFTBRACKET) | (1L << LEFTPAREN))) != 0)) {
				{
				{
				setState(77);
				stmt();
				setState(78);
				match(T__0);
				}
				}
				setState(84);
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierProductionContext extends IdentifierContext {
		public TerminalNode ID() { return getToken(CANNParser.ID, 0); }
		public IdentifierProductionContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterIdentifierProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitIdentifierProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitIdentifierProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		try {
			_localctx = new IdentifierProductionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprStmtContext extends StmtContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallStmtContext extends StmtContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterFunctionCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitFunctionCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitFunctionCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CtrlStmtContext extends StmtContext {
		public Control_structureContext control_structure() {
			return getRuleContext(Control_structureContext.class,0);
		}
		public CtrlStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterCtrlStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitCtrlStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitCtrlStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssStmtContext extends StmtContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterAssStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitAssStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitAssStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DclStmtContext extends StmtContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DclStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterDclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitDclStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitDclStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new DclStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				declaration();
				}
				break;
			case 2:
				_localctx = new AssStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				assignment();
				}
				break;
			case 3:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				expression();
				}
				break;
			case 4:
				_localctx = new CtrlStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				control_structure();
				}
				break;
			case 5:
				_localctx = new FunctionCallStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				functionCall();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MtrxDeclContext extends DeclarationContext {
		public MatrixdeclarationContext matrixdeclaration() {
			return getRuleContext(MatrixdeclarationContext.class,0);
		}
		public MtrxDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterMtrxDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitMtrxDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitMtrxDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VecDeclContext extends DeclarationContext {
		public VectordeclarationContext vectordeclaration() {
			return getRuleContext(VectordeclarationContext.class,0);
		}
		public VecDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVecDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVecDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVecDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarialbeDeclContext extends DeclarationContext {
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public VarialbeDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVarialbeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVarialbeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVarialbeDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NnDeclContext extends DeclarationContext {
		public NndeclarationContext nndeclaration() {
			return getRuleContext(NndeclarationContext.class,0);
		}
		public NnDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterNnDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitNnDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitNnDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataDeclContext extends DeclarationContext {
		public DatadeclarationContext datadeclaration() {
			return getRuleContext(DatadeclarationContext.class,0);
		}
		public DataDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterDataDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitDataDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitDataDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMPLE_TYPE:
				_localctx = new VarialbeDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				variabledeclaration();
				}
				break;
			case T__6:
				_localctx = new NnDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				nndeclaration();
				}
				break;
			case T__7:
			case T__8:
				_localctx = new DataDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				datadeclaration();
				}
				break;
			case VEC:
				_localctx = new VecDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				vectordeclaration();
				}
				break;
			case MTRX:
				_localctx = new MtrxDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				matrixdeclaration();
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

	public static class VariabledeclarationContext extends ParserRuleContext {
		public VariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaration; }
	 
		public VariabledeclarationContext() { }
		public void copyFrom(VariabledeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDclContext extends VariabledeclarationContext {
		public Token declType;
		public IdentifierContext vardclid;
		public TerminalNode SIMPLE_TYPE() { return getToken(CANNParser.SIMPLE_TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarDclContext(VariabledeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVarDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVarDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVarDcl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDclValueContext extends VariabledeclarationContext {
		public Token declType;
		public IdentifierContext vardclid;
		public ValueContext vardclval;
		public TerminalNode EQUALS() { return getToken(CANNParser.EQUALS, 0); }
		public TerminalNode SIMPLE_TYPE() { return getToken(CANNParser.SIMPLE_TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VarDclValueContext(VariabledeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVarDclValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVarDclValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVarDclValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclarationContext variabledeclaration() throws RecognitionException {
		VariabledeclarationContext _localctx = new VariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variabledeclaration);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new VarDclValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				((VarDclValueContext)_localctx).declType = match(SIMPLE_TYPE);
				setState(102);
				((VarDclValueContext)_localctx).vardclid = identifier();
				setState(103);
				match(EQUALS);
				setState(104);
				((VarDclValueContext)_localctx).vardclval = value();
				}
				break;
			case 2:
				_localctx = new VarDclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				((VarDclContext)_localctx).declType = match(SIMPLE_TYPE);
				setState(107);
				((VarDclContext)_localctx).vardclid = identifier();
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssValueContext extends AssignmentContext {
		public IdentifierContext ident;
		public ValueContext assvalue;
		public TerminalNode EQUALS() { return getToken(CANNParser.EQUALS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssValueContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterAssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitAssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitAssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			_localctx = new AssValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((AssValueContext)_localctx).ident = identifier();
			setState(111);
			match(EQUALS);
			setState(112);
			((AssValueContext)_localctx).assvalue = value();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithmExprContext extends ExpressionContext {
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public ArithmExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterArithmExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitArithmExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitArithmExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VecExprContext extends ExpressionContext {
		public Vector_exprContext vector_expr() {
			return getRuleContext(Vector_exprContext.class,0);
		}
		public VecExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVecExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVecExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatrxExprContext extends ExpressionContext {
		public Matrx_valContext matrx_val() {
			return getRuleContext(Matrx_valContext.class,0);
		}
		public MatrxExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterMatrxExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitMatrxExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitMatrxExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprContext extends ExpressionContext {
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public BoolExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new BoolExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				boolean_expr(0);
				}
				break;
			case 2:
				_localctx = new ArithmExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				arithmetic_expr(0);
				}
				break;
			case 3:
				_localctx = new VecExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				vector_expr(0);
				}
				break;
			case 4:
				_localctx = new MatrxExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				matrx_val();
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

	public static class Boolean_exprContext extends ParserRuleContext {
		public Boolean_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expr; }
	 
		public Boolean_exprContext() { }
		public void copyFrom(Boolean_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolIdentifierContext extends Boolean_exprContext {
		public IdentifierContext booleanidenfifier;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BoolIdentifierContext(Boolean_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterBoolIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitBoolIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitBoolIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanComparisonContext extends Boolean_exprContext {
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(CANNParser.GREATER_THAN, 0); }
		public GreaterThanComparisonContext(Boolean_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterGreaterThanComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitGreaterThanComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitGreaterThanComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolLogicContext extends Boolean_exprContext {
		public Boolean_exprContext expr1;
		public Boolean_exprContext expr2;
		public TerminalNode LOGIC_OP() { return getToken(CANNParser.LOGIC_OP, 0); }
		public List<Boolean_exprContext> boolean_expr() {
			return getRuleContexts(Boolean_exprContext.class);
		}
		public Boolean_exprContext boolean_expr(int i) {
			return getRuleContext(Boolean_exprContext.class,i);
		}
		public BoolLogicContext(Boolean_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterBoolLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitBoolLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitBoolLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolComparisonContext extends Boolean_exprContext {
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public TerminalNode COMPAREOP() { return getToken(CANNParser.COMPAREOP, 0); }
		public BoolComparisonContext(Boolean_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterBoolComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitBoolComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitBoolComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolValueContext extends Boolean_exprContext {
		public Token bvalue;
		public TerminalNode BOOL_VALUE() { return getToken(CANNParser.BOOL_VALUE, 0); }
		public BoolValueContext(Boolean_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNegationContext extends Boolean_exprContext {
		public Boolean_exprContext bexpr;
		public TerminalNode NOT() { return getToken(CANNParser.NOT, 0); }
		public TerminalNode LEFTPAREN() { return getToken(CANNParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(CANNParser.RIGHTPAREN, 0); }
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public BoolNegationContext(Boolean_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterBoolNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitBoolNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitBoolNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolParenExprContext extends Boolean_exprContext {
		public Boolean_exprContext bexpr;
		public TerminalNode LEFTPAREN() { return getToken(CANNParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(CANNParser.RIGHTPAREN, 0); }
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public BoolParenExprContext(Boolean_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterBoolParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitBoolParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitBoolParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_exprContext boolean_expr() throws RecognitionException {
		return boolean_expr(0);
	}

	private Boolean_exprContext boolean_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Boolean_exprContext _localctx = new Boolean_exprContext(_ctx, _parentState);
		Boolean_exprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_boolean_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new BoolValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(121);
				((BoolValueContext)_localctx).bvalue = match(BOOL_VALUE);
				}
				break;
			case 2:
				{
				_localctx = new BoolParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(LEFTPAREN);
				setState(123);
				((BoolParenExprContext)_localctx).bexpr = boolean_expr(0);
				setState(124);
				match(RIGHTPAREN);
				}
				break;
			case 3:
				{
				_localctx = new BoolNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(NOT);
				setState(127);
				match(LEFTPAREN);
				setState(128);
				((BoolNegationContext)_localctx).bexpr = boolean_expr(0);
				setState(129);
				match(RIGHTPAREN);
				}
				break;
			case 4:
				{
				_localctx = new BoolComparisonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				arithmetic_expr(0);
				setState(132);
				match(COMPAREOP);
				setState(133);
				arithmetic_expr(0);
				}
				break;
			case 5:
				{
				_localctx = new GreaterThanComparisonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				arithmetic_expr(0);
				setState(136);
				match(GREATER_THAN);
				setState(137);
				arithmetic_expr(0);
				}
				break;
			case 6:
				{
				_localctx = new BoolIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				((BoolIdentifierContext)_localctx).booleanidenfifier = identifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolLogicContext(new Boolean_exprContext(_parentctx, _parentState));
					((BoolLogicContext)_localctx).expr1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_boolean_expr);
					setState(142);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(143);
					match(LOGIC_OP);
					setState(144);
					((BoolLogicContext)_localctx).expr2 = boolean_expr(3);
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Arithmetic_exprContext extends ParserRuleContext {
		public Arithmetic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expr; }
	 
		public Arithmetic_exprContext() { }
		public void copyFrom(Arithmetic_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithmeticUnaryExprContext extends Arithmetic_exprContext {
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public ArithmeticUnaryExprContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterArithmeticUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitArithmeticUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitArithmeticUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends Arithmetic_exprContext {
		public NumContext numeralvalue;
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public NumberContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticParenExprContext extends Arithmetic_exprContext {
		public TerminalNode LEFTPAREN() { return getToken(CANNParser.LEFTPAREN, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(CANNParser.RIGHTPAREN, 0); }
		public ArithmeticParenExprContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterArithmeticParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitArithmeticParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitArithmeticParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticPlusOpExprContext extends Arithmetic_exprContext {
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public ArithmeticPlusOpExprContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterArithmeticPlusOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitArithmeticPlusOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitArithmeticPlusOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticIdentifierContext extends Arithmetic_exprContext {
		public IdentifierContext arithmeticidentifiervalue;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArithmeticIdentifierContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterArithmeticIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitArithmeticIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitArithmeticIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticTimesOpExprContext extends Arithmetic_exprContext {
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public ArithmeticTimesOpExprContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterArithmeticTimesOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitArithmeticTimesOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitArithmeticTimesOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticDivOpExprContext extends Arithmetic_exprContext {
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public ArithmeticDivOpExprContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterArithmeticDivOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitArithmeticDivOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitArithmeticDivOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticMinusOpExprContext extends Arithmetic_exprContext {
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public ArithmeticMinusOpExprContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterArithmeticMinusOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitArithmeticMinusOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitArithmeticMinusOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_exprContext arithmetic_expr() throws RecognitionException {
		return arithmetic_expr(0);
	}

	private Arithmetic_exprContext arithmetic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_exprContext _localctx = new Arithmetic_exprContext(_ctx, _parentState);
		Arithmetic_exprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_arithmetic_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL_NUMERAL:
			case INTEGER_NUMERAL:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(151);
				((NumberContext)_localctx).numeralvalue = num();
				}
				break;
			case LEFTPAREN:
				{
				_localctx = new ArithmeticParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(LEFTPAREN);
				setState(153);
				arithmetic_expr(0);
				setState(154);
				match(RIGHTPAREN);
				}
				break;
			case T__1:
				{
				_localctx = new ArithmeticUnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(T__1);
				setState(157);
				arithmetic_expr(6);
				}
				break;
			case ID:
				{
				_localctx = new ArithmeticIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				((ArithmeticIdentifierContext)_localctx).arithmeticidentifiervalue = identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticTimesOpExprContext(new Arithmetic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(161);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(162);
						match(T__2);
						setState(163);
						arithmetic_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticDivOpExprContext(new Arithmetic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(164);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(165);
						match(T__3);
						setState(166);
						arithmetic_expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticPlusOpExprContext(new Arithmetic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(167);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(168);
						match(T__4);
						setState(169);
						arithmetic_expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticMinusOpExprContext(new Arithmetic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(170);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(171);
						match(T__1);
						setState(172);
						arithmetic_expr(3);
						}
						break;
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Vector_exprContext extends ParserRuleContext {
		public Vector_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_expr; }
	 
		public Vector_exprContext() { }
		public void copyFrom(Vector_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VectorValContext extends Vector_exprContext {
		public Vector_valContext vectorvaluevalue;
		public Vector_valContext vector_val() {
			return getRuleContext(Vector_valContext.class,0);
		}
		public VectorValContext(Vector_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVectorVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVectorVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVectorVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorMinusExpressionContext extends Vector_exprContext {
		public List<Vector_exprContext> vector_expr() {
			return getRuleContexts(Vector_exprContext.class);
		}
		public Vector_exprContext vector_expr(int i) {
			return getRuleContext(Vector_exprContext.class,i);
		}
		public VectorMinusExpressionContext(Vector_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVectorMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVectorMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVectorMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorHadaExpressionContext extends Vector_exprContext {
		public List<Vector_exprContext> vector_expr() {
			return getRuleContexts(Vector_exprContext.class);
		}
		public Vector_exprContext vector_expr(int i) {
			return getRuleContext(Vector_exprContext.class,i);
		}
		public VectorHadaExpressionContext(Vector_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVectorHadaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVectorHadaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVectorHadaExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorMultiplicationExpressionContext extends Vector_exprContext {
		public Vector_exprContext vecex;
		public Arithmetic_exprContext arithex;
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public Vector_exprContext vector_expr() {
			return getRuleContext(Vector_exprContext.class,0);
		}
		public VectorMultiplicationExpressionContext(Vector_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVectorMultiplicationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVectorMultiplicationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVectorMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorPlusExpressionContext extends Vector_exprContext {
		public List<Vector_exprContext> vector_expr() {
			return getRuleContexts(Vector_exprContext.class);
		}
		public Vector_exprContext vector_expr(int i) {
			return getRuleContext(Vector_exprContext.class,i);
		}
		public VectorPlusExpressionContext(Vector_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVectorPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVectorPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVectorPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorParenExpressionContext extends Vector_exprContext {
		public TerminalNode LEFTPAREN() { return getToken(CANNParser.LEFTPAREN, 0); }
		public Vector_exprContext vector_expr() {
			return getRuleContext(Vector_exprContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(CANNParser.RIGHTPAREN, 0); }
		public VectorParenExpressionContext(Vector_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVectorParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVectorParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVectorParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vector_exprContext vector_expr() throws RecognitionException {
		return vector_expr(0);
	}

	private Vector_exprContext vector_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Vector_exprContext _localctx = new Vector_exprContext(_ctx, _parentState);
		Vector_exprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_vector_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new VectorParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(179);
				match(LEFTPAREN);
				setState(180);
				vector_expr(0);
				setState(181);
				match(RIGHTPAREN);
				}
				break;
			case 2:
				{
				_localctx = new VectorMultiplicationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				((VectorMultiplicationExpressionContext)_localctx).arithex = arithmetic_expr(0);
				setState(184);
				match(T__2);
				setState(185);
				((VectorMultiplicationExpressionContext)_localctx).vecex = vector_expr(3);
				}
				break;
			case 3:
				{
				_localctx = new VectorValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				((VectorValContext)_localctx).vectorvaluevalue = vector_val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new VectorHadaExpressionContext(new Vector_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vector_expr);
						setState(190);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(191);
						match(T__5);
						setState(192);
						vector_expr(7);
						}
						break;
					case 2:
						{
						_localctx = new VectorPlusExpressionContext(new Vector_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vector_expr);
						setState(193);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(194);
						match(T__4);
						setState(195);
						vector_expr(6);
						}
						break;
					case 3:
						{
						_localctx = new VectorMinusExpressionContext(new Vector_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vector_expr);
						setState(196);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(197);
						match(T__1);
						setState(198);
						vector_expr(5);
						}
						break;
					case 4:
						{
						_localctx = new VectorMultiplicationExpressionContext(new Vector_exprContext(_parentctx, _parentState));
						((VectorMultiplicationExpressionContext)_localctx).vecex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_vector_expr);
						setState(199);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(200);
						match(T__2);
						setState(201);
						((VectorMultiplicationExpressionContext)_localctx).arithex = arithmetic_expr(0);
						}
						break;
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Vector_valContext extends ParserRuleContext {
		public Vector_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_val; }
	 
		public Vector_valContext() { }
		public void copyFrom(Vector_valContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VecIdContext extends Vector_valContext {
		public IdentifierContext vectoridentifiervalue;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VecIdContext(Vector_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVecId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVecId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVecId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorValueNumeralContext extends Vector_valContext {
		public Arithmetic_exprContext vecval;
		public Arithmetic_exprContext vecval1;
		public TerminalNode LEFTBRACKET() { return getToken(CANNParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(CANNParser.RIGHTBRACKET, 0); }
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CANNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CANNParser.COMMA, i);
		}
		public VectorValueNumeralContext(Vector_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVectorValueNumeral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVectorValueNumeral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVectorValueNumeral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vector_valContext vector_val() throws RecognitionException {
		Vector_valContext _localctx = new Vector_valContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vector_val);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTBRACKET:
				_localctx = new VectorValueNumeralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(LEFTBRACKET);
				setState(208);
				((VectorValueNumeralContext)_localctx).vecval = arithmetic_expr(0);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(209);
					match(COMMA);
					setState(210);
					((VectorValueNumeralContext)_localctx).vecval1 = arithmetic_expr(0);
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				match(RIGHTBRACKET);
				}
				break;
			case ID:
				_localctx = new VecIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				((VecIdContext)_localctx).vectoridentifiervalue = identifier();
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

	public static class NnDimensionsContext extends ParserRuleContext {
		public NnDimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nnDimensions; }
	 
		public NnDimensionsContext() { }
		public void copyFrom(NnDimensionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NnDimsContext extends NnDimensionsContext {
		public Token dimval;
		public Token dimval1;
		public TerminalNode LEFTCURLY() { return getToken(CANNParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(CANNParser.RIGHTCURLY, 0); }
		public List<TerminalNode> INTEGER_NUMERAL() { return getTokens(CANNParser.INTEGER_NUMERAL); }
		public TerminalNode INTEGER_NUMERAL(int i) {
			return getToken(CANNParser.INTEGER_NUMERAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CANNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CANNParser.COMMA, i);
		}
		public NnDimsContext(NnDimensionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterNnDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitNnDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitNnDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NnDimensionsContext nnDimensions() throws RecognitionException {
		NnDimensionsContext _localctx = new NnDimensionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nnDimensions);
		int _la;
		try {
			_localctx = new NnDimsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(LEFTCURLY);
			setState(222);
			((NnDimsContext)_localctx).dimval = match(INTEGER_NUMERAL);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(223);
				match(COMMA);
				setState(224);
				((NnDimsContext)_localctx).dimval1 = match(INTEGER_NUMERAL);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(RIGHTCURLY);
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

	public static class NndeclarationContext extends ParserRuleContext {
		public NndeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nndeclaration; }
	 
		public NndeclarationContext() { }
		public void copyFrom(NndeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NnDclContext extends NndeclarationContext {
		public IdentifierContext ident;
		public NnDimensionsContext nnDim;
		public TerminalNode EQUALS() { return getToken(CANNParser.EQUALS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NnDimensionsContext nnDimensions() {
			return getRuleContext(NnDimensionsContext.class,0);
		}
		public NnDclContext(NndeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterNnDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitNnDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitNnDcl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NnDclImportContext extends NndeclarationContext {
		public IdentifierContext ident;
		public TerminalNode EQUALS() { return getToken(CANNParser.EQUALS, 0); }
		public ImportFunctionContext importFunction() {
			return getRuleContext(ImportFunctionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NnDclImportContext(NndeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterNnDclImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitNnDclImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitNnDclImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NndeclarationContext nndeclaration() throws RecognitionException {
		NndeclarationContext _localctx = new NndeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nndeclaration);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new NnDclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(T__6);
				setState(233);
				((NnDclContext)_localctx).ident = identifier();
				setState(234);
				match(EQUALS);
				setState(235);
				((NnDclContext)_localctx).nnDim = nnDimensions();
				}
				break;
			case 2:
				_localctx = new NnDclImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(T__6);
				setState(238);
				((NnDclImportContext)_localctx).ident = identifier();
				setState(239);
				match(EQUALS);
				setState(240);
				importFunction();
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

	public static class DatadeclarationContext extends ParserRuleContext {
		public DatadeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datadeclaration; }
	 
		public DatadeclarationContext() { }
		public void copyFrom(DatadeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DataDclContext extends DatadeclarationContext {
		public IdentifierContext id1;
		public IdentifierContext id2;
		public TerminalNode LEFTPAREN() { return getToken(CANNParser.LEFTPAREN, 0); }
		public TerminalNode COMMA() { return getToken(CANNParser.COMMA, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(CANNParser.RIGHTPAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DataDclContext(DatadeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterDataDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitDataDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitDataDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatadeclarationContext datadeclaration() throws RecognitionException {
		DatadeclarationContext _localctx = new DatadeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_datadeclaration);
		int _la;
		try {
			_localctx = new DataDclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(245);
			match(LEFTPAREN);
			setState(246);
			((DataDclContext)_localctx).id1 = identifier();
			setState(247);
			match(COMMA);
			setState(248);
			((DataDclContext)_localctx).id2 = identifier();
			setState(249);
			match(RIGHTPAREN);
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

	public static class VectordeclarationContext extends ParserRuleContext {
		public VectordeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectordeclaration; }
	 
		public VectordeclarationContext() { }
		public void copyFrom(VectordeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VecDclContext extends VectordeclarationContext {
		public TypeContext vecdcltype;
		public Arithmetic_exprContext vecdcldim;
		public IdentifierContext vecdclid;
		public TerminalNode VEC() { return getToken(CANNParser.VEC, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(CANNParser.LEFTBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(CANNParser.COMMA, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(CANNParser.RIGHTBRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VecDclContext(VectordeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVecDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVecDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVecDcl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VecDclValContext extends VectordeclarationContext {
		public TypeContext vecdcltype;
		public Arithmetic_exprContext vecdcldim;
		public IdentifierContext vecdclid;
		public Vector_exprContext vecdclval;
		public TerminalNode VEC() { return getToken(CANNParser.VEC, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(CANNParser.LEFTBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(CANNParser.COMMA, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(CANNParser.RIGHTBRACKET, 0); }
		public TerminalNode EQUALS() { return getToken(CANNParser.EQUALS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Vector_exprContext vector_expr() {
			return getRuleContext(Vector_exprContext.class,0);
		}
		public VecDclValContext(VectordeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVecDclVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVecDclVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVecDclVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectordeclarationContext vectordeclaration() throws RecognitionException {
		VectordeclarationContext _localctx = new VectordeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_vectordeclaration);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new VecDclValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(VEC);
				setState(252);
				match(LEFTBRACKET);
				setState(253);
				((VecDclValContext)_localctx).vecdcltype = type();
				setState(254);
				match(COMMA);
				setState(255);
				((VecDclValContext)_localctx).vecdcldim = arithmetic_expr(0);
				setState(256);
				match(RIGHTBRACKET);
				setState(257);
				((VecDclValContext)_localctx).vecdclid = identifier();
				setState(258);
				match(EQUALS);
				setState(259);
				((VecDclValContext)_localctx).vecdclval = vector_expr(0);
				}
				break;
			case 2:
				_localctx = new VecDclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(VEC);
				setState(262);
				match(LEFTBRACKET);
				setState(263);
				((VecDclContext)_localctx).vecdcltype = type();
				setState(264);
				match(COMMA);
				setState(265);
				((VecDclContext)_localctx).vecdcldim = arithmetic_expr(0);
				setState(266);
				match(RIGHTBRACKET);
				setState(267);
				((VecDclContext)_localctx).vecdclid = identifier();
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

	public static class MatrixdeclarationContext extends ParserRuleContext {
		public MatrixdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixdeclaration; }
	 
		public MatrixdeclarationContext() { }
		public void copyFrom(MatrixdeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MatrixDclContext extends MatrixdeclarationContext {
		public TypeContext matrixdcltype;
		public Arithmetic_exprContext matrxdcldim1;
		public Arithmetic_exprContext matrxdcldim2;
		public IdentifierContext matrixdclid;
		public TerminalNode MTRX() { return getToken(CANNParser.MTRX, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(CANNParser.LEFTBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CANNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CANNParser.COMMA, i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(CANNParser.RIGHTBRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MatrixDclContext(MatrixdeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterMatrixDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitMatrixDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitMatrixDcl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatrixDclValContext extends MatrixdeclarationContext {
		public TypeContext matrixdcltype;
		public Arithmetic_exprContext matrxdcldim1;
		public Arithmetic_exprContext matrxdcldim2;
		public IdentifierContext matrixdclid;
		public Matrx_valContext matrixdclval;
		public TerminalNode MTRX() { return getToken(CANNParser.MTRX, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(CANNParser.LEFTBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CANNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CANNParser.COMMA, i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(CANNParser.RIGHTBRACKET, 0); }
		public TerminalNode EQUALS() { return getToken(CANNParser.EQUALS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Matrx_valContext matrx_val() {
			return getRuleContext(Matrx_valContext.class,0);
		}
		public MatrixDclValContext(MatrixdeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterMatrixDclVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitMatrixDclVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitMatrixDclVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixdeclarationContext matrixdeclaration() throws RecognitionException {
		MatrixdeclarationContext _localctx = new MatrixdeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_matrixdeclaration);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new MatrixDclValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(MTRX);
				setState(272);
				match(LEFTBRACKET);
				setState(273);
				((MatrixDclValContext)_localctx).matrixdcltype = type();
				setState(274);
				match(COMMA);
				setState(275);
				((MatrixDclValContext)_localctx).matrxdcldim1 = arithmetic_expr(0);
				setState(276);
				match(COMMA);
				setState(277);
				((MatrixDclValContext)_localctx).matrxdcldim2 = arithmetic_expr(0);
				setState(278);
				match(RIGHTBRACKET);
				setState(279);
				((MatrixDclValContext)_localctx).matrixdclid = identifier();
				setState(280);
				match(EQUALS);
				setState(281);
				((MatrixDclValContext)_localctx).matrixdclval = matrx_val();
				}
				break;
			case 2:
				_localctx = new MatrixDclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(MTRX);
				setState(284);
				match(LEFTBRACKET);
				setState(285);
				((MatrixDclContext)_localctx).matrixdcltype = type();
				setState(286);
				match(COMMA);
				setState(287);
				((MatrixDclContext)_localctx).matrxdcldim1 = arithmetic_expr(0);
				setState(288);
				match(COMMA);
				setState(289);
				((MatrixDclContext)_localctx).matrxdcldim2 = arithmetic_expr(0);
				setState(290);
				match(RIGHTBRACKET);
				setState(291);
				((MatrixDclContext)_localctx).matrixdclid = identifier();
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

	public static class Matrx_valContext extends ParserRuleContext {
		public Matrx_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrx_val; }
	 
		public Matrx_valContext() { }
		public void copyFrom(Matrx_valContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MatrixValueContext extends Matrx_valContext {
		public Vector_valContext firstvec;
		public Vector_valContext subseqvec;
		public TerminalNode LEFTBRACKET() { return getToken(CANNParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(CANNParser.RIGHTBRACKET, 0); }
		public List<Vector_valContext> vector_val() {
			return getRuleContexts(Vector_valContext.class);
		}
		public Vector_valContext vector_val(int i) {
			return getRuleContext(Vector_valContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CANNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CANNParser.COMMA, i);
		}
		public MatrixValueContext(Matrx_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterMatrixValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitMatrixValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitMatrixValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matrx_valContext matrx_val() throws RecognitionException {
		Matrx_valContext _localctx = new Matrx_valContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_matrx_val);
		int _la;
		try {
			_localctx = new MatrixValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(LEFTBRACKET);
			setState(296);
			((MatrixValueContext)_localctx).firstvec = vector_val();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(297);
				match(COMMA);
				setState(298);
				((MatrixValueContext)_localctx).subseqvec = vector_val();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(RIGHTBRACKET);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MathfunContext extends FunctionCallContext {
		public MathFunctionsContext mathFunctions() {
			return getRuleContext(MathFunctionsContext.class,0);
		}
		public MathfunContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterMathfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitMathfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitMathfun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrainfunContext extends FunctionCallContext {
		public TrainFunctionContext trainFunction() {
			return getRuleContext(TrainFunctionContext.class,0);
		}
		public TrainfunContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterTrainfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitTrainfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitTrainfun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TestfunContext extends FunctionCallContext {
		public TestFunctionContext testFunction() {
			return getRuleContext(TestFunctionContext.class,0);
		}
		public TestfunContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterTestfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitTestfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitTestfun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExfunContext extends FunctionCallContext {
		public ExportFunctionContext exportFunction() {
			return getRuleContext(ExportFunctionContext.class,0);
		}
		public ExfunContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterExfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitExfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitExfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionCall);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new TrainfunContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				trainFunction();
				}
				break;
			case T__10:
				_localctx = new TestfunContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				testFunction();
				}
				break;
			case T__11:
				_localctx = new ExfunContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				exportFunction();
				}
				break;
			case T__12:
			case T__13:
			case T__14:
				_localctx = new MathfunContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				mathFunctions();
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

	public static class TrainFunctionContext extends ParserRuleContext {
		public TrainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trainFunction; }
	 
		public TrainFunctionContext() { }
		public void copyFrom(TrainFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrainParamsContext extends TrainFunctionContext {
		public TerminalNode LEFTPAREN() { return getToken(CANNParser.LEFTPAREN, 0); }
		public NnContext nn() {
			return getRuleContext(NnContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CANNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CANNParser.COMMA, i);
		}
		public EpochContext epoch() {
			return getRuleContext(EpochContext.class,0);
		}
		public Learning_rateContext learning_rate() {
			return getRuleContext(Learning_rateContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(CANNParser.RIGHTPAREN, 0); }
		public TrainParamsContext(TrainFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterTrainParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitTrainParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitTrainParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrainFunctionContext trainFunction() throws RecognitionException {
		TrainFunctionContext _localctx = new TrainFunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_trainFunction);
		try {
			_localctx = new TrainParamsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(T__9);
			setState(313);
			match(LEFTPAREN);
			setState(314);
			nn();
			setState(315);
			match(COMMA);
			setState(316);
			epoch();
			setState(317);
			match(COMMA);
			setState(318);
			learning_rate();
			setState(319);
			match(COMMA);
			setState(320);
			input();
			setState(321);
			match(COMMA);
			setState(322);
			output();
			setState(323);
			match(RIGHTPAREN);
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

	public static class TestFunctionContext extends ParserRuleContext {
		public TestFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testFunction; }
	 
		public TestFunctionContext() { }
		public void copyFrom(TestFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TestParamsContext extends TestFunctionContext {
		public TerminalNode LEFTPAREN() { return getToken(CANNParser.LEFTPAREN, 0); }
		public NnContext nn() {
			return getRuleContext(NnContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CANNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CANNParser.COMMA, i);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(CANNParser.RIGHTPAREN, 0); }
		public TestParamsContext(TestFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterTestParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitTestParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitTestParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestFunctionContext testFunction() throws RecognitionException {
		TestFunctionContext _localctx = new TestFunctionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_testFunction);
		try {
			_localctx = new TestParamsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__10);
			setState(326);
			match(LEFTPAREN);
			setState(327);
			nn();
			setState(328);
			match(COMMA);
			setState(329);
			input();
			setState(330);
			match(COMMA);
			setState(331);
			output();
			setState(332);
			match(RIGHTPAREN);
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

	public static class ImportFunctionContext extends ParserRuleContext {
		public ImportFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFunction; }
	 
		public ImportFunctionContext() { }
		public void copyFrom(ImportFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImpParamsContext extends ImportFunctionContext {
		public TerminalNode IMPORT() { return getToken(CANNParser.IMPORT, 0); }
		public TerminalNode LEFTPAREN() { return getToken(CANNParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(CANNParser.RIGHTPAREN, 0); }
		public ImpParamsContext(ImportFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterImpParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitImpParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitImpParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFunctionContext importFunction() throws RecognitionException {
		ImportFunctionContext _localctx = new ImportFunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_importFunction);
		try {
			_localctx = new ImpParamsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(IMPORT);
			setState(335);
			match(LEFTPAREN);
			setState(336);
			match(RIGHTPAREN);
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

	public static class ExportFunctionContext extends ParserRuleContext {
		public ExportFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportFunction; }
	 
		public ExportFunctionContext() { }
		public void copyFrom(ExportFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExParamsContext extends ExportFunctionContext {
		public TerminalNode LEFTPAREN() { return getToken(CANNParser.LEFTPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(CANNParser.RIGHTPAREN, 0); }
		public ExParamsContext(ExportFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterExParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitExParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitExParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportFunctionContext exportFunction() throws RecognitionException {
		ExportFunctionContext _localctx = new ExportFunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exportFunction);
		try {
			_localctx = new ExParamsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__11);
			setState(339);
			match(LEFTPAREN);
			setState(340);
			identifier();
			setState(341);
			match(RIGHTPAREN);
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

	public static class NnContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterNn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitNn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitNn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NnContext nn() throws RecognitionException {
		NnContext _localctx = new NnContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			identifier();
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

	public static class EpochContext extends ParserRuleContext {
		public EpochContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epoch; }
	 
		public EpochContext() { }
		public void copyFrom(EpochContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntepochContext extends EpochContext {
		public TerminalNode INTEGER_NUMERAL() { return getToken(CANNParser.INTEGER_NUMERAL, 0); }
		public IntepochContext(EpochContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterIntepoch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitIntepoch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitIntepoch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdepochContext extends EpochContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdepochContext(EpochContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterIdepoch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitIdepoch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitIdepoch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EpochContext epoch() throws RecognitionException {
		EpochContext _localctx = new EpochContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_epoch);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NUMERAL:
				_localctx = new IntepochContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(INTEGER_NUMERAL);
				}
				break;
			case ID:
				_localctx = new IdepochContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				identifier();
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

	public static class Learning_rateContext extends ParserRuleContext {
		public Learning_rateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_learning_rate; }
	 
		public Learning_rateContext() { }
		public void copyFrom(Learning_rateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdlrContext extends Learning_rateContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdlrContext(Learning_rateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterIdlr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitIdlr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitIdlr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReallrContext extends Learning_rateContext {
		public RealnumeralContext realnumeral() {
			return getRuleContext(RealnumeralContext.class,0);
		}
		public ReallrContext(Learning_rateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterReallr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitReallr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitReallr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Learning_rateContext learning_rate() throws RecognitionException {
		Learning_rateContext _localctx = new Learning_rateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_learning_rate);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL_NUMERAL:
				_localctx = new ReallrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				realnumeral();
				}
				break;
			case ID:
				_localctx = new IdlrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				identifier();
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

	public static class InputContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			identifier();
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

	public static class OutputContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			identifier();
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

	public static class MathFunctionsContext extends ParserRuleContext {
		public MathFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathFunctions; }
	 
		public MathFunctionsContext() { }
		public void copyFrom(MathFunctionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MathFunctionsMatrixContext extends MathFunctionsContext {
		public Matrix_functionContext matrix_function() {
			return getRuleContext(Matrix_functionContext.class,0);
		}
		public MathFunctionsMatrixContext(MathFunctionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterMathFunctionsMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitMathFunctionsMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitMathFunctionsMatrix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathFunctionsVectorContext extends MathFunctionsContext {
		public Vector_functionContext vector_function() {
			return getRuleContext(Vector_functionContext.class,0);
		}
		public MathFunctionsVectorContext(MathFunctionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterMathFunctionsVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitMathFunctionsVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitMathFunctionsVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathFunctionsContext mathFunctions() throws RecognitionException {
		MathFunctionsContext _localctx = new MathFunctionsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mathFunctions);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
				_localctx = new MathFunctionsMatrixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				matrix_function();
				}
				break;
			case T__14:
				_localctx = new MathFunctionsVectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				vector_function();
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

	public static class Matrix_functionContext extends ParserRuleContext {
		public Matrix_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_function; }
	 
		public Matrix_functionContext() { }
		public void copyFrom(Matrix_functionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DimensionFunctionContext extends Matrix_functionContext {
		public TerminalNode LEFTPAREN() { return getToken(CANNParser.LEFTPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(CANNParser.RIGHTPAREN, 0); }
		public DimensionFunctionContext(Matrix_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterDimensionFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitDimensionFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitDimensionFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransposeFunctionContext extends Matrix_functionContext {
		public TerminalNode LEFTPAREN() { return getToken(CANNParser.LEFTPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(CANNParser.RIGHTPAREN, 0); }
		public TransposeFunctionContext(Matrix_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterTransposeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitTransposeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitTransposeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matrix_functionContext matrix_function() throws RecognitionException {
		Matrix_functionContext _localctx = new Matrix_functionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_matrix_function);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new DimensionFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(T__12);
				setState(362);
				match(LEFTPAREN);
				setState(363);
				identifier();
				setState(364);
				match(RIGHTPAREN);
				}
				break;
			case T__13:
				_localctx = new TransposeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(T__13);
				setState(367);
				match(LEFTPAREN);
				setState(368);
				identifier();
				setState(369);
				match(RIGHTPAREN);
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

	public static class Vector_functionContext extends ParserRuleContext {
		public Vector_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_function; }
	 
		public Vector_functionContext() { }
		public void copyFrom(Vector_functionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VecFunctionContext extends Vector_functionContext {
		public TerminalNode LEFTPAREN() { return getToken(CANNParser.LEFTPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(CANNParser.RIGHTPAREN, 0); }
		public VecFunctionContext(Vector_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVecFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVecFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVecFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vector_functionContext vector_function() throws RecognitionException {
		Vector_functionContext _localctx = new Vector_functionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_vector_function);
		try {
			_localctx = new VecFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(T__14);
			setState(374);
			match(LEFTPAREN);
			setState(375);
			identifier();
			setState(376);
			match(RIGHTPAREN);
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

	public static class NumContext extends ParserRuleContext {
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
	 
		public NumContext() { }
		public void copyFrom(NumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RealNumberContext extends NumContext {
		public RealnumeralContext realval;
		public RealnumeralContext realnumeral() {
			return getRuleContext(RealnumeralContext.class,0);
		}
		public RealNumberContext(NumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterRealNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitRealNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitRealNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerNumberContext extends NumContext {
		public Token intval;
		public TerminalNode INTEGER_NUMERAL() { return getToken(CANNParser.INTEGER_NUMERAL, 0); }
		public IntegerNumberContext(NumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterIntegerNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitIntegerNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitIntegerNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_num);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NUMERAL:
				_localctx = new IntegerNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				((IntegerNumberContext)_localctx).intval = match(INTEGER_NUMERAL);
				}
				break;
			case REAL_NUMERAL:
				_localctx = new RealNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				((RealNumberContext)_localctx).realval = realnumeral();
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValNumContext extends ValueContext {
		public NumContext numval;
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ValNumContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterValNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitValNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitValNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueVecContext extends ValueContext {
		public VectornumeralContext vecval;
		public VectornumeralContext vectornumeral() {
			return getRuleContext(VectornumeralContext.class,0);
		}
		public ValueVecContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterValueVec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitValueVec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitValueVec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValMathMethContext extends ValueContext {
		public MathFunctionsContext valmeth;
		public MathFunctionsContext mathFunctions() {
			return getRuleContext(MathFunctionsContext.class,0);
		}
		public ValMathMethContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterValMathMeth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitValMathMeth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitValMathMeth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueExprContext extends ValueContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueExprContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValStringContext extends ValueContext {
		public Token stringval;
		public TerminalNode STRING_VALUE() { return getToken(CANNParser.STRING_VALUE, 0); }
		public ValStringContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterValString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitValString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitValString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueIContext extends ValueContext {
		public IdentifierContext valid;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueIContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterValueI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitValueI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitValueI(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValBoolContext extends ValueContext {
		public Token boolval;
		public TerminalNode BOOL_VALUE() { return getToken(CANNParser.BOOL_VALUE, 0); }
		public ValBoolContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterValBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitValBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitValBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_value);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new ValueIContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				((ValueIContext)_localctx).valid = identifier();
				}
				break;
			case 2:
				_localctx = new ValueExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				expression();
				}
				break;
			case 3:
				_localctx = new ValueVecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				((ValueVecContext)_localctx).vecval = vectornumeral();
				}
				break;
			case 4:
				_localctx = new ValNumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				((ValNumContext)_localctx).numval = num();
				}
				break;
			case 5:
				_localctx = new ValStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				((ValStringContext)_localctx).stringval = match(STRING_VALUE);
				}
				break;
			case 6:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(387);
				((ValBoolContext)_localctx).boolval = match(BOOL_VALUE);
				}
				break;
			case 7:
				_localctx = new ValMathMethContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(388);
				((ValMathMethContext)_localctx).valmeth = mathFunctions();
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

	public static class Control_structureContext extends ParserRuleContext {
		public Control_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_structure; }
	 
		public Control_structureContext() { }
		public void copyFrom(Control_structureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfCtrlContext extends Control_structureContext {
		public Boolean_exprContext cond;
		public StmtsContext body;
		public TerminalNode LEFTPAREN() { return getToken(CANNParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(CANNParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(CANNParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(CANNParser.RIGHTCURLY, 0); }
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public IfCtrlContext(Control_structureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterIfCtrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitIfCtrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitIfCtrl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopCtrlContext extends Control_structureContext {
		public Arithmetic_exprContext from;
		public Arithmetic_exprContext to;
		public StmtsContext body;
		public TerminalNode LEFTPAREN() { return getToken(CANNParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(CANNParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(CANNParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(CANNParser.RIGHTCURLY, 0); }
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public LoopCtrlContext(Control_structureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterLoopCtrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitLoopCtrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitLoopCtrl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileCtrlContext extends Control_structureContext {
		public Boolean_exprContext cond;
		public StmtsContext body;
		public TerminalNode LEFTPAREN() { return getToken(CANNParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(CANNParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(CANNParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(CANNParser.RIGHTCURLY, 0); }
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public WhileCtrlContext(Control_structureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterWhileCtrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitWhileCtrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitWhileCtrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_structureContext control_structure() throws RecognitionException {
		Control_structureContext _localctx = new Control_structureContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_control_structure);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				_localctx = new IfCtrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(T__15);
				setState(392);
				match(LEFTPAREN);
				setState(393);
				((IfCtrlContext)_localctx).cond = boolean_expr(0);
				setState(394);
				match(RIGHTPAREN);
				setState(395);
				match(LEFTCURLY);
				setState(396);
				((IfCtrlContext)_localctx).body = stmts();
				setState(397);
				match(RIGHTCURLY);
				}
				break;
			case T__16:
				_localctx = new WhileCtrlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(T__16);
				setState(400);
				match(LEFTPAREN);
				setState(401);
				((WhileCtrlContext)_localctx).cond = boolean_expr(0);
				setState(402);
				match(RIGHTPAREN);
				setState(403);
				match(LEFTCURLY);
				setState(404);
				((WhileCtrlContext)_localctx).body = stmts();
				setState(405);
				match(RIGHTCURLY);
				}
				break;
			case T__17:
				_localctx = new LoopCtrlContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(T__17);
				setState(408);
				match(LEFTPAREN);
				setState(409);
				match(T__18);
				setState(410);
				((LoopCtrlContext)_localctx).from = arithmetic_expr(0);
				setState(411);
				match(T__19);
				setState(412);
				((LoopCtrlContext)_localctx).to = arithmetic_expr(0);
				setState(413);
				match(RIGHTPAREN);
				setState(414);
				match(LEFTCURLY);
				setState(415);
				((LoopCtrlContext)_localctx).body = stmts();
				setState(416);
				match(RIGHTCURLY);
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

	public static class TypeContext extends ParserRuleContext {
		public Token typeval;
		public TerminalNode SIMPLE_TYPE() { return getToken(CANNParser.SIMPLE_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			((TypeContext)_localctx).typeval = match(SIMPLE_TYPE);
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

	public static class VectornumeralContext extends ParserRuleContext {
		public VectornumeralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectornumeral; }
	 
		public VectornumeralContext() { }
		public void copyFrom(VectornumeralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VectnumContext extends VectornumeralContext {
		public Arithmetic_exprContext vecval;
		public Arithmetic_exprContext vecval1;
		public TerminalNode LEFTBRACKET() { return getToken(CANNParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(CANNParser.RIGHTBRACKET, 0); }
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CANNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CANNParser.COMMA, i);
		}
		public VectnumContext(VectornumeralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterVectnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitVectnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitVectnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectornumeralContext vectornumeral() throws RecognitionException {
		VectornumeralContext _localctx = new VectornumeralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_vectornumeral);
		int _la;
		try {
			_localctx = new VectnumContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(LEFTBRACKET);
			setState(423);
			((VectnumContext)_localctx).vecval = arithmetic_expr(0);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(424);
				match(COMMA);
				setState(425);
				((VectnumContext)_localctx).vecval1 = arithmetic_expr(0);
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
			match(RIGHTBRACKET);
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

	public static class RealnumeralContext extends ParserRuleContext {
		public RealnumeralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realnumeral; }
	 
		public RealnumeralContext() { }
		public void copyFrom(RealnumeralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RealnumContext extends RealnumeralContext {
		public TerminalNode REAL_NUMERAL() { return getToken(CANNParser.REAL_NUMERAL, 0); }
		public RealnumContext(RealnumeralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).enterRealnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANNListener ) ((CANNListener)listener).exitRealnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANNVisitor ) return ((CANNVisitor<? extends T>)visitor).visitRealnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealnumeralContext realnumeral() throws RecognitionException {
		RealnumeralContext _localctx = new RealnumeralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_realnumeral);
		try {
			_localctx = new RealnumContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(REAL_NUMERAL);
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
		case 8:
			return boolean_expr_sempred((Boolean_exprContext)_localctx, predIndex);
		case 9:
			return arithmetic_expr_sempred((Arithmetic_exprContext)_localctx, predIndex);
		case 10:
			return vector_expr_sempred((Vector_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolean_expr_sempred(Boolean_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arithmetic_expr_sempred(Arithmetic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean vector_expr_sempred(Vector_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\3\3\7\3S\n\3\f"+
		"\3\16\3V\13\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\5\6f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\5\ty\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008f\n\n\3\n\3\n\3\n\7\n\u0094\n\n\f"+
		"\n\16\n\u0097\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a2"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00b0\n\13\f\13\16\13\u00b3\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00bf\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u00cd\n\f\f\f\16\f\u00d0\13\f\3\r\3\r\3\r\3\r\7\r\u00d6\n\r\f\r\16\r"+
		"\u00d9\13\r\3\r\3\r\3\r\5\r\u00de\n\r\3\16\3\16\3\16\3\16\7\16\u00e4\n"+
		"\16\f\16\16\16\u00e7\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00f5\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0110\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0128\n\22\3\23\3\23\3\23\3\23\7\23\u012e\n\23\f\23\16\23\u0131"+
		"\13\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0139\n\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\5\32\u015e\n\32\3\33\3\33\5\33\u0162\n\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\5\36\u016a\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0176\n\37\3 \3 \3 \3 \3 \3!\3!\5!\u017f\n!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\5\"\u0188\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01a5\n#\3$\3$\3%"+
		"\3%\3%\3%\7%\u01ad\n%\f%\16%\u01b0\13%\3%\3%\3&\3&\3&\2\5\22\24\26\'\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2"+
		"\3\3\2\n\13\2\u01c8\2L\3\2\2\2\4T\3\2\2\2\6W\3\2\2\2\b^\3\2\2\2\ne\3\2"+
		"\2\2\fn\3\2\2\2\16p\3\2\2\2\20x\3\2\2\2\22\u008e\3\2\2\2\24\u00a1\3\2"+
		"\2\2\26\u00be\3\2\2\2\30\u00dd\3\2\2\2\32\u00df\3\2\2\2\34\u00f4\3\2\2"+
		"\2\36\u00f6\3\2\2\2 \u010f\3\2\2\2\"\u0127\3\2\2\2$\u0129\3\2\2\2&\u0138"+
		"\3\2\2\2(\u013a\3\2\2\2*\u0147\3\2\2\2,\u0150\3\2\2\2.\u0154\3\2\2\2\60"+
		"\u0159\3\2\2\2\62\u015d\3\2\2\2\64\u0161\3\2\2\2\66\u0163\3\2\2\28\u0165"+
		"\3\2\2\2:\u0169\3\2\2\2<\u0175\3\2\2\2>\u0177\3\2\2\2@\u017e\3\2\2\2B"+
		"\u0187\3\2\2\2D\u01a4\3\2\2\2F\u01a6\3\2\2\2H\u01a8\3\2\2\2J\u01b3\3\2"+
		"\2\2LM\5\4\3\2MN\7\2\2\3N\3\3\2\2\2OP\5\b\5\2PQ\7\3\2\2QS\3\2\2\2RO\3"+
		"\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\5\3\2\2\2VT\3\2\2\2WX\7$\2\2X\7"+
		"\3\2\2\2Y_\5\n\6\2Z_\5\16\b\2[_\5\20\t\2\\_\5D#\2]_\5&\24\2^Y\3\2\2\2"+
		"^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\t\3\2\2\2`f\5\f\7\2af\5\34"+
		"\17\2bf\5\36\20\2cf\5 \21\2df\5\"\22\2e`\3\2\2\2ea\3\2\2\2eb\3\2\2\2e"+
		"c\3\2\2\2ed\3\2\2\2f\13\3\2\2\2gh\7\32\2\2hi\5\6\4\2ij\7\'\2\2jk\5B\""+
		"\2ko\3\2\2\2lm\7\32\2\2mo\5\6\4\2ng\3\2\2\2nl\3\2\2\2o\r\3\2\2\2pq\5\6"+
		"\4\2qr\7\'\2\2rs\5B\"\2s\17\3\2\2\2ty\5\22\n\2uy\5\24\13\2vy\5\26\f\2"+
		"wy\5$\23\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\21\3\2\2\2z{\b\n\1"+
		"\2{\u008f\7\"\2\2|}\7/\2\2}~\5\22\n\2~\177\7\60\2\2\177\u008f\3\2\2\2"+
		"\u0080\u0081\7)\2\2\u0081\u0082\7/\2\2\u0082\u0083\5\22\n\2\u0083\u0084"+
		"\7\60\2\2\u0084\u008f\3\2\2\2\u0085\u0086\5\24\13\2\u0086\u0087\7&\2\2"+
		"\u0087\u0088\5\24\13\2\u0088\u008f\3\2\2\2\u0089\u008a\5\24\13\2\u008a"+
		"\u008b\7\65\2\2\u008b\u008c\5\24\13\2\u008c\u008f\3\2\2\2\u008d\u008f"+
		"\5\6\4\2\u008ez\3\2\2\2\u008e|\3\2\2\2\u008e\u0080\3\2\2\2\u008e\u0085"+
		"\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0095\3\2\2\2\u0090"+
		"\u0091\f\4\2\2\u0091\u0092\7(\2\2\u0092\u0094\5\22\n\5\u0093\u0090\3\2"+
		"\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\23\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\b\13\1\2\u0099\u00a2\5@!\2"+
		"\u009a\u009b\7/\2\2\u009b\u009c\5\24\13\2\u009c\u009d\7\60\2\2\u009d\u00a2"+
		"\3\2\2\2\u009e\u009f\7\4\2\2\u009f\u00a2\5\24\13\b\u00a0\u00a2\5\6\4\2"+
		"\u00a1\u0098\3\2\2\2\u00a1\u009a\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u00a0"+
		"\3\2\2\2\u00a2\u00b1\3\2\2\2\u00a3\u00a4\f\7\2\2\u00a4\u00a5\7\5\2\2\u00a5"+
		"\u00b0\5\24\13\b\u00a6\u00a7\f\6\2\2\u00a7\u00a8\7\6\2\2\u00a8\u00b0\5"+
		"\24\13\7\u00a9\u00aa\f\5\2\2\u00aa\u00ab\7\7\2\2\u00ab\u00b0\5\24\13\6"+
		"\u00ac\u00ad\f\4\2\2\u00ad\u00ae\7\4\2\2\u00ae\u00b0\5\24\13\5\u00af\u00a3"+
		"\3\2\2\2\u00af\u00a6\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\25\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\b\f\1\2\u00b5\u00b6\7/\2\2\u00b6\u00b7"+
		"\5\26\f\2\u00b7\u00b8\7\60\2\2\u00b8\u00bf\3\2\2\2\u00b9\u00ba\5\24\13"+
		"\2\u00ba\u00bb\7\5\2\2\u00bb\u00bc\5\26\f\5\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bf\5\30\r\2\u00be\u00b4\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00bd\3"+
		"\2\2\2\u00bf\u00ce\3\2\2\2\u00c0\u00c1\f\b\2\2\u00c1\u00c2\7\b\2\2\u00c2"+
		"\u00cd\5\26\f\t\u00c3\u00c4\f\7\2\2\u00c4\u00c5\7\7\2\2\u00c5\u00cd\5"+
		"\26\f\b\u00c6\u00c7\f\6\2\2\u00c7\u00c8\7\4\2\2\u00c8\u00cd\5\26\f\7\u00c9"+
		"\u00ca\f\4\2\2\u00ca\u00cb\7\5\2\2\u00cb\u00cd\5\24\13\2\u00cc\u00c0\3"+
		"\2\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\27\3\2\2"+
		"\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7+\2\2\u00d2\u00d7\5\24\13\2\u00d3"+
		"\u00d4\7\61\2\2\u00d4\u00d6\5\24\13\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\7,\2\2\u00db\u00de\3\2\2\2\u00dc\u00de\5\6"+
		"\4\2\u00dd\u00d1\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\31\3\2\2\2\u00df\u00e0"+
		"\7-\2\2\u00e0\u00e5\7\31\2\2\u00e1\u00e2\7\61\2\2\u00e2\u00e4\7\31\2\2"+
		"\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7.\2\2\u00e9"+
		"\33\3\2\2\2\u00ea\u00eb\7\t\2\2\u00eb\u00ec\5\6\4\2\u00ec\u00ed\7\'\2"+
		"\2\u00ed\u00ee\5\32\16\2\u00ee\u00f5\3\2\2\2\u00ef\u00f0\7\t\2\2\u00f0"+
		"\u00f1\5\6\4\2\u00f1\u00f2\7\'\2\2\u00f2\u00f3\5,\27\2\u00f3\u00f5\3\2"+
		"\2\2\u00f4\u00ea\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f5\35\3\2\2\2\u00f6\u00f7"+
		"\t\2\2\2\u00f7\u00f8\7/\2\2\u00f8\u00f9\5\6\4\2\u00f9\u00fa\7\61\2\2\u00fa"+
		"\u00fb\5\6\4\2\u00fb\u00fc\7\60\2\2\u00fc\37\3\2\2\2\u00fd\u00fe\7 \2"+
		"\2\u00fe\u00ff\7+\2\2\u00ff\u0100\5F$\2\u0100\u0101\7\61\2\2\u0101\u0102"+
		"\5\24\13\2\u0102\u0103\7,\2\2\u0103\u0104\5\6\4\2\u0104\u0105\7\'\2\2"+
		"\u0105\u0106\5\26\f\2\u0106\u0110\3\2\2\2\u0107\u0108\7 \2\2\u0108\u0109"+
		"\7+\2\2\u0109\u010a\5F$\2\u010a\u010b\7\61\2\2\u010b\u010c\5\24\13\2\u010c"+
		"\u010d\7,\2\2\u010d\u010e\5\6\4\2\u010e\u0110\3\2\2\2\u010f\u00fd\3\2"+
		"\2\2\u010f\u0107\3\2\2\2\u0110!\3\2\2\2\u0111\u0112\7\37\2\2\u0112\u0113"+
		"\7+\2\2\u0113\u0114\5F$\2\u0114\u0115\7\61\2\2\u0115\u0116\5\24\13\2\u0116"+
		"\u0117\7\61\2\2\u0117\u0118\5\24\13\2\u0118\u0119\7,\2\2\u0119\u011a\5"+
		"\6\4\2\u011a\u011b\7\'\2\2\u011b\u011c\5$\23\2\u011c\u0128\3\2\2\2\u011d"+
		"\u011e\7\37\2\2\u011e\u011f\7+\2\2\u011f\u0120\5F$\2\u0120\u0121\7\61"+
		"\2\2\u0121\u0122\5\24\13\2\u0122\u0123\7\61\2\2\u0123\u0124\5\24\13\2"+
		"\u0124\u0125\7,\2\2\u0125\u0126\5\6\4\2\u0126\u0128\3\2\2\2\u0127\u0111"+
		"\3\2\2\2\u0127\u011d\3\2\2\2\u0128#\3\2\2\2\u0129\u012a\7+\2\2\u012a\u012f"+
		"\5\30\r\2\u012b\u012c\7\61\2\2\u012c\u012e\5\30\r\2\u012d\u012b\3\2\2"+
		"\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7,\2\2\u0133%\3\2\2\2\u0134\u0139"+
		"\5(\25\2\u0135\u0139\5*\26\2\u0136\u0139\5.\30\2\u0137\u0139\5:\36\2\u0138"+
		"\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2"+
		"\2\2\u0139\'\3\2\2\2\u013a\u013b\7\f\2\2\u013b\u013c\7/\2\2\u013c\u013d"+
		"\5\60\31\2\u013d\u013e\7\61\2\2\u013e\u013f\5\62\32\2\u013f\u0140\7\61"+
		"\2\2\u0140\u0141\5\64\33\2\u0141\u0142\7\61\2\2\u0142\u0143\5\66\34\2"+
		"\u0143\u0144\7\61\2\2\u0144\u0145\58\35\2\u0145\u0146\7\60\2\2\u0146)"+
		"\3\2\2\2\u0147\u0148\7\r\2\2\u0148\u0149\7/\2\2\u0149\u014a\5\60\31\2"+
		"\u014a\u014b\7\61\2\2\u014b\u014c\5\66\34\2\u014c\u014d\7\61\2\2\u014d"+
		"\u014e\58\35\2\u014e\u014f\7\60\2\2\u014f+\3\2\2\2\u0150\u0151\7\27\2"+
		"\2\u0151\u0152\7/\2\2\u0152\u0153\7\60\2\2\u0153-\3\2\2\2\u0154\u0155"+
		"\7\16\2\2\u0155\u0156\7/\2\2\u0156\u0157\5\6\4\2\u0157\u0158\7\60\2\2"+
		"\u0158/\3\2\2\2\u0159\u015a\5\6\4\2\u015a\61\3\2\2\2\u015b\u015e\7\31"+
		"\2\2\u015c\u015e\5\6\4\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e"+
		"\63\3\2\2\2\u015f\u0162\5J&\2\u0160\u0162\5\6\4\2\u0161\u015f\3\2\2\2"+
		"\u0161\u0160\3\2\2\2\u0162\65\3\2\2\2\u0163\u0164\5\6\4\2\u0164\67\3\2"+
		"\2\2\u0165\u0166\5\6\4\2\u01669\3\2\2\2\u0167\u016a\5<\37\2\u0168\u016a"+
		"\5> \2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a;\3\2\2\2\u016b\u016c"+
		"\7\17\2\2\u016c\u016d\7/\2\2\u016d\u016e\5\6\4\2\u016e\u016f\7\60\2\2"+
		"\u016f\u0176\3\2\2\2\u0170\u0171\7\20\2\2\u0171\u0172\7/\2\2\u0172\u0173"+
		"\5\6\4\2\u0173\u0174\7\60\2\2\u0174\u0176\3\2\2\2\u0175\u016b\3\2\2\2"+
		"\u0175\u0170\3\2\2\2\u0176=\3\2\2\2\u0177\u0178\7\21\2\2\u0178\u0179\7"+
		"/\2\2\u0179\u017a\5\6\4\2\u017a\u017b\7\60\2\2\u017b?\3\2\2\2\u017c\u017f"+
		"\7\31\2\2\u017d\u017f\5J&\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f"+
		"A\3\2\2\2\u0180\u0188\5\6\4\2\u0181\u0188\5\20\t\2\u0182\u0188\5H%\2\u0183"+
		"\u0188\5@!\2\u0184\u0188\7#\2\2\u0185\u0188\7\"\2\2\u0186\u0188\5:\36"+
		"\2\u0187\u0180\3\2\2\2\u0187\u0181\3\2\2\2\u0187\u0182\3\2\2\2\u0187\u0183"+
		"\3\2\2\2\u0187\u0184\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188"+
		"C\3\2\2\2\u0189\u018a\7\22\2\2\u018a\u018b\7/\2\2\u018b\u018c\5\22\n\2"+
		"\u018c\u018d\7\60\2\2\u018d\u018e\7-\2\2\u018e\u018f\5\4\3\2\u018f\u0190"+
		"\7.\2\2\u0190\u01a5\3\2\2\2\u0191\u0192\7\23\2\2\u0192\u0193\7/\2\2\u0193"+
		"\u0194\5\22\n\2\u0194\u0195\7\60\2\2\u0195\u0196\7-\2\2\u0196\u0197\5"+
		"\4\3\2\u0197\u0198\7.\2\2\u0198\u01a5\3\2\2\2\u0199\u019a\7\24\2\2\u019a"+
		"\u019b\7/\2\2\u019b\u019c\7\25\2\2\u019c\u019d\5\24\13\2\u019d\u019e\7"+
		"\26\2\2\u019e\u019f\5\24\13\2\u019f\u01a0\7\60\2\2\u01a0\u01a1\7-\2\2"+
		"\u01a1\u01a2\5\4\3\2\u01a2\u01a3\7.\2\2\u01a3\u01a5\3\2\2\2\u01a4\u0189"+
		"\3\2\2\2\u01a4\u0191\3\2\2\2\u01a4\u0199\3\2\2\2\u01a5E\3\2\2\2\u01a6"+
		"\u01a7\7\32\2\2\u01a7G\3\2\2\2\u01a8\u01a9\7+\2\2\u01a9\u01ae\5\24\13"+
		"\2\u01aa\u01ab\7\61\2\2\u01ab\u01ad\5\24\13\2\u01ac\u01aa\3\2\2\2\u01ad"+
		"\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2"+
		"\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\7,\2\2\u01b2I\3\2\2\2\u01b3\u01b4"+
		"\7\30\2\2\u01b4K\3\2\2\2\37T^enx\u008e\u0095\u00a1\u00af\u00b1\u00be\u00cc"+
		"\u00ce\u00d7\u00dd\u00e5\u00f4\u010f\u0127\u012f\u0138\u015d\u0161\u0169"+
		"\u0175\u017e\u0187\u01a4\u01ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}