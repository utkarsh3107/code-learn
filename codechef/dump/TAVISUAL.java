import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TAVISUAL{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
        
        int testCases = Integer.parseInt(br.readLine());
        
        for(int q=0;q<testCases;q++){
            String[] line1 = br.readLine().split(" ");
            int N = Integer.parseInt(line1[0]);
            int C = Integer.parseInt(line1[1]);
            int Q = Integer.parseInt(line1[2]);
            int pos = 0;
            for(int r = 0; r < Q; r++){
                String[] line2 = br.readLine().split(" ");
                int L = Integer.parseInt(line2[0]);
                int R = Integer.parseInt(line2[1]);
                pos = L + R - C;
                if((L <= C && C <= R) && (pos > 0 && pos <= N))
                    C = pos;
            }
            bw.write(C+"\n");
        }
        bw.close();
        br.close();
    }
}