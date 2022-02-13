/**
 * To avoid this extra overhead every time, double checked locking principle is used. 
 * In this approach, the synchronized block is used inside the if condition with an additional 
 * check to ensure that only one instance of singleton class is created.
 * 
 * https://stackoverflow.com/questions/29876641/what-is-the-purpose-of-passing-parameter-to-synchronized-block
 */
package creational.singelton;

/**
 * @author utkarsh
 *
 */
public class ThreadSafeOptimizedSingelton {

	private static ThreadSafeOptimizedSingelton instance;
	
	private ThreadSafeOptimizedSingelton(){
		
	}
	
	public static ThreadSafeOptimizedSingelton getInstance(){
		if(instance == null){
			synchronized(ThreadSafeOptimizedSingelton.class){
				if(instance == null){
					instance = new ThreadSafeOptimizedSingelton();
				}
			}
		}
		return instance;
	}
}
