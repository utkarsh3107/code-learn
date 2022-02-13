/**
 * 
 */
package interview.acolite_19_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author cHeRRy
 *
 */
public class VowelPhelia {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0){
			int N = Integer.parseInt(br.readLine());
			String input = br.readLine();
			int count = 0;
			int tCount = 0;
			int lastVowelPos = -1;
			char[] arr = input.toCharArray();
			for(int i = 0; i < N;i++){
				char c = arr[i];
				if(checkVowel(c)){
					count++;
					if(count == 3){
						i = lastVowelPos;
						tCount++;
						count = 0;
						continue;
					}
					lastVowelPos = i;
				}
			}
			System.out.println(tCount);
		}
	}
	
	private static boolean checkVowel(char c){
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
			return true;
		}
		
		return false;
	}

}
