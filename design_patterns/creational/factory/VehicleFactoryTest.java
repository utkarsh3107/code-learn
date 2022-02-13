/**
 * 
 */
package creational.factory;

/**
 * @author utkarsh
 *
 */
public class VehicleFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println((new VehicleFactory().getVehicle("car", "Red", 4, "road")) instanceof Car);
		System.out.println(new VehicleFactory().getVehicle("truck", "Black", 8, "road") instanceof Truck);
	}

}
