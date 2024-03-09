package Nodes.StmtNodes.ExpressionNodes.VectorExpressionNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class PlusVectorExpressionNode extends BaseNode {
    public PlusVectorExpressionNode(ArrayList<BaseNode> children) {
        super(children);
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }
}
