package hacker_earth.interview.rangde;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MillyAndRanks2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			String[] R = br.readLine().split(" ");
			int[] r = new int[N];
			int[] temp = new int[N *2];
			for (int i = 0; i < N; i++) {
				r[i] = Integer.parseInt(R[i]);
				temp[i] = -1;
			}
			for(int i = N;i <N*2;i++){
				temp[i] = -1;
			}
			
			Arrays.sort(r);
			
			for (int i = 0; i < N; i++) {
				int val = r[i];
				
				if(temp[val] == -1){
					temp[val] = 0;
				}else{
					int count = 0;
					for(int j = val; j < N*2;j++){
						if(temp[j] == -1){
							temp[j] = count;
							break;
						}else{
							count++;
							
						}
					}
				}
			}
			
			int sum = 0;
			for(int i = 0; i< temp.length;i++){
				if(temp[i] > 0)
					sum = sum + temp[i];
			}
			
			System.out.println(sum);
		}
	}

}
