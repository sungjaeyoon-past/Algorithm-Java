package baekjoon;

import java.util.Scanner;

public class P1057 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int round = 1;

		int all = sc.nextInt();
		int kim = sc.nextInt();
		int han = sc.nextInt();

		while (true) {
			int a = kim;
			int b = han;

			if (a % 2 == 0) {
				a /= 2;
			} else {
				a /= 2;
				a++;
			}
			if (b % 2 == 0) {
				b /= 2;
			} else {
				b /= 2;
				b++;
			}

			if (a == b) {
				break;
			}
			round++;
			if (kim % 2 == 0) {
				kim /= 2;
			} else {
				kim /= 2;
				kim++;
			}

			if (han % 2 == 0) {
				han /= 2;
			} else {
				han /= 2;
				han++;
			}
		}
		System.out.println(round);

	}

}
