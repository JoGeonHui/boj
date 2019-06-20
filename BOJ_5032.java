package worldhello;

import java.util.Scanner;

public class BOJ_5032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int e, f, c;
		e = scan.nextInt();// 가지고 있는 빈병
		f = scan.nextInt();// 발견한 빈병
		c = scan.nextInt();// 교환하는데 필요한 갯수

		int b = e+f;

		int result = 0;
		
		while(b>=c) {
			int nym = b/c;
			result += nym;
			b -= nym*c-nym;
		}
		


		System.out.println(result);

	}

}
