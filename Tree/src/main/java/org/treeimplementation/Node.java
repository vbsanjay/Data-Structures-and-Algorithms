package org.treeimplementation;

public class Node {
    int val;
    Node leftNode;
    Node rightNode;
    
    public Node(int val, Node leftNode, Node rightNode){
        this.val = val;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
    public Node(int val){
        this.val = val;
    }

    public String toString(){
        return Integer.toString(this.val);
    }
}
