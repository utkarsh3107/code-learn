package hacker_earth.interview.rangde;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DistinctPowers {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0){
			int A =Integer.parseInt(br.readLine());
			String binary = Integer.toBinaryString(A);
			
			int lstIndex = binary.lastIndexOf("0");
			
			if(lstIndex > 0){
				binary = new StringBuilder(binary).replace(lstIndex, lstIndex+1,"1").toString();
			}else{
				binary = binary + "1";
			}
			System.out.println(Integer.parseInt(binary,2));
		}
	}

}
