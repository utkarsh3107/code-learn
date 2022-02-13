package interview.acolite;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class SimpleGame {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			
			String[] terms = br.readLine().split(" ");
			
			int monkTerms = Integer.valueOf(terms[0]);
			int monkNTerms = Integer.valueOf(terms[1]);

			
			String[] line1 = br.readLine().split(" ");
			String[] line2 = br.readLine().split(" ");
			
			int[] monksTerms = new int[monkTerms];
			int[] monksNTerms = new int[monkNTerms];
			
			
			for(int i=0;i< monkTerms;i++){
				monksTerms[i] = Integer.valueOf(line1[i]);
			}
			
			for(int i=0;i< monkNTerms;i++){
				monksNTerms[i] = Integer.valueOf(line2[i]);
			}
						
			Arrays.sort(monksTerms);
			Arrays.sort(monksNTerms);
			
			
		} catch (Exception e) {

		} 

	}

	private static int binarySearch(int[] arr, int m, int n, int target) {
		if (m == n)
			return m;

		if ((n - m) == 1)
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
