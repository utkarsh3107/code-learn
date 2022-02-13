import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class ALEXNUMB{
    
    final static long temp[];
    
    static{
        temp = new long[100001];
        temp[0] = 0;
        temp[1] = 0;
        temp[2] = 1;
        for(int i =3;i < temp.length;i++)
            temp[i] = (i-1) + (temp[i-1]);
    }
    
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
        
        int testCases = Integer.parseInt(br.readLine());
            
        for(int q = 0;q<testCases;q++){
            int size = Integer.parseInt(br.readLine());
            String array = br.readLine();
            
            bw.write(temp[size]+"\n");
        }
        bw.close();
        br.close();
    }       
}