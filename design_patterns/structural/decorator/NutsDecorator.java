package structural.decorator;

public class NutsDecorator extends IceCreamDecorator {
	
	public NutsDecorator(IceCream iceCream) {
		super(iceCream);
		// TODO Auto-generated constructor stub
	}
	
	public String addNuts(){
		return " added nuts";
	}
	
	@Override
	public String makeIceCream() {
		return getIceCream().makeIceCream() + addNuts();
	}


}
