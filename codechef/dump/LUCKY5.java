import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LUCKY5{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
        
        int testCases = Integer.parseInt(br.readLine());
        
        for(int q=0;q<testCases;q++){
            String N = br.readLine(); 
            char[] ch = N.toCharArray();        
            int sol1 = solution1(ch);
            bw.write(sol1+"\n");
        }

        bw.close();
        br.close();
    }
    
    private static int solution1(char[] ch){
        int count = 0;
        for(int i = 0;i< ch.length; i++){
            if(ch[i] != '4' && ch[i] != '7')
                count++;
        }
        return count;
    }
    
 }