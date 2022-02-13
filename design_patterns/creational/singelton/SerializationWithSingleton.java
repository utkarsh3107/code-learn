/**
 * 
 */
package creational.singelton;

import java.io.Serializable;

/**
 * @author utkarsh
 *
 */
public class SerializationWithSingleton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1372868450531136279L;
	
	private static SerializationWithSingleton instance;
	
	private SerializationWithSingleton(){
		
	}
	
	public static SerializationWithSingleton getInstance(){
		if(instance == null){
			instance = new SerializationWithSingleton();
		}
		return instance;
	}
	
	/**
	 * We need to add the readResolve method if we want to preserve the Singelton behaviour of the class
	 * @return
	 */
	protected Object readResolve(){
		return getInstance();
	}

}
