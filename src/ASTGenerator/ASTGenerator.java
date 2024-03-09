package ASTGenerator;
import Nodes.StmtNodes.AssignmentNode;
import Nodes.StmtNodes.ExpressionNodes.ArithmeticExpressionNodes.*;
import Nodes.StmtNodes.ControlStructureNodes.IfNode;
import Nodes.StmtNodes.ControlStructureNodes.LoopNode;
import Nodes.StmtNodes.ControlStructureNodes.WhileNode;
import Nodes.StmtNodes.DeclarationNodes.*;
import Nodes.StmtNodes.ExpressionNodes.BooleanExpressionNodes.*;
import Nodes.StmtNodes.ExpressionNodes.VectorExpressionNodes.*;
import Nodes.StmtNodes.FuncCallNodes.ExportNode;
import Nodes.StmtNodes.FuncCallNodes.ImportNode;
import Nodes.StmtNodes.FuncCallNodes.TestNode;
import Nodes.StmtNodes.FuncCallNodes.TrainNode;
import Nodes.StmtNodes.HelperNodes.MatrixValueNode;
import Nodes.ValueNodes.IdentifierNode;
import Nodes.ValueNodes.MathFunctionNodes.DimensionNode;
import Nodes.ValueNodes.MathFunctionNodes.SizeNode;
import Nodes.ValueNodes.MathFunctionNodes.TransposeNode;
import Nodes.ValueNodes.NumberNodes.IntegerNumeralNode;
import Nodes.ValueNodes.NumberNodes.RealNumeralNode;
import Nodes.ValueNodes.StringValueNode;
import gen.CANNBaseVisitor;
import Nodes.*;
import gen.CANNParser;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;

// vi vil lave ast for: true;

public class ASTGenerator extends CANNBaseVisitor<BaseNode>{

    private final CANNParser.ProgContext _cst;

    public ASTGenerator(CANNParser.ProgContext cst)
    {
        this._cst = cst;
    }

    //AST nodegenerator
    public BaseNode generateAST() {
        return visitProg(_cst);
    }

    //region Prog and stmts
    @Override
    // should return a topnode with a list of stmt children
    public BaseNode visitProg(CANNParser.ProgContext context) {
        return new TopNode(visitStmtsReturnNodeList(context.stmts()));
    }

    //Statements node
    public ArrayList<BaseNode> visitStmtsReturnNodeList(CANNParser.StmtsContext context){ // :D

        ArrayList<BaseNode> listOfStatements =new ArrayList<>(context.stmt().size());
        for (CANNParser.StmtContext stmtCTX: context.stmt()) // denne for visitor alle statements i en stmtscontext
        {
            listOfStatements.add(visit((stmtCTX)));
        }

        return listOfStatements;
    }
    //endregion

    //region Control structures
    public IfNode visitIfCtrl(CANNParser.IfCtrlContext context) {
        IfNode node = new IfNode(new ArrayList<>());
        node.children.add(visit(context.cond));
        node.children.addAll(visitStmtsReturnNodeList(context.body));
        return node;
    }
    @Override
    public WhileNode visitWhileCtrl(CANNParser.WhileCtrlContext context) {
        WhileNode node = new WhileNode(new ArrayList<>());
        node.children.add(visit(context.cond));
        node.children.addAll(visitStmtsReturnNodeList(context.body));
        return node;
    }
    @Override
    public LoopNode visitLoopCtrl(CANNParser.LoopCtrlContext context) {
        LoopNode node = new LoopNode(new ArrayList<>());
        node.children.add(visit(context.from));
        node.children.add(visit(context.to));
        node.children.addAll(visitStmtsReturnNodeList(context.body));
        return node;
    }
    //endregion

    //region Assignments
    @Override
    public AssignmentNode visitAssValue(CANNParser.AssValueContext context) {
        AssignmentNode node = new AssignmentNode(new ArrayList<>());
        node.children.add(visit(context.ident));
        node.children.add(visit(context.assvalue));
        return node;
    }
    //endregion

    @Override
    public BooleanValueNode visitBoolValue(CANNParser.BoolValueContext context) {
        String boolValString = context.bvalue.getText();
        boolean value = Boolean.parseBoolean(boolValString);
        return new BooleanValueNode(value);
    }

