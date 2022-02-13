/**
 * 
 */
package behavioural.mediator;

import java.util.ArrayList;

/**
 * @author utkarsh
 *
 */
public class ApplicationMediator implements Mediator{

	private ArrayList<Colleague> colleagues;
	
	public ApplicationMediator(){
		this.colleagues = new ArrayList<>();
	}
	
	public void addColleague(Colleague collegaue){
		this.colleagues.add(collegaue);
	}

	@Override
	public void send(String message, Colleague colleague) {
		for(Colleague each : colleagues){
			if(each != colleague){
				each.receive(message);
			}
		}
		
	}
	
	
}
