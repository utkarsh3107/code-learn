package structural.bridge;

public class Bike extends Vehicle {
	
	
	public Bike(Workshop produdeWorkshop, Workshop assembleWorkshop) {
		super(produdeWorkshop, assembleWorkshop);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see designpatterns.structural.bridge.Vehicle#manifecture()
	 */
	@Override
	public void manifecture() {
		System.out.println("Bike Manifectured");
		getAssembleWorkshop().work();
		getProdudeWorkshop().work();
	}
}
