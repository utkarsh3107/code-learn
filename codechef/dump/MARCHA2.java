import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import static java.lang.Math.*;

public class MARCHA2{
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
        
        int testCases = Integer.parseInt(br.readLine());
        
        loop: for(int q=0;q<testCases;q++){
            int val = Integer.parseInt(br.readLine());
            String[] line2 = br.readLine().split(" ");
            long leaves = 1;
            for (int i = 0; i < val; i++) {
				int temp = Integer.parseInt(line2[i]);
				if (temp > leaves) {
					bw.write("No\n");
					continue loop;
				}
				leaves = (leaves - temp) * 2;
			}
			if (leaves == 0)
				bw.write("Yes\n");
			else
				bw.write("No\n");                
        }
        bw.close();
        br.close();

    }
}