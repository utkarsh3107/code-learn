import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import static java.lang.Math.sqrt;

class RESQ3{

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out),65536);
		
		int testCase = Integer.parseInt(reader.readLine());
		for (int q = 0; q < testCase; q++) {
			int num = Integer.parseInt(reader.readLine());
			double d = sqrt(num);
			int sNum = (int) d;
			writer.write(getValue(sNum,num)+"\n");
		}
		reader.close();
		writer.close();
	}
	
	private static int getValue(int sNum , int num){
		if((sNum * sNum) == (int) num)
			return 0;
		else{
			for(int i = sNum; i >= 1 ;i--){
				if(num % i == 0){
					return (num/i) - i;
				}
			}
		}
		return -1;
	}
}