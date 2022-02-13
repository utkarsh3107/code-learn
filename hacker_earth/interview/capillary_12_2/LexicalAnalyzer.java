package interview.capillary_12_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class LexicalAnalyzer {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Set<String> map = new HashSet<String>();
		
		while(N-- > 0){
			String stmt = br.readLine();
			int pos = stmt.indexOf(61);
			String newStr = stmt.substring(0, pos);
			map.add(newStr);
		}
		System.out.println(map.size());
	}

}
