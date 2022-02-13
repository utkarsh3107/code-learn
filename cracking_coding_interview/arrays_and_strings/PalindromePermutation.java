/**
 * 
 */
package arrays_and_strings;

/**
 * @author utkarsh
 *
 */
public class PalindromePermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String x = "tact coa";

		System.out.println(isPermutation(x));

	}
	
	private static boolean isPermutation(String x){
		int[][] val = new int[24][2];

		for (char ch : x.toCharArray()) {
			if (ch >= 97 && ch < 123) {
				int value = ch - 97;
				val[value][1] = ++val[value][1];
			}

		}

		int flag1 = 0;

		for (int i = 0; i < val[i][1]; i++) {
			
			if(val[i][1] % 2 == 0){
				continue;
			}else{
				flag1++;
			}
			
			if(flag1 > 1)
				return false;
		}
		
		
		
		return true;
	}

}
