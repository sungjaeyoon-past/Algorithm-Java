package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P2589 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int dx[] = { 0, 0, 1, -1 };
		final int dy[] = { 1, -1, 0, 0 };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int N = Integer.parseInt(in[0]);
		int M = Integer.parseInt(in[1]);

		int graph[][] = new int[N][M];

		for (int i = 0; i < N; i++) {
			String[] Line = br.readLine().split("");
			for (int j = 0; j < M; j++) {
				if (Line[j].equals("W")) {
					graph[i][j] = 0;
				} else {
					graph[i][j] = 1;
				}
			}
		}

		int max = -1;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (graph[i][j] == 1) {
					// bfs -> find max
					int cur = -1;
					boolean visited[][] = new boolean[N][M];
					Queue<Integer> qx = new LinkedList<>();
					Queue<Integer> qy = new LinkedList<>();
					Queue<Integer> l = new LinkedList<>();
					qx.add(i);
					qy.add(j);
					l.add(0);
					visited[i][j] = true;
					while (!qx.isEmpty()) {
						int x = qx.poll();
						int y = qy.poll();
						int le = l.poll();
						if (le > cur) {
							cur = le;
						}
						for (int k = 0; k < 4; k++) {
							int nx = x + dx[k];
							int ny = y + dy[k];
							if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
								continue;
							} else {
								if (graph[nx][ny] == 1 && visited[nx][ny] == false) {
									visited[nx][ny] = true;
									qx.add(nx);
									qy.add(ny);
									l.add(le + 1);
								}
							}
						}
					}
					if (cur > max) {
						max = cur;
					}
				}
			}
		}

		System.out.println(max);

	}

}
