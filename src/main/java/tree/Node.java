package tree;

/**
 * Created by tianye13 on 2019/7/24.
 */
public class Node {
    Node parent;
    Node leftChild;
    Node rightChild;
    int val;
    public Node(Node parent, Node leftChild, Node rightChild,int val) {
        this.parent = parent;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.val = val;
    }

    public Node(int val){
        this(null,null,null,val);
    }

    public Node(Node node,int val){
        this(node,null,null,val);
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }


}
