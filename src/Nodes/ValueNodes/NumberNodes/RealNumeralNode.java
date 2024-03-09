package Nodes.ValueNodes.NumberNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

public class RealNumeralNode extends BaseNode {
    public RealNumeralNode(double value)
    {
        this.value=value;
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }

    public double value;
}
