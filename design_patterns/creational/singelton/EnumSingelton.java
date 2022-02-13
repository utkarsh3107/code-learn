/**
 * To overcome this situation with Reflection, Joshua Bloch suggests the use of Enum to implement 
 * Singleton design pattern as Java ensures that any enum value is instantiated only once in a Java program. 
 * Since Java Enum values are globally accessible, so is the singleton.
 *  
 * The drawback is that the enum type is somewhat inflexible; for example, it does not allow lazy initialization.
 * 
 * http://javarevisited.blogspot.in/2012/07/why-enum-singleton-are-better-in-java.html#axzz4qYvqQKa5
 */
package creational.singelton;

/**
 * @author utkarsh
 *
 */
public class EnumSingelton {
	
	public static void main(String[] args){
		EnumInstace.INSTACE.doSomething();
	}
}

enum EnumInstace{
	
	INSTACE;
	
	public void doSomething(){
		System.out.println("Hello");
	}

	
}
