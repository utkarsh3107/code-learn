/**
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author utkarsh
 *
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		List<List<Integer>> list = initializeValues();
		printArrayList(list);
		System.out.println("----------------------------------------");
		int m = list.size();
		int n = list.get(0).size();
		System.out.println(printSpiral(list,m,n));
	}


	private static List<Integer> printSpiral(List<List<Integer>> list, int m , int n) {
		int colBeg = 0;
		int rowBeg = 0;
		int rowEnd = m;
		int colEnd = n;

		List<Integer> result = new ArrayList<>();
		while (colBeg < colEnd && rowBeg < rowEnd) {

			for (int i = rowBeg; i < colEnd; i++) {
				result.add(list.get(rowBeg).get(i));
			}
			rowBeg++;

			for (int i = rowBeg; i < rowEnd; i++) {
				result.add(list.get(i).get(colEnd - 1));
			}
			colEnd--;
			
			//if added beacuse Added because 1x2 scenario fails
			if (rowEnd > rowBeg) {
				for (int i = colEnd - 1; i >= colBeg; i--) {
					result.add(list.get(rowEnd - 1).get(i));
				}
				rowEnd--;
			}
			//if added beacuse Added because 3x1 scenario fails
			if (colEnd > colBeg) {
				for (int i = rowEnd - 1; i >= rowBeg; i--) {
					result.add(list.get(i).get(colBeg));
				}
				colBeg++;
			}
		}
		
		return result;
	}

	private static void printArrayList(List<List<Integer>> list) {
		list.forEach(new MyConsumer());
	}

	private static List<List<Integer>> initializeValues() {
		List<List<Integer>> list = new ArrayList<>();

		list.add(getInternalList(1, 3));
		list.add(getInternalList(2, 3));
		//list.add(getInternalList(9, 4));
		//list.add(getInternalList(13, 4));
		return list;
	}

	private static List<Integer> getInternalList(int intialValue, int size) {
		List<Integer> list = new ArrayList<>();
		int counter = 0;

		while (counter < size) {
			list.add(intialValue++);
			counter++;
		}

		return list;
	}

}

class MyConsumer implements Consumer<List<Integer>> {

	@Override
	public void accept(List<Integer> t) {
		for (Integer each : t) {
			System.out.print(each + " ");
		}
		System.out.println();

	}

}
