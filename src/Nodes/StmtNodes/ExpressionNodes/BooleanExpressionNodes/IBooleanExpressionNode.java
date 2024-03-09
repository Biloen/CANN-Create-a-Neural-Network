package Nodes.StmtNodes.ExpressionNodes.BooleanExpressionNodes;

import java.util.ArrayList;

public interface IBooleanExpressionNode {
        public BooleanValueNode BooleanValueNode(ArrayList<BooleanValueNode> children);
        public NegatedBooleanExpression NegatedBooleanExpression(ArrayList<NegatedBooleanExpression> children);
        public CompareExpressionNode CompareExpressionNode(ArrayList<CompareExpressionNode> children);
        public LogicalExpressionNode LogicalExpressionNode(ArrayList<LogicalExpressionNode> children);
}