    //Expression statement node
    @Override
    public BaseNode visitExprStmt(CANNParser.ExprStmtContext context)
    {
    return visit(context.expression());
    }

    // Boolean expression node
     @Override
     public BaseNode visitBoolExpr(CANNParser.BoolExprContext context) {
        return visit(context.boolean_expr());
     }

    @Override
    public BaseNode visitArithmExpr(CANNParser.ArithmExprContext context) {
        return visit(context.arithmetic_expr());
    }

    //Negated
     @Override
    public NegatedBooleanExpression visitBoolNegation(CANNParser.BoolNegationContext context){
        NegatedBooleanExpression myNode = new NegatedBooleanExpression(new ArrayList<>());
        myNode.children.add(visit(context.boolean_expr()));
        return myNode;
    }
    @Override
    public CompareExpressionNode visitBoolComparison(CANNParser.BoolComparisonContext context)
    {
        CompareExpressionNode myNode = new CompareExpressionNode(new ArrayList<>());
        myNode.children.add(visit(context.arithmetic_expr(0)));
        myNode.children.add(visit(context.arithmetic_expr(1)));
        return myNode;
    }

    @Override
    public IdentifierNode visitBoolIdentifier(CANNParser.BoolIdentifierContext context) {
        return (IdentifierNode) visit(context.identifier());
    }

    @Override
    public ParenthesizedNode visitBoolParenExpr(CANNParser.BoolParenExprContext context) {
        ParenthesizedNode myNode = new ParenthesizedNode(new ArrayList<>());
        myNode.children.add(visit(context.boolean_expr()));
        return myNode;
    }

    @Override
    public GreaterThanNode visitGreaterThanComparison(CANNParser.GreaterThanComparisonContext context) {
        GreaterThanNode myNode = new GreaterThanNode(new ArrayList<>());
        myNode.children.add(visit(context.arithmetic_expr(0)));
        myNode.children.add(visit(context.arithmetic_expr(1)));
        return myNode;
    }

     //Logical does not work as intended
    @Override
    public LogicalExpressionNode visitBoolLogic(CANNParser.BoolLogicContext context)
    {
        LogicalExpressionNode myNode = new LogicalExpressionNode(new ArrayList<>());
        myNode.children.add(visit(context.boolean_expr(0)));
        myNode.children.add(visit(context.boolean_expr(1)));
        myNode.operator = context.children.get(1).getText();
        System.out.println(myNode.operator);
        return myNode;
    }

    //NumberNode is not done correctly. It is done for

    @Override
    public BaseNode visitNumber(CANNParser.NumberContext context){
       return (visit(context.num()));
    }


    @Override
    public IntegerNumeralNode visitIntegerNumber(CANNParser.IntegerNumberContext context)
    {
        return new IntegerNumeralNode(Integer.parseInt(context.intval.getText()));
    }

    @Override
    public RealNumeralNode visitRealNumber(CANNParser.RealNumberContext context)
    {
        return new RealNumeralNode((Double.parseDouble(context.realval.getText())));
    }


    @Override
    public ParenthesizedNode visitArithmeticParenExpr(CANNParser.ArithmeticParenExprContext context){
        ParenthesizedNode myNode = new ParenthesizedNode(new ArrayList<>());
        myNode.children.add(visit(context.arithmetic_expr()));
        return myNode;
    }

    @Override
    public ParenthesizedVectorExpressionNode visitVectorParenExpression(CANNParser.VectorParenExpressionContext context) {
        ParenthesizedVectorExpressionNode node = new ParenthesizedVectorExpressionNode(new ArrayList<>());
        node.children.add(visit(context.vector_expr()));
        return node;
    }


    @Override
    public PlusVectorExpressionNode visitVectorPlusExpression(CANNParser.VectorPlusExpressionContext context){
        PlusVectorExpressionNode myNode = new PlusVectorExpressionNode(new ArrayList<>());
        myNode.children.add(visit(context.vector_expr(0)));
        myNode.children.add(visit(context.vector_expr(1)));
        return myNode;
    }

    @Override
    public MinusVectorExpressionNode visitVectorMinusExpression(CANNParser.VectorMinusExpressionContext context){
        MinusVectorExpressionNode myNode = new MinusVectorExpressionNode(new ArrayList<>());
        myNode.children.add(visit(context.vector_expr(0)));
        myNode.children.add(visit(context.vector_expr(1)));
        return myNode;
    }

