package codemonk.stackqueue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class MonkandPrisonerofAzkaban {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader(new File("file1.txt")));
		int N = Integer.parseInt(br.readLine());
		long x[] = new long[N];
		long y[] = new long[N];
		long[] givenArr = new long[N];
		String[] arr = br.readLine().split(" ");

		for (int i = 0; i < arr.length; i++) {
			givenArr[i] = Long.parseLong(arr[i]);
		}

		x = getVal(givenArr, N, true);
		y = getVal(givenArr, N, false);

		for (int i = 0; i < N; i++) {
			System.out.print(x[i] + y[i] + " ");
		}
	}

	private static long[] getVal(long[] arr, int N, boolean flag){
		long x[] = new long[N];
			for(int i = 0;i < arr.length;i++){	
				if(flag)
					x[i] = iterateX(arr,i);
				else
					x[i] = iterateY(arr,i);
		
			}
		
		return x;
	}

	private static long iterateX(long[] arr, int i) {
		for (int j = i - 1; j >= 0; j--) {
			if (arr[j] > arr[i]) return j + 1;
		}
		return -1;
	}

	private static long iterateY(long[] arr, int i) {
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] > arr[i]) return j+1;
		}
		return -1;
	}

}
