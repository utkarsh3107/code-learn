/**
 * Watson gives to Sherlock a bag of numbers [1, 2, 3 ... N] and then he removes K numbers A1, A2 ... AK from the bag. He now asks Sherlock to find the P'th smallest number in the bag.

Input
First line contains T, the number of test cases. Each test case consists of N, K and P followed by K integers in next line denoting the array A.

Output
For each test case, print P'th smallest number in the bag. If no such number exists output -1.

Constraints
1 ≤ T ≤ 10
20% testdata: 1 ≤ N ≤ 103
20% testdata: 1 ≤ N ≤ 105
60% testdata: 1 ≤ N ≤ 109
0 ≤ K ≤ min(N, 105)
1 ≤ P ≤ N

Note: Large input files. Use scanf instead of cin.

SAMPLE INPUT 
2
4 1 2
1
5 2 4
1 3
SAMPLE OUTPUT 
3
-1
Explanation
Test case 1: Remaining numbers are [2, 3, 4]. 3 is the 2nd smallest remaining numbers.

Test case 2: Remaining numbers are [2, 4, 5]. 4th smallest remaining number doesn't exist.
 */
package hacker_earth.practice.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author cHeRRy
 *
 */
public class SherlockandNumbers {

	/**
	 * @param args
	 */
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

			 System.out.println(calculateSherlockNumbers(N, K, P, Ki) + "\n");
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
			count = P;
		} else {
			int floor = binarySearchFloor(Ki, P, 0, Ki.length - 1);
			count = Ki[floor] == P ? P - floor : P - (binarySearchFloor(Ki, P, 0, Ki.length - 1) + 1);
		}
		//System.out.println("count--->"+count + " : P------>"+P);
		int j;

		for (j = P+1; j <= N; j++) {
			if (binarySearch(Ki, j, 0, Ki.length - 1) == -1) {
				count++;
				if (count >= P)
					break;
			}
	
		}
		return j;
	}

}
