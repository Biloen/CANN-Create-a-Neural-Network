package Nodes.StmtNodes.MethodCallNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class ParameterlessMethodCallNode extends BaseNode {
    public ParameterlessMethodCallNode(ArrayList<BaseNode> children) {
        super(children);
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        //visitor.visit(this);
    }
}
