package linkedlist;

public class LinkedListTest{

	public static void main(String[] args){
		LinkedListImpl<Integer> list = new LinkedListImpl<Integer>();
		list.insertElement(1);
		list.insertElement(2);
		list.insertElement(5);
		list.insertElement(6);
		list.insertNodePosition(3,3);
		list.insertNodePosition(4,4);
		list.insertNodePosition(7,7);
		list.insertNodePosition(1,0);
		System.out.println(list.printList());
		list.deleateNode(1);
		System.out.println(list.printList());
		list.deleateNode(7);
		System.out.println(list.printList());
		list.deleateNode(3);
		System.out.println(list.printList());
	}
}
	


