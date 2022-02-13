package practice.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class DiscoverTheMonk {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 65536);
		
		String[] cases = br.readLine().split(" ");
		Set<Integer> set = new HashSet<Integer>();
		int N = Integer.parseInt(cases[0]);
		int Q = Integer.parseInt(cases[1]);

		String[] arr = br.readLine().split(" ");

		for (int i = 0; i < N; i++) {
			set.add(Integer.parseInt(arr[i]));
		}

		for (int i = 0; i < Q; i++) {
			int X = Integer.parseInt(br.readLine());
			
			if(set.contains(X))
				bw.write("YES\n");
			else
				bw.write("NO\n");
		}

		bw.close();
		br.close();
	}

}
