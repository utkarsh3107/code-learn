package binarytree;

public class BinaryTree{
    private BinaryTree leftNode;
    private BinaryTree rightNode;
    private int data;
    
    public BinaryTree(int data){
        this.leftNode = null;
        this.rightNode = null;
        this.data = data;
    }
    
    public BinaryTree(BinaryTree leftNode, BinaryTree rightNode ,int data){
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.data = data;
    }
    
    public int getData(){
        return this.data;
    }
    
    public void setData(int data){
        this.data = data;
    }
    
    public BinaryTree getLeftNode(){
        return this.leftNode;
    }
    
    public void setLeftNode(BinaryTree leftNode){
        this.leftNode = leftNode;
    }
    
    public BinaryTree getRightNode(){
        return this.rightNode;
    }
    
    public void setRightNode(BinaryTree rightNode){
        this.rightNode = rightNode;
    }
}

