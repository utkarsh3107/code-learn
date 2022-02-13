package structural.decorator;

public class IceCreamDecorator implements IceCream {

	private IceCream iceCream;
	
	public IceCreamDecorator(IceCream iceCream){
		this.iceCream = iceCream;
	}
	
	@Override
	public String makeIceCream() {
		return iceCream.makeIceCream();
	}

	public IceCream getIceCream() {
		return iceCream;
	}

	
}
