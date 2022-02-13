/**
 * 
 */
package creational.abstractfactory;

/**
 * @author utkarsh
 *
 */
public class Truck extends Vehicle {
	private String color;

	private int tyreCount;

	private String transportMeans;

	public Truck(String color, int tyreCount, String transportMeans) {
		this.color = color;
		this.tyreCount = tyreCount;
		this.transportMeans = transportMeans;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public int getTyreCount() {
		return tyreCount;
	}

	@Override
	public String getTranportMeans() {
		return transportMeans;
	}

}
