package Nodes.StmtNodes.FuncCallNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class ParameterlessFuncCallNode extends BaseNode {
    public ParameterlessFuncCallNode(ArrayList<BaseNode> children) {
        super(children);
    }

    @Override
    public void Accept(BaseVisitor visitor) {
       // visitor.visit(this);
    }
}
