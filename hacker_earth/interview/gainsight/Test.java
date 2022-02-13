package interview.gainsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		List list1 = new ArrayList<>();
		List list2 = new ArrayList<>();
		List list3 = new ArrayList<>();
		
		list1.add("vishu");
		list1.add("sachin");
		list1.add("pawan");
		
		list2.add("vishu");
		list2.add("lala");
		list2.add("dc");
		
		list3.add("vishu");
		list3.add("dude");
		list3.add("gupta");
		
		
		Map<String, Integer> map = new  HashMap<>();
		
		getListParam(list1,map);
		getListParam(list2,map);
		getListParam(list3,map);
		
		for(String each : map.keySet()){
			int value = map.get(each);
			if(value >= 3){
				System.out.println(each);
			}
		}
	}
	
	private static void getListParam(List<String> list, Map<String,Integer> map){
		for(String each : list){
			if(map.containsKey(each)){
				int value = map.get(each);
				
				map.put(each, value+1);
			}else{
				map.put(each, 1);
				
			}
		}
	}
	
	
}
