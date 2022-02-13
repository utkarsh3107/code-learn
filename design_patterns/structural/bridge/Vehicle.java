/**
 * 
 */
package structural.bridge;

/**
 * @author utkarsh
 *
 */
public abstract class Vehicle {

	private Workshop produdeWorkshop;
	private Workshop assembleWorkshop;


	public Vehicle(Workshop produdeWorkshop, Workshop assembleWorkshop){
		this.produdeWorkshop = produdeWorkshop;
		this.assembleWorkshop = assembleWorkshop;
	}
	
	public abstract void manifecture();

	public Workshop getProdudeWorkshop() {
		return produdeWorkshop;
	}

	public Workshop getAssembleWorkshop() {
		return assembleWorkshop;
	}
	
	
}
