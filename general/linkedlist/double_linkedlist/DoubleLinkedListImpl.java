package linkedlist.double_linkedlist;

public class DoubleLinkedListImpl<T>{
    
    private DoubleLinkedList<T> head = null;
    private DoubleLinkedList<T> tail = null;
    
    public DoubleLinkedListImpl(){
        this.head = null;
        this.tail = null;
    }
    
    public DoubleLinkedList<T> getHead(){
        return this.head;
    }
    
     public DoubleLinkedList<T> getTail(){
        return this.tail;
    }
    
    public boolean insertElement(T data){
        DoubleLinkedList<T> head = this.head;
        
        if(head == null){
            DoubleLinkedList<T> temp = new DoubleLinkedList<T>(data);
            temp.setNextNode(null);
            temp.setPreviousNode(null);
            this.head = temp;
            this.tail = temp;
            return true;
        }
            
        while(head.getNextNode() != null){
            head = head.getNextNode();
        }
        DoubleLinkedList<T> temp = new DoubleLinkedList<T>(data);
        temp.setNextNode(null);
        temp.setPreviousNode(head);
        head.setNextNode(temp);
        this.tail = temp;
        return true;
    }
    
    public boolean insertElementAt(int position,T data){
        DoubleLinkedList<T> current = this.head;
        if(position <= 0 || head == null)
            return false;
        
        while(position > 1){
            if(current.getNextNode() == null) return false;            
            current = current.getNextNode();
            position--;
        }
       
        DoubleLinkedList<T> temp = new DoubleLinkedList<T>(data);

        temp.setNextNode(current);
        if(null == current.getPreviousNode()){          
            temp.setPreviousNode(null);      
            this.head = temp;
        }else{
            temp.setPreviousNode(current.getPreviousNode());
            current.getPreviousNode().setNextNode(temp);
            
        }
        current.setPreviousNode(temp);
        
        return true;
    }
    
    public boolean insertElementLast(T data){
        if (tail == null)
            return false;
            
        DoubleLinkedList<T> temp = new DoubleLinkedList<T>(data);
        DoubleLinkedList<T> current = this.tail;
        
        temp.setNextNode(null);
        temp.setPreviousNode(current);
        current.setNextNode(temp);
        this.tail = temp;
        
        return true;
    }
    
    public boolean removeElementAt(int pos){
        if(pos <= 0 || this.head == null)
            return false;
            
        DoubleLinkedList<T> current = this.head;
        
        while(pos > 1){
            if(current.getNextNode() == null) return false;
            current = current.getNextNode();
            pos--;
        }
        
        if(current.getPreviousNode() == null){
            current.getNextNode().setPreviousNode(null);
            this.head = current.getNextNode();
        }else if(current.getNextNode() == null){
            current.getPreviousNode().setNextNode(null);
            this.tail = current.getPreviousNode();
        }else{
            DoubleLinkedList<T> previous = current.getPreviousNode();
            DoubleLinkedList<T> next = current.getNextNode();
            previous.setNextNode(next);
            next.setPreviousNode(previous);
        }
        
        return true;    
            
    }
    
    public String printListHead(){
        StringBuffer buf = new StringBuffer();
        DoubleLinkedList<T> head = this.head;
        
        if(head == null)
            return "";
        
        while(head.getNextNode() != null){
            buf.append(head.getData()+ " - ");
            head = head.getNextNode();
        }
        buf.append(head.getData()+ " - ");
        return buf.toString();
    }
    
    public String printListTail(){
        StringBuffer buf = new StringBuffer();
        DoubleLinkedList<T> tail = this.tail;
        
        if(tail == null)
            return "";
        
        while(tail.getPreviousNode() != null){
            buf.append(tail.getData()+ " - ");
            tail = tail.getPreviousNode();
        }
        buf.append(tail.getData()+ " - ");
        return buf.toString();
    }
}