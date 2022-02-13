/**
 * 
 */
package structural.flyweight;

/**
 * @author utkarsh
 *
 */
public class Radiant implements Player {

	private String MISSION = "Destroy Dire Tree";
	private String hero;
	
	@Override
	public String mission() {
		return MISSION + " -- Your Hero is " + hero; 
		
	}

	/* (non-Javadoc)
	 * @see designpatterns.structural.flyweight.Player#assignHero(java.lang.String)
	 */
	@Override
	public void assignHero(String hearoName) {
		// TODO Auto-generated method stub
		this.hero = hearoName;
	}

}
