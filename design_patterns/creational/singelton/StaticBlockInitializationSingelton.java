/**
 * Static block initialization implementation is similar to eager initialization, 
 * except that instance of class is created in the static block that provides option for exception handling.
 */
package creational.singelton;

/**
 * @author utkarsh
 *
 */
public class StaticBlockInitializationSingelton {

	private static StaticBlockInitializationSingelton instance = null;

	static {
		try {
			instance = new StaticBlockInitializationSingelton();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private StaticBlockInitializationSingelton() {

	}

	public static StaticBlockInitializationSingelton getInstance() {
		return instance;
	}
}
