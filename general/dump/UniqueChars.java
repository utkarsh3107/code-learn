/**
 * 
 */
package selfstudy;

/**
 * @author utkarsh
 *
 */
public class UniqueChars {

	public static void main(String[] args) {
		System.out.println(uniqueChars("asdefd"));
	}

	public static boolean isUniqueChars(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); ++i) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}
		return true;
	}

	public static boolean uniqueChars(String str) {
		boolean[] flag = new boolean[256];

		for (char ch : str.toCharArray()) {
			if (flag[ch] == true) {
				return false;
			}
			flag[ch] = true;
		}
		
		return true;
	}
}
