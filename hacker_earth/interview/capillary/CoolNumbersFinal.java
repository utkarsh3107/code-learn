package hacker_earth.interview.capillary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoolNumbersFinal {

	private static int[] nums;
	private static int counter;

	static{
		nums = new int[510];
		for (int i = 1; i < 55555556 ;) {
			int t = passNumber(i);
			i = i + t;
		}	
		System.out.println();
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
					nums[counter++] = num;
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
	
	private static int binarySearch(int[] arr, int m, int n, int target) {
		if (m == n)
			return m;

		if ((n - m) == 1 )
			return arr[m] == target ? m : n;
		
		int mid = (m + n) / 2;

		if (arr[mid] == target)
			return mid;

		if (arr[mid] > target)
			return binarySearch(arr, m, mid, target);
		else
			return binarySearch(arr, mid, n, target);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0){
			String[] line = br.readLine().split(" ");
			int l = Integer.parseInt(line[0]);
			int r = Integer.parseInt(line[1]);
			long sum = 0;
			for(int i = l;i<=r;i++){
				int val = binarySearch(nums, 0, nums.length-1, i);
				sum += nums[val];
			}
			System.out.println(sum);
		}
	}


}
