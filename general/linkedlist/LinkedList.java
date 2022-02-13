package linkedlist;

public class LinkedList<T>{

	private T data;
	private LinkedList<T> node;
	
	public LinkedList(T data){
		this.data = data;
		this.node = null;
	}
	
	public T getData(){
		return this.data;
	}
	
	public LinkedList<T> getNextNode(){
		return this.node;
	}
	
	public void setData(T data){
		this.data = data;
	}
	
	public void setNextNode(LinkedList<T> node){
		this.node = node;
	}
}
