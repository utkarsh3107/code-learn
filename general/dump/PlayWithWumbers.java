/**
 * You are given an array of n numbers and q queries. For each query you have to print the floor of the expected value(mean) of the subarray from l to r.

Input:
First line contains two integers N and Q denoting number of array elements and number of queries.

Next line contains N space seperated integers denoting array elements.

Next Q lines contain two integers L and R.


Output:
print a single integer denoting the answer.

Constraints :

1<= N ,Q <= 10^6

1<= Array elements <= 10^9

Problem setter : Sheldon Tauro

SAMPLE INPUT 
5 3
1 2 3 4 5
1 3
2 4
2 5

SAMPLE OUTPUT 
2 
3
3

 */
package general.dump;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author utkarsh
 *
 */
public class PlayWithWumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception { // BufferedReader
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("PlayWithWumbers1.txt"));
		String line = br.readLine();
		String[] arr = line.split(" ");

		int N = Integer.parseInt(arr[0]);
		int Q = Integer.parseInt(arr[1]);

		long time1 = System.nanoTime();
		long[] nArr = new long[N + 1];
		
		int i = 1;
		nArr[0] = 0;
		
		int[] array = Stream.of(br.readLine().split(" "))
                .mapToInt(token -> Integer.parseInt(token))
                .toArray();
		
		long time2 = System.nanoTime();
		
		System.out.println((time2 - time1)/1000000);

		time1 = System.nanoTime();
		while (Q-- > 0) {
			String[] qArr = br.readLine().split(" ");

			int l = Integer.parseInt(qArr[0]);
			int r = Integer.parseInt(qArr[1]);

			long sum = (nArr[r] - (nArr[l-1])) / (r - l + 1);

			//System.out.println(sum);
		}
		time2 = System.nanoTime();
		System.out.println((time2 - time1)/1000000);

	}
	
}
