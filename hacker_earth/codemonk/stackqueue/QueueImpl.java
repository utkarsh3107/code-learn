package hacker_earth.codemonk.stackqueue;

public class QueueImpl<T> {

	private T[] arr = null;
	private int front;
	private int rear;
	
	@SuppressWarnings("unchecked")
	public QueueImpl(int size){
		front = -1;
		rear = -1;
		arr = (T[]) new Object[size];
	}
	
	public T enque(T element){
		if(rear == arr.length)
			return null;
		
		arr[++rear] = element;
		return arr[rear];
	}
	
	public T deque(){
		if(front == rear)
			return null;
		
		T element = arr[++front];
		arr[front-1] = null;
		return element;
	}
	
	public T peek(){
		if(front == -1)
			return null;
		
		return arr[front]; 
	}
	
	public int getSize(){
		return rear - front;
	}
	
	public boolean isEmpty(){
		return front == rear;
	}
}
