package linkedlist;

class LinkedListImpl<T>{
	LinkedList<T> head = null;
	
	public LinkedList<T> getListHead(){
		return head;
	}
	
	public void insertElement(T data){
		if(this.head == null)
			this.head = new LinkedList<T>(data);
		else{
			LinkedList<T> current = this.head;
			while(current.getNextNode() != null){
				current = current.getNextNode();
			}
			current.setNextNode(new LinkedList<T>(data));
		}
	}
	
	public boolean insertNodePosition(int pos, T data){
		int counter = 1;
		LinkedList<T> current = this.head;
		
		if(pos <=0 )
			return false;
		
		if(counter == pos){
			LinkedList<T> newNode = new LinkedList<T>(data);
			newNode.setNextNode(current);
			this.head = newNode;
			return true;
		}else{
			while(current.getNextNode() != null && counter != (pos-1)){
				current = current.getNextNode();
				counter++;
			}	
			
			if(counter == (pos-1)){
				LinkedList<T> newNode = new LinkedList<T>(data);
				newNode.setNextNode(current.getNextNode());
				current.setNextNode(newNode);
				return true;
			}else{
				return false;
			}
		}
	}
	
	public boolean deleateNode(int pos){
		if(pos <= 0){
			return false;
		}
		
		int counter = 1;
		LinkedList<T> current = this.head;
		
		if(pos == 1){
			LinkedList<T> temp = head;
			head = temp.getNextNode();
			return true;
		}else{
			while(counter != (pos-1) && current.getNextNode() != null){
				counter++;
				current = current.getNextNode();
			}
	
			if(counter == (pos-1)){
				LinkedList<T> temp = current.getNextNode();
				current.setNextNode(temp.getNextNode());
				return true;
			}
		}
		return false;
	}
	
	
	public String printList(){
		LinkedList<T> current = head;
		String value = "";
		while(current.getNextNode() !=null){
			value = value + " - " + current.getData();
			current = current.getNextNode();
		}
		return value + " - " + current.getData();
	}
		
	
}