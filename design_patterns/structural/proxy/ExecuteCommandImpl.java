package structural.proxy;

public class ExecuteCommandImpl implements ExecuteCommand {

	@Override
	public void runCommand(String command) {
		System.out.println(command);
	}

}
