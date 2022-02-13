import java.util.Arrays;

public class Test{
    
        public static void main(String[] args){
            String val = "1 1 1 1 1 1 1 1 1 10"; 
            int n = 10;
            int k = 5;
            int bag1 = 0,bag2 = 0;
            String[] line = val.split(" ");
            
            int[] arr = new int[line.length];
            
            for(int i = 0;i < arr.length;i++)
                arr[i] = Integer.parseInt(line[i]);
            
            Arrays.sort(arr);
            
            int mid = n / 2;
            System.out.println(mid);   
            if(mid > k){
                System.out.println("Inside 1");  
                for(int i = 0; i < arr.length;i++)
                    if(i < k){
                        bag1 = bag1 + arr[i];
                        System.out.println("bag1: " +bag1);
                    }else{
                        bag2 = bag2 + arr[i];
                        System.out.println("bag2: " +bag2);
                }
            }else{
                System.out.println("Inside 2");  
                for(int i = 0; i < arr.length;i++)
                    if(i < (n-k)){
                        bag1 = bag1 + arr[i];
                        System.out.println("bag1: " +bag1);
                    }else{
                        bag2 = bag2 + arr[i];
                        System.out.println("bag2: " +bag2);
                }
            }

            System.out.println(bag2-bag1);
        }

}
