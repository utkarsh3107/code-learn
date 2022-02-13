/**
 * { 
		{ 00, 01, 02 }, 
		{ 10, 11, 12 }, 
		{ 20, 21, 22 } 
	};
 * 
 * 
 * { 
		{ 20, 10, 00 }, 
		{ 21, 11, 01 }, 
		{ 22, 12, 02 } 
	};

 */
package arrays_and_strings;

/**
 * @author utkarsh
 *
 */
public class RotateMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] arr = { { 00, 01, 02 }, { 10, 11, 12 }, { 20, 21, 22 } };

		int[][] expected = { { 00, 01, 02 }, { 10, 11, 12 }, { 20, 21, 22 } };
		for(int i = 0 ; i  < 3 ;i++){
			for(int j = 2 ; j >= 0 ; j--){
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		
		
		for(int i = 0 ; i  < 3 ;i++){
			for(int j = 2 ; j >= 0 ; j--){
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
