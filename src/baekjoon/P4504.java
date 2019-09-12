package baekjoon;

import java.util.Scanner;

public class P4504 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (true) {
			int num = sc.nextInt();
			if (num == 0)
				break;
			if (num % N == 0) {
				System.out.println(String.format("%d is a multiple of %d.", num, N));
			} else {
				System.out.println(String.format("%d is NOT a multiple of %d.", num, N));
			}
		}
	}

}
