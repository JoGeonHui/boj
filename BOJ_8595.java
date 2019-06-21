package worldhello;

import java.util.Scanner;

public class BOJ_8595 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		int n = scan.nextInt();
		String word = scan2.nextLine();

		char hidden;
		int number = 0;
		int result =0;
		for (int i = 0; i < word.length(); i++) {
			hidden = word.charAt(i);
			if(hidden >=65 && hidden <=122) {
				result += number;
				number = 0;
			}
			else {
				number = 10*number + (hidden - '0');
			}
		}
		if(number !=0)
			result += number;
		System.out.println(result);
	}

}
