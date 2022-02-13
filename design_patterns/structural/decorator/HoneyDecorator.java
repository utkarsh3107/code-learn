package structural.decorator;

public class HoneyDecorator extends IceCreamDecorator {
	
	public HoneyDecorator(IceCream iceCream) {
		super(iceCream);
		// TODO Auto-generated constructor stub
	}
	
	public String addHoney(){
		return " added honey";
	}
	
	@Override
	public String makeIceCream() {
		return getIceCream().makeIceCream() + addHoney();
	}

}
