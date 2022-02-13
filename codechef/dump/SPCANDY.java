import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SPCANDY{
    
    public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
		
		int testCases =	Integer.parseInt(br.readLine());
		
		for(int q=0;q<testCases;q++){
            String[] line1 = br.readLine().split(" ");
            long N = Long.parseLong(line1[0]);
            long K = Long.parseLong(line1[1]);
            
            if(K == 0 || K > N){
                bw.write("0 "+N+"\n");
                continue;
            }
            
            if(N % K == 0){
                bw.write(N/K + " 0\n");
            }else{
                bw.write(N/K + " "+(N-((N/K)*K)) + "\n");
            }
        }
     
        bw.close();
        br.close();   
    }
    
}