package hacker_earth.codemonk.stackqueue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MonkandPhilosopherStone {

	private static String HARRY = "Harry";
	
	public static void main(String[] args) throws Exception{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader(new File("file1.txt")));
		
		int N = Integer.parseInt(br.readLine());
		String[] bag = br.readLine().split(" ");
		
		String[] QX = br.readLine().split(" ");
		int Q = Integer.parseInt(QX[0]);
		int X = Integer.parseInt(QX[1]);
		int sum = 0;
		
		int counter = 0;
		StackImpl<Integer> stack = new StackImpl<Integer>(Q);
		boolean flag = true;
		while(Q-- > 0){
			String stmt = br.readLine();
			
			if(stmt.equals(HARRY)){
/*				if(stack.pushElement(Integer.parseInt(bag[counter])) == null){
					System.out.println(checkElement(X , sum , stack));
				}*/
				
				if(stack.pushElement(Integer.parseInt(bag[counter])) != null){
					sum = sum + (int) stack.getTopElement();
					if(checkElement(X , sum)){
						flag = false;
						System.out.println(stack.getSize());
						break;
					}
					counter++;
				}
				
			}else{
				Integer num = stack.popElement();
				if(num != null){
					sum = sum - num;
					if(checkElement(X , sum)){
						flag = false;
						System.out.println(stack.getSize());
						break;
					}
				}
				
			}
		}
		
		if(flag){
			System.out.println("-1");
		}
	}
	
	
	private static boolean checkElement(int desired, int current){
		return desired == current ? true : false;
	}

}
