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
import Nodes.ValueNodes.NumberNodes.RealNumeralNode;
import SymbolTable.SymbolTableEntry;

public abstract class BaseVisitor {
    public void visit(BaseNode node) {
        node.Accept(this);
    }

    public abstract void visit(TopNode node);
    public abstract void visit(IfNode node);
    public abstract void visit(WhileNode node);
    public abstract void visit(LoopNode node);
    public abstract void visit(MatrixDeclarationNode node);
    public abstract void visit(NNDeclarationNode node);
    public abstract void visit(VariableDeclarationNode node);
    public abstract void visit(VectorDeclarationNode node);
    public abstract void visit(IdentifierNode node);
    public abstract void visit(ArithmeticDivOperationNode node);
    public abstract void visit(ArithmeticMinusOperationNode node);
    public abstract void visit(ArithmeticPlusOperationNode node);
    public abstract void visit(ArithmeticTimesOperationNode node);
    public abstract void visit(ArithmeticUnaryExprNode node);
    public abstract void visit(ParenthesizedNode node);
    public abstract void visit(BooleanValueNode node);
    public abstract void visit(CompareExpressionNode node);
    public abstract void visit(LogicalExpressionNode node);
    public abstract void visit(NegatedBooleanExpression node);
    public abstract void visit(HadaVectorExpressionNode node);

    public abstract void visit(MinusVectorExpressionNode node);

    public abstract void visit(MultiplicationVectorExpressionNode node);
    public abstract void visit(ParenthesizedVectorExpressionNode node);
    public abstract void visit(PlusVectorExpressionNode node);
    public abstract void visit(VectorValueNode node);

    public abstract void visit(VectorValueNode node, int vectorLength);

    public abstract void visit(VectorValueNode node, SymbolTableEntry matrixDclEntry);
    public abstract void visit(ExportNode node);
    public abstract void visit(ImportNode node);
    public abstract void visit(TestNode node);
    public abstract void visit(TrainNode node);
    public abstract void visit(MatrixValueNode node);

    public abstract void visit(MatrixValueNode node, SymbolTableEntry matrixDclEntry);

    public abstract void visit(AssignmentNode node);
    public abstract void visit(NnDimensions node);

    public abstract void visit(NnDimensions node, SymbolTableEntry nnDclEntry);

    public abstract void visit(TypeNode node);
    public abstract void visit(IntegerNumeralNode node);
    public abstract void visit(RealNumeralNode node);
    public abstract void visit(DataDeclarationNode node);
    public abstract void visit(GreaterThanNode node);
}
