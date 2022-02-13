/**
 * Lazy initialization method to implement Singleton pattern creates the instance in the global access method. 
 * Here is the sample code for creating Singleton class with this approach.
 */
package creational.singelton;

/**
 * @author utkarsh
 *
 */
public class LazyInitializationSingelton {

	private static LazyInitializationSingelton instance = null;

	private LazyInitializationSingelton() {

	}

	public static LazyInitializationSingelton getInstacne() {
		if(instance == null)
			instance = new LazyInitializationSingelton();
		return instance;
	}
}
