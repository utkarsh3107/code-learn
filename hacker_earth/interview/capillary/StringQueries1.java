package interview.capillary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringQueries1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inps = br.readLine().split(" ");
		int Q = Integer.parseInt(inps[1]);
		char[] queryString = br.readLine().toCharArray();
		
		while(Q-- > 0){
			String[] query = br.readLine().split(" ");
			int l = Integer.parseInt(query[0]);
			int r = Integer.parseInt(query[1]);
			Map<Character, Integer> map = parseString(l-1, r-1, queryString);
			int[] min = iterateMap(map);
			System.out.println(medianQualifications(min));
		}
	}
	
	private static Map<Character, Integer> parseString(int l,int r, char[] queryString){
		Map<Character, Integer> map = new HashMap<>();
		for(int i = l; i <= r; i++) {
			if(map.containsKey(queryString[i])){
				int val = map.get(queryString[i]);
				map.put(queryString[i], val+1);
			}else{
				map.put(queryString[i], 1);
			}
		}
		return map;
	}
	
	private static int[] iterateMap(Map<Character, Integer> map){
		int[] arr = new int[map.size()];
		int counter = 0;
		for(Character each : map.keySet()){
			int value = map.get(each);
			arr[counter++] = value;
		}
		Arrays.sort(arr);
		return arr;
	}
	
	private static int medianQualifications(int[] arr){
		int median = arr.length / 2;
		int variations = 0;
		
		for(int i = 0; i< median;i++){
			variations += arr[median] - arr[i]; 
		}
		for (int i = median + 1; i < arr.length; i++) {
			variations += arr[i] - arr[median];
		}
		
		return variations;
	}
	
}
