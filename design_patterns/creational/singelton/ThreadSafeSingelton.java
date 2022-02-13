/**
 * The easier way to create a thread-safe singleton class is to make the global access method synchronized, 
 * so that only one thread can execute this method at a time. 
 * General implementation of this approach is like the below class.
 * Below implementation works fine and provides thread-safety but it reduces the performance because of cost associated with the synchronized method, 
 * although we need it only for the first few threads who might create the separate instances 
 */
package creational.singelton;

/**
 * @author utkarsh
 *
 */
public class ThreadSafeSingelton {

	private static ThreadSafeSingelton instance = null;

	private ThreadSafeSingelton() {

	}

	public static synchronized ThreadSafeSingelton getInstace() {
		if (instance == null)
			instance = new ThreadSafeSingelton();

		return instance;
	}
}
