package binarytree;

import java.util.Arrays;
import java.util.Comparator;

import queue.QueueArrayImpl;
import stack.StackLinkedListImpl;

public class BinaryTreeImpl {
	private BinaryTree root;

	public BinaryTree getRoot() {
		return this.root;
	}

	public boolean addElement(int data) {
		BinaryTree current = this.root;
		if (this.root == null) {
			BinaryTree tree = new BinaryTree(data);
			this.root = tree;
			return true;
		}
		boolean flag = findPosition(data, current);
		return flag;
	}

	private boolean findPosition(int data, BinaryTree current) {
		if (current.getData() < data)
			if (current.getRightNode() == null) {
				current.setRightNode(new BinaryTree(data));
				return true;
			} else
				return findPosition(data, current.getRightNode());
		else if (current.getLeftNode() == null) {
			current.setLeftNode(new BinaryTree(data));
			return true;
		} else
			return findPosition(data, current.getLeftNode());

	}

	public int findHeightRoot() {
		QueueArrayImpl<BinaryTree> queueImpl = new QueueArrayImpl<BinaryTree>();
		queueImpl.pushElement(root);
		int height = 0;

		while (!queueImpl.isEmpty()) {
			int nodeCount = queueImpl.size();
			if (nodeCount == 0)
				return height;
			else
				height++;

			while (nodeCount > 0) {
				BinaryTree node = (BinaryTree) queueImpl.popElement();
				queueImpl.pushElement(node.getLeftNode());
				queueImpl.pushElement(node.getRightNode());
				nodeCount--;
			}
		}
		return height;
	}

	public int findHeightRootRecursive() {
		return findRecursiveHeight(root);
	}

	public int findRecursiveHeight(BinaryTree node) {
		if (node == null)
			return 0;
		return 1 + Math.max(findRecursiveHeight(node.getLeftNode()), findRecursiveHeight(node.getRightNode()));
	}

	public void print() {
		BinaryTree temp = this.root;
		printHelper(temp, "");
	}
	
	public void print(BinaryTree root){
		printHelper(root, "");
	}

	private static void printHelper(BinaryTree root, String indent) {
		if (root == null) {
			System.out.println(indent + "null");
			return;
		}

		String newIndent;
		if (indent.equals("")) {
			newIndent = ".. ";
		} else {
			newIndent = "..." + indent;
		}

		printHelper(root.getLeftNode(), newIndent);
		System.out.println(indent + root.getData());
		printHelper(root.getRightNode(), newIndent);
	}

	public void preOrderTraversal() {
		BinaryTree node = root;
		preOrder(node);
	}

	private void preOrder(BinaryTree node) {
		if (node == null)
			return;

		System.out.print(node.getData() + " ");
		preOrder(node.getLeftNode());
		preOrder(node.getRightNode());
	}

	public void inOrderTraversal() {
		BinaryTree node = root;
		inOrder(node);
	}

	private void inOrder(BinaryTree node) {
		if (node == null)
			return;

		inOrder(node.getLeftNode());
		System.out.print(node.getData() + " ");
		inOrder(node.getRightNode());

	}

	public void postOrderTraversal() {
		BinaryTree node = root;
		postOrder(node);
	}

	private void postOrder(BinaryTree node) {
		if (node == null)
			return;

		postOrder(node.getLeftNode());
		postOrder(node.getRightNode());
		System.out.print(node.getData() + " ");
	}

	public void preOrderIterative() {
		StackLinkedListImpl<BinaryTree> stack = new StackLinkedListImpl<BinaryTree>();
		stack.push(root);
		while (!stack.isEmpty()) {
			BinaryTree node = stack.pop();
			int data = node.getData();
			System.out.print(data + " ");
			if (node.getRightNode() != null)
				stack.push(node.getRightNode());
			if (node.getLeftNode() != null)
				stack.push(node.getLeftNode());
		}
	}
	
	public BinaryTree findLowestCommonAncestor(int data1, int data2){
		BinaryTree node = this.root;
		
		if(node == null)
			return null;
			
		while(node != null){
			if(node.getData() < data1 && node.getData() < data2)
				node = node.getRightNode();
			else if(node.getData() > data1 && node.getData() > data2)
				node = node.getLeftNode();
			else
				return node;
		}
		
		return null;	
	}
	
	public BinaryTree heapifyBinaryTree(){
		BinaryTree temp = this.root;
		int totalNodes = totalNodes();
		BinaryTree[] nodeArray  = new BinaryTree[totalNodes];
		
		traverse(temp,0,nodeArray);
		sortArray(nodeArray);
		
		for(int i =0 ;i < nodeArray.length;i++){
			int left = (2 * i) + 1;
			int right = left + 1;
			nodeArray[i].setLeftNode(left >= totalNodes ? null : nodeArray[left]);
			nodeArray[i].setRightNode(right >= totalNodes ? null : nodeArray[right]);
		}
		
		return nodeArray[0];				
	}
	
	private BinaryTree[] sortArray(BinaryTree[] nodeArray){
		Arrays.sort(nodeArray, new Comparator<BinaryTree>(){	
			@Override
			public int compare(BinaryTree tree1, BinaryTree tree2){
				if(tree1.getData() == tree2.getData())
					return 0;
				else if(tree1.getData() < tree2.getData())
					return -1;
				else
					return 1;	
			}
		});
		return nodeArray;
	}
	
	
	public int totalNodes(){
		BinaryTree temp = this.root;
		return traverse(temp,0);
	}

	private int traverse(BinaryTree root, int counter, BinaryTree[] nodeArray){
		if(root == null)
			return counter;
		
		if(root != null)
			nodeArray[counter] = root;
		counter++;
		counter = traverse(root.getLeftNode(),counter,nodeArray);
		counter = traverse(root.getRightNode(),counter,nodeArray);
		
		return counter;
	}
	
	
	private int traverse(BinaryTree root, int count){
		if(root == null)
			return count;
		
		count++;
		count = traverse(root.getLeftNode(),count);
		count = traverse(root.getRightNode(),count);
		return count;	
	}
}
