package baekjoon;

import java.util.Scanner;

public class P5543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			int num = sc.nextInt();
			min = Math.min(num, min);
		}
		result += min;
		min = Integer.MAX_VALUE;
		for (int i = 0; i < 2; i++) {
			int num = sc.nextInt();
			min = Math.min(num, min);
		}
		result += min;
		System.out.println(result - 50);

	}

}
