/**
 * 
 */
package hacker_earth.practice.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author cHeRRy
 *
 */
public class CountingTriangles {

	/**
	 * @param args
	 */

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 65536);

		int triangles = Integer.parseInt(br.readLine());
		Map<Triangle,Integer> map = new HashMap<>();
		for (int q = 0; q < triangles; q++) {
			String[] line = br.readLine().split(" ");
			long number1 = Long.parseLong(line[0]);
			long number2 = Long.parseLong(line[1]);
			long number3 = Long.parseLong(line[2]);

			if (number1 > number2) {
				long temp = number1;
				number1 = number2;
				number2 = temp;
			}

			if (number2 > number3) {
				long temp = number2;
				number2 = number3;
				number3 = temp;
			}

			if (number1 > number2) {
				long temp = number1;
				number1 = number2;
				number2 = temp;
			}

			Triangle temp = new Triangle(number1, number2, number3);
			if(map.containsKey(temp))
				map.put(temp, map.get(temp)+1);
			else
				map.put(temp,0);
		}
		int count = 0;
		Set<Triangle> set = map.keySet();
		for(Triangle each : set){
			if(map.get(each) == 0) count++;
		}
		System.out.println(count);
	}

}

class Triangle {

	long a;
	long b;
	long c;

	Triangle(long a, long b, long c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public boolean equals(Object obj) {
		Triangle o = (Triangle) obj;
		if (this.a == o.a && this.b == o.b && this.c == o.c)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		long val = a * b * c;
		return (int) (val % 1000000007);
	}

}
