package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11404 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int INF = 1000000001;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int graph[][] = new int[N + 1][N + 1];

		for (int i = 1; i < N + 1; i++) {
			Arrays.fill(graph[i], INF);
			graph[i][i] = 0;
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if (graph[a][b] != INF) {
				graph[a][b] = Math.min(graph[a][b], c);
			} else {
				graph[a][b] = c;
			}
		}

		for (int k = 1; k < N + 1; k++) {
			for (int i = 1; i < N + 1; i++) {
				for (int j = 1; j < N + 1; j++) {
					if (graph[i][k] + graph[k][j] < graph[i][j]) {
						graph[i][j] = graph[i][k] + graph[k][j];
					}
				}
			}
		}

		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < N + 1; j++) {
				if (graph[i][j] == INF) {
					System.out.print(0 + " ");
				} else {
					System.out.print(graph[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

}
