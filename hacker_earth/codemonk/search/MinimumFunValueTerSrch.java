package codemonk.search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MinimumFunValueTerSrch {

	private static DecimalFormat df = new DecimalFormat("#");
			
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			String[] intervals = br.readLine().split(" ");
			System.out.println(ternarySearchVal(Double.parseDouble(intervals[0]), Double.parseDouble(intervals[1])));
		}
	}

	private static String ternarySearchVal(double start, double end) {
		double l = start;
		double r = end;

		for (int i = 0; i < 200; i++) {
			if(l > r)
				break;
			
			double l1 = (l * 2 + r)/3;
			double l2 = (l + 2 * r)/3;
			
			if(func(l1) > func(l2))
				l = l1;
			else
				r = l2;	
		}

		return round(func(l));		
	}
	
	private static String round (double value) {
	    return df.format(value);
	}

	private static double func(double x) {
		return (2 * x * x) - (12 * x) + 7;
	}

}
