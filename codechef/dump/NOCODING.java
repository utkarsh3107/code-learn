package codechef.dump;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NOCODING{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
        
        int testCases = Integer.parseInt(br.readLine());
        
        for(int q=0;q<testCases;q++){
            String query = br.readLine();
            char[] ch = query.toCharArray();
            
            int init = ch[0] - 97;
            int count = 2;
            
            for(int i = 1; i < ch.length; i++){
                int temp = ch[i] - 97;
                if(init == temp)
                    count++;
                else{
                    if(init < temp)
                        count = count + (temp - init) + 1;
                    else
                        count = count + (26 - init) + temp +1;
                    init = temp;                    
                }    
            }
            if(((ch.length) * 11) >= count) 
                bw.write("YES\n");
            else
                bw.write("NO\n");
        }
        
        bw.close();
        br.close();
    }
}