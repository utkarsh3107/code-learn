/**
 * 
 */
package design_patterns.behavioural.mediator;

/**
 * @author utkarsh
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationMediator mediator = new ApplicationMediator();

		ConcereteColleague desktop = new ConcereteColleague(mediator);

		MobileColleague mobile = new MobileColleague(mediator);

		mediator.addColleague(desktop);

		mediator.addColleague(mobile);

		desktop.send("Hello World");

		mobile.send("Hello");

	}

}
