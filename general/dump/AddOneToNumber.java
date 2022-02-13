/**
 * 
 */
package selfstudy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author utkarsh
 *
 */
public class AddOneToNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		List<Integer> list = getList();

		long number = 0 ;
		long counter = 1;
		
		ListIterator<Integer> namesIterator = list.listIterator(list.size());
		
		while(namesIterator.hasPrevious()){
			number += (counter * namesIterator.previous());
			counter *= 10;
		}
		
		number  = number + 1;
		
		List<Integer> result = convertToList(number);
		
		System.out.println(result);
		System.out.println(System.currentTimeMillis() - start);
	}
	
	private static List<Integer> convertToList(long number){
		long temp = number;
		List<Integer> list = new LinkedList<>();
		while(temp > 0){
			long num = temp % 10;
			temp = temp / 10;
			list.add(0,(int) num);
		}
		return list;
	}

	private static List<Integer> getList() {
		List<Integer> temp = new ArrayList<>();
		temp.add(0);
		temp.add(0);
		temp.add(9);
		temp.add(0);
		temp.add(9);
		temp.add(9);
		temp.add(9);
		temp.add(9);
		temp.add(9);
		temp.add(1);
		temp.add(2);
		temp.add(3);
		temp.add(4);
		return temp;
	}

}
