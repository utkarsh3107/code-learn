import java.math.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DRAGNXOR{
    final static int[] temp = new int[31];
    
    static{
        for(int i = 30;i >= 0;i--){
            temp[i] = ((Double)Math.pow(2,i)).intValue();
        }
    }
    
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
		
        BigInteger one = new BigInteger("1");
        BigInteger ten = new BigInteger("10");
		
        int testCases =	Integer.parseInt(br.readLine());
		
		for(int q=0;q<testCases;q++){
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int A = Integer.parseInt(line[1]);
            int B = Integer.parseInt(line[2]);
            int valueA = get1(N,A);
            int valueB = get1(N,B);
            BigInteger value = new BigInteger("0");
            int totalOne = valueA + valueB;

            if(totalOne > N){

                int count0inA = N - valueA;
                int count0inB = N - valueB;
                int local = count0inA + count0inB;
                for(int i=0;i<local;i++){
                    value = value.multiply(ten).add(one);  
                }
                for(int i=0;i<N - local;i++){
                    value = value.multiply(ten) ;  
                }   
            }else if(totalOne < N){
               //System.out.println("2");
                for(int i=0;i<totalOne;i++){
                    value = value.multiply(ten).add(one) ;  
                }
                //System.out.println("Step 1 value "+value);
                //System.out.println("====== N & totalOne "+ N + totalOne);
                //System.out.println("====== N - totalOne "+ (N - totalOne));
                for(int i=0;i<N - totalOne;i++){
                    //System.out.println("inside "+value);
                    value = value.multiply(ten);  
                }
                //System.out.println("Step 2 value "+value);
            }else{
                //System.out.println("3");
                 for(int i=0;i<N;i++){
                    value = value.multiply(ten).add(one) ;  
                }
            }
            //System.out.println("Binary A "+getBinary(N,A));
            //System.out.println("Binary B "+getBinary(N,B));
            //System.out.println("valueA " +valueA);
            //System.out.println("valueB " +valueB);
            //System.out.println("value " +getDecimal(value));
            bw.write(getDecimal(value)+"\n");
        }
        bw.close();
        br.close();
        
    }
    
    public static int getBinary(int N, int A){
        int binary = 0;
        for(int i=30;i>=0;i--){
            if(A >= temp[i]){
                A = A - temp[i];
                binary += ((Double)Math.pow(10,i)).intValue();
            }
        }
        
        return binary;   
    }
    
    public static int get1(int N, int A){
        int value = 0;
        for(int i=30;i>=0;i--){
            if(A >= temp[i]){
                A = A - temp[i];
                value++;
            }
        }
        return value; 
    }
    
    public static long getDecimal(BigInteger A){
        String value = "" + A;
        char[] arr = value.toCharArray();
        long sum = 0;
        for(int i=0,j = arr.length-1;i<arr.length;i++,j--){
            if(arr[i] == '1')
                sum = sum + temp[j];
        }
        return sum; 
    }
}