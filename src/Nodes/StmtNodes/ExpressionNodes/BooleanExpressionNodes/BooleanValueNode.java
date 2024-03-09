package Nodes.StmtNodes.ExpressionNodes.BooleanExpressionNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class BooleanValueNode extends BaseNode {
    public BooleanValueNode(ArrayList<BaseNode> children) {
        super(children);
    }
    public BooleanValueNode(boolean value)
    {
        this._value=value;
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }

    public boolean _value;


}
