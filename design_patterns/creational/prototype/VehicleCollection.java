/**
 * 
 */
package creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author utkarsh
 *
 */
public class VehicleCollection implements Cloneable{

	
	private List<String> vehicleList;
	
	public VehicleCollection(){
		vehicleList = new ArrayList<>();
	}
	
	public VehicleCollection(List<String> vehicleList){
		this.vehicleList = vehicleList;
	}
	
	public void loadData(){
		vehicleList.add("Maruti");
		vehicleList.add("Honda");
		vehicleList.add("Skoda");
		vehicleList.add("BMW");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		VehicleCollection clone = new VehicleCollection();
		for(String each : this.vehicleList){
			clone.getVehicleList().add(each);
		}
		return clone;
	}

	public List<String> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(List<String> vehicleList) {
		this.vehicleList = vehicleList;
	}

	@Override
	public String toString() {
		StringBuilder op= new StringBuilder();
		for(String each : vehicleList){
			op.append(each).append(System.getProperty("line.separator"));
			
		}
		return "VehicleCollection [vehicleList=" + op.toString() + "]";
	}
	
	

}
