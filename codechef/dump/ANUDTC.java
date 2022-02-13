package codechef.dump;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class ANUDTC{
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
        
        int testCases = Integer.parseInt(br.readLine());
        
        for(int q = 0;q<testCases;q++){
            int testCase = Integer.parseInt(br.readLine()); 
            boolean flag1 = (360 % testCase) == 0;
            boolean flag2 = (testCase >= 1) && (testCase <= 360);
            boolean flag3 = (long)((long)(testCase + 1L) * (long)(testCase))/2L <= 360L;
            
            bw.write((flag1 ? "y": "n") + " " + (flag2 ? "y": "n") + " " +(flag3 ? "y": "n") + "\n");
        }
        
        bw.close();
        br.close();
    }
    
}