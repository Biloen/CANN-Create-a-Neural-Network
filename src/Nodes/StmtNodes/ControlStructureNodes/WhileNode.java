package Nodes.StmtNodes.ControlStructureNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class WhileNode extends BaseNode {
    public WhileNode(ArrayList<BaseNode> children) {
        super(children);
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }
}
