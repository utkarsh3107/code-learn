package stack;

public class StackLinkedList{
    
    public static void main(String[] args){
        StackLinkedListImpl<Integer> impl = new StackLinkedListImpl<Integer>();
        impl.push(1);
        impl.push(2);
        impl.push(3);
        impl.push(4);
        System.out.println(impl.printStack());
        System.out.println(impl.pop());
        System.out.println(impl.pop());
        System.out.println(impl.printStack());
        System.out.println(impl.isEmpty());
        System.out.println(impl.size());
    }
}