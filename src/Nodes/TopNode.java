package Nodes;

import ASTVisitors.BaseVisitor;

import java.util.ArrayList;

public class TopNode extends BaseNode{

    public TopNode(ArrayList<BaseNode> children) {
        super(children);
    }

    @Override
    public void Accept(BaseVisitor visitor) {visitor.visit(this);}
}
