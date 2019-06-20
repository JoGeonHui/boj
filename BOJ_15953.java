package worldhello;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_15953 {
	public static void main(String[] args) {

		int T;
		int a = 0;
		int b = 0;

		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i < T; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			list.add(a);
			list2.add(b);
		}

		ArrayList<Integer> list3 = new ArrayList<Integer>();

		for (int count = 0; count < list.size(); count++) {
			if (list.get(count) == 1)
				list3.add(500);
			else if (list.get(count) > 1 && list.get(count) <= 3)
				list3.add(300);
			else if (list.get(count) > 3 && list.get(count) <= 6)
				list3.add(200);
			else if (list.get(count) > 6 && list.get(count) <= 10)
				list3.add(50);
			else if (list.get(count) > 10 && list.get(count) <= 15)
				list3.add(30);
			else if (list.get(count) > 15 && list.get(count) <= 21)
				list3.add(10);
		}
		for (int count = 0; count < list2.size(); count++) {
			if (list2.get(count) == 1)
				list3.add(512);
			else if (list2.get(count) > 1 && list2.get(count) <= 3)
				list3.add(256);
			else if (list2.get(count) > 3 && list2.get(count) <= 7)
				list3.add(128);
			else if (list2.get(count) > 7 && list2.get(count) <= 15)
				list3.add(64);
			else if (list2.get(count) > 15 && list2.get(count) <= 31)
				list3.add(32);
		}

		ArrayList<Integer> list4 = new ArrayList<Integer>();
		
		for (int count = 0; count < list3.size()/2; count++) {
				int result = list3.get(count) + list3.get(T+count);
				list4.add(result);

		}
		for(int i=0;i<list4.size();i++)
			System.out.println(list4.get(i)*10000);
	}

}
