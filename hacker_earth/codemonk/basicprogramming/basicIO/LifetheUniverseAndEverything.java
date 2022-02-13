package hacker_earth.codemonk.basicprogramming.basicIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LifetheUniverseAndEverything {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String line = br.readLine();
			if (line.equals("42"))
				break;

			System.out.println(line);
		}

	}
}
