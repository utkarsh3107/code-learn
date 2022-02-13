package codechef.dump;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class TOTR{

     public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
        
        String[] testCase = br.readLine().split(" ");
        int testCases = Integer.parseInt(testCase[0]);
        char[] temp = testCase[1].toCharArray();
        
        char[] lookup =new char[123];
        lookup[46] = '.';
        lookup[32] = '_';
        lookup[95] = ' ';
        lookup[63] = '?';
        lookup[33] = '!';
        lookup[44] = ',';
        
        for(int i = 97,j=0 ; i <= 122;i++,j++){
            lookup[i] = temp[j];
        }
 
        for(int i = 65,j=97 ; i <= 90;i++,j++){
            lookup[i] = (char)((int)lookup[j] - 32);            
        }  
        
        for(int q=0;q<testCases;q++){
            StringBuilder output = new StringBuilder();
			String line = br.readLine();
            char[] ch = line.toCharArray();
            for(int i =0;i<ch.length;i++)
                output.append(lookup[(int)ch[i]]);
			bw.write(output+"\n");
        }
        bw.close();
        br.close();
     }
}