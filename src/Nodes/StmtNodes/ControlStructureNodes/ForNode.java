package Nodes.StmtNodes.ControlStructureNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class ForNode extends BaseNode {
    public ForNode(ArrayList<BaseNode> children) {
        super(children);
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        //visitor.visit(this);
    }
}