    @Override
    public HadaVectorExpressionNode visitVectorHadaExpression(CANNParser.VectorHadaExpressionContext context){
        HadaVectorExpressionNode myNode = new HadaVectorExpressionNode(new ArrayList<>());
        myNode.children.add(visit(context.vector_expr(0)));
        myNode.children.add(visit(context.vector_expr(1)));
        return myNode;
    }

    @Override
    public MultiplicationVectorExpressionNode visitVectorMultiplicationExpression(CANNParser.VectorMultiplicationExpressionContext context){
        MultiplicationVectorExpressionNode myNode = new MultiplicationVectorExpressionNode(new ArrayList<>());
        myNode.children.add(visit(context.arithex));
        myNode.children.add(visit(context.vecex));
        return myNode;
    }

    /*@Override // uncommented here
    public VectorValueNode visitVectorVal(CANNParser.VectorValContext context){ // kunne være id
        return (VectorValueNode) visit(context.vector_val());
    }*/

    @Override
    public VectorValueNode visitVectorValueNumeral(CANNParser.VectorValueNumeralContext context) {
        VectorValueNode myNode = new VectorValueNode(new ArrayList<>());
        for (CANNParser.Arithmetic_exprContext child : context.arithmetic_expr())
        {
            myNode.children.add(visit(child));
        }
        return myNode;
    }

    @Override
    public IdentifierNode visitVecId(CANNParser.VecIdContext context)
    {
        return (IdentifierNode) visit(context.identifier());
    }

    @Override
    public ArithmeticPlusOperationNode visitArithmeticPlusOpExpr(CANNParser.ArithmeticPlusOpExprContext context){
        ArithmeticPlusOperationNode myNode = new ArithmeticPlusOperationNode(new ArrayList<>());
        myNode.children.add(visit(context.arithmetic_expr(0)));
        myNode.children.add(visit(context.arithmetic_expr(1)));
        return myNode;
    }

    @Override
    public ArithmeticMinusOperationNode visitArithmeticMinusOpExpr(CANNParser.ArithmeticMinusOpExprContext context){
        ArithmeticMinusOperationNode myNode = new  ArithmeticMinusOperationNode(new ArrayList<>());
        myNode.children.add(visit(context.arithmetic_expr(0)));
        myNode.children.add(visit(context.arithmetic_expr(1)));
        return myNode;
    }

    @Override
    public ArithmeticTimesOperationNode visitArithmeticTimesOpExpr(CANNParser.ArithmeticTimesOpExprContext context){
        ArithmeticTimesOperationNode myNode = new  ArithmeticTimesOperationNode(new ArrayList<>());
        myNode.children.add(visit(context.arithmetic_expr(0)));
        myNode.children.add(visit(context.arithmetic_expr(1)));
        return myNode;
    }

    @Override
    public ArithmeticDivOperationNode visitArithmeticDivOpExpr(CANNParser.ArithmeticDivOpExprContext context){
        ArithmeticDivOperationNode myNode = new  ArithmeticDivOperationNode(new ArrayList<>());
        myNode.children.add(visit(context.arithmetic_expr(0)));
        myNode.children.add(visit(context.arithmetic_expr(1)));
        return myNode;
    }

    @Override
    public IdentifierNode visitArithmeticIdentifier(CANNParser.ArithmeticIdentifierContext context){
        //IdentifierNode myNode = new IdentifierNode(context.getText());
        return (IdentifierNode) visit(context.identifier());
    }

    @Override // untested
    public ArithmeticUnaryExprNode visitArithmeticUnaryExpr(CANNParser.ArithmeticUnaryExprContext context) {
        ArithmeticUnaryExprNode node = new ArithmeticUnaryExprNode(new ArrayList<>());
        node.children.add(visit(context.arithmetic_expr()));
        return node;
    }

    @Override
    public IdentifierNode visitIdentifierProduction(CANNParser.IdentifierProductionContext context)
    {
        return new IdentifierNode(context.getText());
    }


