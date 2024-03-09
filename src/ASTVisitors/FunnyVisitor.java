package ASTVisitors;

import Nodes.BaseNode;
import Nodes.NnDimensions;
import Nodes.StmtNodes.AssignmentNode;
import Nodes.StmtNodes.ControlStructureNodes.IfNode;
import Nodes.StmtNodes.ControlStructureNodes.LoopNode;
import Nodes.StmtNodes.ControlStructureNodes.WhileNode;
import Nodes.StmtNodes.DeclarationNodes.*;
import Nodes.StmtNodes.ExpressionNodes.ArithmeticExpressionNodes.*;
import Nodes.StmtNodes.ExpressionNodes.BooleanExpressionNodes.*;
import Nodes.StmtNodes.ExpressionNodes.VectorExpressionNodes.*;
import Nodes.StmtNodes.FuncCallNodes.ExportNode;
import Nodes.StmtNodes.FuncCallNodes.ImportNode;
import Nodes.StmtNodes.FuncCallNodes.TestNode;
import Nodes.StmtNodes.FuncCallNodes.TrainNode;
import Nodes.StmtNodes.HelperNodes.MatrixValueNode;
import Nodes.TopNode;
import Nodes.TypeNode;
import Nodes.ValueNodes.IdentifierNode;
import Nodes.ValueNodes.NumberNodes.IntegerNumeralNode;
import Nodes.ValueNodes.NumberNodes.NaturalNumeralNode;
import Nodes.ValueNodes.NumberNodes.RealNumeralNode;
/*
public class FunnyVisitor extends BaseVisitor{

    @Override
    public void visit(TopNode node) {
        System.out.println("topnode haha");
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(IfNode node) {

    }

    @Override
    public void visit(WhileNode node) {

    }

    @Override
    public void visit(LoopNode node) {

    }

    @Override
    public void visit(DeclarationNode node) {

    }

    @Override
    public void visit(MatrixDeclarationNode node) {

    }

    @Override
    public void visit(NNDeclarationNode node) {

    }

    @Override
    public void visit(VariableDeclarationNode node) {
        System.out.println("I'm a declaration being visited!");
    }

    @Override
    public void visit(VectorDeclarationNode node) {

    }

    @Override
    public String visit(IdentifierNode node) {

    }

    @Override
    public void visit(ArithmeticDivOperationNode node) {

    }

    @Override
    public void visit(ArithmeticMinusOperationNode node) {

    }

    @Override
    public void visit(ArithmeticPlusOperationNode node) {

    }

    @Override
    public void visit(ArithmeticTimesOperationNode node) {

    }

    @Override
    public void visit(ArithmeticUnaryExprNode node) {

    }

    @Override
    public void visit(ParenthesizedNode node) {

    }

    @Override
    public boolean visit(BooleanValueNode node) {

    }

    @Override
    public void visit(CompareExpressionNode node) {

    }

    @Override
    public void visit(LogicalExpressionNode node) {

    }

    @Override
    public void visit(NegatedBooleanExpression node) {

    }

    @Override
    public int visit(HadaVectorExpressionNode node) {

    }

    @Override
    public int visit(MinusVectorExpressionNode node) {

    }

    @Override
    public int visit(MultiplicationVectorExpressionNode node) {

    }

    @Override
    public void visit(ParenthesizedVectorExpressionNode node) {

    }

    @Override
    public int visit(PlusVectorExpressionNode node) {

    }

    @Override
    public void visit(VectorValueNode node) {

    }

    @Override
    public void visit(ExportNode node) {

    }

    @Override
    public void visit(ImportNode node) {

    }

    @Override
    public void visit(TestNode node) {

    }

    @Override
    public void visit(TrainNode node) {

    }

    @Override
    public void visit(MatrixValueNode node) {

    }

    @Override
    public void visit(AssignmentNode node) {

    }

    @Override
    public void visit(NnDimensions node) {

    }

    @Override
    public String visit(TypeNode node) {

    }

    @Override
    public int visit(IntegerNumeralNode node) {

    }

    @Override
    public void visit(NaturalNumeralNode node) {

    }

    @Override
    public double visit(RealNumeralNode node) {

    }

    @Override
    public void visit(DataDeclarationNode node) {

    }

    @Override
    public void visit(GreaterThanNode node) {

    }


}*/
