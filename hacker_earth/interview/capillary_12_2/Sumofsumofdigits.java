package hacker_earth.interview.capillary_12_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sumofsumofdigits {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NQ = br.readLine().split(" ");
		
		int N = Integer.parseInt(NQ[0]);
		int Q = Integer.parseInt(NQ[1]);
		
		String[] arr = br.readLine().split(" ");
		int[] finalArr = getIntArray(arr,N);
		
		Arrays.sort(finalArr);
		
		
		while(Q-- > 0){
			String[] IK = br.readLine().split(" ");
			int I = Integer.parseInt(IK[0]);
			int K = Integer.parseInt(IK[1]);
			
			if(I == 1){
				System.out.println(getMaxTally(finalArr, K));
			}else{
				System.out.println(getMinTally(finalArr, K));
			}
			
		}
	}
	
	
	public static int getMaxTally(int[] arr, int K){
		int sum = 0;
		int counter = arr.length-1;
		
		while(K-- > 0){
			sum += arr[counter--];
		}
		
		return sum;
	}
	
	public static int getMinTally(int[] arr, int K){
		int sum = 0;
		for(int i = 0;i<K; i++){
			sum += arr[i];
		}
		
		return sum;
	}
	
	public static int[] getIntArray(String[] arr,int N){
		int[] intArr = new int[N];
		
		for(int i = 0; i< N;i++){
			intArr[i] = getSum(Long.parseLong(arr[i]));
		}
		return intArr;
		
	}
	
	public static int getSum(long num) {
        int sum = 0;
        while (num > 0) {
            sum = (int) (sum + num % 10);
            num = num / 10;
        }
        
        if(sum == 10){
        	return 1;
        }
        
        if(sum > 10){
        	sum = getSum(sum);
        }
        
        return sum;
	}

}
