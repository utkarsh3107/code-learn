/**
 * 
 */
package selfstudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Dhananjay has recently learned about ASCII values.He is very fond of
 * experimenting. With his knowledge of ASCII values and character he has
 * developed a special word and named it Dhananjay's Magical word.
 * 
 * A word which consist of alphabets whose ASCII values is a prime number is an
 * Dhananjay's Magical word. An alphabet is Dhananjay's Magical alphabet if its
 * ASCII value is prime.
 * 
 * Dhananjay's nature is to boast about the things he know or have learnt about.
 * So just to defame his friends he gives few string to his friends and ask them
 * to convert it to Dhananjay's Magical word. None of his friends would like to
 * get insulted. Help them to convert the given strings to Dhananjay's Magical
 * Word.
 * 
 * Rules for converting:
 * 
 * 1.Each character should be replaced by the nearest Dhananjay's Magical
 * alphabet.
 * 
 * 2.If the character is equidistant with 2 Magical alphabets. The one with
 * lower ASCII value will be considered as its replacement.
 * 
 * Input format:
 * 
 * First line of input contains an integer T number of test cases. Each test
 * case contains an integer N (denoting the length of the string) and a string
 * S.
 * 
 * Output Format:
 * 
 * For each test case, print Dhananjay's Magical Word in a new line.
 * 
 * Constraints:
 * 
 * 1 <= T <= 100
 * 
 * 1 <= |S| <= 500 SAMPLE INPUT
 * 
 * 1 6 AFREEN
 * 
 * SAMPLE OUTPUT
 * 
 * CGSCCO
 * 
 * Explanation
 * 
 * ASCII values of alphabets in AFREEN are 65, 70, 82, 69 ,69 and 78
 * respectively which are converted to CGSCCO with ASCII values 67, 71, 83, 67,
 * 67, 79 respectively. All such ASCII values are prime numbers.
 * 
 * @author utkarsh
 *
 */
public class MagicalWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = getMap();

		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			int x = Integer.parseInt(br.readLine());
			char[] ch = br.readLine().toCharArray();
			char[] fch = new char[x];

			for (int i = 0; i < ch.length; i++) {
				fch[i] = (char) map.get((int)ch[i]).intValue() ;
			}
			
			System.out.println(new String(fch));

		}

	}

	private static Map<Integer, Integer> getMap() {
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i <= 127; i++) {
			
			if (i >= 65 && isPrime(i)) {
				map.put(i, i);
				continue;
			}

			int nPrime = 0, lPrime = 0;
			int tI = i;;
			
			if(tI < 65 )
				tI = 65;
			for (int j = tI; j <= 122; j++) {
				if (isPrime(j)) {
					nPrime = j;
					break;
				}
			}

			for (int j = tI; j >= 65; j--) {
				if (isPrime(j)) {
					lPrime = j;
					break;
				}
			}

			if (nPrime == 0) {
				map.put(i, lPrime);
				continue;
			} else if (lPrime == 0) {
				map.put(i, nPrime);
				continue;
			}

			int L = nPrime - i;
			int R = i - lPrime;

			// (L > R) ? map.put(i, lPrime) : map.put(i,nPrime);

			if (L >= R) {
				map.put(i, lPrime);
			} else {
				map.put(i, nPrime);
			}

		}
		return map;
	}

	public static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

}
