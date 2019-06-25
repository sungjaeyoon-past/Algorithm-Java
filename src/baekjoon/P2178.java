package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2178 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] graph = new int[N][M];
		boolean[][] visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split("");
			for (int j = 0; j < M; j++) {
				graph[i][j] = Integer.parseInt(input[j]);
			}
		}

		Queue<Integer> qx = new LinkedList<>();
		Queue<Integer> qy = new LinkedList<>();
		Queue<Integer> cost = new LinkedList<>();
		final int[] dx = { 1, -1, 0, 0 };
		final int[] dy = { 0, 0, 1, -1 };

		qx.offer(0);
		qy.offer(0);
		cost.offer(1);
		visited[0][0] = true;

		while (!qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();
			int co = cost.poll();
			if (x == N - 1 && y == M - 1) {
				System.out.println(co);
				break;
			}
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
					continue;
				} else {
					if (!visited[nx][ny] && graph[nx][ny] == 1) {
						qx.offer(nx);
						qy.offer(ny);
						cost.add(co + 1);
						visited[nx][ny] = true;
					}
				}
			}

		}

	}

}
