/**
 * Our monk, while taking a stroll in the park, stumped upon a polynomial ( A X2 + B X +C ) lying on the ground. The polynomial was dying! Being considerate, our monk tried to talk and revive the polynomial. The polynomial said: 
I have served my purpose, and shall not live anymore. Please fulfill my dying wish. Find me the least non-negative integer Xo, that shall make my value atleast K i.e., A Xo2 + B Xo + C >= K . 
Help our Monk fulfill the polynomial's dying wish!


Input: 
The first line contains an integer T. T test cases follow. 
Each test case consists of four space-separated integers A, B, C and K. 

Output:
For each test case, output the answer in a new line.

Constraints:
1 ≤ T ≤ 105
1 ≤ A,B,C ≤ 105
1 ≤ K ≤ 1010

SAMPLE INPUT 
3
3 4 5 6
3 4 5 5
3 4 5 150

SAMPLE OUTPUT 
1
0
7

 */
package practice.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class MonksEncounterWithPolynomial {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 65536);

		int testCases = Integer.parseInt(br.readLine());

		for (int q = 0; q < testCases; q++) {
			String[] line = br.readLine().split(" ");
			long A = Long.parseLong(line[0]);
			long B = Long.parseLong(line[1]);
			long C = Long.parseLong(line[2]);
			long K = Long.parseLong(line[3]);

			long x = K - C;
			BigInteger target = new BigInteger(String.valueOf(x));
			if(x > 0)
				bw.write(binarySearch(A, B,target, 0, x)+"\n");
			else
				bw.write(0+"\n");
		}
		bw.close();
		br.close();
	}

	private static long binarySearch(long A, long B, BigInteger target, long m, long n) {
		if (m >= n)
			return n;

		long mid = (m + n) / 2;
		BigInteger val = computePolynomial(A, B, mid);
		
		if(val.compareTo(target) == 0)	
			return mid;
		else if (val.compareTo(target) == 1)
			return binarySearch(A, B, target, m, mid);
		else
			return binarySearch(A, B, target, mid+1, n);

	}

	private static BigInteger computePolynomial(long a, long b, long x) {
		BigInteger A = new BigInteger(String.valueOf(a));
		BigInteger B = new BigInteger(String.valueOf(b));
		BigInteger X = new BigInteger(String.valueOf(x));
		BigInteger init = A.multiply(X).multiply(X);
		BigInteger init2 = B.multiply(X);
		return  init.add(init2);
	}

}
