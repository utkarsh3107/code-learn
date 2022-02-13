/**
 * 
 */
package structural.proxy;

/**
 * @author utkarsh
 *
 */
public class ProxyExecutor implements ExecuteCommand{

	private boolean isAdmin;
	private ExecuteCommand executor;
	public ProxyExecutor(String uname, String password){
		if(uname.equals("asd") && password.equals("asd")){
			isAdmin = true;
			executor = new ExecuteCommandImpl();
		}
		
	}
	
	@Override
	public void runCommand(String command) {
		if(isAdmin){
			executor.runCommand(command);
		}else{
			System.out.println("Admin can only run commands");
		}
		
	}
}
