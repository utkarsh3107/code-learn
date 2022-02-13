package structural.composite;

public class Test {

	public static void main(String[] args) {
		Member sunny = new Parent("sunny", "pinky", "kanwal");
		Member bunny = new Parent("bunny", "pinky", "kanwal");
		Member kanwal = new Parent("kanwal", "dulari", "girdhari");
		Member vivan = new Parent("vivan","aanchal","sunny");
		sunny.addMember(vivan);
		kanwal.addMember(sunny);
		kanwal.addMember(bunny);
		//System.out.println(sunny.getParents());
		kanwal.printChildren();
	}
}
