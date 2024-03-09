package ASTVisitors;

import ASTGenerator.ASTGenerator;
import Nodes.BaseNode;
import Nodes.StmtNodes.DeclarationNodes.VectorDeclarationNode;
import Nodes.StmtNodes.ExpressionNodes.VectorExpressionNodes.MinusVectorExpressionNode;
import SemanticAnalyzer.SemanticAnalyzer;
import SymbolTable.SymbolTable;
import gen.CANNLexer;
import gen.CANNParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SemanticVisitorsTest {

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

    SymbolTable st = new SymbolTable();
    @Test
    void vectorPlus() {
        
        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("[3,3,4] + [3,4,5];");
        topNode.Accept(semanticQuest);

    }

    @Test
    void vectorPlusMul() {

        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("[3,3,4] - [5,5,4] + [3,5,6] + [3,4,5];");
        topNode.Accept(semanticQuest);

    }
    @Test
    void vectorPlusMulMinus() {

        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("[3,3,4] + [5,5,4] + [23,4,3];");
        topNode.Accept(semanticQuest);

    }
    @Test
    void vectorMinus() {

        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("[3,3,4] - [3,4,5];");
        topNode.Accept(semanticQuest);

    }

    @Test
    void vectorMinusMul() {

        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("[3,3,4] - [3,4,5] - [3,4,5];");
        topNode.Accept(semanticQuest);

    }

    @Test
    void vectorHada()
    {
        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("[3,3,4] hada [3,4,5];");
        topNode.Accept(semanticQuest);
    }

    @Test
    void vectorScalarMult()
    {
        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("[3,4] * 3 + [3,4];");
        topNode.Accept(semanticQuest);
    }

    @Test
    void arithPlus()
    {
        BaseNode topNode = start("3 + 4 + 5 + 6;");
        SemanticAnalyzer SemAn = new SemanticAnalyzer(topNode);
        SemAn.Analyze();
    }

    @Test
    void arithMinus(){

        BaseNode topNode = start("5-2-1;");
        SemanticAnalyzer SemAn = new SemanticAnalyzer(topNode);
        SemAn.Analyze();
    }

    @Test
    void arithMult(){

        BaseNode topNode = start("5 * 3 * 6 * 8;");
        SemanticAnalyzer SemAn = new SemanticAnalyzer(topNode);
        SemAn.Analyze();
    }

    @Test // Does not work with 3 numbers
    void arithDiv(){
        BaseNode topNode = start("25 / 5 / 6 / 7;");
        SemanticAnalyzer SemAn = new SemanticAnalyzer(topNode);
        SemAn.Analyze();

    }

    @Test
    void vecDclNodeOk(){
        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("vec[int, 2] ident := [2,4];");
        SemanticAnalyzer SemAn = new SemanticAnalyzer(topNode);
        SemAn.Analyze();
    }

    @Test
    void unaryExpression()
    {
        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("-1;");
        topNode.Accept(semanticQuest);
    }

    @Test
    void parenthesizedExpression()
    {
        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("(-1);");
        topNode.Accept(semanticQuest);
    }

    @Test
    void BooleanDeclaration()
    {
        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("bool var := true;");
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
        //        topNode.Accept(semanticQuest);
    }

    @Test
    void ifCtrl()
    {
        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("if (true) { bool var := true; };");
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
        //        topNode.Accept(semanticQuest);
    }
    @Test
    void whileCtrl()
    {
        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("while (true) { bool var := true; };");
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
        //topNode.Accept(semanticQuest);
    }

    @Test
    void matrixDcl()
    {
        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("mtrx[int, 3, 3] var := [[1,2,3] ,[4,3,5], [2,3,3]];");
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
        //    topNode.Accept(semanticQuest);
    }
    @Test
    void NeuNetCtrl()
    {
        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("neunet var := import();");
        topNode.Accept(semanticQuest);
    }

    @Test
    void VarDcl()
    {
        SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("int var := 53;");
//        topNode.Accept(semanticQuest);
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
        topNode = start("bool var := true;");
        SemanticAnalyzer AnalyzeSemantically2 = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
        //        topNode.Accept(semanticQuest);
    }

    @Test
    void LoopCtrl()
    {
        //SemanticVisitors semanticQuest = new SemanticVisitors(st);
        BaseNode topNode = start("loop (from 2 to 4) {id;};");
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
        //topNode.Accept(semanticQuest);
    }

    @Test
    void MatrixDeclaration()
    {
        BaseNode topNode = start("mtrx[int, 3, 3] var;");
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
    }

    @Test
    void AssignmentNodeOnlyIds()
    {
        BaseNode topNode = start("a := b;");
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();

    }

    @Test
    void AssignmentNode()
    {
        BaseNode topNode = start("a := 3.4;");
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
    }

    @Test
    void TrainNode()
    {
        BaseNode topNode = start("train (nn, 2, 0.5, matrixOne, matrixTwo);");
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
    }

    @Test
    void TestNode()
    {
        BaseNode topNode = start("test (nn, vectorOne,vectorTwo);");
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
    }


    @Test
    void BooleanSematicTest()
    {
        BaseNode topNode = start("true && true;");
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
    }

    @Test
    void BooleanSematicTestComparison()
    {
        BaseNode topNode = start("4 == 3;");
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
    }
    @Test
    void BooleanSematicTestNegated()
    {
        BaseNode topNode = start("!(!(3 == 2 || 2 == 1 ));");
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
    }

    @Test
    void NNDclDimensions()
    {
        BaseNode topNode = start("neunet idnet := {1,23,4};");
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
    }

    void ArithIdPlusExpression()
    {
        BaseNode topNode = start("ident + 74;");
        SemanticAnalyzer AnalyzeSemantically = new SemanticAnalyzer(topNode);
        AnalyzeSemantically.Analyze();
    }

    // MANGLER Booleans, Vectors,




}