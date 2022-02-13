package codechef.dump;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class NAME2{
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
		
		int testCases =	Integer.parseInt(br.readLine());
		
		for(int q=0;q<testCases;q++){
            String[] line = br.readLine().split(" ");
            String M = line[0];
            String W = line[1];
            
            char[] arrM = null;
            char[] arrW = null;
            
            if(M.length() > W.length()){
                arrW = W.toCharArray();
                arrM = M.toCharArray();
            }else{
                arrM = W.toCharArray();
                arrW = M.toCharArray();
            }
            
            int i=0,j=0;
            
            while(i < arrM.length && j < arrW.length){
                if(arrM[i] == arrW[j]){
                    i++;j++;
                }else{
                    i++;
                }
            }
            if(j == arrW.length){
               bw.write("YES\n"); 
            }else{
                bw.write("NO\n");
            }
        }
        
        bw.close();
        br.close();
    }
}