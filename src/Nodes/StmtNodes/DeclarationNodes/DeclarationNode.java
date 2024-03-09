package Nodes.StmtNodes.DeclarationNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class DeclarationNode extends BaseNode {
    public DeclarationNode (ArrayList<BaseNode> children, String id) {
        super(children);
        this.id = id;
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }

    public String id;
}
