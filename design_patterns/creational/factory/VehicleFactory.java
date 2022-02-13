/**
 * 
 */
package creational.factory;

/**
 * @author utkarsh
 *
 */
public class VehicleFactory {

	public static Vehicle getVehicle(String type, String color ,int tyreCount,String transportMeans){
		
		if(type.equalsIgnoreCase("car")){
			return new Car(color, tyreCount, transportMeans);
		}else{
			return new Truck(color, tyreCount, transportMeans);
		}
		
	}
	
}
