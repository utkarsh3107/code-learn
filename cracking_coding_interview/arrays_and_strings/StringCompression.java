/**
 * 
 */
package cracking_coding_interview.arrays_and_strings;

/**
 * @author utkarsh
 *
 */
public class StringCompression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String  input = "akdkdkkkkdllolwlwldlldlldldddddddddddddddddddddd";
		System.out.println(compressString(input));
	}
	
	
	private static String compressString(String input){
		StringBuilder result = new StringBuilder();
		
		int count = 0;
		char previousElement = input.charAt(0);
		
		for(char each : input.toCharArray()){
			if(each == previousElement){
				count++;
			}else{
				result.append(previousElement);
				previousElement = each;
				result.append(count);
				count = 1;
			}
		}
		result.append(previousElement);
		result.append(count);
		
		if(result.length() > input.length())
			return input;
		
		
		return result.toString();
	}

}
