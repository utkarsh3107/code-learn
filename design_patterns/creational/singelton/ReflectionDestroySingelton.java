/**
 * 
 */
package creational.singelton;

import java.lang.reflect.Constructor;

/**
 * @author utkarsh
 *
 */
public class ReflectionDestroySingelton {

	public static void main(String[] args){
		LazyInitializationSingelton obj1 = LazyInitializationSingelton.getInstacne();
		
		LazyInitializationSingelton obj2 = null;
		
		try{
			Constructor[] constructor = LazyInitializationSingelton.class.getDeclaredConstructors();
			
			for(Constructor each : constructor){
				each.setAccessible(true);
				obj2 = (LazyInitializationSingelton) each.newInstance();
				break;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		System.out.println("Obj1" + obj1);
		System.out.println("Obj2" + obj2);
	}
	
}
