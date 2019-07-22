package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P10026 {
	static final int[] dx = { 1, -1, 0, 0 };
	static final int[] dy = { 0, 0, 1, -1 };

	// do dfs -> all -1
	public static int dfs(int graph[][]) {
		int count = 0;
		int len = graph.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (graph[i][j] != -1) {
					Queue<Integer> qx = new LinkedList<Integer>();
					Queue<Integer> qy = new LinkedList<Integer>();
					int num = graph[i][j];
					qx.add(i);
					qy.add(j);
					graph[i][j] = -1;
					while (!qx.isEmpty()) {
						int x = qx.poll();
						int y = qy.poll();
						for (int k = 0; k < 4; k++) {
							int nx = x + dx[k];
							int ny = y + dy[k];
							if (nx < 0 || nx >= len || ny < 0 || ny >= len) {
								continue;
							} else {
								if (graph[nx][ny] == num) {
									graph[nx][ny] = -1;
									qx.add(nx);
									qy.add(ny);
								}
							}
						}

					}
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int oriGraph[][] = new int[N][N];
		int rbGraph[][] = new int[N][N];

		// R - 0 G - 1 B - 2
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split("");
			for (int j = 0; j < N; j++) {
				if (input[j].equals("R")) {
					oriGraph[i][j] = 0;
					rbGraph[i][j] = 0;
				} else if (input[j].equals("G")) {
					oriGraph[i][j] = 1;
					rbGraph[i][j] = 0;
				} else if (input[j].equals("B")) {
					oriGraph[i][j] = 2;
					rbGraph[i][j] = 2;
				}
			}
		}
		System.out.println(String.format("%d %d", dfs(oriGraph), dfs(rbGraph)));

	}

}
