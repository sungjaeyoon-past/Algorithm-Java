package baekjoon;

import java.util.Scanner;

public class P5565 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		for (int i = 0; i < 9; i++) {
			total -= sc.nextInt();
		}
		System.out.println(total);

	}

}
