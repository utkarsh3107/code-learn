/**
 * 
 */
package cracking_coding_interview.arrays_and_strings;

/**
 * @author utkarsh
 *
 */
public class URLify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "Mr John Smith    ";
		System.out.println(new String(replaceChars(input.toCharArray(), 13)));
	}
	
	private static char[] replaceChars(char[] ch, int length){
		
		int count = 0;
		for(int i = 0;i< length;i++){
			if(ch[i] == 32) count++;
		}
		
		int newLength = length + (2 * count);
		
		for(int i = length-1; i >=0 ;i--){
			
			if(ch[i] == 32){
				ch[newLength - 1] = '0';
				ch[newLength - 2] = '2';
				ch[newLength - 3] = '%';
				newLength -= 3;
			}else{
				ch[newLength - 1] = ch[i];
				newLength--;
			}
			
		}
		
		return ch;
	}

}
