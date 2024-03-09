package Nodes.ValueNodes.NumberNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

public class NaturalNumeralNode extends BaseNode {
    public NaturalNumeralNode(int value)
    {
        this.value=value;
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }

    public int value;
}
