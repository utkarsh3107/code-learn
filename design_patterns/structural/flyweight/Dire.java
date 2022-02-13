/**
 * 
 */
package structural.flyweight;

/**
 * @author utkarsh
 *
 */
public class Dire implements Player{

	private String MISSION = "Destroy Radiant Tree";
	private String hero;
	
	@Override
	public String mission() {
		// TODO Auto-generated method stub
		return MISSION + " -- Your Hero is " + hero; 
	}

	@Override
	public void assignHero(String hearoName) {
		// TODO Auto-generated method stub
		this.hero = hearoName;
	}

}
