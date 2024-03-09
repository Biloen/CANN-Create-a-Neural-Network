package ASTGenerator;

import Nodes.BaseNode;
import Nodes.NnDimensions;
import Nodes.StmtNodes.AssignmentNode;
import Nodes.StmtNodes.DeclarationNodes.*;
import Nodes.StmtNodes.ExpressionNodes.ArithmeticExpressionNodes.*;
import Nodes.StmtNodes.ExpressionNodes.BooleanExpressionNodes.BooleanValueNode;
import Nodes.StmtNodes.ExpressionNodes.BooleanExpressionNodes.LogicalExpressionNode;
import Nodes.StmtNodes.ExpressionNodes.BooleanExpressionNodes.NegatedBooleanExpression;
import Nodes.StmtNodes.ExpressionNodes.VectorExpressionNodes.MinusVectorExpressionNode;
import Nodes.StmtNodes.ExpressionNodes.VectorExpressionNodes.ParenthesizedVectorExpressionNode;
import Nodes.StmtNodes.ExpressionNodes.VectorExpressionNodes.VectorValueNode;
import Nodes.StmtNodes.FuncCallNodes.ExportNode;
import Nodes.StmtNodes.FuncCallNodes.TestNode;
import Nodes.StmtNodes.FuncCallNodes.TrainNode;
import Nodes.StmtNodes.HelperNodes.MatrixValueNode;
import Nodes.ValueNodes.IdentifierNode;
import Nodes.StmtNodes.ControlStructureNodes.LoopNode;
import Nodes.StmtNodes.ControlStructureNodes.WhileNode;
import Nodes.StmtNodes.ControlStructureNodes.IfNode;
import Nodes.ValueNodes.MathFunctionNodes.DimensionNode;
import Nodes.ValueNodes.MathFunctionNodes.SizeNode;
import Nodes.ValueNodes.MathFunctionNodes.TransposeNode;
import Nodes.ValueNodes.NumberNodes.IntegerNumeralNode;
import Nodes.ValueNodes.NumberNodes.RealNumeralNode;
import gen.CANNLexer;
import gen.CANNParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ASTGeneratorTest {


    BaseNode start(String simpleInput)
    {
        CharStream inputStream = CharStreams.fromString(simpleInput);
        CANNLexer lexer = new CANNLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CANNParser parser = new CANNParser(tokenStream);

        CANNParser.ProgContext cst = parser.prog();

        System.out.println(cst.toStringTree(parser));
        ASTGenerator astBuilder = new ASTGenerator(cst);
        BaseNode topNode = astBuilder.generateAST();

        return topNode;
    }

    @Test
    void visitBoolValueOnCorrectInput(){
        BaseNode topNode = start("true;false;");

        BooleanValueNode TestNode1 = (BooleanValueNode) topNode.children.get(0);
        BooleanValueNode TestNode2 = (BooleanValueNode) topNode.children.get(1);

        assertEquals(TestNode1._value, true);
        assertEquals(TestNode2._value, false);

        assertTrue(TestNode1 instanceof BooleanValueNode);
        assertTrue(TestNode2 instanceof BooleanValueNode);
    }

    @Test
    void visitBoolNegationOnMultipleNegations()
    {
        BaseNode topNode = start("!(false);");

        NegatedBooleanExpression TestNode = (NegatedBooleanExpression) topNode.children.get(0);
        BooleanValueNode TestNodeInsideNegated = (BooleanValueNode) TestNode.children.get(0);

        BaseNode SecondTopNode = start("!(!(true));");

        NegatedBooleanExpression OuterExpression = (NegatedBooleanExpression) SecondTopNode.children.get(0);
        NegatedBooleanExpression InnerExpression = (NegatedBooleanExpression) OuterExpression.children.get(0);
        BooleanValueNode TestNodeValue = (BooleanValueNode) InnerExpression.children.get(0);

        assertEquals(true, TestNodeValue._value);
        assertEquals(false, TestNodeInsideNegated._value);
        assertTrue(TestNode instanceof NegatedBooleanExpression);
        assertTrue(OuterExpression instanceof NegatedBooleanExpression);
        assertTrue(InnerExpression instanceof NegatedBooleanExpression);
    }

    @Test
    void visitBoolLogicOnMultipleLogicalExpressions()
    {
        BaseNode topNode = start("true && false || true;");
        LogicalExpressionNode LogicNode = (LogicalExpressionNode) topNode.children.get(0);
        LogicalExpressionNode LogicNodeChild = (LogicalExpressionNode) LogicNode.children.get(0);

        BooleanValueNode FirstBooleanNode = (BooleanValueNode) LogicNodeChild.children.get(0);
        BooleanValueNode SecondBooleanNode = (BooleanValueNode) LogicNodeChild.children.get(1);
        BooleanValueNode ThirdBooleanNode = (BooleanValueNode) LogicNode.children.get(1);

        assertEquals(true, FirstBooleanNode._value);
        assertEquals(false, SecondBooleanNode._value);
        assertEquals(true, ThirdBooleanNode._value);

        assertEquals(2, LogicNode.children.size());
        assertEquals(2, LogicNodeChild.children.size());

        assertTrue(LogicNode instanceof LogicalExpressionNode);
        assertTrue(LogicNodeChild instanceof LogicalExpressionNode);

    }

    @Test
    void visitArithmeticParenExpr() {
        BaseNode topNode = start("(35);");
        ParenthesizedNode TestNode = (ParenthesizedNode) topNode.children.get(0);
        IntegerNumeralNode ActualNumber = (IntegerNumeralNode) TestNode.children.get(0);

        assertTrue(TestNode instanceof ParenthesizedNode);
        assertEquals(35, ActualNumber.value);
    }

    @Test
    void visitArithmeticUnaryExprOnMinusMinusInteger()
    {
        BaseNode topNode = start("--2;");
        ArithmeticUnaryExprNode TestNode = (ArithmeticUnaryExprNode) topNode.children.get(0);
        System.out.println(TestNode.children.get(0).children.get(0));
        IntegerNumeralNode IntegerNumber = (IntegerNumeralNode) TestNode.children.get(0).children.get(0);

        assertEquals(2, IntegerNumber.value);

    }

    @Test
    void visitNnDims()
    {
        BaseNode topNode = start("neunet newID := {1,2, 3};");
        NNDeclarationNode TestNode  = (NNDeclarationNode) topNode.children.get(0);
        NnDimensions Dimensions = (NnDimensions) TestNode.children.get(2);

        assertEquals(3, Dimensions.children.size());
    }


    @Test
    void visitArithmeticIdentifier()
    {
        BaseNode topNode = start("randomIdentifier;");
        IdentifierNode TestNode = (IdentifierNode) topNode.children.get(0);

        assertEquals("randomIdentifier", TestNode.identifier);
    }
    @Test
    void visitRealNumberOnFloatValues()
    {
        BaseNode topNode = start("100.10;");
        RealNumeralNode TestNode = (RealNumeralNode) topNode.children.get(0);

        assertEquals(100.10, TestNode.value);
        assertTrue(TestNode instanceof RealNumeralNode);
    }

    @Test
    //A RealNumber must be followed by dot
    void visitRealNumberOnIntegerValues()
    {
        BaseNode topNode = start("100;");

        assertThrows(ClassCastException.class, () -> {
            RealNumeralNode TestNode = (RealNumeralNode) topNode.children.get(0);
        });
    }

   @Test
    void visitArithmeticPlusOpExpr()
    {
        BaseNode topNode = start("10+20;");
        ArithmeticPlusOperationNode ArithmeticNode = (ArithmeticPlusOperationNode) topNode.children.get(0);

        IntegerNumeralNode NumberTen = (IntegerNumeralNode) ArithmeticNode.children.get(0);
        IntegerNumeralNode NumberTwenty = (IntegerNumeralNode) ArithmeticNode.children.get(1);

        assertEquals(10  , NumberTen.value);

        assertEquals(20, NumberTwenty.value);
        assertTrue(ArithmeticNode instanceof ArithmeticPlusOperationNode);
        assertTrue(NumberTen instanceof IntegerNumeralNode);
    }

    @Test
    void visitArithmeticMinusOpExpr()
    {
        BaseNode topNode = start("10 - 20;");
        ArithmeticMinusOperationNode ArithmeticNode = (ArithmeticMinusOperationNode) topNode.children.get(0);


        IntegerNumeralNode NumberTen = (IntegerNumeralNode) ArithmeticNode.children.get(0);
        IntegerNumeralNode NumberTwenty = (IntegerNumeralNode) ArithmeticNode.children.get(1);

        assertEquals(10  , NumberTen.value);
        assertEquals(20, NumberTwenty.value);
        assertTrue(ArithmeticNode instanceof ArithmeticMinusOperationNode);
        assertTrue(NumberTen instanceof IntegerNumeralNode);
    }

    @Test
    void visitArithmeticUnaryExprReturnsArithmeticUnaryExprNode() {
        BaseNode topNode = start("-1;");
        ArithmeticUnaryExprNode node = (ArithmeticUnaryExprNode) topNode.children.get(0);

        assertTrue(node instanceof ArithmeticUnaryExprNode);
    }

    @Test
    void visitVarDclValueReturnsVarDclNode(){
        BaseNode topNode = start("int numberID := 45;");
        VariableDeclarationNode TestNode = (VariableDeclarationNode) topNode.children.get(0);

        assertTrue(TestNode instanceof  VariableDeclarationNode);
    }

    @Test
    void TestVarDclValNodeReturnsOneChild(){
        BaseNode topNode = start("int testNum := 2;");
        VariableDeclarationNode theNode = (VariableDeclarationNode) topNode.children.get(0);
        int childrenCount = theNode.children.size();

        assertEquals(3, childrenCount);
    }

    @Test
    void visitIfCtrlReturnsIfNode() {
        BaseNode topNode = start("if(true) {true;false;};");
        IfNode TestNode = (IfNode) topNode.children.get(0);

        assertTrue(TestNode instanceof IfNode);
    }

    @Test
    void visitIfCtrlHasRightAmountOfChildren() {
        BaseNode topNode = start("if(true) {true; true;};");
        IfNode TestNode = (IfNode) topNode.children.get(0);

        int expected = 3;
        int numberOfChildren = TestNode.children.size();

        assertEquals(expected, numberOfChildren);
    }

    @Test
    void visitWhileCtrlReturnsWhileNode() {
        BaseNode topNode = start("while(true) {true;};");
        WhileNode TestNode = (WhileNode) topNode.children.get(0);

        assertTrue(TestNode instanceof WhileNode);
    }

    @Test
    void visitWhileCtrlHasRightAmountOfChildren() {
        BaseNode topNode = start("if(true) {true; true;};");
        IfNode TestNode = (IfNode) topNode.children.get(0);

        int expected = 3;
        int numberOfChildren = TestNode.children.size();

        assertEquals(expected, numberOfChildren);
    }

    @Test
    void visitLoopCtrlReturnsLoopNode() {
        BaseNode topNode = start("loop(from 1 to 2) {true;};");
        LoopNode TestNode = (LoopNode) topNode.children.get(0);

        assertTrue(TestNode instanceof LoopNode);
    }

    @Test
    void visitLoopCtrlReturnsRightAmountOfChildren() {
        BaseNode topNode = start("loop(from 1 to 2) {true; false;};");
        LoopNode TestNode = (LoopNode) topNode.children.get(0);

        int expected = 4;
        int numberOfChildren = TestNode.children.size();

        assertEquals(expected, numberOfChildren);
    }

    @Test
    void visitAssValueReturnsAssignmentNode() {
        BaseNode topNode = start("someName := 2;");
        AssignmentNode testNode = (AssignmentNode) topNode.children.get(0);

        assertTrue(testNode instanceof AssignmentNode);
    }

    @Test
    void visitAssValueMakesRightChildren() { // more of an integration test, i just needed to see if the identifier field was preserved. It was.
        BaseNode topNode = start("someName := 2;");
        AssignmentNode assignNode = (AssignmentNode) topNode.children.get(0);
        IdentifierNode idNode = (IdentifierNode) assignNode.children.get(0);

        assertEquals("someName", idNode.identifier);
    }

    @Test
    void visitVectorValueNumeralOnAmountOfChildren(){
        BaseNode topNode = start("[1.2,23.43,4];");
        VectorValueNode TestNode = (VectorValueNode) topNode.children.get(0);
        System.out.println(TestNode.children.size());
        assertEquals(3, TestNode.children.size());

    }

    @Test
    void visitDataDclArguments()
    {
        BaseNode topNode = start("loadTestData(matrixOne, matrixTwo);");
        DataDeclarationNode TestNode = (DataDeclarationNode) topNode.children.get(0);
        IdentifierNode firstMatrix = (IdentifierNode) TestNode.children.get(0);
        IdentifierNode secondMatrix = (IdentifierNode) TestNode.children.get(1);


        assertEquals("matrixOne", firstMatrix.identifier);
        assertEquals("matrixTwo", secondMatrix.identifier);
    }

    @Test
    void visitVecDclVal()
        {
            BaseNode topNode = start("vec[int, 2] ID := [2.24,3,3];");
            VectorDeclarationNode TestNode = (VectorDeclarationNode) topNode.children.get(0);
            VectorValueNode Vect = (VectorValueNode) TestNode.children.get(TestNode.children.size()-1);

            assertEquals(4,TestNode.children.size());
            assertEquals(3, Vect.children.size());
        }


        @Test
    void vistiVecDcl()
    {
        BaseNode topNode = start("vec[int, 2 ] ID;");
        VectorDeclarationNode TestNode = (VectorDeclarationNode) topNode.children.get(0);

        assertEquals(3, TestNode.children.size());
    }

    @Test
    void visitMatrixDcl()
    {
        BaseNode topNode = start("mtrx[ int, 2 , 2] ident := [ [ 2.2 , 3.3 ] , [ 4.4 , 5.5 ] , [ 6.2] ];");
        MatrixDeclarationNode TestNode = (MatrixDeclarationNode) topNode.children.get(0);

        assertEquals(5, TestNode.children.size());
    }

    @Test
    void visitMatrixDclVal()
    {
        BaseNode topNode = start("[ [ 2.2 , 3.3 ] , [ 4.4 , 5.5 ] , [ 6.2] ];");
        MatrixValueNode TestNode = (MatrixValueNode) topNode.children.get(0);

        assertEquals(3, TestNode.children.size());
    }

    @Test
    void visitTrainParams(){
        BaseNode topNode = start("train( neun , 500 , 2.52 , fileone , filetwo );");
        TrainNode TestNode= (TrainNode) topNode.children.get(0);

        assertEquals(5, TestNode.children.size());
    }

    @Test
    void visitTestParams(){
        BaseNode topNode = start("test( neun ,fileone , filetwo );");
        TestNode Test= (TestNode) topNode.children.get(0);

        assertEquals(3, Test.children.size());
    }

    @Test
    void visitExParams(){
        BaseNode topNode = start("export( identif );");
        ExportNode Test= (ExportNode) topNode.children.get(0);

        assertTrue(Test instanceof ExportNode);

        assertTrue((Test.children.get(0)) instanceof IdentifierNode);
    }

    @Test
    void visitNnDclImportGetsRightChildren (){
    BaseNode topNode = start("neunet ident := import();");
    NNDeclarationNode Test= (NNDeclarationNode) topNode.children.get(0);

        assertEquals(3, Test.children.size());
    }

    @Test
    void visitTransposeFunction()
    {
        BaseNode topNode = start("Transpose ( matrix );");
        TransposeNode Test= (TransposeNode) topNode.children.get(0);

        assertTrue(Test instanceof TransposeNode);
        assertEquals(1, Test.children.size());
    }
    @Test
    void visitDimensionsFunction()
    {
        BaseNode topNode = start("Dimensions ( matrix );");
        DimensionNode Test= (DimensionNode) topNode.children.get(0);

        assertTrue(Test instanceof DimensionNode);
        assertEquals(1, Test.children.size());
    }
    @Test
    void visitSizeFunctionTest()
    {
        BaseNode topNode = start("Size ( matrix );");
        SizeNode Test= (SizeNode) topNode.children.get(0);

        assertTrue(Test instanceof SizeNode);
        assertEquals(1, Test.children.size());
    }

    @Test
    void visitValExpressionWithArithmeticExpression()
    {
        BaseNode topNode = start("identif := 2+3+4;");
        AssignmentNode TestNode = (AssignmentNode) topNode.children.get(0);

        ArithmeticPlusOperationNode firstArimExprNode = (ArithmeticPlusOperationNode) TestNode.children.get(1);
        ArithmeticPlusOperationNode secondArimExprNode = (ArithmeticPlusOperationNode) TestNode.children.get(1).children.get(0);

        IntegerNumeralNode thirdNumber = (IntegerNumeralNode) firstArimExprNode.children.get(1);

        IntegerNumeralNode secondNumber = (IntegerNumeralNode) secondArimExprNode.children.get(1);
        IntegerNumeralNode firstNumber = (IntegerNumeralNode) secondArimExprNode.children.get(0);

        assertEquals(4, thirdNumber.value);
        assertEquals(2, firstNumber.value);
        assertEquals(3, secondNumber.value);

    }

    @Test
    void visitVectorParenExpressionReturnsParenthesizedVectorExpressionNode() {
        BaseNode top = start("([1,1,1]);");
        ParenthesizedVectorExpressionNode testNode = (ParenthesizedVectorExpressionNode) top.children.get(0);
        assertTrue(testNode instanceof ParenthesizedVectorExpressionNode);
    }

    @Test
    void visitVectorParenExpressionHasVectorValueChild() {
        BaseNode top = start("([1,2]);");
        ParenthesizedVectorExpressionNode testNode = (ParenthesizedVectorExpressionNode) top.children.get(0);
        VectorValueNode child = (VectorValueNode) testNode.children.get(0);
        assertTrue(child instanceof VectorValueNode);
    }

}