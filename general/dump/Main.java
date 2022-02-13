package selfstudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(5);
		a.add(10);
		a.add(2);
		a.add(1);/*
		a.add(46);
		a.add(58);
		a.add(54);
		a.add(74);*/
		/*a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);*/

		ArrayList<Integer> B = performOps(a);
		for (int i = 0; i < B.size(); i++) {
		        System.out.print(B.get(i) + " ");
		}


	}


private static ArrayList<Integer> performOps(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
                B.set(i, A.get(i));
                B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
}



}