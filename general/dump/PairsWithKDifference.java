/**
 * 
 */
package selfstudy;

import java.util.HashSet;

/**
 * @author utkarsh
 *
 */
public class PairsWithKDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 7, 5, 9, 2, 12, 3 };
		int k = 2;
		HashSet<Integer> set = new HashSet<>();
		
		for(int each: arr){
			set.add(each);
		}
		
		for(int each : arr){
			int kAdd = each + k;
			int kSub  = each - k;
		
			if(set.contains(kAdd)){
				System.out.print("("+each +" , " + kAdd+")");
			}
			
			if(set.contains(kSub)){
				System.out.print("("+each +" , " + kSub+")");
			}
			
			set.remove(each);
		}
	}

}
