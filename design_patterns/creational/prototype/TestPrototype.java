/**
 * 
 */
package creational.prototype;

/**
 * @author utkarsh
 *
 */
public class TestPrototype {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		VehicleCollection coll = new VehicleCollection();
		coll.loadData();
		
		VehicleCollection clone1 = (VehicleCollection) coll.clone();
		VehicleCollection clone2 = (VehicleCollection) coll.clone();
		
		
		clone1.getVehicleList().add("Merc");
		clone2.getVehicleList().remove(1);
		
		System.out.println(coll + " " +clone1 + " " + clone2);
	}

}
