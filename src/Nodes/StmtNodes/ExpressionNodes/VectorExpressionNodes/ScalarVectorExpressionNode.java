package Nodes.StmtNodes.ExpressionNodes.VectorExpressionNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class  ScalarVectorExpressionNode extends BaseNode {
    public ScalarVectorExpressionNode(ArrayList<BaseNode> children) {
        super(children);
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        //visitor.visit(this);
    }
}
