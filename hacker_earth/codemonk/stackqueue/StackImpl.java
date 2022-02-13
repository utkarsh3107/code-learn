package hacker_earth.codemonk.stackqueue;


public class StackImpl<T> {

	private int top, arrSize;
	private T[] arr; 
	
		
	@SuppressWarnings("unchecked")
	StackImpl(int size){
		top = -1;
		arrSize = size;
		arr = (T[]) new Object[size];
	}
	
	public Object pushElement(T element){
		if(top == arrSize){
			return null;
		}
		
		arr[++top] = element;
		return arr[top];
	}
	
	public T popElement(){
		if(top == -1)
			return null;
		
		return arr[top--];
	}
	
	public T getTopElement(){
		return arr[top];
	}
	
	public int getSize(){
		return top+1;
	}
	
}
