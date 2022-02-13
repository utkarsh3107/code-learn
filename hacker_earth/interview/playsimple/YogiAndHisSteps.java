package hacker_earth.interview.playsimple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class YogiAndHisSteps {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] arr = br.readLine().split(" ");
		int[] newArray = new int[N]; 
		Integer[] ascArray = new Integer[N];
		Integer[] descArray = new Integer[N];
		
		for (int i = 0; i < N; i++) {
			int val = Integer.parseInt(arr[i]);
			newArray[i] = val;
			ascArray[i] = val;
			descArray[i] = val;
		}
		Arrays.sort(ascArray);
		Arrays.sort(descArray, Collections.reverseOrder());
		int flag = 0;
		for (int i = 0; i < N; i++) {
			if(newArray[i] != ascArray[i])
				flag++;
		}
		int flag1 = 0;
		for (int i = 0; i < N; i++) {
			if(newArray[i] != descArray[i])
				flag1++;
		}
		
		System.out.println(getFlagValues(flag,flag1));
		
	}
	
	private static int getFlagValues(int flag,int flag1){
		if(flag1 == 0|| flag == 0){
			return 0;
		}
		
		if(flag1 > flag){
			if(flag % 2 == 0)
				return flag/2;
			else
				return flag/2+ 1;
		}
		else{
			if(flag % 2 == 0)
				return flag1/2;
			else
				return flag1/2+ 1;
	
		}
	}
	

}
