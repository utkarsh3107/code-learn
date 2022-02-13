package selfstudy;

public class MaximumAbsoluteDifference {

	public static void main(String[] args) {
		int[] arr = { -1, 3, -2, 5, -4, 1 };
		System.out.println(maxArr(arr));
	}

	private static int maxArr(int[] A) {
		int n = A.length, max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE,
				max4 = Integer.MIN_VALUE, ans = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max1 = Math.max(max1, A[i] + i);
			max2 = Math.max(max2, -A[i] + i);
			max3 = Math.max(max3, A[i] - i);
			max4 = Math.max(max4, -A[i] - i);
		}
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, max1 - A[i] - i);
			ans = Math.max(ans, max2 + A[i] - i);
			ans = Math.max(ans, max3 - A[i] + i);
			ans = Math.max(ans, max4 + A[i] + i);
		}
		return ans;
	}
}
