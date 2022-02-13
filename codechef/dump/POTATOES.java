package codechef.dump;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import static java.lang.Math.sqrt;
import static java.lang.Math.ceil;
import java.util.List;
import java.util.ArrayList;

public class POTATOES{

		static final List<Integer> temp;
		
		static{
			temp = new ArrayList<Integer>();
			temp.add(2);
			int count = 3;
			while(count <= 2003){
				if(isPrime(count)){
					temp.add(count);
				}
				count++;
			}
		}

		
		private static boolean isPrime(int N){
			for(int i = 2;i<=(sqrt(N)+1);i++){
				if(N%i == 0)
					return false;
			}
			return true;
		}
		
		private static int binarySearch(List<Integer> temp,int start, int end,int value){
			if(start > end){
				return temp.get((int)ceil(((double)(start + end) / (double)2)));
			}
			int mid = (start + end) / 2;
				
			if(temp.get(mid) > value)
				return binarySearch(temp,start, mid-1, value);
			else
				return binarySearch(temp,mid + 1, end, value);	
		}
		
    public static void main(String[] args) throws Exception{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
		
			int testCases =	Integer.parseInt(br.readLine());
		
			for(int q = 0;q<testCases;q++){
				String[] line = br.readLine().split(" ");
				int a = Integer.parseInt(line[0]);
				int b = Integer.parseInt(line[1]);
				int value = a + b;
				
				int op = binarySearch(temp,0,temp.size()-1,value);	
				bw.write((op - value)+"\n");
			}	

			bw.close();
			br.close();
    }	
}