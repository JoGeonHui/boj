package worldhello;

import java.util.Scanner;

public class BOJ_1174 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		long result=0;
		if(n> 10) {
			System.out.println(-1);
			return;
		}
		long count =1;
		for(int i=0;i<n;i++) {
			if(n==1) {
				System.out.println(0);
				break;
			}
			result += i*count;
			count = count*10;
			
		}
		
		System.out.println(result);
	}

}
