/**
 * 
 */
package structural.flyweight;

import java.util.HashMap;

/**
 * @author utkarsh
 *
 */
public class PlayerFactory {

	private static HashMap<String, Player> hm = new HashMap<String, Player>();

	public static Player getPlayer(String type) {
		Player p = null;
		
		if(hm.containsKey(type)){
			p = hm.get(type);
		}else{
			if (!hm.containsKey(type)) {
				switch (type) {
				case "Radiant":
					System.out.println("Radiant member created");
					p = new Radiant();
					hm.put(type, p);
					return p;
				case "Dire":
					System.out.println("Dire member created");
					p = new Radiant();
					hm.put(type, p);
					return p;
				default : System.out.println("Oops some issue"); return p;
				}
			}
		
		}
			
		return p;
	}

}
