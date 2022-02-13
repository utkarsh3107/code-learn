package hacker_earth.codemonk.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MonkBeingMonitor {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String N = br.readLine();
			String[] heightArr = br.readLine().split(" ");
			System.out.println(divideArray(heightArr));
			
		}
	}

	private static int divideArray(String[] arr) {
		int[] heights = new int[arr.length];
		int index = 0;

		for (String eachElement : arr) {
			heights[index] = Integer.parseInt(eachElement);
			index++;
		}
		// Sort the array
		Arrays.sort(heights);

		int max = 0, tempMax = 0;
		int maxPreviousElement = heights[0];
		int min = Integer.MAX_VALUE, tempMin = 0;
		int minPreviousElement = heights[0];
		for (int i = 0; i < heights.length; i++) {
		if (maxPreviousElement == heights[i]) {
				tempMax++;
			} else {
				if (tempMax > max) {
					max = tempMax;
				}
				tempMax = 1;
				maxPreviousElement = heights[i];
			}

			if (minPreviousElement == heights[i]) {
				tempMin++;
			} else {
				if (tempMin < min) {
					min = tempMin;
				}
				tempMin = 1;
				minPreviousElement = heights[i];
			}
		}
		if (tempMax > max)
			max = tempMax;

		if (tempMin < min)
			min = tempMin;

		if(max > min)
			return max - min;
		else 
			return -1;

	}

}
