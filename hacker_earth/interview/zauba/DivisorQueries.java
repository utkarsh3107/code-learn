package hacker_earth.interview.zauba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisorQueries {

	private static int[] primeNumbers = {2,3,5,7};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		int N =  Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		String[] array = br.readLine().split(" ");
		int[] intArr = convertStringToInt(array, N);
		
		int[][] arr = getAllPrimeArray(intArr, N);
		while(M > 0){
			String[] queryString = br.readLine().split(" ");
			int l = Integer.parseInt(queryString[0]);
			int r = Integer.parseInt(queryString[1]);
			int total = getTotalMultiplication(arr,l,r);
			System.out.println(totalDivisors(total));
			M--;
		}
		
		
	}
	
	private static int[] convertStringToInt(String[] arr,int N){
		if(arr == null){
			return null;
		}
		
		int[] intArr = new int[N];
		
		for(int i = 0;i <N;i++){
			intArr[i] = Integer.parseInt(arr[i]);
		}
		
		return intArr;
	}
	
	private static int[][] getAllPrimeArray(int[] array,int N){
		int [][] primeTotal = new int [N][4];
		
		for(int i=0 ;i < N;i++){
			int eachElement = array[i];
			
			for (int j = 0; i > 0  && j < 4; j++)
				primeTotal[i][j] = primeTotal[i-1][j];
			
			int temp = 0;
			while (eachElement > 1)
			{
				int div = primeNumbers[temp];
				int count = 0;
				while (eachElement % div == 0)
				{
					eachElement /= div;
					count++;
				}
				primeTotal[i][temp] += count;
				temp++;
			}
		}
		
		return primeTotal;
	}
	
	private static int getTotalMultiplication(int[][] primesTotal, int l ,int r){
		int total = 1;
		for(int i =0; i <4;i++){
			int temp = primesTotal[r-1][i] - primesTotal[l-1][i];
			total *= Math.pow(primeNumbers[i], temp);
		}
		
		return total;
	}
	
	private static int totalDivisors(int num) {
		if(num == 2)
			return 2;
		
		int counter = 0;
		for (int i = 1; i <= Math.sqrt(num) + 1; i++) {
			if (num % i == 0) {
				if (num / i == i)
					counter++;
				else 
					counter += 2;
			}
		}
		return counter;
	}

}
