package Nodes.ValueNodes.MathFunctionNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class VectorFunctionNode extends BaseNode {
    public VectorFunctionNode(ArrayList<BaseNode> children) {
        super(children);
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        //visitor.visit(this);
    }
}
