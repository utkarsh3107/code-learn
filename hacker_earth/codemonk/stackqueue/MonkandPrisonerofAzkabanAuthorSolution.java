package codemonk.stackqueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class MonkandPrisonerofAzkabanAuthorSolution {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[] a = new long[n];
		long[] ng = new long[n];
		long[] pg = new long[n];
		
		String[] arr = br.readLine().split(" ");

		for (int i = 0; i < arr.length; i++) {
			a[i] = Long.parseLong(arr[i]);
		}
		
		Stack<Integer> s = new Stack<>();
		s.push(0);
		for(int i=1; i<n; i++){
			while(!s.isEmpty() && a[s.peek()] < a[i]){
				ng[s.peek()] = i+1;
				s.pop();
			}
			s.push(i);
		}	
		while(!s.isEmpty()){
			ng[s.peek()] = -1;
			s.pop();
		}
		s.push(n-1);
		for(int i=n-2; i>=0; i--){
			while(!s.isEmpty() && a[s.peek()] < a[i]){
				pg[s.peek()] = i+1;
				s.pop();
			}
			s.push(i);
		}
		while(!s.isEmpty()){
			pg[s.peek()] = -1;
			s.pop();
		}
		for(int i=0; i<n; i++){
			System.out.println(ng[i] + pg[i]);
		}
		
	}

}
