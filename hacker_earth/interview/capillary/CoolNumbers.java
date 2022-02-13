package hacker_earth.interview.capillary;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CoolNumbers {

	private static List<Integer> numbers;
	
	static{
		long startTime = System.nanoTime();
		numbers = new ArrayList<>();
		for(int i = 1;i <=100000000;){
			int firstDigit = getFirstDigit(i);
			
			if(firstDigit == 2 || firstDigit == 5){
				if(iterate(i)){
					numbers.add(i);
					//nums[i] = i;
				}
				i++;
			}else{
				i = i + incrementor(i);
			}
		}
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
	}
	
	private static int incrementor(int num){
		int temp = num;
		int val = 1;
		while(temp > 0){
			temp = temp/10;
			val = val * 10;
		}
		return val/10;
	}
	
	private static int getFirstDigit(int num){
		int i = Math.abs(num);
		while(i >= 10)
		    i /= 10;
		
		return i;
	}
	
	
	
	private static boolean iterate(int num){
		int temp = num;
		int val;
		while(temp > 0){
			val = temp %10;
			if(val != 5 && val != 2){
				return false;
			}
			temp = temp/10;
		}
		
		return true;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}

}
