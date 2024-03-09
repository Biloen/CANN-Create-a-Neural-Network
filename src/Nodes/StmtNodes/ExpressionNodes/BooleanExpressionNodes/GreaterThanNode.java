package Nodes.StmtNodes.ExpressionNodes.BooleanExpressionNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class GreaterThanNode extends BaseNode {
    public GreaterThanNode(ArrayList<BaseNode> children) {
        super(children);
    }
    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }
}
