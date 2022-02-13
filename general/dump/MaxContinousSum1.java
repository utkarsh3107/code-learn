/**
 * 
 */
package selfstudy;

/**
 * @author utkarsh
 *
 */
public class MaxContinousSum1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		 //int[] arr = {-2, -3, -4, -1, -2, -1, -5, -3};
		//int[] arr = { 2, 2, 3, 9, -5, 7, 8, 1 };
		 int[] arr = {-10, -5, -4, -3, -1, -2, -5};

		int max_sum = maxSubArraySum(arr, 7);
		System.out.println(max_sum);

	}

	private static int maxSubArraySum(int a[], int size) {
		int max_so_far = a[0];
		int curr_max = a[0];

		for (int i = 1; i < size; i++) {
			curr_max = Math.max(a[i], curr_max + a[i]);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		return max_so_far;
	}
}
