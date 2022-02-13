package hacker_earth.practice.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TheOldMonk2 {

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

		for (int j = b.length - 1; j >= 0; j--) {
			for (int i = a.length - 1; i >= 0; i--) {
				if (b[j] < a[i])
					break;
				else if (j - i > val)
					val = j - i;
			}
		}

		return val;
	}

}
