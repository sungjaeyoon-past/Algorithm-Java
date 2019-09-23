package baekjoon;

import java.util.Scanner;

public class P10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			if (num < 40) {
				num = 40;
			}
			sum += num;
		}
		System.out.println(sum / 5);
	}

}
