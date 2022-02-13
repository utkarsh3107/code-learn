package hacker_earth.interview.cleartrip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InAnArray2 {


	public static void main(String[] args) throws IOException{
		/*long startTime = System.currentTimeMillis();*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NKXY = br.readLine().split(" ");
		
		int N = Integer.parseInt(NKXY[0]);
		int K = Integer.parseInt(NKXY[1]);
		int X = Integer.parseInt(NKXY[2]);
		int Y = Integer.parseInt(NKXY[3]);
		
		String[] arr = br.readLine().split(" ");
		
		int[] intArr = getIntArray(arr,N);
		int counter = 0;
		for(int i = 0;i < N; i++){
			for(int j = i+1 ;j < N; j++){
				int num1 = intArr[i];
				int num2 = intArr[j];
				
				if(checkMultiply(num1,num2,K,Y)){
					if(checkAddition(num1,num2,K,X)){
						counter++;
					}
				}
			}
		}
		
		System.out.println(counter);
		/*long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);*/
	}
	
	public static int[] getIntArray(String[] arr,int N){
		int[] intArr = new int[N];
		
		for(int i = 0; i< N;i++){
			intArr[i] = Integer.parseInt(arr[i]);
		}
		
		return intArr;
	}
	
	public static boolean checkMultiply(int i, int j, int K, int Y){
		long val = i * j;
		if((val % K) == Y){
			return true;
		}
		return false;
	}
	
	public static boolean checkAddition(int i, int j, int K, int X){
		long val = i + j;
		if((val % K) == X){
			return true;
		}
		return false;
	}
	

}
