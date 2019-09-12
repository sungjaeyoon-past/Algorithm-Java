package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point16198 {
	public int x;
	public int y;

}

public class P16918 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		final int[] dx = { 1, -1, 0, 0 };
		final int[] dy = { 0, 0, 1, -1 };

		st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		String[][] graph = new String[R][];
		int[][] bombTime = new int[R][C];

		for (int i = 0; i < R; i++) {
			String[] in = br.readLine().split("");
			graph[i] = in;
			for (int j = 0; j < in.length; j++) {
				if (in[j].equals("O")) {
					bombTime[i][j] = 2;
				}
			}
		}

		int time = 0;
		while (time < N) {
			if (time == 0) {
//				bw.write(time + "~" + (time + 1) + "\n");
//				for (String[] a : graph) {
//					for (String b : a) {
//						bw.write(b);
//					}
//					bw.write("\n");
//				}
//				bw.flush();
				time++;
				continue;
			}
			// 3
			if (time % 2 != 0) {
				for (int i = 0; i < R; i++) {
					for (int j = 0; j < C; j++) {
						if (graph[i][j].equals(".")) {
							graph[i][j] = "O";
							bombTime[i][j] = 3;
						} else {
							bombTime[i][j]--;
							if (bombTime[i][j] == 0) {
								// 큐 삽입
								qx.add(i);
								qy.add(j);
							} else if (bombTime[i][j] < 0) {
								bombTime[i][j] = 0;
							}
						}
					}
				}
			} else {
				for (int i = 0; i < R; i++) {
					for (int j = 0; j < C; j++) {
						bombTime[i][j]--;
						if (bombTime[i][j] == 0) {
							qx.add(i);
							qy.add(j);
						} else if (bombTime[i][j] < 0) {
							bombTime[i][j] = 0;
						}

					}
				}

			}
			// 4 큐 폭발
			while (!qx.isEmpty()) {
				int x = qx.poll();
				int y = qy.poll();
				graph[x][y] = ".";
				for (int i = 0; i < 4; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					if (nx < 0 || nx >= R || ny < 0 || ny >= C) {
						continue;
					} else {
						graph[nx][ny] = ".";
						bombTime[nx][ny] = 0;
					}
				}

			}
			time++;
		}
		for (String[] a : graph) {
			for (String b : a) {
				bw.write(b);
			}
			bw.write("\n");
		}
		bw.flush();

	}

}
