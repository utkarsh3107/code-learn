/**
 * Big Chandan is a dire lover of Biryani, especially Old Monk's Biryani. Today, he went over to have some of it. To his surprise, the waiter turns out be to be a coding geek and refuses to serves him unless Chandu solves his two- arrays problem, stated as:

Given two non-increasing array of integers A,B i.e A[i] >= A[i+1] and B[i] >= B[i+1] and for all i, 0 ≤ i < n-1.

The monkiness of two numbers is given by: M (A[i],B[j]) = j - i , if j >=i and B[j] >= A[i], or 0 otherwise. 


Find the monkiness of the two arrays, that is given by: M (A,B)= max (M(A[i],B[j])) for 0≤ i, j< n-1.

Input Format:
The first line contains an integer, tc, denoting the number of test cases. The next line contains an integer, n, denoting the size of the two arrays. The size of both the arrays will be equal. After that line, the next line contains n integers denoting the numbers in the array A, and in the next line, there will be n numbers denoting the numbers in the array B.

Output format:
Print the monkiness of the two arrays.

Constraints:
1 <= Test Cases <= 50
1 <= N <= 105
1 <= Ai, Bi <= 1012

SAMPLE INPUT 
2
9
7 7 3 3 3 2 2 2 1
8 8 7 7 5 5 4 3 2
6
6 5 4 4 4 4
2 2 2 2 2 2
SAMPLE OUTPUT 
5
0
Explanation
In the first case, we can see that 3 in the second array is the number which is equal to the 3 in the first array, and the difference between their positions is 5. So, the answer is 5.
 */

package practice.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TheOldMonk {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("file3.txt")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 65536);

		int testCases = Integer.parseInt(br.readLine());

		for (int q = 0; q < testCases; q++) {
			int N = Integer.parseInt(br.readLine());
			String[] arr1 = br.readLine().split(" ");
			String[] arr2 = br.readLine().split(" ");
			long[] a = new long[N];
			long[] b = new long[N];

			for (int i = 0; i < N; i++) {
				a[i] = Long.parseLong(arr1[i]);
				b[i] = Long.parseLong(arr2[i]);
			}

			bw.write(computeSolution(a, b) + "\n");

		}

		bw.close();
		br.close();
	}

	private static int computeSolution(long[] a, long[] b) {
		int val = 0;

		if (b[b.length - 1] > a[0])
			return val;

		for (int i = b.length - 1; i >= 0; i--) {
			int flag = binarySearch(a, 0, a.length - 1, b[i]);
			if (flag != -1) {
				int temp = i - flag;
				if (temp > val)
					val = temp;
			}

			if (val > i)
				break;
		}

		return val;
	}

	private static int binarySearch(long[] arr, int m, int n, long target) {
		if (m >= n)
			return computeValues(m, n, arr, target);

		int mid = (m + n) / 2;

		if (arr[mid] > target)
			return binarySearch(arr, mid + 1, n, target);
		else
			return binarySearch(arr, m, mid, target);
	}

	private static int computeValues(int index1, int index2, long[] arr, long target) {
		if (index1 == index2) {
			return  index1;
		} else {
			if (arr[index2] >= target)
				return index2;
			else 
				return index1;

		}
	}

}
