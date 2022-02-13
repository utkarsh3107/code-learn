package design_patterns.structural.bridge;

public class AssembleWorkshop implements Workshop {

	@Override
	public void work() {
		System.out.println("Assemble Workshop");
	}

}