    //DECLARATIONS
    @Override
    public VariableDeclarationNode visitVarDclValue(CANNParser.VarDclValueContext context){

        VariableDeclarationNode variableValueNode = new VariableDeclarationNode(new ArrayList<>());
        variableValueNode.children.add(new TypeNode(context.declType.getText()));
        variableValueNode.children.add(visit(context.vardclid));
        variableValueNode.children.add(visit(context.vardclval));
        return variableValueNode;

    }

    @Override
    public VariableDeclarationNode visitVarDcl(CANNParser.VarDclContext context){
        VariableDeclarationNode variableDclNode = new VariableDeclarationNode(new ArrayList<>());
        variableDclNode.children.add(new TypeNode(context.declType.getText()));
        variableDclNode.children.add(visit(context.vardclid));
        return variableDclNode;
    }
    @Override
    public NNDeclarationNode visitNnDcl(CANNParser.NnDclContext context) {
        NNDeclarationNode nnDclNode = new NNDeclarationNode(new ArrayList<>());
        nnDclNode.children.add(new TypeNode("neunet"));
        nnDclNode.children.add(visit(context.identifier()));
        nnDclNode.children.add(visit(context.nnDim)); // maybe addall
        return nnDclNode;
    }
    @Override
    public NnDimensions visitNnDims(CANNParser.NnDimsContext context) {
        NnDimensions nnDimsNode = new NnDimensions(new ArrayList<>());
        for (TerminalNode child: context.INTEGER_NUMERAL()) {
                nnDimsNode.children.add(new IntegerNumeralNode(Integer.parseInt(child.getText())));
        }
        return nnDimsNode;
    }

    @Override
    public DataDeclarationNode visitDataDcl(CANNParser.DataDclContext context){
        DataDeclarationNode dataDclNode = new DataDeclarationNode(new ArrayList<>());
        dataDclNode.children.add(visit(context.id1));
        dataDclNode.children.add(visit(context.id2));
        dataDclNode.methodName = context.children.get(0).getText();
        System.out.println(dataDclNode.methodName);
        return dataDclNode;
    }

    //Vector declaration node visitor

    @Override
    public VectorDeclarationNode visitVecDclVal(CANNParser.VecDclValContext context){
        VectorDeclarationNode vecDclValNode = new VectorDeclarationNode(new ArrayList<>());

        vecDclValNode.children.add(new TypeNode(context.vecdcltype.getText()));
        vecDclValNode.children.add(visit(context.vecdcldim));
        vecDclValNode.children.add(visit(context.identifier()));
        vecDclValNode.children.add(visit(context.vecdclval));

        return vecDclValNode;
    }

    @Override
    public VectorDeclarationNode visitVecDcl(CANNParser.VecDclContext context){
        VectorDeclarationNode vecDclNode = new VectorDeclarationNode(new ArrayList<>());

        vecDclNode.children.add(new TypeNode(context.vecdcltype.getText()));
        vecDclNode.children.add(visit(context.vecdcldim));
        vecDclNode.children.add(visit(context.identifier()));

        return vecDclNode;
    }

    //Matrix declaration node visitor

    @Override
    public MatrixDeclarationNode visitMatrixDclVal(CANNParser.MatrixDclValContext context){
        MatrixDeclarationNode matrixDclValNode = new MatrixDeclarationNode(new ArrayList<>());

        matrixDclValNode.children.add(new TypeNode(context.matrixdcltype.getText()));
        matrixDclValNode.children.add(visit(context.matrxdcldim1));
        matrixDclValNode.children.add(visit(context.matrxdcldim2));
        matrixDclValNode.children.add(visit(context.identifier()));
        matrixDclValNode.children.add(visit(context.matrixdclval));

        return matrixDclValNode;
    }

    @Override
    public MatrixDeclarationNode visitMatrixDcl(CANNParser.MatrixDclContext context){
        MatrixDeclarationNode matrixDclNode = new MatrixDeclarationNode(new ArrayList<>());

        matrixDclNode.children.add(new TypeNode(context.matrixdcltype.getText()));
        matrixDclNode.children.add(visit(context.matrxdcldim1));
        matrixDclNode.children.add(visit(context.matrxdcldim2));
        matrixDclNode.children.add(visit(context.identifier()));
        return matrixDclNode;
    }

    @Override
    public MatrixValueNode visitMatrixValue(CANNParser.MatrixValueContext context)
    {
        MatrixValueNode matrixValNode = new MatrixValueNode(new ArrayList<>());

        for (CANNParser.Vector_valContext child: context.vector_val()) {
            matrixValNode.children.add(visit(child));
        }
        return matrixValNode;
    }

