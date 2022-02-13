/**
 * 
 */
package structural.bridge;

/**
 * @author utkarsh
 *
 */
public class Car extends Vehicle {
	
	public Car(Workshop produdeWorkshop, Workshop assembleWorkshop){
		super(produdeWorkshop, assembleWorkshop);
	}
	
	/* (non-Javadoc)
	 * @see designpatterns.structural.bridge.Vehicle#manifecture()
	 */
	@Override
	public void manifecture() {
		System.out.println("Car Manifectured");
		getAssembleWorkshop().work();
		getProdudeWorkshop().work();
	}

}
