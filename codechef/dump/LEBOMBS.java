package codechef.dump;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class LEBOMBS{
    
    public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
		
		int testCases =	Integer.parseInt(br.readLine());
		
		for(int q=0;q<testCases;q++){
			String size = br.readLine();
            String val = br.readLine();
            
            boolean[] cpy = new boolean[val.length()];           
            int count = 0;
            for(int i = 0;i<cpy.length;i++){
                if(val.charAt(i) == '1'){
                    cpy[i] = true;
                    if((i-1) >=0) cpy[i-1] = true;
                    if((i+1) < cpy.length) cpy[i+1] = true;
                }     
            }
            for(int i = 0;i<cpy.length;i++)
                if(!cpy[i]) count++;
            bw.write(count+"\n");
        }
        bw.close();
        br.close();
    }
        
}