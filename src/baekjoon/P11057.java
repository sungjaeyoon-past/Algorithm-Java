package baekjoon;

import java.util.Scanner;

public class P11057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int[][] DP = new int[N + 1][10];

		for (int i = 0; i < 10; i++) {
			DP[1][i] = 1;
		}
		for (int i = 2; i < N + 1; i++) {
			for (int j = 0; j < 10; j++) {
				DP[i][j] = DP[i - 1][j] % 10007;
				for (int k = 0; k < j; k++) {
					DP[i][j] += (DP[i - 1][k]) % 10007;
				}
			}
		}

		int result = 0;
		for (int a : DP[N]) {
			result += a % 10007;
		}
		System.out.println(result % 10007);
	}

}
