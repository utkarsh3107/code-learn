/**
 * 
 */
package creational.abstractfactory;

/**
 * @author utkarsh
 *
 */
public class TruckFactory implements AbstractVehicleFactory{
	private String color;

	private int tyreCount;

	private String transportMeans;

	public TruckFactory(String color, int tyreCount, String transportMeans){
		this.color = color;
		this.tyreCount = tyreCount;
		this.transportMeans = transportMeans;
	}

	@Override
	public Vehicle createVehicle() {
		return new Truck(color, tyreCount, transportMeans);
	}
}
