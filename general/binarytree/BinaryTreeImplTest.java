package binarytree;

public class BinaryTreeImplTest{

    public static void main(String[] args){
        BinaryTreeImpl tree = new BinaryTreeImpl();
        tree.addElement(100);
        tree.addElement(50);
        tree.addElement(150);
        tree.addElement(25);
        tree.addElement(75);
        tree.addElement(125);
        tree.addElement(175);
        tree.addElement(110);
        //tree.print();
        
        //tree.preOrderTraversal();
        //System.out.println();
        //tree.preOrderIterative();
        //System.out.println();
        //BinaryTree node = tree.findLowestCommonAncestor(110, 175);
        //System.out.println(node.getData());
        //System.out.println(tree.totalNodes());
        //tree.heapifyBinaryTree();
        
        tree.print(tree.heapifyBinaryTree());
        /*QueueArrayImpl<Integer> implTest = new QueueArrayImpl<Integer>();
        implTest.pushElement(1);
        implTest.pushElement(2);
        implTest.pushElement(3);
        implTest.pushElement(4);
        implTest.printQueue();
        System.out.println(implTest.popElement());
        System.out.println(implTest.popElement());
        System.out.println(implTest.popElement());
        implTest.printQueue();*/       
    }

}