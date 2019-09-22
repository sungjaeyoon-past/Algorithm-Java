package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1405 {
	static public int N;
	static public double result;
	static double[] Portable;
	static boolean visited[][];
	static final int dx[] = { 0, 0, -1, 1 };
	static final int dy[] = { 1, -1, 0, 0 };

	static public void DFS(int x, int y, double port) {
		if (N == 0) {
			result += port;
			return;
		}
		visited[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (!visited[nx][ny]) {
				N -= 1;
				DFS(nx, ny, port * Portable[i]);
				N += 1;
				visited[nx][ny] = false;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		result = 0;
		visited = new boolean[30][30];
		Portable = new double[4];
		for (int i = 0; i < 4; i++) {
			Portable[i] = Double.parseDouble(st.nextToken()) / 100;
		}

		DFS(15, 15, 1);

		System.out.println(result);

	}

}
