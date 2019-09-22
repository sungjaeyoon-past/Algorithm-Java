package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P3184 {
	/*
	 * 6 6 ...#.. .##v#. #v.#.# #.o#.# .###.# ...###
	 */
	final static int dx[] = { 1, -1, 0, 0 };
	final static int dy[] = { 0, 0, 1, -1 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());

		int[][] graph = new int[X][Y];

		// . -> 0 # -> -1 v -> 1 o->2
		for (int i = 0; i < X; i++) {
			String in[] = br.readLine().split("");
			for (int j = 0; j < Y; j++) {
				if (in[j].equals(".")) {
					graph[i][j] = 0;
				} else if (in[j].equals("#")) {
					graph[i][j] = -1;
				} else if (in[j].equals("v")) {
					graph[i][j] = 1;
				} else if (in[j].equals("o")) {
					graph[i][j] = 2;
				}
			}
		}

		int v = 0;
		int o = 0;

		for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {
				if (graph[i][j] != -1) {

					Queue<Integer> qx = new LinkedList<>();
					Queue<Integer> qy = new LinkedList<>();
					qx.add(i);
					qy.add(j);
					int vc = 0;
					int oc = 0;
					if (graph[i][j] == 1) {
						vc++;
					}
					if (graph[i][j] == 2) {
						oc++;
					}
					graph[i][j] = -1;

					while (!qx.isEmpty()) {
						int x = qx.poll();
						int y = qy.poll();
						for (int k = 0; k < 4; k++) {
							int nx = x + dx[k];
							int ny = y + dy[k];
							if (!(nx < 0 || ny < 0 || nx >= X || ny >= Y)) {
								if (graph[nx][ny] != -1) {
									qx.add(nx);
									qy.add(ny);
									if (graph[nx][ny] == 1) {
										vc++;
									}
									if (graph[nx][ny] == 2) {
										oc++;
									}
									graph[nx][ny] = -1;
								}
							}
						}

					}
					if (oc > vc) {
						o += oc;
						// v += vc;
					} else {
						v += vc;
					}
				}
			}
		}
		System.out.println(o + " " + v);
	}

}
