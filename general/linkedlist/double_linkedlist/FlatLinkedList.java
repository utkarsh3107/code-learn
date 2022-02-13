package linkedlist.double_linkedlist;
public class FlatLinkedList<T> extends DoubleLinkedList<T>{

    private FlatLinkedList<T> child;
    
    public FlatLinkedList(T data){
        super(data);
        this.child = null;
    }
    
    public FlatLinkedList<T> getChileNode(){
        return this.child;
    }
    
    public void setChildNode(FlatLinkedList<T> child){
        this.child = child;
    }
}