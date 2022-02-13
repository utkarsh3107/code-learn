import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseWords{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string");
        String[] input = br.readLine().split(" ");
        for(int i = input.length-1 ; i >= 0;i--)
             System.out.print(input[i] + " ");
    }

}