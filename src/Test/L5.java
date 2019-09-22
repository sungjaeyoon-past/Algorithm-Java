package Test;

import java.util.Scanner;

public class L5 {
	public final static int dx[] = { 1, -1, 0, 0 };
	public final static int dy[] = { 0, 0, 1, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int X = sc.nextInt();
		int Y = sc.nextInt();

		if (X < 0 || Y < 0 || X >= N || Y >= M) {
			System.out.println("fail");
			return;
		}

		long[][] DP = new long[N][M];

		for (int i = 0; i < N; i++) {
			DP[0][i] = 1;
		}
		for (int i = 0; i < M; i++) {
			DP[i][0] = 1;
		}
		for (int i = 1; i < N; i++) {
			for (int j = 1; j < M; j++) {
				DP[i][j] = DP[i - 1][j] + DP[i][j - 1];
			}
		}

		for (long a[] : DP) {
			for (long b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

		System.out.println(X + Y);
		System.out.println(DP[X][Y]);

	}
}
