package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1965 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[] size = new int[N + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < N + 1; i++) {
			size[i] = Integer.parseInt(st.nextToken());
		}

		int[] DP = new int[N + 1];
		DP[1] = 1;

		for (int i = 2; i < N + 1; i++) {
			int max = 0;
			for (int j = i - 1; j > 0; j--) {
				if (size[i] > size[j]) {
					if (DP[j] > max) {
						max = DP[j];
					}
				}
			}
			DP[i] = max + 1;
		}
		int max = 0;
		for (int a : DP) {
			if (a > max)
				max = a;
		}
		System.out.println(max);

	}

}
