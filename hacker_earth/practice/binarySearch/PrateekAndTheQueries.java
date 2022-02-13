package hacker_earth.practice.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class PrateekAndTheQueries {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 65536);

		int N = Integer.parseInt(br.readLine());
		String[] ai = br.readLine().split(" ");

		int[] pArray = new int[N];

		for (int i = 0; i < ai.length; i++) {
			int val = Integer.parseInt(ai[i]);
			pArray[i] = val;
		}

		Arrays.sort(pArray);

		int cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < cases; i++) {
			String[] pi = br.readLine().split(" ");
			int L = Integer.parseInt(pi[0]);
			int R = Integer.parseInt(pi[1]);

			bw.write(calculateQueries(pArray, L, R) + "\n");
		}

		bw.close();
		br.close();

	}

	private static int calculateQueries(int[] pArray, int L, int R) {
		if (L > pArray[pArray.length - 1])
			return 0;

		if (R > pArray[pArray.length - 1])
			R = pArray[pArray.length - 1];

		int Lval = binarySearchFloorRepeatinNumbers(pArray, L, 0, pArray.length - 1);
		int Rval = binarySearchCeilingRepeatinNumbers(pArray, 0, pArray.length - 1, R);

		return Rval - Lval + 1;
	}

	private static int binarySearchFloorRepeatinNumbers(int[] A, int target, int m, int n) {
		if (m >= n)
			return n;

		if ((n - m) == 1)
			return A[m] == target ? m : n;

		int mid = (m + n) / 2;

		if (A[mid] == target)
			return binarySearchFloorRepeatinNumbers(A, target, m, mid);
		else if (A[mid] > target)
			return binarySearchFloorRepeatinNumbers(A, target, m, mid);
		else
			return binarySearchFloorRepeatinNumbers(A, target, mid, n);
	}

	private static int binarySearchCeilingRepeatinNumbers(int[] arr, int m, int n, int target) {
		if (m == n)
			return m;

		if ((n - m) == 1)
			return arr[n] == target ? n : m;

		int mid = (m + n) / 2;

		// if (arr[mid] == target)
		// return binarySearchCeilingRepeatinNumbers(arr, m, mid, target);
		// else
		if (arr[mid] > target)
			return binarySearchCeilingRepeatinNumbers(arr, m, mid, target);
		else
			return binarySearchCeilingRepeatinNumbers(arr, mid, n, target);
	}

}
