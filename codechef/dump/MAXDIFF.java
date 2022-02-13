import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class MAXDIFF {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
        int testCases =	Integer.parseInt(br.readLine());
		
		for(int q=0;q<testCases;q++){
            String[] line1 = br.readLine().split(" ");
            String val = br.readLine(); 
            int n = Integer.parseInt(line1[0]);
            int k = Integer.parseInt(line1[1]);
            int bag1 = 0,bag2 = 0;
            
            String[] line = val.split(" ");
            
            int[] arr = new int[line.length];
            
            for(int i = 0;i < arr.length;i++)
                arr[i] = Integer.parseInt(line[i]);
            
            Arrays.sort(arr);
            
            int mid = n / 2;
             
            if(mid >= k){
                  
                for(int i = 0; i < arr.length;i++)
                    if(i < k){
                        bag1 = bag1 + arr[i];
                        
                    }else{
                        bag2 = bag2 + arr[i];
                        
                }
            }else{
                for(int i = 0; i < arr.length;i++)
                    if(i < (n-k)){
                        bag1 = bag1 + arr[i];
                       
                    }else{
                        bag2 = bag2 + arr[i];
                        
                }
            }
            bw.write((bag2-bag1)+"\n");
        }
        
        bw.close();
        bw.close();
    }
    
}