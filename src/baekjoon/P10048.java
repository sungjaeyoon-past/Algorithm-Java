package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10048 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] graph = new int[N][M];
		int[][] DP = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		DP[0][0] = graph[0][0];
		for (int i = 1; i < N; i++) {
			DP[i][0] = DP[i - 1][0] + graph[i][0];
		}
		for (int i = 1; i < M; i++) {
			DP[0][i] = DP[0][i - 1] + graph[0][i];
		}

		for (int i = 1; i < N; i++) {
			for (int j = 1; j < M; j++) {
				DP[i][j] = Math.max(DP[i - 1][j], DP[i][j - 1]) + graph[i][j];
			}
		}

		System.out.println(DP[N - 1][M - 1]);

	}

}
