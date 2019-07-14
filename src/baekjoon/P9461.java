package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9461 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			long[] DP;
			if (N < 6) {
				DP = new long[6];
			} else {
				DP = new long[N + 1];
			}
			DP[0] = 1;
			DP[1] = 1;
			DP[2] = 1;
			DP[3] = 1;
			DP[4] = 2;
			DP[5] = 2;
			for (int j = 6; j < N + 1; j++) {
				DP[j] = DP[j - 1] + DP[j - 5];
			}
			System.out.println(DP[N]);
		}
	}

}
