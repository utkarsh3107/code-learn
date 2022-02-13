package codechef.dump;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class AMSGAME4{
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
		
		int testCases =	Integer.parseInt(br.readLine());
		
		for(int q=0;q<testCases;q++){
            int size = Integer.parseInt(br.readLine());
			String[] line = br.readLine().split(" ");
			bw.write(calculateValue(line)+"\n");
        }
        bw.close();
        br.close();           
    }   
    
    public static int calculateValue(String[] line){
        if(line.length == 1)
            return Integer.parseInt(line[0]);
         
        int num1 = Integer.parseInt(line[0]);
        int num2 = Integer.parseInt(line[1]);
            
        int gcd = findGCD(num1,num2);
            
		for(int i = 2;i<line.length;i++){
			int val = Integer.parseInt(line[i]);
            gcd = findGCD(gcd,val);
        }
        return gcd;
    }
    
    public static int findGCD(int num1 , int num2){
        if(num2 == 0) return num1;
        
        return findGCD(num2,num1%num2);
    } 
} 