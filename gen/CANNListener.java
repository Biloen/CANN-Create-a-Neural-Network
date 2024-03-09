// Generated from C:/Users/joens/source/repos/p4\CANN.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CANNParser}.
 */
public interface CANNListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CANNParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CANNParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANNParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CANNParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANNParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(CANNParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANNParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(CANNParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierProduction}
	 * labeled alternative in {@link CANNParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierProduction(CANNParser.IdentifierProductionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierProduction}
	 * labeled alternative in {@link CANNParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierProduction(CANNParser.IdentifierProductionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dclStmt}
	 * labeled alternative in {@link CANNParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDclStmt(CANNParser.DclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dclStmt}
	 * labeled alternative in {@link CANNParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDclStmt(CANNParser.DclStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assStmt}
	 * labeled alternative in {@link CANNParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssStmt(CANNParser.AssStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assStmt}
	 * labeled alternative in {@link CANNParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssStmt(CANNParser.AssStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link CANNParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(CANNParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link CANNParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(CANNParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctrlStmt}
	 * labeled alternative in {@link CANNParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCtrlStmt(CANNParser.CtrlStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctrlStmt}
	 * labeled alternative in {@link CANNParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCtrlStmt(CANNParser.CtrlStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallStmt}
	 * labeled alternative in {@link CANNParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStmt(CANNParser.FunctionCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallStmt}
	 * labeled alternative in {@link CANNParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStmt(CANNParser.FunctionCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varialbeDecl}
	 * labeled alternative in {@link CANNParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVarialbeDecl(CANNParser.VarialbeDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varialbeDecl}
	 * labeled alternative in {@link CANNParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVarialbeDecl(CANNParser.VarialbeDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nnDecl}
	 * labeled alternative in {@link CANNParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterNnDecl(CANNParser.NnDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nnDecl}
	 * labeled alternative in {@link CANNParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitNnDecl(CANNParser.NnDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataDecl}
	 * labeled alternative in {@link CANNParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDataDecl(CANNParser.DataDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataDecl}
	 * labeled alternative in {@link CANNParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDataDecl(CANNParser.DataDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vecDecl}
	 * labeled alternative in {@link CANNParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVecDecl(CANNParser.VecDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vecDecl}
	 * labeled alternative in {@link CANNParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVecDecl(CANNParser.VecDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mtrxDecl}
	 * labeled alternative in {@link CANNParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterMtrxDecl(CANNParser.MtrxDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mtrxDecl}
	 * labeled alternative in {@link CANNParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitMtrxDecl(CANNParser.MtrxDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDclValue}
	 * labeled alternative in {@link CANNParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDclValue(CANNParser.VarDclValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDclValue}
	 * labeled alternative in {@link CANNParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDclValue(CANNParser.VarDclValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDcl}
	 * labeled alternative in {@link CANNParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDcl(CANNParser.VarDclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDcl}
	 * labeled alternative in {@link CANNParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDcl(CANNParser.VarDclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assValue}
	 * labeled alternative in {@link CANNParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssValue(CANNParser.AssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assValue}
	 * labeled alternative in {@link CANNParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssValue(CANNParser.AssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link CANNParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(CANNParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link CANNParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(CANNParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmExpr}
	 * labeled alternative in {@link CANNParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmExpr(CANNParser.ArithmExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmExpr}
	 * labeled alternative in {@link CANNParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmExpr(CANNParser.ArithmExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vecExpr}
	 * labeled alternative in {@link CANNParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVecExpr(CANNParser.VecExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vecExpr}
	 * labeled alternative in {@link CANNParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVecExpr(CANNParser.VecExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code matrxExpr}
	 * labeled alternative in {@link CANNParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMatrxExpr(CANNParser.MatrxExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matrxExpr}
	 * labeled alternative in {@link CANNParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMatrxExpr(CANNParser.MatrxExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolLogic}
	 * labeled alternative in {@link CANNParser#boolean_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolLogic(CANNParser.BoolLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolLogic}
	 * labeled alternative in {@link CANNParser#boolean_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolLogic(CANNParser.BoolLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolComparison}
	 * labeled alternative in {@link CANNParser#boolean_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolComparison(CANNParser.BoolComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolComparison}
	 * labeled alternative in {@link CANNParser#boolean_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolComparison(CANNParser.BoolComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolValue}
	 * labeled alternative in {@link CANNParser#boolean_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(CANNParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolValue}
	 * labeled alternative in {@link CANNParser#boolean_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(CANNParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolNegation}
	 * labeled alternative in {@link CANNParser#boolean_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolNegation(CANNParser.BoolNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolNegation}
	 * labeled alternative in {@link CANNParser#boolean_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolNegation(CANNParser.BoolNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnaryExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnaryExpr(CANNParser.ArithmeticUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnaryExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnaryExpr(CANNParser.ArithmeticUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CANNParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CANNParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticParenExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticParenExpr(CANNParser.ArithmeticParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticParenExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticParenExpr(CANNParser.ArithmeticParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticPlusOpExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticPlusOpExpr(CANNParser.ArithmeticPlusOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticPlusOpExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticPlusOpExpr(CANNParser.ArithmeticPlusOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticIdentifier}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticIdentifier(CANNParser.ArithmeticIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticIdentifier}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticIdentifier(CANNParser.ArithmeticIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticTimesOpExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticTimesOpExpr(CANNParser.ArithmeticTimesOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticTimesOpExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticTimesOpExpr(CANNParser.ArithmeticTimesOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticDivOpExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticDivOpExpr(CANNParser.ArithmeticDivOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticDivOpExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticDivOpExpr(CANNParser.ArithmeticDivOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticMinusOpExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticMinusOpExpr(CANNParser.ArithmeticMinusOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticMinusOpExpr}
	 * labeled alternative in {@link CANNParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticMinusOpExpr(CANNParser.ArithmeticMinusOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vectorVal}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void enterVectorVal(CANNParser.VectorValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vectorVal}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void exitVectorVal(CANNParser.VectorValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vectorMinusExpression}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void enterVectorMinusExpression(CANNParser.VectorMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vectorMinusExpression}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void exitVectorMinusExpression(CANNParser.VectorMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vectorHadaExpression}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void enterVectorHadaExpression(CANNParser.VectorHadaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vectorHadaExpression}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void exitVectorHadaExpression(CANNParser.VectorHadaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vectorMultiplicationExpression}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void enterVectorMultiplicationExpression(CANNParser.VectorMultiplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vectorMultiplicationExpression}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void exitVectorMultiplicationExpression(CANNParser.VectorMultiplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vectorPlusExpression}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void enterVectorPlusExpression(CANNParser.VectorPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vectorPlusExpression}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void exitVectorPlusExpression(CANNParser.VectorPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vectorParenExpression}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void enterVectorParenExpression(CANNParser.VectorParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vectorParenExpression}
	 * labeled alternative in {@link CANNParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void exitVectorParenExpression(CANNParser.VectorParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vectorValueNumeral}
	 * labeled alternative in {@link CANNParser#vector_val}.
	 * @param ctx the parse tree
	 */
	void enterVectorValueNumeral(CANNParser.VectorValueNumeralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vectorValueNumeral}
	 * labeled alternative in {@link CANNParser#vector_val}.
	 * @param ctx the parse tree
	 */
	void exitVectorValueNumeral(CANNParser.VectorValueNumeralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vecId}
	 * labeled alternative in {@link CANNParser#vector_val}.
	 * @param ctx the parse tree
	 */
	void enterVecId(CANNParser.VecIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vecId}
	 * labeled alternative in {@link CANNParser#vector_val}.
	 * @param ctx the parse tree
	 */
	void exitVecId(CANNParser.VecIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nnDims}
	 * labeled alternative in {@link CANNParser#nnDimensions}.
	 * @param ctx the parse tree
	 */
	void enterNnDims(CANNParser.NnDimsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nnDims}
	 * labeled alternative in {@link CANNParser#nnDimensions}.
	 * @param ctx the parse tree
	 */
	void exitNnDims(CANNParser.NnDimsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nnDcl}
	 * labeled alternative in {@link CANNParser#nndeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNnDcl(CANNParser.NnDclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nnDcl}
	 * labeled alternative in {@link CANNParser#nndeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNnDcl(CANNParser.NnDclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nnDclImport}
	 * labeled alternative in {@link CANNParser#nndeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNnDclImport(CANNParser.NnDclImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nnDclImport}
	 * labeled alternative in {@link CANNParser#nndeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNnDclImport(CANNParser.NnDclImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataDcl}
	 * labeled alternative in {@link CANNParser#datadeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDataDcl(CANNParser.DataDclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataDcl}
	 * labeled alternative in {@link CANNParser#datadeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDataDcl(CANNParser.DataDclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vecDclVal}
	 * labeled alternative in {@link CANNParser#vectordeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVecDclVal(CANNParser.VecDclValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vecDclVal}
	 * labeled alternative in {@link CANNParser#vectordeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVecDclVal(CANNParser.VecDclValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vecDcl}
	 * labeled alternative in {@link CANNParser#vectordeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVecDcl(CANNParser.VecDclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vecDcl}
	 * labeled alternative in {@link CANNParser#vectordeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVecDcl(CANNParser.VecDclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code matrixDclVal}
	 * labeled alternative in {@link CANNParser#matrixdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMatrixDclVal(CANNParser.MatrixDclValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matrixDclVal}
	 * labeled alternative in {@link CANNParser#matrixdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMatrixDclVal(CANNParser.MatrixDclValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code matrixDcl}
	 * labeled alternative in {@link CANNParser#matrixdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMatrixDcl(CANNParser.MatrixDclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matrixDcl}
	 * labeled alternative in {@link CANNParser#matrixdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMatrixDcl(CANNParser.MatrixDclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code matrixValue}
	 * labeled alternative in {@link CANNParser#matrx_val}.
	 * @param ctx the parse tree
	 */
	void enterMatrixValue(CANNParser.MatrixValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matrixValue}
	 * labeled alternative in {@link CANNParser#matrx_val}.
	 * @param ctx the parse tree
	 */
	void exitMatrixValue(CANNParser.MatrixValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trainfun}
	 * labeled alternative in {@link CANNParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterTrainfun(CANNParser.TrainfunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trainfun}
	 * labeled alternative in {@link CANNParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitTrainfun(CANNParser.TrainfunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testfun}
	 * labeled alternative in {@link CANNParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterTestfun(CANNParser.TestfunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testfun}
	 * labeled alternative in {@link CANNParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitTestfun(CANNParser.TestfunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exfun}
	 * labeled alternative in {@link CANNParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterExfun(CANNParser.ExfunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exfun}
	 * labeled alternative in {@link CANNParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitExfun(CANNParser.ExfunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathfun}
	 * labeled alternative in {@link CANNParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterMathfun(CANNParser.MathfunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathfun}
	 * labeled alternative in {@link CANNParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitMathfun(CANNParser.MathfunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trainParams}
	 * labeled alternative in {@link CANNParser#trainFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrainParams(CANNParser.TrainParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trainParams}
	 * labeled alternative in {@link CANNParser#trainFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrainParams(CANNParser.TrainParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testParams}
	 * labeled alternative in {@link CANNParser#testFunction}.
	 * @param ctx the parse tree
	 */
	void enterTestParams(CANNParser.TestParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testParams}
	 * labeled alternative in {@link CANNParser#testFunction}.
	 * @param ctx the parse tree
	 */
	void exitTestParams(CANNParser.TestParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code impParams}
	 * labeled alternative in {@link CANNParser#importFunction}.
	 * @param ctx the parse tree
	 */
	void enterImpParams(CANNParser.ImpParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code impParams}
	 * labeled alternative in {@link CANNParser#importFunction}.
	 * @param ctx the parse tree
	 */
	void exitImpParams(CANNParser.ImpParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exParams}
	 * labeled alternative in {@link CANNParser#exportFunction}.
	 * @param ctx the parse tree
	 */
	void enterExParams(CANNParser.ExParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exParams}
	 * labeled alternative in {@link CANNParser#exportFunction}.
	 * @param ctx the parse tree
	 */
	void exitExParams(CANNParser.ExParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANNParser#nn}.
	 * @param ctx the parse tree
	 */
	void enterNn(CANNParser.NnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANNParser#nn}.
	 * @param ctx the parse tree
	 */
	void exitNn(CANNParser.NnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intepoch}
	 * labeled alternative in {@link CANNParser#epoch}.
	 * @param ctx the parse tree
	 */
	void enterIntepoch(CANNParser.IntepochContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intepoch}
	 * labeled alternative in {@link CANNParser#epoch}.
	 * @param ctx the parse tree
	 */
	void exitIntepoch(CANNParser.IntepochContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idepoch}
	 * labeled alternative in {@link CANNParser#epoch}.
	 * @param ctx the parse tree
	 */
	void enterIdepoch(CANNParser.IdepochContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idepoch}
	 * labeled alternative in {@link CANNParser#epoch}.
	 * @param ctx the parse tree
	 */
	void exitIdepoch(CANNParser.IdepochContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reallr}
	 * labeled alternative in {@link CANNParser#learning_rate}.
	 * @param ctx the parse tree
	 */
	void enterReallr(CANNParser.ReallrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reallr}
	 * labeled alternative in {@link CANNParser#learning_rate}.
	 * @param ctx the parse tree
	 */
	void exitReallr(CANNParser.ReallrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idlr}
	 * labeled alternative in {@link CANNParser#learning_rate}.
	 * @param ctx the parse tree
	 */
	void enterIdlr(CANNParser.IdlrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idlr}
	 * labeled alternative in {@link CANNParser#learning_rate}.
	 * @param ctx the parse tree
	 */
	void exitIdlr(CANNParser.IdlrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANNParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(CANNParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANNParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(CANNParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANNParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(CANNParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANNParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(CANNParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathFunctionsMatrix}
	 * labeled alternative in {@link CANNParser#mathFunctions}.
	 * @param ctx the parse tree
	 */
	void enterMathFunctionsMatrix(CANNParser.MathFunctionsMatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathFunctionsMatrix}
	 * labeled alternative in {@link CANNParser#mathFunctions}.
	 * @param ctx the parse tree
	 */
	void exitMathFunctionsMatrix(CANNParser.MathFunctionsMatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathFunctionsVector}
	 * labeled alternative in {@link CANNParser#mathFunctions}.
	 * @param ctx the parse tree
	 */
	void enterMathFunctionsVector(CANNParser.MathFunctionsVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathFunctionsVector}
	 * labeled alternative in {@link CANNParser#mathFunctions}.
	 * @param ctx the parse tree
	 */
	void exitMathFunctionsVector(CANNParser.MathFunctionsVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimensionFunction}
	 * labeled alternative in {@link CANNParser#matrix_function}.
	 * @param ctx the parse tree
	 */
	void enterDimensionFunction(CANNParser.DimensionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimensionFunction}
	 * labeled alternative in {@link CANNParser#matrix_function}.
	 * @param ctx the parse tree
	 */
	void exitDimensionFunction(CANNParser.DimensionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transposeFunction}
	 * labeled alternative in {@link CANNParser#matrix_function}.
	 * @param ctx the parse tree
	 */
	void enterTransposeFunction(CANNParser.TransposeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transposeFunction}
	 * labeled alternative in {@link CANNParser#matrix_function}.
	 * @param ctx the parse tree
	 */
	void exitTransposeFunction(CANNParser.TransposeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vecFunction}
	 * labeled alternative in {@link CANNParser#vector_function}.
	 * @param ctx the parse tree
	 */
	void enterVecFunction(CANNParser.VecFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vecFunction}
	 * labeled alternative in {@link CANNParser#vector_function}.
	 * @param ctx the parse tree
	 */
	void exitVecFunction(CANNParser.VecFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerNumber}
	 * labeled alternative in {@link CANNParser#num}.
	 * @param ctx the parse tree
	 */
	void enterIntegerNumber(CANNParser.IntegerNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerNumber}
	 * labeled alternative in {@link CANNParser#num}.
	 * @param ctx the parse tree
	 */
	void exitIntegerNumber(CANNParser.IntegerNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realNumber}
	 * labeled alternative in {@link CANNParser#num}.
	 * @param ctx the parse tree
	 */
	void enterRealNumber(CANNParser.RealNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realNumber}
	 * labeled alternative in {@link CANNParser#num}.
	 * @param ctx the parse tree
	 */
	void exitRealNumber(CANNParser.RealNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueI}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueI(CANNParser.ValueIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueI}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueI(CANNParser.ValueIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(CANNParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(CANNParser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueVec}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueVec(CANNParser.ValueVecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueVec}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueVec(CANNParser.ValueVecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valNum}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValNum(CANNParser.ValNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valNum}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValNum(CANNParser.ValNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valString}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValString(CANNParser.ValStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valString}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValString(CANNParser.ValStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valBool}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValBool(CANNParser.ValBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valBool}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValBool(CANNParser.ValBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valMathMeth}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValMathMeth(CANNParser.ValMathMethContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valMathMeth}
	 * labeled alternative in {@link CANNParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValMathMeth(CANNParser.ValMathMethContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifCtrl}
	 * labeled alternative in {@link CANNParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void enterIfCtrl(CANNParser.IfCtrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifCtrl}
	 * labeled alternative in {@link CANNParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void exitIfCtrl(CANNParser.IfCtrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileCtrl}
	 * labeled alternative in {@link CANNParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void enterWhileCtrl(CANNParser.WhileCtrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileCtrl}
	 * labeled alternative in {@link CANNParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void exitWhileCtrl(CANNParser.WhileCtrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopCtrl}
	 * labeled alternative in {@link CANNParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void enterLoopCtrl(CANNParser.LoopCtrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopCtrl}
	 * labeled alternative in {@link CANNParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void exitLoopCtrl(CANNParser.LoopCtrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANNParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CANNParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANNParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CANNParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vectnum}
	 * labeled alternative in {@link CANNParser#vectornumeral}.
	 * @param ctx the parse tree
	 */
	void enterVectnum(CANNParser.VectnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vectnum}
	 * labeled alternative in {@link CANNParser#vectornumeral}.
	 * @param ctx the parse tree
	 */
	void exitVectnum(CANNParser.VectnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realnum}
	 * labeled alternative in {@link CANNParser#realnumeral}.
	 * @param ctx the parse tree
	 */
	void enterRealnum(CANNParser.RealnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realnum}
	 * labeled alternative in {@link CANNParser#realnumeral}.
	 * @param ctx the parse tree
	 */
	void exitRealnum(CANNParser.RealnumContext ctx);
}