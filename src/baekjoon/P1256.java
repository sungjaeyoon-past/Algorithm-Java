package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1256 {

	static void print(String cur, int N, int M) {
		String a = "a";
		String z = "z";
		if (N == 0 || M == 0) {
			System.out.println(cur);
			return;
		} else {
			if (N == 0 && M > 0) {
				print(z += cur, N, M - 1);

			} else if (N > 0 && M == 0) {
				print(a += cur, N - 1, M);

			} else {
				print(a += cur, N - 1, M);
				print(z += cur, N, M - 1);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		print("", N, M);

	}

}
