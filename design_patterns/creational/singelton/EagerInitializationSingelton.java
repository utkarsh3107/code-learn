/**
* In eager initialization, the instance of Singleton Class is created at the time of class loading, 
* this is the easiest method to create a singleton class but it has a drawback that instance is created 
* even though client application might not be using it.
* Here is the implementation of static initialization singleton class.
*/
package creational.singelton;

/**
 * @author utkarsh
 *
 */
public class EagerInitializationSingelton {

	private static final EagerInitializationSingelton instance = new EagerInitializationSingelton();
	
	private EagerInitializationSingelton(){
		
	}
	
	public static EagerInitializationSingelton getInstance(){
		return instance;
	}
}
