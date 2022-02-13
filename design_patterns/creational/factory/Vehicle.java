/**
 * 
 */
package design_patterns.creational.factory;

/**
 * @author utkarsh
 *
 */
public abstract class Vehicle {

	public abstract String getColor();

	public abstract int getTyreCount();

	public abstract String getTranportMeans();

	@Override
	public String toString() {
		return "Vehicle [getColor()=" + getColor() + ", getTyreCount()=" + getTyreCount() + ", getTranportMeans()="
				+ getTranportMeans() + "]";
	}

	
	
}
