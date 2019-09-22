package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P6603 {
	static int K;
	static int arr[];
	static StringBuilder sb;
	static int cnt;

	public static void dfs(int v, String str) {
		if (cnt == 6) {
			sb.append(str + "\n");
		} else {
			for (int i = v + 1; i < K; i++) {
				++cnt;
				dfs(i, str + arr[i] + " ");
			}
		}
		--cnt;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		sb = new StringBuilder();

		while (true) {
			st = new StringTokenizer(br.readLine());
			K = Integer.parseInt(st.nextToken());

			if (K == 0)
				break;

			arr = new int[13];

			for (int i = 0; i < K; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < K; i++) {
				cnt = 1;
				dfs(i, arr[i] + " ");
				sb.append("---");
			}

			sb.append("\n");
		}
		System.out.println(sb.toString());

	}

}