    @Override
    public MatrixValueNode visitMatrxExpr(CANNParser.MatrxExprContext context)
    {
        return (MatrixValueNode) visit(context.matrx_val());
    }

    @Override
    public ImportNode visitImpParams(CANNParser.ImpParamsContext context)
    {
        return new ImportNode(new ArrayList<>());
    }


    @Override
    public TrainNode visitTrainParams(CANNParser.TrainParamsContext context)
    {
        TrainNode train = new TrainNode(new ArrayList<>());
        train.children.add(visit(context.nn()));
        train.children.add(visit(context.epoch()));
        train.children.add(visit(context.learning_rate()));
        train.children.add(visit(context.input()));
        train.children.add(visit(context.output()));
        return train;
    }

    @Override
    public IntegerNumeralNode visitIntepoch(CANNParser.IntepochContext context)
    {
        return new IntegerNumeralNode(Integer.parseInt(context.getText()));
    }

    @Override
    public RealNumeralNode visitReallr(CANNParser.ReallrContext context)
    {
        return (RealNumeralNode) visit(context.realnumeral());
    }

    @Override
    public RealNumeralNode visitRealnum(CANNParser.RealnumContext context) {
        return new RealNumeralNode(Double.parseDouble(context.REAL_NUMERAL().getText()));
    }

    @Override
    public IdentifierNode visitIdepoch(CANNParser.IdepochContext context)
    {
        return (IdentifierNode) visit(context.identifier());
    }
    @Override
    public IdentifierNode visitIdlr(CANNParser.IdlrContext context)
    {
        return (IdentifierNode) visit(context.identifier());
    }

    @Override
    public NNDeclarationNode visitNnDclImport(CANNParser.NnDclImportContext context)
    {
        NNDeclarationNode nn = new NNDeclarationNode(new ArrayList<>());
        nn.children.add(new TypeNode("neunet"));
        nn.children.add(visit(context.identifier()));
        nn.children.add(visit(context.importFunction()));
        return nn;
    }
    @Override //
    public ExportNode visitExParams(CANNParser.ExParamsContext context) {
        ExportNode node = new ExportNode(new ArrayList<>());
        node.children.add(visit(context.identifier()));
        return node;
    }
    @Override // untested
    public TestNode visitTestParams(CANNParser.TestParamsContext context) {
        TestNode node = new TestNode(new ArrayList<>());
        node.children.add(visit(context.nn()));
        node.children.add(visit(context.input()));
        node.children.add(visit(context.output()));
        return node;
    }

    @Override
    public SizeNode visitVecFunction(CANNParser.VecFunctionContext context)
    {
        SizeNode size = new SizeNode(new ArrayList<>());
        size.children.add(visit(context.identifier()));
        return size;
    }

    @Override
    public DimensionNode visitDimensionFunction(CANNParser.DimensionFunctionContext ctx)
    {
        DimensionNode node = new DimensionNode(new ArrayList<>());
        node.children.add(visit(ctx.identifier()));
        return node;
    }


    @Override
    public TransposeNode visitTransposeFunction(CANNParser.TransposeFunctionContext context) {
        TransposeNode transpose = new TransposeNode(new ArrayList<>());
        transpose.children.add(visit(context.identifier()));
        return transpose;
    }

    @Override
    public IdentifierNode visitValueI(CANNParser.ValueIContext context){
        return (IdentifierNode) visit(context.identifier());
    }

    @Override
    public BaseNode visitValueExpr(CANNParser.ValueExprContext context)
    {
        return visit(context.expression());
    }


    @Override
    public BaseNode visitValueVec(CANNParser.ValueVecContext context)
    {
        return visit(context.vectornumeral());
    }


    @Override
    public BooleanValueNode visitValBool(CANNParser.ValBoolContext context)
    {
        return new BooleanValueNode(Boolean.parseBoolean(context.boolval.getText()));
    }

    @Override
    public StringValueNode visitValString(CANNParser.ValStringContext context)
    {
        return new StringValueNode(context.stringval.getText());
    }

    @Override
    public BaseNode visitValNum(CANNParser.ValNumContext context)
    {
        return visit(context.num());
    }


}

