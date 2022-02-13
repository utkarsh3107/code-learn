import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RRCOPY{
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
        
        int testCases = Integer.parseInt(br.readLine());
            
        for(int q = 0;q<testCases;q++){
            int[] value = new int[100001];
            int size = Integer.parseInt(br.readLine());
            String[] array = br.readLine().split(" ");
            int count = 0;
            for(int i=0;i<array.length;i++){
                int temp = Integer.parseInt(array[i]);
                if(value[temp] == 0){
                    count++;
                    value[temp] = 1;
                }       
            }
            bw.write(count+"\n");
        }
        bw.close();
        br.close();
    }    
}