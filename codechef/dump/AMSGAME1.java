import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AMSGAME1{

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
			
			int divisor = 2;
			int minimum = calculateMininmum(arr);
			int sum = 1;
			boolean flag = true;
			
			if(minimum == Integer.MAX_VALUE){
				bw.write("1\n");
			}else{
				while(divisor <= minimum){
					for(int i = 0;i<arr.length;i++)
						if(arr[i] % divisor != 0) flag = false;
					if(flag){
						for(int i = 0;i<arr.length;i++)
							arr[i] = arr[i] / divisor;
						minimum = calculateMininmum(arr);
						sum = sum * divisor;
						divisor = 2;	
					}else{
						divisor++;
					}
					flag = true;
				}
				bw.write(sum+"\n");
			}
		}
		bw.close();
		br.close();
	}
	
	
	
	public static int calculateMininmum(int[] arr){
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
			if(arr[i] != 1 && min > arr[i])
				min = arr[i];
				
		return 	min;
	}
}