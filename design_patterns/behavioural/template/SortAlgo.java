/**
 * 
 */
package behavioural.template;

/**
 * @author utkarsh
 *
 */
public abstract class SortAlgo {
	
	public abstract void compare();
	
	/**
	 * Final method
	 */
	public final void sort(){
		processArray();
		compare();
		returnArray();
	}
	
	private void processArray(){
		System.out.println("Processing Array");
	}
	
	private void returnArray(){
		System.out.println("Returning Array");
	}
}
