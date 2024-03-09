package Nodes.StmtNodes.ExpressionNodes.ArithmeticExpressionNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class ArithmeticIdentifierNode extends ArithmeticExpressionNode {
    public ArithmeticIdentifierNode(ArrayList<BaseNode> children) {
        super(children);
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        //visitor.visit(this);
    }
}
