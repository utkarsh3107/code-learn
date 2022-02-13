package interview.zauba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LexicalSortingReloaded {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0){
			int N = Integer.parseInt(br.readLine());
			List<List<char[]>> lists = new ArrayList<List<char[]>>();
			for(int i = 0; i< N;i++){
				List<char[]> charArray= Arrays.asList(br.readLine().toCharArray());
				lists.add(charArray);
			}
			
			
		}
		
	}
	
	private static void sortArrays(List<List<char[]>> charArrays){
		
		for(List<char[]> each: charArrays){
		}
		
	}

}
