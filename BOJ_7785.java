package worldhello;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_7785 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		n = n*2;
		String name;

		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			name = scan.next();
			arr[i] = name;
		}
	
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i < n; i += 2) {
			if (arr[i].equals("enter")) 
				list.add(arr[i-1]);
		}
		for (int i = 1; i < n; i += 2) {
			// System.out.println(arr[i]);
			if (arr[i].equals("leave")) { 
				list.remove(arr[i-1]);
			}
		}

		System.out.println(list.toString());
	}
}
