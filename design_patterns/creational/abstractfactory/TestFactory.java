/**
 * 
 */
package creational.abstractfactory;

/**
 * @author utkarsh
 *
 */
public class TestFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle obj1 = new CarFactory("red", 4, "road").createVehicle();
		System.out.println(obj1 instanceof Car);
		Vehicle obj2 = new TruckFactory("red", 8, "road").createVehicle();
		System.out.println(obj2 instanceof Truck);
	}

}
