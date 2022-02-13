/**
 * Watson gives a date to Sherlock and asks him what is the date on the previous day. Help Sherlock. 
 * You are given date in DD MM YYYY format. DD is an integer without leading zeroes. MM is one of the "January", "
 * February", "March", "April", "May", "June", "July", "August", "September", "October", "November" and "December" 
 * (all quotes for clarity). YYYY is also an integer between 1600 and 2000 without leading zeroes. 
 * You have to print the date of the previous day in same format.

Input and Output
First line, T (≤ 100), the number of testcases. Each testcase consists of date in specified format. For each testcase, print the required answer in one line. Given date will be a valid date.
SAMPLE INPUT

3
23 July 1914
2 August 2000
5 November 1999

SAMPLE OUTPUT

22 July 1914
1 August 2000
4 November 1999


 */
package general.dump;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author utkarsh
 *
 */
public class SherlockAndDate {

	private static Map<String, String> priorMonthMap;
	private static Map<String, Integer> daysInMonthMap;

	static {
		priorMonthMap = new HashMap<>();
		priorMonthMap.put("January", "December");
		priorMonthMap.put("February", "January");
		priorMonthMap.put("March", "February");
		priorMonthMap.put("April", "March");
		priorMonthMap.put("May", "April");
		priorMonthMap.put("June", "May");
		priorMonthMap.put("July", "June");
		priorMonthMap.put("August", "July");
		priorMonthMap.put("September", "August");
		priorMonthMap.put("October", "September");
		priorMonthMap.put("November", "October");
		priorMonthMap.put("December", "November");
	}

	static {
		daysInMonthMap = new HashMap<>();
		daysInMonthMap.put("January", 31);
		daysInMonthMap.put("February", 29);
		daysInMonthMap.put("March", 31);
		daysInMonthMap.put("April", 30);
		daysInMonthMap.put("May", 31);
		daysInMonthMap.put("June", 30);
		daysInMonthMap.put("July", 31);
		daysInMonthMap.put("August", 31);
		daysInMonthMap.put("September", 30);
		daysInMonthMap.put("October", 31);
		daysInMonthMap.put("November", 30);
		daysInMonthMap.put("December", 31);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			String[] query = br.readLine().split(" ");
			int D = Integer.parseInt(query[0]);
			String M = query[1];
			int Y = Integer.parseInt(query[2]);
			
			if(D == 1){
				String priorMonth = priorMonthMap.get(M);
				if(priorMonth.equals("February")){
					if(isLeapYear(Y)){
						System.out.println(29 + " " + priorMonth + " " + Y);
					}else{
						System.out.println(28 + " " + priorMonth + " " + Y);
					}
				}else{
					int days = daysInMonthMap.get(priorMonth);
					if(M.equals("January")){
						System.out.println(days + " " + priorMonth + " " + (Y - 1));
					}else{
						System.out.println(days + " " + priorMonth + " " + Y);
					}
					
				}
				
				
			}else{
				System.out.println(D - 1 + " " + M + " " + Y);
			}
			
			
			
		}
	}

	public static boolean isLeapYear(int year) {
		boolean leap = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;

		return leap;
	}

}
