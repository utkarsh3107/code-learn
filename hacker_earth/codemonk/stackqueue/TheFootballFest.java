package hacker_earth.codemonk.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheFootballFest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0){
			String[] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[1]);
			int passes =  Integer.parseInt(input[0]);
			StackImpl<Integer> stack = new StackImpl<>(passes+1);
			stack.pushElement(N);
			while(passes-- > 0){
				String value = br.readLine();
				if(value.split(" ").length > 1){
					int temp = Integer.parseInt(value.split(" ")[1]);
					stack.pushElement(temp);
				}else{
					int pTop = stack.popElement();
					int num = stack.getTopElement();
					stack.pushElement(pTop);
					stack.pushElement(num);
				}
			}
			System.out.println("Player "+stack.getTopElement());
		}
	}

}
