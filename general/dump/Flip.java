/**
 * 
 */
package selfstudy;

import java.util.ArrayList;

import java.util.ArrayList;

/**
 * @author utkarsh
 *
 */
public class Flip {
	public ArrayList<Integer> flip(String A) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (A.length() == 0)
			return result;

		int[] m = new int[A.length()];

		char[] chars = A.toCharArray();
		int numOnes = 0;
		for (int i = 0; i < chars.length; i++) {
			m[i] = chars[i] == '0' ? 1 : -1;
			numOnes += m[i];
		}

		if (numOnes == -m.length)
			return result;

		// Now, Kadane's.
		int leftLimitForThisBestSum = 0;
		int rightLimitForThisBestSum = 0;
		int thisBestSum = m[0];
		int prevBestSum = m[0];

		int leftLimitOfBestSum = 0;
		int rightLimitOfBestSum = 0;
		int bestSum = m[0];

		for (int i = 1; i < m.length; i++) {
			int prevPlusThisNum = m[i] + prevBestSum;
			if (m[i] > prevPlusThisNum) {
				leftLimitForThisBestSum = i;
				rightLimitForThisBestSum = i;
				thisBestSum = m[i];
			} else {
				rightLimitForThisBestSum = i;
				thisBestSum = prevPlusThisNum;
			}

			if (thisBestSum > bestSum) {
				bestSum = thisBestSum;
				leftLimitOfBestSum = leftLimitForThisBestSum;
				rightLimitOfBestSum = rightLimitForThisBestSum;
			}
			prevBestSum = thisBestSum;
		}

		result.add(leftLimitOfBestSum + 1);
		result.add(rightLimitOfBestSum + 1);
		return result;
	}

	public static void main(String[] args) {
		/*String s = "100010011111111111111110000000000000000000000000000000001";*/
		String s = "100010001";
		System.out.println(new Flip().flip(s));
	}

}