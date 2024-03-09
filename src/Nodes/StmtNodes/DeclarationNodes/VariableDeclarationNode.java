package Nodes.StmtNodes.DeclarationNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class VariableDeclarationNode extends BaseNode {
    public String id;


    public VariableDeclarationNode(ArrayList<BaseNode> children) {
        super(children);
    }


    public VariableDeclarationNode(ArrayList<BaseNode> children, String id){
        super(children);
            this.id=id;
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }
}
