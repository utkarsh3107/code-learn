/**
 * 
 */
package structural.flyweight;

import java.util.Random;

/**
 * @author utkarsh
 *
 */
public class Dota2 {
	private static String[] playerType = { "Radiant", "Dire" };
	private static String[] heroType = { "Strength", "Magic", "Agility" };

	public static void main(String args[]) {
		for (int i = 0; i < 10; i++) {
			Player p = PlayerFactory.getPlayer(getRandPlayerType());

			p.assignHero(getRandomHero());

			// Send this player on a mission
			System.out.println(p.mission());
			
		}
	}

	// Utility methods to get a random player type and
	// weapon
	public static String getRandPlayerType() {
		Random r = new Random();

		// Will return an integer between [0,2)
		int randInt = r.nextInt(playerType.length);

		// return the player stored at index 'randInt'
		return playerType[randInt];
	}

	public static String getRandomHero() {
		Random r = new Random();

		// Will return an integer between [0,3)
		int randInt = r.nextInt(heroType.length);

		// Return the weapon stored at index 'randInt'
		return heroType[randInt];
	}
}
