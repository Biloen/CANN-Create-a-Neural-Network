package Nodes.ValueNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

public class IdentifierNode extends BaseNode {

    public IdentifierNode(String identifier)
    {
        this.identifier=identifier;
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }

    public String identifier;
}
