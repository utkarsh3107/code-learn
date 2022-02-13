package hacker_earth.interview.playsimple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonkAndKOperations {

	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0){
			String[] NK = br.readLine().split(" ");
			int N = Integer.parseInt(NK[0]);
			int K = Integer.parseInt(NK[1]);
			
			String[] A = br.readLine().split(" ");
			int i = 0;
			int j = N -1;
			int counter = -1;
			for(i = 0,j = N-1;K-- > 0; ){
			    boolean b1 =false;
				int tFront = Integer.parseInt(A[i]);
				int tRear = Integer.parseInt(A[j]);
				if(tFront > tRear){
					j--;
				    b1 = true;
				}else{
					i++;
				}	
				if(i > j){
				    if(b1)
				        counter = i;
				    else
				        counter = j;
				}
			}
			
			if(counter >= 0){
			    System.out.println(Integer.parseInt(A[counter]));
			    return;
			}
			
			if(i == j)
			    System.out.println(Integer.parseInt(A[i]));
			else
			    System.out.println(Integer.parseInt(A[i]) * Integer.parseInt(A[j]));
			
		}
    
	}

}
