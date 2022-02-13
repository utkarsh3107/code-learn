/**
 * 
 */
package design_patterns.behavioural.mediator;

/**
 * @author utkarsh
 *
 */
public class MobileColleague extends Colleague {

	public MobileColleague(Mediator mediator) {
		super(mediator);
	}

	/* (non-Javadoc)
	 * @see designpatterns.behavioural.mediator.Colleague#receive(java.lang.String)
	 */
	@Override
	public void receive(String message) {
		System.out.println("Mobile Colleague Received " + message);

	}

}
