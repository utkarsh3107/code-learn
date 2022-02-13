package linkedlist.double_linkedlist;

public class DoubleLinkedListTest{
    
    public static void main(String[] args){
        DoubleLinkedListImpl<Integer> dLinkedList = new DoubleLinkedListImpl<Integer>();
        System.out.println(dLinkedList.insertElement(1));
        System.out.println(dLinkedList.insertElement(2));
        System.out.println(dLinkedList.insertElement(4));
        System.out.println(dLinkedList.insertElement(5));
        System.out.println(dLinkedList.printListHead());
        System.out.println(dLinkedList.printListTail());
        System.out.println(dLinkedList.insertElementAt(3,3));
        System.out.println(dLinkedList.printListHead());
        System.out.println(dLinkedList.printListTail());
        System.out.println(dLinkedList.insertElementAt(1,0));
        System.out.println(dLinkedList.printListHead());
        System.out.println(dLinkedList.printListTail());
        System.out.println(dLinkedList.insertElementAt(6,6));
        System.out.println(dLinkedList.printListHead());
        System.out.println(dLinkedList.printListTail());
        System.out.println(dLinkedList.insertElementLast(7));
        System.out.println(dLinkedList.printListHead());
        System.out.println(dLinkedList.printListTail());
        System.out.println("---------------------------");
        System.out.println(dLinkedList.removeElementAt(1));
        System.out.println(dLinkedList.printListHead());
        System.out.println(dLinkedList.printListTail());
        System.out.println(dLinkedList.removeElementAt(6));
        System.out.println(dLinkedList.printListHead());
        System.out.println(dLinkedList.printListTail());
        System.out.println(dLinkedList.removeElementAt(3));
        System.out.println(dLinkedList.printListHead());
        System.out.println(dLinkedList.printListTail());
    }
    
    
}