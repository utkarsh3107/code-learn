package codechef.dump;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class AMSGAME3{
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
		
		int testCases =	Integer.parseInt(br.readLine());
		
		for(int q=0;q<testCases;q++){
            int size = Integer.parseInt(br.readLine());
			String[] line = br.readLine().split(" ");
			int[] arr = new int[size];
			
			for(int i = 0;i<arr.length;i++){
				arr[i] = Integer.parseInt(line[i]);
			}
            
            int min = calculateMininmum(arr);
            int sum = 1;
            int divisor = 2;
            if(min == Integer.MAX_VALUE)
                System.out.println(sum);
            else{
                outside: 
                while(divisor <= min){
                    if(min == Integer.MAX_VALUE)
                        break;
                    for(int i=0;i<arr.length;i++){
                        if(arr[i] % divisor != 0){
                            divisor++;
                            continue outside;
                        }
                    }
                    
                    for(int i = 0;i<arr.length;i++)
                        arr[i] = arr[i] / divisor;
                   
                    sum = sum * divisor;
                    divisor = 2;        
                    min = calculateMininmum(arr);   
                }
                System.out.println(sum);
            }       
        }           
    }
    
    public static int calculateMininmum(int[] arr){
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
			if(arr[i] != 1 && min > arr[i])
				min = arr[i];
				
		return 	min;
	}
    
} 