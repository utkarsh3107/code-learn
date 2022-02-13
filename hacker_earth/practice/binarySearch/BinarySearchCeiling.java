package hacker_earth.practice.binarySearch;

public class BinarySearchCeiling {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 5, 5, 11, 13 ,13, 15 ,15, 19 };
		System.out.println(binarySearch(arr,0,arr.length-1,5));
	}

	private static int binarySearch(int[] arr, int m, int n, int target) {
		if (m == n)
			return m;

		if ((n - m) == 1 )
			return arr[m] == target ? m : n;
		
		int mid = (m + n) / 2;

		if (arr[mid] == target)
			return mid;

		if (arr[mid] > target)
			return binarySearch(arr, m, mid, target);
		else
			return binarySearch(arr, mid, n, target);
	}
}
