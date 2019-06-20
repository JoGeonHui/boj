package worldhello;

import java.util.Scanner;

public class BOJ_13223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String time;
		String time2;

		Scanner scan = new Scanner(System.in);

		time = scan.nextLine();
		time2 = scan.nextLine();

		String arr[] = time.split(":");
		String arr2[] = time2.split(":");

		int[] temp = new int[3];
		for (int i = 0; i < 3; i++) {
			int a = Integer.valueOf(arr[i]);
			int b = Integer.valueOf(arr2[i]);

			if (a - b < 0) {
				temp[i] = b - a;
			} else if (a - b == 0) {
				temp[i] = 0;;
			}
			else if (a - b > 0) {
				if (i == 0) {
					temp[i] = b+24-a;
					continue;
				}
				temp[i - 1] = temp[i - 1] - 1;
				temp[i] = b+60-a;
			} 
		}
		String result[] = new String[temp.length];
		for(int i=0;i<3;i++) {
			if(i==0) {
				if(temp[i] <10) {
					result[i] = "0"+String.valueOf(temp[i]+":");
				}
				else {
					result[i] = String.valueOf(temp[i]+":");
				}
			}
			else if(i==2) {
				if(temp[i]<10) {
					result[i] = "0"+String.valueOf(temp[i]);
				}
				else {
					result[i] = String.valueOf(temp[i]);
				}
			}
			else {
				if(temp[i]<10) {
					result[i] = "0"+String.valueOf(temp[i])+":";
				}
				else {
					result[i] = String.valueOf(temp[i]+":");
				}
			}
		}
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
		}

	}

}
