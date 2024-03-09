package Nodes.StmtNodes.ExpressionNodes.VectorExpressionNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class HadaVectorExpressionNode extends BaseNode {
    public HadaVectorExpressionNode(ArrayList<BaseNode> children) {
        super(children);
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }
}
