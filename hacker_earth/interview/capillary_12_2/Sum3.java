package hacker_earth.interview.capillary_12_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sum3 {


	public static int[] maxArray;
	public static int[] minArray;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NQ = br.readLine().split(" ");
		
		int N = Integer.parseInt(NQ[0]);
		int Q = Integer.parseInt(NQ[1]);
		
		String[] arr = br.readLine().split(" ");
		int[] finalArr = getIntArray(arr,N);
		
		Arrays.sort(finalArr);
		
		getSumMinArray(finalArr,N);
		getSumMaxArray(finalArr,N);
		
		while(Q-- > 0){
			String[] IK = br.readLine().split(" ");
			int I = Integer.parseInt(IK[0]);
			int K = Integer.parseInt(IK[1]);
			
			if(I == 1){
				System.out.println(maxArray[K-1]);
			}else{
				System.out.println(minArray[K-1]);
			}
			
		}
	}
	
	public static int[] getIntArray(String[] arr, int N){
		int[] intArr = new int[N];
		
		for(int i = 0; i< N;i++){
			intArr[i] = getSum(Long.parseLong(arr[i]));
		}
		
		return intArr;
	}
	

	public static void getSumMinArray(int[] arr,int N){
		int[] intArr = new int[N];
		intArr[0] = arr[0];
		
		for(int i = 1; i< N;i++){
			int currentSum = arr[i];
			intArr[i] = currentSum + intArr[i-1];
		}

		minArray = intArr;
	}
	
	public static void getSumMaxArray(int[] arr,int N){
		int[] intArr = new int[N];
		intArr[0] = arr[arr.length - 1];
		for(int i = arr.length - 2,counter = 1; i >= 0;i--,counter++){
			int currentSum = arr[i];
			intArr[counter] = currentSum + intArr[counter-1];
		}

		maxArray = intArr;
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
