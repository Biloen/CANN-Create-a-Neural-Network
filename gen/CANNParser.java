// Generated from C:/Users/joens/source/repos/p4\CANN.g4 by ANTLR 4.9.2
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
		T__17=18, T__18=19, IMPORT=20, REAL_NUMERAL=21, INTEGER_NUMERAL=22, SIMPLE_TYPE=23, 
		R=24, Z=25, N=26, BOOL=27, MTRX=28, VEC=29, STRING=30, BOOL_VALUE=31, 
		STRING_VALUE=32, ID=33, LINE_COMMENT=34, COMPAREOP=35, EQUALS=36, LOGIC_OP=37, 
		NOT=38, DOT=39, LEFTBRACKET=40, RIGHTBRACKET=41, LEFTCURLY=42, RIGHTCURLY=43, 
		LEFTPAREN=44, RIGHTPAREN=45, COMMA=46, WHITESPACE=47, LESS_THAN=48, LESS_THAN_OR_EQUALS=49, 
		GREATER_THAN=50, GREATER_THAN_OR_EQUALS=51, NOT_EQUALS=52, COLON=53, DOUBLECOLON=54, 
		ACTIVATION_FUNC=55;
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << REAL_NUMERAL) | (1L << INTEGER_NUMERAL) | (1L << SIMPLE_TYPE) | (1L << MTRX) | (1L << VEC) | (1L << BOOL_VALUE) | (1L << ID) | (1L << NOT) | (1L << LEFTBRACKET) | (1L << LEFTPAREN))) != 0)) {
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_VALUE:
				{
				_localctx = new BoolValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(121);
				((BoolValueContext)_localctx).bvalue = match(BOOL_VALUE);
				}
				break;
			case NOT:
				{
				_localctx = new BoolNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(NOT);
				setState(123);
				match(LEFTPAREN);
				setState(124);
				((BoolNegationContext)_localctx).bexpr = boolean_expr(0);
				setState(125);
				match(RIGHTPAREN);
				}
				break;
			case T__1:
			case REAL_NUMERAL:
			case INTEGER_NUMERAL:
			case ID:
			case LEFTPAREN:
				{
				_localctx = new BoolComparisonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				arithmetic_expr(0);
				setState(128);
				match(COMPAREOP);
				setState(129);
				arithmetic_expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
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
					setState(133);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(134);
					match(LOGIC_OP);
					setState(135);
					((BoolLogicContext)_localctx).expr2 = boolean_expr(2);
					}
					} 
				}
				setState(140);
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
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL_NUMERAL:
			case INTEGER_NUMERAL:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(142);
				((NumberContext)_localctx).numeralvalue = num();
				}
				break;
			case LEFTPAREN:
				{
				_localctx = new ArithmeticParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(LEFTPAREN);
				setState(144);
				arithmetic_expr(0);
				setState(145);
				match(RIGHTPAREN);
				}
				break;
			case T__1:
				{
				_localctx = new ArithmeticUnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(T__1);
				setState(148);
				arithmetic_expr(6);
				}
				break;
			case ID:
				{
				_localctx = new ArithmeticIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				((ArithmeticIdentifierContext)_localctx).arithmeticidentifiervalue = identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticTimesOpExprContext(new Arithmetic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(152);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(153);
						match(T__2);
						setState(154);
						arithmetic_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticDivOpExprContext(new Arithmetic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(155);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(156);
						match(T__3);
						setState(157);
						arithmetic_expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticPlusOpExprContext(new Arithmetic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(158);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(159);
						match(T__4);
						setState(160);
						arithmetic_expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticMinusOpExprContext(new Arithmetic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(162);
						match(T__1);
						setState(163);
						arithmetic_expr(3);
						}
						break;
					}
					} 
				}
				setState(168);
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
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new VectorParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(170);
				match(LEFTPAREN);
				setState(171);
				vector_expr(0);
				setState(172);
				match(RIGHTPAREN);
				}
				break;
			case 2:
				{
				_localctx = new VectorMultiplicationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				((VectorMultiplicationExpressionContext)_localctx).arithex = arithmetic_expr(0);
				setState(175);
				match(T__2);
				setState(176);
				((VectorMultiplicationExpressionContext)_localctx).vecex = vector_expr(3);
				}
				break;
			case 3:
				{
				_localctx = new VectorValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				((VectorValContext)_localctx).vectorvaluevalue = vector_val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new VectorHadaExpressionContext(new Vector_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vector_expr);
						setState(181);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(182);
						match(T__5);
						setState(183);
						vector_expr(7);
						}
						break;
					case 2:
						{
						_localctx = new VectorPlusExpressionContext(new Vector_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vector_expr);
						setState(184);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(185);
						match(T__4);
						setState(186);
						vector_expr(6);
						}
						break;
					case 3:
						{
						_localctx = new VectorMinusExpressionContext(new Vector_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vector_expr);
						setState(187);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(188);
						match(T__1);
						setState(189);
						vector_expr(5);
						}
						break;
					case 4:
						{
						_localctx = new VectorMultiplicationExpressionContext(new Vector_exprContext(_parentctx, _parentState));
						((VectorMultiplicationExpressionContext)_localctx).vecex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_vector_expr);
						setState(190);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(191);
						match(T__2);
						setState(192);
						((VectorMultiplicationExpressionContext)_localctx).arithex = arithmetic_expr(0);
						}
						break;
					}
					} 
				}
				setState(197);
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
		public NumContext vecval;
		public NumContext vecval1;
		public TerminalNode LEFTBRACKET() { return getToken(CANNParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(CANNParser.RIGHTBRACKET, 0); }
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
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
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTBRACKET:
				_localctx = new VectorValueNumeralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(LEFTBRACKET);
				setState(199);
				((VectorValueNumeralContext)_localctx).vecval = num();
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(200);
					match(COMMA);
					setState(201);
					((VectorValueNumeralContext)_localctx).vecval1 = num();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(RIGHTBRACKET);
				}
				break;
			case ID:
				_localctx = new VecIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
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
			setState(212);
			match(LEFTCURLY);
			setState(213);
			((NnDimsContext)_localctx).dimval = match(INTEGER_NUMERAL);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214);
				match(COMMA);
				setState(215);
				((NnDimsContext)_localctx).dimval1 = match(INTEGER_NUMERAL);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
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
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new NnDclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__6);
				setState(224);
				((NnDclContext)_localctx).ident = identifier();
				setState(225);
				match(EQUALS);
				setState(226);
				((NnDclContext)_localctx).nnDim = nnDimensions();
				}
				break;
			case 2:
				_localctx = new NnDclImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(T__6);
				setState(229);
				((NnDclImportContext)_localctx).ident = identifier();
				setState(230);
				match(EQUALS);
				setState(231);
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
		try {
			_localctx = new DataDclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__7);
			setState(236);
			match(LEFTPAREN);
			setState(237);
			((DataDclContext)_localctx).id1 = identifier();
			setState(238);
			match(COMMA);
			setState(239);
			((DataDclContext)_localctx).id2 = identifier();
			setState(240);
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
		public Token vecdcldim;
		public IdentifierContext vecdclid;
		public TerminalNode VEC() { return getToken(CANNParser.VEC, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(CANNParser.LEFTBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(CANNParser.COMMA, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(CANNParser.RIGHTBRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INTEGER_NUMERAL() { return getToken(CANNParser.INTEGER_NUMERAL, 0); }
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
		public Token vecdcldim;
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
		public TerminalNode INTEGER_NUMERAL() { return getToken(CANNParser.INTEGER_NUMERAL, 0); }
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
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new VecDclValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(VEC);
				setState(243);
				match(LEFTBRACKET);
				setState(244);
				((VecDclValContext)_localctx).vecdcltype = type();
				setState(245);
				match(COMMA);
				setState(246);
				((VecDclValContext)_localctx).vecdcldim = match(INTEGER_NUMERAL);
				setState(247);
				match(RIGHTBRACKET);
				setState(248);
				((VecDclValContext)_localctx).vecdclid = identifier();
				setState(249);
				match(EQUALS);
				setState(250);
				((VecDclValContext)_localctx).vecdclval = vector_expr(0);
				}
				break;
			case 2:
				_localctx = new VecDclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(VEC);
				setState(253);
				match(LEFTBRACKET);
				setState(254);
				((VecDclContext)_localctx).vecdcltype = type();
				setState(255);
				match(COMMA);
				setState(256);
				((VecDclContext)_localctx).vecdcldim = match(INTEGER_NUMERAL);
				setState(257);
				match(RIGHTBRACKET);
				setState(258);
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
		public Token matrxdcldim1;
		public Token matrxdcldim2;
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
		public List<TerminalNode> INTEGER_NUMERAL() { return getTokens(CANNParser.INTEGER_NUMERAL); }
		public TerminalNode INTEGER_NUMERAL(int i) {
			return getToken(CANNParser.INTEGER_NUMERAL, i);
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
		public Token matrxdcldim1;
		public Token matrxdcldim2;
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
		public List<TerminalNode> INTEGER_NUMERAL() { return getTokens(CANNParser.INTEGER_NUMERAL); }
		public TerminalNode INTEGER_NUMERAL(int i) {
			return getToken(CANNParser.INTEGER_NUMERAL, i);
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
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new MatrixDclValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(MTRX);
				setState(263);
				match(LEFTBRACKET);
				setState(264);
				((MatrixDclValContext)_localctx).matrixdcltype = type();
				setState(265);
				match(COMMA);
				setState(266);
				((MatrixDclValContext)_localctx).matrxdcldim1 = match(INTEGER_NUMERAL);
				setState(267);
				match(COMMA);
				setState(268);
				((MatrixDclValContext)_localctx).matrxdcldim2 = match(INTEGER_NUMERAL);
				setState(269);
				match(RIGHTBRACKET);
				setState(270);
				((MatrixDclValContext)_localctx).matrixdclid = identifier();
				setState(271);
				match(EQUALS);
				setState(272);
				((MatrixDclValContext)_localctx).matrixdclval = matrx_val();
				}
				break;
			case 2:
				_localctx = new MatrixDclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(MTRX);
				setState(275);
				match(LEFTBRACKET);
				setState(276);
				((MatrixDclContext)_localctx).matrixdcltype = type();
				setState(277);
				match(COMMA);
				setState(278);
				((MatrixDclContext)_localctx).matrxdcldim1 = match(INTEGER_NUMERAL);
				setState(279);
				match(COMMA);
				setState(280);
				((MatrixDclContext)_localctx).matrxdcldim2 = match(INTEGER_NUMERAL);
				setState(281);
				match(RIGHTBRACKET);
				setState(282);
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
			setState(286);
			match(LEFTBRACKET);
			setState(287);
			((MatrixValueContext)_localctx).firstvec = vector_val();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(288);
				match(COMMA);
				setState(289);
				((MatrixValueContext)_localctx).subseqvec = vector_val();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
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
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new TrainfunContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				trainFunction();
				}
				break;
			case T__9:
				_localctx = new TestfunContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				testFunction();
				}
				break;
			case T__10:
				_localctx = new ExfunContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				exportFunction();
				}
				break;
			case T__11:
			case T__12:
			case T__13:
				_localctx = new MathfunContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
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
			setState(303);
			match(T__8);
			setState(304);
			match(LEFTPAREN);
			setState(305);
			nn();
			setState(306);
			match(COMMA);
			setState(307);
			epoch();
			setState(308);
			match(COMMA);
			setState(309);
			learning_rate();
			setState(310);
			match(COMMA);
			setState(311);
			input();
			setState(312);
			match(COMMA);
			setState(313);
			output();
			setState(314);
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
			setState(316);
			match(T__9);
			setState(317);
			match(LEFTPAREN);
			setState(318);
			nn();
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
			setState(325);
			match(IMPORT);
			setState(326);
			match(LEFTPAREN);
			setState(327);
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
			setState(329);
			match(T__10);
			setState(330);
			match(LEFTPAREN);
			setState(331);
			identifier();
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
			setState(334);
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
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NUMERAL:
				_localctx = new IntepochContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(INTEGER_NUMERAL);
				}
				break;
			case ID:
				_localctx = new IdepochContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
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
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL_NUMERAL:
				_localctx = new ReallrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				realnumeral();
				}
				break;
			case ID:
				_localctx = new IdlrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
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
			setState(344);
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
			setState(346);
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
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
				_localctx = new MathFunctionsMatrixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				matrix_function();
				}
				break;
			case T__13:
				_localctx = new MathFunctionsVectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
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
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new DimensionFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(T__11);
				setState(353);
				match(LEFTPAREN);
				setState(354);
				identifier();
				setState(355);
				match(RIGHTPAREN);
				}
				break;
			case T__12:
				_localctx = new TransposeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(T__12);
				setState(358);
				match(LEFTPAREN);
				setState(359);
				identifier();
				setState(360);
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
			setState(364);
			match(T__13);
			setState(365);
			match(LEFTPAREN);
			setState(366);
			identifier();
			setState(367);
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
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NUMERAL:
				_localctx = new IntegerNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				((IntegerNumberContext)_localctx).intval = match(INTEGER_NUMERAL);
				}
				break;
			case REAL_NUMERAL:
				_localctx = new RealNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
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
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new ValueIContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				((ValueIContext)_localctx).valid = identifier();
				}
				break;
			case 2:
				_localctx = new ValueExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				expression();
				}
				break;
			case 3:
				_localctx = new ValueVecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				((ValueVecContext)_localctx).vecval = vectornumeral();
				}
				break;
			case 4:
				_localctx = new ValNumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				((ValNumContext)_localctx).numval = num();
				}
				break;
			case 5:
				_localctx = new ValStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(377);
				((ValStringContext)_localctx).stringval = match(STRING_VALUE);
				}
				break;
			case 6:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(378);
				((ValBoolContext)_localctx).boolval = match(BOOL_VALUE);
				}
				break;
			case 7:
				_localctx = new ValMathMethContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(379);
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
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				_localctx = new IfCtrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				match(T__14);
				setState(383);
				match(LEFTPAREN);
				setState(384);
				((IfCtrlContext)_localctx).cond = boolean_expr(0);
				setState(385);
				match(RIGHTPAREN);
				setState(386);
				match(LEFTCURLY);
				setState(387);
				((IfCtrlContext)_localctx).body = stmts();
				setState(388);
				match(RIGHTCURLY);
				}
				break;
			case T__15:
				_localctx = new WhileCtrlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(T__15);
				setState(391);
				match(LEFTPAREN);
				setState(392);
				((WhileCtrlContext)_localctx).cond = boolean_expr(0);
				setState(393);
				match(RIGHTPAREN);
				setState(394);
				match(LEFTCURLY);
				setState(395);
				((WhileCtrlContext)_localctx).body = stmts();
				setState(396);
				match(RIGHTCURLY);
				}
				break;
			case T__16:
				_localctx = new LoopCtrlContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				match(T__16);
				setState(399);
				match(LEFTPAREN);
				setState(400);
				match(T__17);
				setState(401);
				((LoopCtrlContext)_localctx).from = arithmetic_expr(0);
				setState(402);
				match(T__18);
				setState(403);
				((LoopCtrlContext)_localctx).to = arithmetic_expr(0);
				setState(404);
				match(RIGHTPAREN);
				setState(405);
				match(LEFTCURLY);
				setState(406);
				((LoopCtrlContext)_localctx).body = stmts();
				setState(407);
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
			setState(411);
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
		public NumContext vecval;
		public NumContext vecval1;
		public TerminalNode LEFTBRACKET() { return getToken(CANNParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(CANNParser.RIGHTBRACKET, 0); }
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
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
			setState(413);
			match(LEFTBRACKET);
			setState(414);
			((VectnumContext)_localctx).vecval = num();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(415);
				match(COMMA);
				setState(416);
				((VectnumContext)_localctx).vecval1 = num();
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
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
			setState(424);
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
			return precpred(_ctx, 1);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u01ad\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\3\3\7\3S\n\3\f"+
		"\3\16\3V\13\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\5\6f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\5\ty\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0086"+
		"\n\n\3\n\3\n\3\n\7\n\u008b\n\n\f\n\16\n\u008e\13\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0099\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a7\n\13\f\13\16\13\u00aa\13\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b6\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c4\n\f\f\f\16\f\u00c7\13\f\3\r"+
		"\3\r\3\r\3\r\7\r\u00cd\n\r\f\r\16\r\u00d0\13\r\3\r\3\r\3\r\5\r\u00d5\n"+
		"\r\3\16\3\16\3\16\3\16\7\16\u00db\n\16\f\16\16\16\u00de\13\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ec\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0107\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u011f\n\22\3\23\3\23\3\23\3\23"+
		"\7\23\u0125\n\23\f\23\16\23\u0128\13\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\5\24\u0130\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u0155\n\32\3\33"+
		"\3\33\5\33\u0159\n\33\3\34\3\34\3\35\3\35\3\36\3\36\5\36\u0161\n\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u016d\n\37\3 \3"+
		" \3 \3 \3 \3!\3!\5!\u0176\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u017f\n\""+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\5#\u019c\n#\3$\3$\3%\3%\3%\3%\7%\u01a4\n%\f%\16%\u01a7\13"+
		"%\3%\3%\3&\3&\3&\2\5\22\24\26\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJ\2\2\2\u01bc\2L\3\2\2\2\4T\3\2\2\2\6W\3"+
		"\2\2\2\b^\3\2\2\2\ne\3\2\2\2\fn\3\2\2\2\16p\3\2\2\2\20x\3\2\2\2\22\u0085"+
		"\3\2\2\2\24\u0098\3\2\2\2\26\u00b5\3\2\2\2\30\u00d4\3\2\2\2\32\u00d6\3"+
		"\2\2\2\34\u00eb\3\2\2\2\36\u00ed\3\2\2\2 \u0106\3\2\2\2\"\u011e\3\2\2"+
		"\2$\u0120\3\2\2\2&\u012f\3\2\2\2(\u0131\3\2\2\2*\u013e\3\2\2\2,\u0147"+
		"\3\2\2\2.\u014b\3\2\2\2\60\u0150\3\2\2\2\62\u0154\3\2\2\2\64\u0158\3\2"+
		"\2\2\66\u015a\3\2\2\28\u015c\3\2\2\2:\u0160\3\2\2\2<\u016c\3\2\2\2>\u016e"+
		"\3\2\2\2@\u0175\3\2\2\2B\u017e\3\2\2\2D\u019b\3\2\2\2F\u019d\3\2\2\2H"+
		"\u019f\3\2\2\2J\u01aa\3\2\2\2LM\5\4\3\2MN\7\2\2\3N\3\3\2\2\2OP\5\b\5\2"+
		"PQ\7\3\2\2QS\3\2\2\2RO\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\5\3\2\2"+
		"\2VT\3\2\2\2WX\7#\2\2X\7\3\2\2\2Y_\5\n\6\2Z_\5\16\b\2[_\5\20\t\2\\_\5"+
		"D#\2]_\5&\24\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\t\3"+
		"\2\2\2`f\5\f\7\2af\5\34\17\2bf\5\36\20\2cf\5 \21\2df\5\"\22\2e`\3\2\2"+
		"\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\13\3\2\2\2gh\7\31\2\2hi\5"+
		"\6\4\2ij\7&\2\2jk\5B\"\2ko\3\2\2\2lm\7\31\2\2mo\5\6\4\2ng\3\2\2\2nl\3"+
		"\2\2\2o\r\3\2\2\2pq\5\6\4\2qr\7&\2\2rs\5B\"\2s\17\3\2\2\2ty\5\22\n\2u"+
		"y\5\24\13\2vy\5\26\f\2wy\5$\23\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2"+
		"\2y\21\3\2\2\2z{\b\n\1\2{\u0086\7!\2\2|}\7(\2\2}~\7.\2\2~\177\5\22\n\2"+
		"\177\u0080\7/\2\2\u0080\u0086\3\2\2\2\u0081\u0082\5\24\13\2\u0082\u0083"+
		"\7%\2\2\u0083\u0084\5\24\13\2\u0084\u0086\3\2\2\2\u0085z\3\2\2\2\u0085"+
		"|\3\2\2\2\u0085\u0081\3\2\2\2\u0086\u008c\3\2\2\2\u0087\u0088\f\3\2\2"+
		"\u0088\u0089\7\'\2\2\u0089\u008b\5\22\n\4\u008a\u0087\3\2\2\2\u008b\u008e"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\23\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\b\13\1\2\u0090\u0099\5@!\2\u0091\u0092\7.\2"+
		"\2\u0092\u0093\5\24\13\2\u0093\u0094\7/\2\2\u0094\u0099\3\2\2\2\u0095"+
		"\u0096\7\4\2\2\u0096\u0099\5\24\13\b\u0097\u0099\5\6\4\2\u0098\u008f\3"+
		"\2\2\2\u0098\u0091\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u00a8\3\2\2\2\u009a\u009b\f\7\2\2\u009b\u009c\7\5\2\2\u009c\u00a7\5\24"+
		"\13\b\u009d\u009e\f\6\2\2\u009e\u009f\7\6\2\2\u009f\u00a7\5\24\13\7\u00a0"+
		"\u00a1\f\5\2\2\u00a1\u00a2\7\7\2\2\u00a2\u00a7\5\24\13\6\u00a3\u00a4\f"+
		"\4\2\2\u00a4\u00a5\7\4\2\2\u00a5\u00a7\5\24\13\5\u00a6\u009a\3\2\2\2\u00a6"+
		"\u009d\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\25\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\u00ac\b\f\1\2\u00ac\u00ad\7.\2\2\u00ad\u00ae\5\26\f\2\u00ae"+
		"\u00af\7/\2\2\u00af\u00b6\3\2\2\2\u00b0\u00b1\5\24\13\2\u00b1\u00b2\7"+
		"\5\2\2\u00b2\u00b3\5\26\f\5\u00b3\u00b6\3\2\2\2\u00b4\u00b6\5\30\r\2\u00b5"+
		"\u00ab\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00c5\3\2"+
		"\2\2\u00b7\u00b8\f\b\2\2\u00b8\u00b9\7\b\2\2\u00b9\u00c4\5\26\f\t\u00ba"+
		"\u00bb\f\7\2\2\u00bb\u00bc\7\7\2\2\u00bc\u00c4\5\26\f\b\u00bd\u00be\f"+
		"\6\2\2\u00be\u00bf\7\4\2\2\u00bf\u00c4\5\26\f\7\u00c0\u00c1\f\4\2\2\u00c1"+
		"\u00c2\7\5\2\2\u00c2\u00c4\5\24\13\2\u00c3\u00b7\3\2\2\2\u00c3\u00ba\3"+
		"\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\27\3\2\2\2\u00c7\u00c5\3\2\2"+
		"\2\u00c8\u00c9\7*\2\2\u00c9\u00ce\5@!\2\u00ca\u00cb\7\60\2\2\u00cb\u00cd"+
		"\5@!\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7+"+
		"\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d5\5\6\4\2\u00d4\u00c8\3\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\31\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7\u00dc\7\30\2"+
		"\2\u00d8\u00d9\7\60\2\2\u00d9\u00db\7\30\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7-\2\2\u00e0\33\3\2\2\2\u00e1\u00e2"+
		"\7\t\2\2\u00e2\u00e3\5\6\4\2\u00e3\u00e4\7&\2\2\u00e4\u00e5\5\32\16\2"+
		"\u00e5\u00ec\3\2\2\2\u00e6\u00e7\7\t\2\2\u00e7\u00e8\5\6\4\2\u00e8\u00e9"+
		"\7&\2\2\u00e9\u00ea\5,\27\2\u00ea\u00ec\3\2\2\2\u00eb\u00e1\3\2\2\2\u00eb"+
		"\u00e6\3\2\2\2\u00ec\35\3\2\2\2\u00ed\u00ee\7\n\2\2\u00ee\u00ef\7.\2\2"+
		"\u00ef\u00f0\5\6\4\2\u00f0\u00f1\7\60\2\2\u00f1\u00f2\5\6\4\2\u00f2\u00f3"+
		"\7/\2\2\u00f3\37\3\2\2\2\u00f4\u00f5\7\37\2\2\u00f5\u00f6\7*\2\2\u00f6"+
		"\u00f7\5F$\2\u00f7\u00f8\7\60\2\2\u00f8\u00f9\7\30\2\2\u00f9\u00fa\7+"+
		"\2\2\u00fa\u00fb\5\6\4\2\u00fb\u00fc\7&\2\2\u00fc\u00fd\5\26\f\2\u00fd"+
		"\u0107\3\2\2\2\u00fe\u00ff\7\37\2\2\u00ff\u0100\7*\2\2\u0100\u0101\5F"+
		"$\2\u0101\u0102\7\60\2\2\u0102\u0103\7\30\2\2\u0103\u0104\7+\2\2\u0104"+
		"\u0105\5\6\4\2\u0105\u0107\3\2\2\2\u0106\u00f4\3\2\2\2\u0106\u00fe\3\2"+
		"\2\2\u0107!\3\2\2\2\u0108\u0109\7\36\2\2\u0109\u010a\7*\2\2\u010a\u010b"+
		"\5F$\2\u010b\u010c\7\60\2\2\u010c\u010d\7\30\2\2\u010d\u010e\7\60\2\2"+
		"\u010e\u010f\7\30\2\2\u010f\u0110\7+\2\2\u0110\u0111\5\6\4\2\u0111\u0112"+
		"\7&\2\2\u0112\u0113\5$\23\2\u0113\u011f\3\2\2\2\u0114\u0115\7\36\2\2\u0115"+
		"\u0116\7*\2\2\u0116\u0117\5F$\2\u0117\u0118\7\60\2\2\u0118\u0119\7\30"+
		"\2\2\u0119\u011a\7\60\2\2\u011a\u011b\7\30\2\2\u011b\u011c\7+\2\2\u011c"+
		"\u011d\5\6\4\2\u011d\u011f\3\2\2\2\u011e\u0108\3\2\2\2\u011e\u0114\3\2"+
		"\2\2\u011f#\3\2\2\2\u0120\u0121\7*\2\2\u0121\u0126\5\30\r\2\u0122\u0123"+
		"\7\60\2\2\u0123\u0125\5\30\r\2\u0124\u0122\3\2\2\2\u0125\u0128\3\2\2\2"+
		"\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0129\u012a\7+\2\2\u012a%\3\2\2\2\u012b\u0130\5(\25\2\u012c\u0130"+
		"\5*\26\2\u012d\u0130\5.\30\2\u012e\u0130\5:\36\2\u012f\u012b\3\2\2\2\u012f"+
		"\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\'\3\2\2\2"+
		"\u0131\u0132\7\13\2\2\u0132\u0133\7.\2\2\u0133\u0134\5\60\31\2\u0134\u0135"+
		"\7\60\2\2\u0135\u0136\5\62\32\2\u0136\u0137\7\60\2\2\u0137\u0138\5\64"+
		"\33\2\u0138\u0139\7\60\2\2\u0139\u013a\5\66\34\2\u013a\u013b\7\60\2\2"+
		"\u013b\u013c\58\35\2\u013c\u013d\7/\2\2\u013d)\3\2\2\2\u013e\u013f\7\f"+
		"\2\2\u013f\u0140\7.\2\2\u0140\u0141\5\60\31\2\u0141\u0142\7\60\2\2\u0142"+
		"\u0143\5\66\34\2\u0143\u0144\7\60\2\2\u0144\u0145\58\35\2\u0145\u0146"+
		"\7/\2\2\u0146+\3\2\2\2\u0147\u0148\7\26\2\2\u0148\u0149\7.\2\2\u0149\u014a"+
		"\7/\2\2\u014a-\3\2\2\2\u014b\u014c\7\r\2\2\u014c\u014d\7.\2\2\u014d\u014e"+
		"\5\6\4\2\u014e\u014f\7/\2\2\u014f/\3\2\2\2\u0150\u0151\5\6\4\2\u0151\61"+
		"\3\2\2\2\u0152\u0155\7\30\2\2\u0153\u0155\5\6\4\2\u0154\u0152\3\2\2\2"+
		"\u0154\u0153\3\2\2\2\u0155\63\3\2\2\2\u0156\u0159\5J&\2\u0157\u0159\5"+
		"\6\4\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159\65\3\2\2\2\u015a"+
		"\u015b\5\6\4\2\u015b\67\3\2\2\2\u015c\u015d\5\6\4\2\u015d9\3\2\2\2\u015e"+
		"\u0161\5<\37\2\u015f\u0161\5> \2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2"+
		"\2\u0161;\3\2\2\2\u0162\u0163\7\16\2\2\u0163\u0164\7.\2\2\u0164\u0165"+
		"\5\6\4\2\u0165\u0166\7/\2\2\u0166\u016d\3\2\2\2\u0167\u0168\7\17\2\2\u0168"+
		"\u0169\7.\2\2\u0169\u016a\5\6\4\2\u016a\u016b\7/\2\2\u016b\u016d\3\2\2"+
		"\2\u016c\u0162\3\2\2\2\u016c\u0167\3\2\2\2\u016d=\3\2\2\2\u016e\u016f"+
		"\7\20\2\2\u016f\u0170\7.\2\2\u0170\u0171\5\6\4\2\u0171\u0172\7/\2\2\u0172"+
		"?\3\2\2\2\u0173\u0176\7\30\2\2\u0174\u0176\5J&\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0174\3\2\2\2\u0176A\3\2\2\2\u0177\u017f\5\6\4\2\u0178\u017f\5\20\t\2"+
		"\u0179\u017f\5H%\2\u017a\u017f\5@!\2\u017b\u017f\7\"\2\2\u017c\u017f\7"+
		"!\2\2\u017d\u017f\5:\36\2\u017e\u0177\3\2\2\2\u017e\u0178\3\2\2\2\u017e"+
		"\u0179\3\2\2\2\u017e\u017a\3\2\2\2\u017e\u017b\3\2\2\2\u017e\u017c\3\2"+
		"\2\2\u017e\u017d\3\2\2\2\u017fC\3\2\2\2\u0180\u0181\7\21\2\2\u0181\u0182"+
		"\7.\2\2\u0182\u0183\5\22\n\2\u0183\u0184\7/\2\2\u0184\u0185\7,\2\2\u0185"+
		"\u0186\5\4\3\2\u0186\u0187\7-\2\2\u0187\u019c\3\2\2\2\u0188\u0189\7\22"+
		"\2\2\u0189\u018a\7.\2\2\u018a\u018b\5\22\n\2\u018b\u018c\7/\2\2\u018c"+
		"\u018d\7,\2\2\u018d\u018e\5\4\3\2\u018e\u018f\7-\2\2\u018f\u019c\3\2\2"+
		"\2\u0190\u0191\7\23\2\2\u0191\u0192\7.\2\2\u0192\u0193\7\24\2\2\u0193"+
		"\u0194\5\24\13\2\u0194\u0195\7\25\2\2\u0195\u0196\5\24\13\2\u0196\u0197"+
		"\7/\2\2\u0197\u0198\7,\2\2\u0198\u0199\5\4\3\2\u0199\u019a\7-\2\2\u019a"+
		"\u019c\3\2\2\2\u019b\u0180\3\2\2\2\u019b\u0188\3\2\2\2\u019b\u0190\3\2"+
		"\2\2\u019cE\3\2\2\2\u019d\u019e\7\31\2\2\u019eG\3\2\2\2\u019f\u01a0\7"+
		"*\2\2\u01a0\u01a5\5@!\2\u01a1\u01a2\7\60\2\2\u01a2\u01a4\5@!\2\u01a3\u01a1"+
		"\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7+\2\2\u01a9I\3\2\2\2\u01aa"+
		"\u01ab\7\27\2\2\u01abK\3\2\2\2\37T^enx\u0085\u008c\u0098\u00a6\u00a8\u00b5"+
		"\u00c3\u00c5\u00ce\u00d4\u00dc\u00eb\u0106\u011e\u0126\u012f\u0154\u0158"+
		"\u0160\u016c\u0175\u017e\u019b\u01a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}