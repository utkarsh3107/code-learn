package hacker_earth.practice.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PrateekAndTheQueries2 {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader(new File("file1.txt")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("file2.txt")), 65536);

		int N = Integer.parseInt(br.readLine());
		String[] ai = br.readLine().split(" ");

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (String a : ai) {
			int val = Integer.parseInt(a);
			if (map.containsKey(val))
				map.put(val, map.get(val) + 1);
			else
				map.put(val, 1);
		}

		int cases = Integer.parseInt(br.readLine());
		List<Integer> list = convertMapToList(map);

		for (int i = 0; i < cases; i++) {
			String[] pi = br.readLine().split(" ");
			int L = Integer.parseInt(pi[0]);
			int R = Integer.parseInt(pi[1]);
			int count = 0;
			int Li = binarySearchCeiling(list, 0, list.size() - 1, L);
			int Ri = binarySearchFloor(list, R, 0, list.size() - 1);
			if(L > list.get(Li)){
				bw.write(0+"\n");
				continue;
			}
				
			for (int j = Li; j <= Ri; j++) {
				if (map.containsKey(list.get(j)))
					count += map.get(list.get(j));
			}
			bw.write(count+"\n");
		}

		bw.close();
		br.close();
	}

	private static int binarySearchCeiling(List<Integer> arr, int m, int n, int target) {
		if (m == n)
			return m;

		if ((n - m) == 1)
			return arr.get(m) >= target ? m : n;

		int mid = (m + n) / 2;

		if (arr.get(mid) == target)
			return mid;

		if (arr.get(mid) > target)
			return binarySearchCeiling(arr, m, mid, target);
		else
			return binarySearchCeiling(arr, mid, n, target);
	}

	private static int binarySearchFloor(List<Integer> A, int target, int m, int n) {
		if (m >= n)
			return n;

		if ((n - m) == 1)
			return A.get(n) <= target ? n : m;

		int mid = (m + n) / 2;

		if (A.get(mid) == target)
			return mid;
		else if (A.get(mid) > target)
			return binarySearchFloor(A, target, m, mid - 1);
		else
			return binarySearchFloor(A, target, mid, n);
	}

	private static List<Integer> convertMapToList(Map<Integer, Integer> map) {
		List<Integer> list = new ArrayList<>();
		for (Integer key : map.keySet()) {
			list.add(key);
		}
		return list;
	}

	private static int[] convertMapToArray(Map<Integer, Integer> map) {
		int[] arr = new int[map.size()];
		int count = 0;
		for (Integer key : map.keySet()) {
			arr[count] = key;
			count++;
		}
		return arr;
	}

}
