package baekjoon;

import java.util.Scanner;

public class P1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		// 64 32 16 8 4 2 1
		int count = 0;
		while (num != 0) {
			if (num >= 64) {
				num -= 64;
				count++;
			}
			if (num >= 32) {
				num -= 32;
				count++;
			}
			if (num >= 16) {
				num -= 16;
				count++;
			}
			if (num >= 8) {
				num -= 8;
				count++;
			}
			if (num >= 4) {
				num -= 4;
				count++;
			}
			if (num >= 2) {
				num -= 2;
				count++;
			}
			if (num >= 1) {
				num -= 1;
				count++;
			}
		}
		System.out.println(count);

	}

}
