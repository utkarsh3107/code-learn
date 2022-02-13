package structural.proxy;

public class Test {

	public static void main(String[] args) {
		ProxyExecutor execute = new ProxyExecutor("asd", "asd");
		execute.runCommand("Hello");
		ProxyExecutor execute1 = new ProxyExecutor("asd1", "asd1");
		execute1.runCommand("Hello");
	}

}
