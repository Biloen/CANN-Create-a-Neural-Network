// Generated from C:/Users/joens/source/repos/p4\CANN.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CANNParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CANNVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CANNParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CANNParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANNParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(CANNParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierProduction}
	 * labeled alternative in {@link CANNParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierProduction(CANNParser.IdentifierProductionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dclStmt}
	 * labeled alternative in {@link CANNParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclStmt(CANNParser.DclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assStmt}
	 * labeled alternative in {@link CANNParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssStmt(CANNParser.AssStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link CANNParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(CANNParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ctrlStmt}
	 * labeled alternative in {@link CANNParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtrlStmt(CANNParser.CtrlStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallStmt}
	 * labeled alternative in {@link CANNParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStmt(CANNParser.FunctionCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varialbeDecl}
	 * labeled alternative in {@link CANNParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarialbeDecl(CANNParser.VarialbeDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nnDecl}
	 * labeled alternative in {@link CANNParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNnDecl(CANNParser.NnDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataDecl}
	 * labeled alternative in {@link CANNParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDecl(CANNParser.DataDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vecDecl}
	 * labeled alternative in {@link CANNParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVecDecl(CANNParser.VecDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mtrxDecl}
	 * labeled alternative in {@link CANNParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMtrxDecl(CANNParser.MtrxDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDclValue}
	 * labeled alternative in {@link CANNParser#variabledeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDclValue(CANNParser.VarDclValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDcl}
	 * labeled alternative in {@link CANNParser#variabledeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDcl(CANNParser.VarDclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assValue}
	 * labeled alternative in {@link CANNParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssValue(CANNParser.AssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link CANNParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(CANNParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmExpr}
	 * labeled alternative in {@link CANNParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmExpr(CANNParser.ArithmExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vecExpr}
	 * labeled alternative in {@link CANNParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVecExpr(CANNParser.VecExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matrxExpr}
	 * labeled alternative in {@link CANNParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrxExpr(CANNParser.MatrxExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolLogic}
	 * labeled alternative in {@link CANNParser#boolean_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLogic(CANNParser.BoolLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolComparison}
	 * labeled alternative in {@link CANNParser#boolean_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolComparison(CANNParser.BoolComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolValue}
	 * labeled alternative in {@link CANNParser#boolean_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(CANNParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolNegation}
	 * labeled alternative in {@link CANNParser#boolean_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNegation(CANNParser.BoolNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnaryExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnaryExpr(CANNParser.ArithmeticUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CANNParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticParenExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticParenExpr(CANNParser.ArithmeticParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticPlusOpExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticPlusOpExpr(CANNParser.ArithmeticPlusOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticIdentifier}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticIdentifier(CANNParser.ArithmeticIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticTimesOpExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticTimesOpExpr(CANNParser.ArithmeticTimesOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticDivOpExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticDivOpExpr(CANNParser.ArithmeticDivOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticMinusOpExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticMinusOpExpr(CANNParser.ArithmeticMinusOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vectorVal}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorVal(CANNParser.VectorValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vectorMinusExpression}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorMinusExpression(CANNParser.VectorMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vectorHadaExpression}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorHadaExpression(CANNParser.VectorHadaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vectorMultiplicationExpression}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorMultiplicationExpression(CANNParser.VectorMultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vectorPlusExpression}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorPlusExpression(CANNParser.VectorPlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vectorParenExpression}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorParenExpression(CANNParser.VectorParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vectorValueNumeral}
	 * labeled alternative in {@link CANNParser#vector_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorValueNumeral(CANNParser.VectorValueNumeralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vecId}
	 * labeled alternative in {@link CANNParser#vector_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVecId(CANNParser.VecIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nnDims}
	 * labeled alternative in {@link CANNParser#nnDimensions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNnDims(CANNParser.NnDimsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nnDcl}
	 * labeled alternative in {@link CANNParser#nndeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNnDcl(CANNParser.NnDclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nnDclImport}
	 * labeled alternative in {@link CANNParser#nndeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNnDclImport(CANNParser.NnDclImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataDcl}
	 * labeled alternative in {@link CANNParser#datadeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDcl(CANNParser.DataDclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vecDclVal}
	 * labeled alternative in {@link CANNParser#vectordeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVecDclVal(CANNParser.VecDclValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vecDcl}
	 * labeled alternative in {@link CANNParser#vectordeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVecDcl(CANNParser.VecDclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matrixDclVal}
	 * labeled alternative in {@link CANNParser#matrixdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixDclVal(CANNParser.MatrixDclValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matrixDcl}
	 * labeled alternative in {@link CANNParser#matrixdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixDcl(CANNParser.MatrixDclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matrixValue}
	 * labeled alternative in {@link CANNParser#matrx_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixValue(CANNParser.MatrixValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trainfun}
	 * labeled alternative in {@link CANNParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrainfun(CANNParser.TrainfunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testfun}
	 * labeled alternative in {@link CANNParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestfun(CANNParser.TestfunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exfun}
	 * labeled alternative in {@link CANNParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExfun(CANNParser.ExfunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathfun}
	 * labeled alternative in {@link CANNParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathfun(CANNParser.MathfunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trainParams}
	 * labeled alternative in {@link CANNParser#trainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrainParams(CANNParser.TrainParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testParams}
	 * labeled alternative in {@link CANNParser#testFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestParams(CANNParser.TestParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impParams}
	 * labeled alternative in {@link CANNParser#importFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpParams(CANNParser.ImpParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exParams}
	 * labeled alternative in {@link CANNParser#exportFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExParams(CANNParser.ExParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANNParser#nn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNn(CANNParser.NnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intepoch}
	 * labeled alternative in {@link CANNParser#epoch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntepoch(CANNParser.IntepochContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idepoch}
	 * labeled alternative in {@link CANNParser#epoch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdepoch(CANNParser.IdepochContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reallr}
	 * labeled alternative in {@link CANNParser#learning_rate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReallr(CANNParser.ReallrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idlr}
	 * labeled alternative in {@link CANNParser#learning_rate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdlr(CANNParser.IdlrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANNParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(CANNParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANNParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(CANNParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathFunctionsMatrix}
	 * labeled alternative in {@link CANNParser#mathFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathFunctionsMatrix(CANNParser.MathFunctionsMatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathFunctionsVector}
	 * labeled alternative in {@link CANNParser#mathFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathFunctionsVector(CANNParser.MathFunctionsVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dimensionFunction}
	 * labeled alternative in {@link CANNParser#matrix_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionFunction(CANNParser.DimensionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code transposeFunction}
	 * labeled alternative in {@link CANNParser#matrix_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransposeFunction(CANNParser.TransposeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vecFunction}
	 * labeled alternative in {@link CANNParser#vector_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVecFunction(CANNParser.VecFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerNumber}
	 * labeled alternative in {@link CANNParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerNumber(CANNParser.IntegerNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realNumber}
	 * labeled alternative in {@link CANNParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealNumber(CANNParser.RealNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueI}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueI(CANNParser.ValueIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(CANNParser.ValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueVec}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueVec(CANNParser.ValueVecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valNum}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValNum(CANNParser.ValNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valString}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValString(CANNParser.ValStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valBool}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValBool(CANNParser.ValBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valMathMeth}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValMathMeth(CANNParser.ValMathMethContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifCtrl}
	 * labeled alternative in {@link CANNParser#control_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCtrl(CANNParser.IfCtrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileCtrl}
	 * labeled alternative in {@link CANNParser#control_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCtrl(CANNParser.WhileCtrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopCtrl}
	 * labeled alternative in {@link CANNParser#control_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopCtrl(CANNParser.LoopCtrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANNParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CANNParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vectnum}
	 * labeled alternative in {@link CANNParser#vectornumeral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectnum(CANNParser.VectnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realnum}
	 * labeled alternative in {@link CANNParser#realnumeral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealnum(CANNParser.RealnumContext ctx);
}