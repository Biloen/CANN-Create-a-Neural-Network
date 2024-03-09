package Nodes.StmtNodes.DeclarationNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class FunctionDeclarationNode extends BaseNode {
    public FunctionDeclarationNode(ArrayList<BaseNode> children) {
        super(children);
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        //visitor.visit(this);
    }
}
