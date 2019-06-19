package worldhello;

import java.util.Scanner;

public class BOJ_2579 {
	public static int staris;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		staris = scan.nextInt();
		int[] arr = new int[staris + 1];
		int[] dp = new int[staris + 1];

		for (int i = 1; i <= staris; i++) {
			arr[i] = scan.nextInt();
		}

		dp[1] = arr[1];

		dp[2] = arr[1] + arr[2];

		for (int i = 3; i <= staris; i++) {
			dp[i] = max(dp[i - 2] + arr[i], arr[i - 1] + arr[i] + dp[i - 3]);
		}

		System.out.println(dp[staris]);
	}

	public static int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;

	}
}
