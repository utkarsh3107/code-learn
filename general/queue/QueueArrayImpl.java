package queue;

public class QueueArrayImpl<T>{
    
    private Queue queue = null;
    
    public class Queue{
        Object[] data;
        int head;
        int rear;
    
        public Queue(int size){
            this.data = new Object[size];
            this.head = 0;
            this.rear = 0;
        }
        
        public Queue(){
            this.data = new Object[10];
            this.head = 0;
            this.rear = 0;
        }
        
    }
    
    public QueueArrayImpl(int size){
        this.queue = new Queue(size);
        
    }
    
    public QueueArrayImpl(){
        this.queue = new Queue();
    }
    
    public boolean pushElement(T element){
        if(queue.rear >= queue.data.length || element == null)
            return false;
        
        queue.data[queue.rear] = element;
        queue.rear++;
        return true;
    }
    
    public T popElement(){
        if(queue.head > queue.rear)
            queue.head = queue.rear = 0;
            
         Object data = queue.data[queue.head];
         queue.head++;
         return (T) data;
    }

    public boolean isEmpty(){
        return (this.queue.head > this.queue.rear) ? true : false;
    }
    
    public int size(){
       Object[] temp = queue.data;
       if(temp == null)
            return 0; 

       return queue.rear - queue.head;
    }

    public void printQueue(){
        int tempHead = 0;
        while(tempHead != queue.rear){
            System.out.println("->"+queue.data[tempHead]);
            tempHead++;
        }
    }
}