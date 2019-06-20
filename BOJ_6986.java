package worldhello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_6986 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();

		ArrayList<Double> list = new ArrayList<Double>();

		for (int i = 0; i < n; i++) {
			list.add(scan.nextDouble());
		}
		Collections.sort(list);
		
		ArrayList<Double> copy = new ArrayList<Double>();
		ArrayList<Double> copy2 = new ArrayList<Double>();
		copy.addAll(list);
		copy2.addAll(list);
		
		trimm_mean(copy, n, k);
		correction_mean(copy2, n, k);

	}

	public static void trimm_mean(ArrayList<Double> list, int n, int k) {

		for (int i = 0; i < k; i++) {
			list.remove(0);
			int r = list.size() - 1;
			list.remove(r);
		}
		double sum = 0.0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}
		System.out.println(String.format("%.2f", sum/list.size()));
	}
	public static void correction_mean(ArrayList<Double> list, int n, int k) {
		for (int i = 0; i < k; i++) {
			list.remove(0);
			int r = list.size() - 1;
			list.remove(r);
		}
		
		double temp1 = list.get(0);
		double temp2 = list.get(list.size()-1);
		
		for (int i = 0; i < k; i++) {
			list.add(temp1);
			list.add(temp2);
		}
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}
		System.out.println(String.format("%.2f", sum/list.size()));
	}
}
