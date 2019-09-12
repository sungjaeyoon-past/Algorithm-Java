package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2875 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int count = 0;

		while (N >= 2 && M >= 1) {
			N -= 2;
			M -= 1;
			count++;
		}

		// 여 1 남 1 이거나
		// 여 1 이거나
		// 남 1
		while (K != 0) {
			if (N != 0) {
				N--;
				K--;
			} else if (M != 0) {
				M--;
				K--;
			} else if (N == 0 && M == 0) {
				count--;
				N = 2;
				M = 1;
			}
		}
		System.out.println(count);

	}

}
