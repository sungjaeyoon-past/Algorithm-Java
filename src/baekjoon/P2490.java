package baekjoon;

import java.util.Scanner;

public class P2490 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			int count = 0;
			for (int j = 0; j < 4; j++) {
				if (sc.nextInt() == 1) {
					count++;
				}
			}
			switch (count) {
			case 3:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 1:
				System.out.println("C");
				break;
			case 0:
				System.out.println("D");
				break;
			default:
				System.out.println("E");
				break;
			}

		}
	}

}
