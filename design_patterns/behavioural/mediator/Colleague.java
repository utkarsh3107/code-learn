package behavioural.mediator;

public abstract class Colleague {

	private Mediator mediator;
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}

	
	public Mediator getMediator() {
		return mediator;
	}
	
	public abstract void receive(String message);

	public void send(String message){
		mediator.send(message, this);
	}
	
	
}
