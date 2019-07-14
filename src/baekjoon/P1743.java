package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1743 {
	public static int[][] graph;
	public final static int[] dx = { 0, 0, 1, -1 };
	public final static int[] dy = { 1, -1, 0, 0 };

	static public int DFS(int i, int j) {
		Queue<Integer> qx = new LinkedList<>();
		Queue<Integer> qy = new LinkedList<>();

		graph[i][j]=0;
		qx.add(i);
		qy.add(j);
		int count = 0;

		while (!qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();
			count++;
			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				if (nx < 0 || nx >= graph.length || ny < 0 || ny >= graph[0].length) {
					continue;
				} else {
					if (graph[nx][ny] == 1) {
						qx.add(nx);
						qy.add(ny);
						graph[nx][ny] = 0;
					}
				}
			}

		}

		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());

		graph = new int[N + 1][M + 1];

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a][b] = 1;
		}
		
		int max = -1;
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < M + 1; j++) {
				if (graph[i][j] == 1) {
					int count = DFS(i, j);
					if (count > max)
						max = count;
				}
			}
		}
		System.out.println(max);
	}

}
