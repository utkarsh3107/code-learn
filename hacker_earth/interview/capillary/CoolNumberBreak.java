package hacker_earth.interview.capillary;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CoolNumberBreak {

	private static List<Integer> numbers;

	static{
		numbers = new ArrayList<>();	
	
		for (int i = 1; i < 100000000;) {
			int t = passNumber(i);
			i = i + t;
		}		
	}
	
	private static int passNumber(int num){
		int temp = num;
		
		while(temp > 0){
			if(removeZeros(temp))
				return 1;
			int firstNumber = getFirstDigit(temp);	
			if(firstNumber == 2 || firstNumber == 5){
				temp = stripFirstDigit(temp,firstNumber);
				if(temp <= 0 && num % 10 != 0){
					numbers.add(num);
					return 1;
				}
			}else{
				int pass = incrementor(temp);
				return pass;
			}
		}
		return 1;
	}
	
	private static int incrementor(int num){
		if(num == 0){
			return 1;
		}
		int temp = num;
		int val = 1;
		while(temp > 0){
			temp = temp/10;
			val = val * 10;
		}
		return val/10;
	}
	
	private static int stripFirstDigit(int num, int firstNumber){
		return num - (firstNumber * incrementor(num));
	}
	
	private static int getFirstDigit(int num){
		
		
		while(num >= 10)
		    num /= 10;
		
		return num;
	}
	
	private static boolean removeZeros(int num){
		char[] c = Integer.toString(num).toCharArray();
		
		for(char each : c){
			if(each == '0')
				return true;
		}
			
		return false;
	}
	
	
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}

}
