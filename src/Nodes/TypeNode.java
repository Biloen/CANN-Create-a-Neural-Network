package Nodes;

import ASTVisitors.BaseVisitor;

public class TypeNode extends BaseNode {
    public TypeNode(String id){
        this.identifier=id;
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }

    public String identifier;
}
