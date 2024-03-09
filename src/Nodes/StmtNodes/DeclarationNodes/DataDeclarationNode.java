package Nodes.StmtNodes.DeclarationNodes;

import ASTVisitors.BaseVisitor;
import Nodes.BaseNode;

import java.util.ArrayList;

public class DataDeclarationNode extends BaseNode {
    public DataDeclarationNode(ArrayList<BaseNode> children){
        super(children);
    }
    public String methodName;

    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }
}
