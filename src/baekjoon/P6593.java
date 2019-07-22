package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P6593 {
	static public final int[] dx = { 0, 0, 1, -1, 0, 0 };
	static public final int[] dy = { 0, 0, 0, 0, 1, -1 };
	static public final int[] dz = { 1, -1, 0, 0, 0, 0 };
	static public int[][][] build;
	static public int L;
	static public int R;
	static public int C;

	static public String BFS(int sz, int sx, int sy, int ez, int ex, int ey) {
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		Queue<Integer> qz = new LinkedList<Integer>();
		Queue<Integer> len = new LinkedList<Integer>();

		qx.add(sx);
		qy.add(sy);
		qz.add(sz);
		len.add(0);
		build[sx][sy][sz] = -1;

		int result = 0;
		boolean able = false;
		while (!qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();
			int z = qz.poll();
			int l = len.poll();
			if (x == ex && y == ey && z == ez) {
				result = l;
				able = true;
				break;
			} else {
				for (int i = 0; i < 6; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					int nz = z + dz[i];
					if (!(nx < 0 || ny < 0 || nz < 0 || nx >= R || ny >= C || nz >= L)) {
						if (build[nz][nx][ny] == 1) {
							qx.add(nx);
							qy.add(ny);
							qz.add(nz);
							len.add(l + 1);
							build[nz][nx][ny] = -1;
						}
					}
				}
			}
		}

		if (able) {
			return String.format("Escaped in %d minute(s).", result);
		} else {
			return "Trapped!";
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		while (true) {

			st = new StringTokenizer(br.readLine());

			L = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			if (L == 0 && R == 0 && C == 0) {
				break;
			}

			int sz = 0, sx = 0, sy = 0;
			int ez = 0, ex = 0, ey = 0;

			// input
			build = new int[L+1][R+1][C+1];
			for (int i = 0; i < L; i++) {
				for (int j = 0; j <= R; j++) {
					if (j == R) {
						br.readLine();
					} else {
						String[] in = br.readLine().split("");
						for (int k = 0; k < C; k++) {
							if (in[k].equals("S")) {
								sz = i;
								sx = j;
								sy = k;
								build[i][j][k] = 1;
							} else if (in[k].equals("#")) {
								build[i][j][k] = -1;
							} else if (in[k].equals(".")) {
								build[i][j][k] = 1;
							}else if (in[k].equals("E")) {
								build[i][j][k] = 1;
								ez = i;
								ex = j;
								ey = k;
							}
						}
					}
				}
			}
//			for(int [][]a:build) {
//				for(int []b:a) {
//					for(int c:b) {
//						System.out.print(c+" ");
//					}
//					System.out.println();
//				}
//				System.out.println();
//			}

			bw.write(BFS(sz, sx, sy, ez, ex, ey) + "\n");
		}
		bw.flush();
	}

}
