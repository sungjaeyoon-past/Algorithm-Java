package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7569 {
	static int[][][] graph;
	static int X;
	static int Y;
	static int Z;
	static final int dx[] = { 1, -1, 0, 0, 0, 0 };
	static final int dy[] = { 0, 0, 1, -1, 0, 0 };
	static final int dz[] = { 0, 0, 0, 0, 1, -1 };

	static public boolean alltomato() {
		for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {
				for (int k = 0; k < Z; k++) {
					if(graph[i][j][k]==0) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		Z = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());

		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		Queue<Integer> qz = new LinkedList<Integer>();

		graph = new int[X][Y][Z];
		System.out.println();
		for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < Z; k++) {
					graph[i][j][k] = Integer.parseInt(st.nextToken());
					if (graph[i][j][k] == 1) {
						qx.add(i);
						qy.add(j);
						qz.add(k);
					}
				}
			}
		}
		int time = 1;
		Queue<Integer> qx2 = new LinkedList<Integer>();
		Queue<Integer> qy2 = new LinkedList<Integer>();
		Queue<Integer> qz2 = new LinkedList<Integer>();

		while (!qx.isEmpty()) {

			int x = qx.poll();
			int y = qy.poll();
			int z = qz.poll();

			for (int i = 0; i < 6; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				int nz = z + dz[i];
				if (nx < 0 || ny < 0 || nz < 0 || nx >= X || ny >= Y || nz >= Z) {
					continue;
				} else {
					if (graph[nx][ny][nz] == 0) {
						graph[nx][ny][nz] = 1;
						qx2.add(nx);
						qy2.add(ny);
						qz2.add(nz);
					}
				}
			}

			if (qx.isEmpty()) {
				time++;
				qx = qx2;
				qy = qy2;
				qz = qz2;
				qx2 = new LinkedList<Integer>();
				qy2 = new LinkedList<Integer>();
				qz2 = new LinkedList<Integer>();

				for (int i = 0; i < X; i++) {
					for (int j = 0; j < Y; j++) {
						for (int k = 0; k < Z; k++) {
							System.out.print(graph[i][j][k] + " ");
						}
						System.out.println();
					}
					System.out.println();
				}
			}
		}
		if(alltomato()) {
			System.out.println(time);
		}else {
			System.out.println(-1);
		}

	}

}
