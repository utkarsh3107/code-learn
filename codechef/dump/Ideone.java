package codechef.dump;

import java.util.*;
import java.io.*;
public class Ideone {
 
    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
		
		long N = Integer.parseInt(br.readLine());
        String C = br.readLine();
        String[] Ci_str = C.split(" ");
        long sum = 0;
        
        for(int i=0; i < Ci_str.length;i++){
            sum = sum + Integer.parseInt(Ci_str[i]);
        }
            
        long N_SUM = ((N + 1) * N) / 2;
        if(N_SUM == sum)
            bw.write("YES");
        else
            bw.write("NO"); 
            
        bw.close();
        br.close();           
    }
    
}