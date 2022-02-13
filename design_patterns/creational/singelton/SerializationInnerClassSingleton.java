/**
 * 
 */
package creational.singelton;

import java.io.Serializable;

/**
 * @author utkarsh
 *
 */
public class SerializationInnerClassSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SerializationInnerClassSingleton(){
		
	}
	
	private static class InnerClass {
		private static final SerializationInnerClassSingleton INSTANCE = new SerializationInnerClassSingleton();
	}
	
	public static SerializationInnerClassSingleton getInstance(){
		return SerializationInnerClassSingleton.InnerClass.INSTANCE;
	}
	
	protected Object readResolve(){
		return getInstance();
	}
	
}
