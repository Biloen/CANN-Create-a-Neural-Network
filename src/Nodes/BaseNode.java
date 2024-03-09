package Nodes;

import ASTVisitors.BaseVisitor;

import java.util.ArrayList;

public abstract class BaseNode {

    public BaseNode(ArrayList<BaseNode> children) {
        for(BaseNode child: children){
            this.children.add(child);
        }
    }
    public BaseNode(){
    }
    public abstract void Accept(BaseVisitor visitor);

    public ArrayList<BaseNode> children = new ArrayList<BaseNode>();
}
