package structural.bridge;

public class Test {

	public static void main(String[] args) {
		Car c = new Car(new ProdudeWorkshop(), new AssembleWorkshop());
		c.manifecture();
		Bike b = new Bike(new ProdudeWorkshop(), new AssembleWorkshop());
		b.manifecture();

	}

}
