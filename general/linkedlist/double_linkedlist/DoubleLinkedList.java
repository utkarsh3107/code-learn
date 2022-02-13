package linkedlist.double_linkedlist;

public class DoubleLinkedList<T>{
    private DoubleLinkedList<T> nextNode;
    private DoubleLinkedList<T> previousNode;
    T data;
    
    public DoubleLinkedList(T data){
        this.data = data;
        this.nextNode = null;
        this.previousNode = null;
    }
    
    public DoubleLinkedList<T> getNextNode(){
        return this.nextNode;
    }
    
    public void setNextNode(DoubleLinkedList<T> nextNode){
        this.nextNode = nextNode;
    }
    
    public DoubleLinkedList<T> getPreviousNode(){
        return this.previousNode;
    }
    
    public void setPreviousNode(DoubleLinkedList<T> previousNode){
        this.previousNode = previousNode;
    }
    
    public T getData(){
        return this.data;
    }
    
    public void setData(T data){
        this.data = data;
    }
    
    
        
}

