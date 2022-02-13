package interview.buytake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentArrangement implements Comparable<String>{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NMK = br.readLine().split(" ");
		int N = Integer.parseInt(NMK[0]);
		int M = Integer.parseInt(NMK[1]);
		int K = Integer.parseInt(NMK[2]);
		String[] A = br.readLine().split(" ");
		int[] row = new int[M];
		initizlizeArray(row,K);
		int counter = 0;
		for(int i = 0;i < N;i++){
			int val = Integer.parseInt(A[i]) - 1;
			if(!seatAvailable(row,val,M)){
				counter++;
			}
		}
		System.out.println(counter);
	}
	
	private static void initizlizeArray(int[] row, int K){
		for(int i = 0;i < row.length;i++){
			row[i] = K;
		}		
	}
	
	private static boolean seatAvailable(int[] row, int val,int M){
		if(val > row.length -1)
			return false;
		
		if(row[val] > 0){
			row[val] = --row[val];
			return true;
		}else{
			for(int i = val+1; i< M;i++){
				if(row[i] > 0){
					row[i] = --row[i];
					return false;
				}
			}
			
			for(int i = 0; i < val; i++){
				if(row[i] > 0){
					row[i] = --row[i];
					return false;
				}
			}
		}
		return false;
	}

	@Override
	public int compareTo(String arg0) {
		
		return 0;
	}

}
