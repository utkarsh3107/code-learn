package behavioural.mediator;

public class ConcereteColleague extends Colleague {

	
	public ConcereteColleague(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void receive(String message) {
		System.out.println("Colleague Received " + message);

	}

}
