package baekjoon;

import java.util.Scanner;

public class P11058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		long[] DP;
		if (N < 7) {
			DP = new long[7];
		} else {
			DP = new long[N + 1];
		}

		for (int i = 1; i <= N; i++) {
			if (i <= 6) {
				DP[i] = i;
			} else {
				for (int j = 3; j <= i - 3; j++) {
					DP[i] = Math.max(DP[i], DP[i - j] * (j - 1));
				}
			}
		}
		System.out.println(DP[N]);
	}

}
