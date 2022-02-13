/**
 * Foo was not amongst the most brilliant students of his class. So, he has some pending exams to clear. As the exams are approaching, this time he vowed to pass in all of them. This will only happen if he is not under stress. Foo's stress can be calculated using a simple function called Foo_function which depends upon the time for which Foo studies continuously .

Foo_funtion is defined as follows:

F(t)=A(t^3)+B(t^2)+C*(t)+D, F(t)<=10^18

where A,B,C,D belong to the set of prime numbers. t is the time in minutes for which foo studies continuously.

As foo is not very good at solving cubic equations, he seeks your help to find out the maximum number of minutes for which he can study continuously without taking stress. Help him find t such that F(t+1) > K, and F(t) <= K, where K is the maximum stress Foo can bear.

Input:

The first line of the input contains a single integer T denoting the number of test cases. each test case consists of a single line containing 5 space seperated positive numbers a, b, c, d, K.

Output:

for each test case, output a single integer t denoting the maximum time for which foo can study continuously without taking stress.

Constraints:

1 <= T <= 10^4 
A, B, C, D belong to a set of prime numbers such that F(t) would never exceed 10^18
t >= 0 
1 <= K <= 10^18

SAMPLE INPUT 
2
2 2 2 2 10
2 3 5 7 1000
SAMPLE OUTPUT 
1
7
Explanation
In the 1st test case for t = 2 foo will be under stress because F(2)=30 > K, therefore he can study for a maximum time of 1 minute without having stress.

In the 2nd test case for t = 8 foo will be under stess because F(8)=1263 > K, therefore he can study for a maximum time of 7 minutes continuously without having stress.
 */

package practice.binarySearch;

import static java.lang.Math.pow;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FooExams {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCases = Integer.parseInt(br.readLine());

		for (int q = 0; q < testCases; q++) {
			String[] input = br.readLine().split(" ");
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			int C = Integer.parseInt(input[2]);
			int D = Integer.parseInt(input[3]);
			long K = Long.parseLong(input[4]);
			
			K = K - D;
			
			long count = 0;
			if (K >= 0) {
				count = binarySearch(A, B, C, K, 0L, 1000000000000000000L);
			}
			System.out.println(count);
			/*
			 * int count = 0; long d = (long) cbrt(K); if (K > 0) { outer: while
			 * (true) { long k = calculateFunction(A, B, C, ++d); if (k > K) {
			 * while (true) { count++; long k1 = calculateFunction(A, B, C, d);
			 * if (k1 <= K) break outer; d--; } } } } else { d = 0; }
			 * System.out.println(count);
			 */
		}
		br.close();

	}

	private static long binarySearch(int A, int B, int C, long k, long m, long n) {
		if (m > n)
			return n;

		long mid = (m + n) / 2;
		long t = 0L;
		
		if(pow(mid,3) <= k)
			t = calculateFunction(A, B, C, mid);
		else
			return binarySearch(A, B, C, k, m, mid - 1);
		
		if (t > k)
			return binarySearch(A, B, C, k, m, mid - 1);
		else
			return binarySearch(A, B, C, k, mid + 1, n);
	}

	private static long calculateFunction(int A, int B, int C, long counter) {
		return (long) ((double) A * pow(counter, 3)) + (long) ((double) B * pow(counter, 2)) + (C * counter);
	}
}