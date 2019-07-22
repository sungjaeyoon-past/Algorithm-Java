package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1236 {
	static boolean isExist(int[] graph) {
		boolean exist = false;
		for (int i = 0; i < graph.length; i++) {
			if (graph[i] == 1) {
				exist = true;
				break;
			}
		}
		return exist;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] graph = new int[N][M];

		for (int i = 0; i < N; i++) {
			String[] in = br.readLine().split("");
			for (int j = 0; j < M; j++) {
				if (in[j].equals(".")) {
					graph[i][j] = 0;
				} else {
					graph[i][j] = 1;
				}
			}
		}

		int NCount = 0;

		for (int i = 0; i < N; i++) {
			if (!isExist(graph[i])) {
				NCount++;
			}
		}

		int MCount = 0;
		for (int i = 0; i < M; i++) {
			boolean exist = false;
			for (int j = 0; j < N; j++) {
				if (graph[j][i] == 1) {
					exist = true;
					break;
				}
			}
			if (!exist) {
				MCount++;
			}
		}

		System.out.println(Math.max(NCount, MCount));
	}

}
