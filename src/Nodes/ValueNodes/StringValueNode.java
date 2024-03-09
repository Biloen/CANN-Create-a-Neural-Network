package Nodes.ValueNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

public class StringValueNode extends BaseNode {
    public StringValueNode(String value)
    {
        this.value=value;
    }
    public String value;

    @Override
    public void Accept(BaseVisitor visitor) {
        //visitor.visit(this);
    }
}
