package Nodes.ValueNodes.NumberNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

public class IntegerNumeralNode extends BaseNode {
    public IntegerNumeralNode(int value)
    {
        this.value=value;
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }

    public int value;
}
