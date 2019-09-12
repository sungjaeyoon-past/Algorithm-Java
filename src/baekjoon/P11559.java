package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P11559 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[][] graph = new int[12][6];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 12; i++) {
			String[] in = br.readLine().split("");
			for (int j = 0; j < 6; j++) {
				switch (in[j]) {
				case ".":
					graph[i][j] = 0;
					break;
				case "R":
					graph[i][j] = 1;
					break;
				case "G":
					graph[i][j] = 2;
					break;
				case "B":
					graph[i][j] = 3;
					break;
				case "P":
					graph[i][j] = 4;
					break;
				case "Y":
					graph[i][j] = 5;
					break;
				default:
					break;
				}
			}
		}

		final int dx[] = { 0, 0, 1, -1 };
		final int dy[] = { 1, -1, 0, 0 };
		int count = 0;

		while (true) {
			boolean pung = false;
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 6; j++) {
					// dfs 돌림
					if (graph[i][j] != 0) {
						int num = graph[i][j];
						Queue<Integer> qx = new LinkedList<Integer>();
						Queue<Integer> qy = new LinkedList<Integer>();
						Queue<Integer> qex = new LinkedList<Integer>();
						Queue<Integer> qey = new LinkedList<Integer>();
						boolean[][] visited = new boolean[12][6];
						visited[i][j] = true;
						qx.add(i);
						qy.add(j);
						qex.add(i);
						qey.add(j);
						while (!qx.isEmpty()) {
							int x = qx.poll();
							int y = qy.poll();
							for (int k = 0; k < 4; k++) {
								int nx = x + dx[k];
								int ny = y + dy[k];
								if (nx < 0 || nx >= 12 || ny < 0 || ny >= 6) {
									continue;
								} else {
									if (!visited[nx][ny] && graph[nx][ny] == num) {
										visited[nx][ny] = true;
										qx.add(nx);
										qy.add(ny);
										qex.add(nx);
										qey.add(ny);
									}
								}
							}
						}

						if (qex.size() >= 4) {
							while (!qex.isEmpty()) {
								graph[qex.poll()][qey.poll()] = 0;
							}
							pung = true;
						}
					}

				}
			}

			// 아래로 당김
			for (int i = 0; i < 6; i++) {
				// graph[][i]
				Queue<Integer> l = new LinkedList<>();
				for (int j = 11; j >= 0; j--) {
					if (graph[j][i] != 0) {
						l.add(graph[j][i]);
					}

				}
				int temp = 11;
				while (!l.isEmpty()) {
					int num = l.poll();
					graph[temp--][i] = num;
				}
				for (int j = temp; j >= 0; j--) {
					graph[j][i] = 0;
				}
			}

			if (!pung) {// 분쇄가 일어나지 않았으면 종료
				break;
			} else {
				count++;
			}

		}

		System.out.println(count);
	}

}
