package org.treeimplementation;

public class BinaryTree {
    Node root;
    public BinaryTree(Node root){
        this.root = root;
    }
    public void insert(int val){
        Node node = new Node(val);
        traverse(node, root);
    }
    public void traverse(Node node, Node root){
        if node == null{

        }
        if (node.val < root.val){

        }
    }
}
