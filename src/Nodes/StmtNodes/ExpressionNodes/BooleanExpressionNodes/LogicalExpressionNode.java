package Nodes.StmtNodes.ExpressionNodes.BooleanExpressionNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class LogicalExpressionNode extends BaseNode {
    public LogicalExpressionNode(ArrayList<BaseNode> children) {
        super(children);
    }
    public String operator;

    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }
}
