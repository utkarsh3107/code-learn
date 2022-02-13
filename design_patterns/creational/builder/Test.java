/**
 * 
 */
package creational.builder;

/**
 * @author utkarsh
 *
 */
public class Test {

	public static void main(String[] args){
		PersonalInformation info = new PersonalInformation.PIBuilder("utkarsh","thusoo").setApartmentName("sai raj").build();
		System.out.println(info);
	}
	
}
