package hacker_earth.interview.rangde;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MillyAndRanks {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0){
			int N = Integer.parseInt(br.readLine());
			String[] R = br.readLine().split(" ");
			int[] r = new int[N];
			for(int i = 0;i < N;i++){
				r[i] = Integer.parseInt(R[i]);
			}
			
			Arrays.sort(r);
			int counter = 0;
			for(int i = 0;i< N;i++){
				int sum = ((i+1) - r[i]);
				if(sum < 0)
					sum *= -1;
				counter += sum;
			}
			
			if(counter < 0)
				counter = counter * -1;
			System.out.println(counter);
		}
	}

}
