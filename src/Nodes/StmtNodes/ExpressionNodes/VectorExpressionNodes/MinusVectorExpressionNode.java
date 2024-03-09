package Nodes.StmtNodes.ExpressionNodes.VectorExpressionNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class MinusVectorExpressionNode extends BaseNode {
    public MinusVectorExpressionNode(ArrayList<BaseNode> children) {
        super(children);
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }

}
