package selfstudy;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixString {

	public static void main(String[] args) {
		List<List<String>> list = initializeValues();
		printArrayList(list);
		System.out.println("----------------------------------------");
		printSpiral(list);
	}

	private static void printSpiral(List<List<String>> list) {
		int colBeg = 0;
		int rowBeg = 0;
		int rowEnd = 3;
		int colEnd = 1;

		while (colBeg < colEnd && rowBeg < rowEnd) {

			for (int i = rowBeg; i < colEnd; i++) {
				System.out.print(list.get(rowBeg).get(i) + " ");
			}
			rowBeg++;

			for (int i = rowBeg; i < rowEnd; i++) {
				System.out.print(list.get(i).get(colEnd - 1) + " ");
			}
			colEnd--;
			
			//if added beacuse Added because 1x2 scenario fails
			if (rowEnd > rowBeg) {
				for (int i = colEnd - 1; i >= colBeg; i--) {
					System.out.print(list.get(rowEnd - 1).get(i) + " ");
				}
				rowEnd--;
			}
			//if added beacuse Added because 3x1 scenario fails
			if (colEnd > colBeg) {
				for (int i = rowEnd - 1; i >= rowBeg; i--) {
					System.out.print(list.get(i).get(colBeg) + " ");
				}
				colBeg++;
			}
		}
	}

	private static void printArrayList(List<List<String>> list) {
		for(List<String> each : list){
			for(String each1 : each){
				System.out.print(each1 + " ");
			}
			System.out.println();
		}
	}

	private static List<List<String>> initializeValues() {
		List<List<String>> finallist = new ArrayList<>();

		List<String> list = new ArrayList<>();
		list.add("00");
		// list.add("01");
		// list.add("02");
		// list.add("03");
		// list.add("04");
		finallist.add(list);

		List<String> list1 = new ArrayList<>();
		list1.add("10");
		// list1.add("11");
		// list1.add("12"); 
		//list1.add("13");
		// list1.add("14");
		finallist.add(list1);

		List<String> list2 = new ArrayList<>();
		list2.add("20");
		//list2.add("21"); 
		// list2.add("22"); 
		//list2.add("23");
		// list2.add("24"); finallist.add(list2);

		List<String> list3 = new ArrayList<>();
		list3.add("30");
		//list3.add("31"); 
		// list3.add("32"); 
		//list3.add("33");
		// list3.add("34"); 
		finallist.add(list3);

		/*
		 * List<String> list4 = new ArrayList<>(); list4.add("40");
		 * list4.add("41"); list4.add("42"); list4.add("43"); list4.add("44");
		 * finallist.add(list4);
		 */

		return finallist;
	}

}