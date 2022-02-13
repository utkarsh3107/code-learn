package interview.EnableMyTeam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GoodString {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			int N = Integer.parseInt(line);

			for (int i = 0; i < N; i++) {
				String queryString = br.readLine();
				System.out.println(divideQueryString(queryString));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static int divideQueryString(String queryString) {
		int max = -1;
		short alphabet = 97;
		for (int i = 0; i < 26; i++,alphabet++) {
			int lPos = searchQSBegin(queryString,(char)alphabet);
			int rPos = searchQSEnd(queryString,(char)alphabet,lPos);
			if(rPos >lPos && lPos != -1 && max < (rPos -lPos + 1))
				max = rPos -lPos +1;			
		}
		return max == -1 ? max : queryString.length() - max;
	}
	
	
	
	private static int searchQSBegin(String queryString,char alphabet){
		for(int i = 0;i < queryString.length();i++){
			if(queryString.charAt(i) == alphabet){
				return i;
			}
		}
		return -1;
	}

	private static int searchQSEnd(String queryString,char alphabet, int pos){
		if(pos == -1)
			return -1;
		
		for(int i = queryString.length() -1 ;i > pos ;i--){
			if(queryString.charAt(i) == alphabet){
				return i;
			}
		}
		
		return -1;
	}

}
