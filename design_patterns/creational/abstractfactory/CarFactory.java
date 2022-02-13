/**
 * 
 */
package creational.abstractfactory;

/**
 * @author utkarsh
 *
 */
public class CarFactory implements AbstractVehicleFactory{

	private String color;
	
	private int tyreCount;
	
	private String transportMeans;
	
	public CarFactory(String color, int tyreCount, String transportMeans){
		this.color = color;
		this.tyreCount = tyreCount;
		this.transportMeans = transportMeans;
	}
	
	@Override
	public Vehicle createVehicle() {
		return new Car(color,tyreCount,transportMeans);
	}

}
