package worldhello;

import java.util.Scanner;

public class BOJ_9095 {

	public static int[] arr = new int[100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n;
		int test;
		test = scan.nextInt();
		

		for (int i = 0; i < test; i++) {
			n = scan.nextInt();
			System.out.println(howTosum(n));
		}
	}

	public static int howTosum(int n) {
		if (n <= 2)
			return n;
		if (n == 3)
			return 4;
		arr[n] = howTosum(n - 1) + howTosum(n - 2) + howTosum(n - 3);

		return arr[n];

	}
}
//피보나치수열
