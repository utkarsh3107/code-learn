package stack;

import linkedlist.LinkedList;

public class StackLinkedListImpl<T>{
    
    private LinkedList<T> head  = null;
    
    public void push(T data){
        if(head == null){
            LinkedList<T> temp = new LinkedList<T>(data);
            head = temp;
        }else{
            LinkedList<T> temp = new LinkedList<T>(data);
            LinkedList<T> current = head;
            while(current.getNextNode() != null){
                current = current.getNextNode();
            }
            current.setNextNode(temp);
        }
    }
    
    public T pop(){
        LinkedList<T> current = head;
        LinkedList<T> previous = null;
        if(head == null){
            return null;
        }else{
            while(current.getNextNode() != null){
                previous = current;
                current = current.getNextNode();
            }
            T data = current.getData();
            previous.setNextNode(null);
            return data;  
        }  
    }
    
    public boolean isEmpty(){
        return (head == null) ? true : false;                   
    }
    
    public int size(){
        int size = 0;
        if(head == null)
            return size;
            
        LinkedList<T> current = head;
        
        while(current != null){
            current = current.getNextNode();
            size++;
        }
        return size;
    }
    
    public String printStack(){
        String value = "";
        LinkedList<T> current = this.head;
        while(current.getNextNode() != null){
            value = value + " - " + current.getData();
            current = current.getNextNode();
        }
        value = value + " - " + current.getData();
        return value;
    }
        
} 
