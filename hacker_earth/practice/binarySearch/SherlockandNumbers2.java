package practice.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SherlockandNumbers2 {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new FileReader(new File("file1.txt")));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 65536);

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String[] val = br.readLine().split(" ");
			int N = Integer.parseInt(val[0]);
			int K = Integer.parseInt(val[1]);
			int P = Integer.parseInt(val[2]);

			int[] Ki = new int[K];

			String[] k = br.readLine().split(" ");

			for (int j = 0; j < k.length; j++) {
				Ki[j] = Integer.parseInt(k[j]);
			}

			 bw.write(calculateSherlockNumbers(N, K, P, Ki)+"\n");
		}

		bw.close();
		br.close();
	}

	private static int binarySearchFloor(int[] A, int target, int m, int n) {
		if (m >= n)
			return n;

		if ((n - m) == 1 )
			return A[n] <= target ? n : m;

		int mid = (m + n) / 2;

		if (A[mid] == target)
			return mid;
		else if (A[mid] > target)
			return binarySearchFloor(A, target, m, mid - 1);
		else
			return binarySearchFloor(A, target, mid, n);
	}
	
	private static int binarySearch(int[] A, int target, int m, int n) {
		if (m > n)
			return -1;

		int mid = (m + n) / 2;

		if (A[mid] == target)
			return mid;

		if (A[mid] > target)
			return binarySearch(A, target, m, mid - 1);
		else
			return binarySearch(A, target, mid + 1, n);
	}

	private static int calculateSherlockNumbers(int N, int K, int P, int[] Ki) {
		if ((N - K) < P)
			return -1;

		int count;

		if (Ki[0] > P) {
			return P;
		} else {
			count = P - (binarySearchFloor(Ki, P, 0, Ki.length - 1) + 1);
		}
		int j;

		for (j = P+1; j <= N; j++) {
			if (binarySearch(Ki, j, 0, Ki.length - 1) == -1) {
				count++;
				if (count == P)
					break;
			}
			
		}
		return j;
	}

}
