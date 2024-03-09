package Nodes.StmtNodes.HelperNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class IdentifierVectorNode extends BaseNode {
    public IdentifierVectorNode(ArrayList<BaseNode> children) {
        super(children);
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        //visitor.visit(this);
    }
}
