package codechef.dump;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PLZLYKME {

     public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
        
        int testCases = Integer.parseInt(br.readLine());
        
        for(int q=0;q<testCases;q++){
            String[] line = br.readLine().split(" ");
            int L = Integer.parseInt(line[0]);
            int D = Integer.parseInt(line[1]);
            int S = Integer.parseInt(line[2]);
            int C = Integer.parseInt(line[3]);
            
            boolean flag = DOA(L,D,S,C);    
            
            if(flag)    bw.write("ALIVE AND KICKING\n");
            else    bw.write("DEAD AND ROTTING\n");
        }
        
        bw.close();
        br.close();             
    }   
       
    private static boolean DOA(int L, int D, int S ,int C){
        if(S >= L)
            return true;
            
        long temp = S;
        
        for(int i = 0;i < (D-1); i++){
            temp = temp + temp * C;
            if(temp >= L)
                return true;
        }
        return false;
    }

}