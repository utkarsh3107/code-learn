package codechef.dump;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OJUMPS{
    
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
		
            long testCase =	Long.parseLong(br.readLine());
		
	        if(((testCase % 3) == 0) || ((testCase % 3 == 1) && !((testCase%2) == 0))){
                bw.write("yes\n");
            }else{
                bw.write("no\n");
            }
        
        
        bw.close();
        br.close();
    }
}