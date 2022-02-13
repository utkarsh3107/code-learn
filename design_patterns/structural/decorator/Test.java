package structural.decorator;

public class Test {

	public static void main(String[] args) {
		IceCream cream = new HoneyDecorator(new NutsDecorator(new SimpleIceCream()));
		IceCream cream1 = new NutsDecorator(new NutsDecorator(new SimpleIceCream()));
		System.out.println(cream1.makeIceCream());

	}

}
