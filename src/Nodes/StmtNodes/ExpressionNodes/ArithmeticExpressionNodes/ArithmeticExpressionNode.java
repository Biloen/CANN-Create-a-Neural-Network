package Nodes.StmtNodes.ExpressionNodes.ArithmeticExpressionNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public abstract class ArithmeticExpressionNode extends BaseNode {
    public ArithmeticExpressionNode(ArrayList<BaseNode> children) { super(children); }
}
