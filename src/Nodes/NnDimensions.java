package Nodes;

import ASTVisitors.BaseVisitor;

import java.util.ArrayList;

public class NnDimensions extends BaseNode{
    public NnDimensions(ArrayList<BaseNode> children) {
        super(children);
    }

    @Override
    public void Accept(BaseVisitor visitor) {
        visitor.visit(this);
    }
}
