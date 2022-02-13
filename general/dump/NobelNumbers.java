/**
 *Noble integers in an array (count of greater elements is equal to value)

Given an array arr[], find a Noble integer in it. An integer x is said to be Noble in arr[] if the number of integers greater than x are equal to x. 
If there are many Noble integers, return any of them. If there is no, then return -1.

Examples:

Input  : [7, 3, 16, 10]
Output : 3  
Number of integers greater than 3
is three.

Input  : [-1, -9, -2, -78, 0]
Output : 0
Number of integers greater than 0
is zero.
*/

package selfstudy;

import java.util.Set;
import java.util.TreeSet;

public class NobelNumbers {

	public static void main(String[] args) {
		Set<Integer> set= new TreeSet<>();
				
		for(int each : getArray()){
			set.add(each);
		}
		
		int val = (hasNobelNumber(set)) ? 1 : -1;
		System.out.println(val);
	}
	
	private static boolean hasNobelNumber(Set<Integer> set){
		int size = set.size();
		int counter = 1;
		for(Integer each : set){
			if(size -counter++ == each){
				return true;
			}
		}
		return false;
	}

	private static int[] getArray() {
		return new int[] { -1, -9, -2, -78 , 0 };
	}

}
