package SamsungSW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Elice3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		final int[] dx = { 1, -1, 0, 0 };
		final int[] dy = { 0, 0, 1, -1 };
		final int IFN = 1000000001;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int TEST_CASE = Integer.parseInt(br.readLine());
		for (int start = 1; start <= TEST_CASE; start++) {

			int N = Integer.parseInt(br.readLine());
			int[][] graph = new int[N][N];
			int[][] floyd = new int[N * N][N * N];

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					graph[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			for (int i = 0; i < floyd.length; i++) {
				Arrays.fill(floyd[i], IFN);
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					for (int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
							continue;
						} else {
							if (graph[i][j] < graph[nx][ny]) {
								if (floyd[i * N + j][nx * N + ny] == IFN) {
									floyd[i * N + j][nx * N + ny] = 1;
								} else {
									floyd[i * N + j][nx * N + ny]++;
								}
							}
						}
					}
				}
			}
			for (int i = 0; i < N * N; i++) {
				floyd[i][i] = 0;
			}

			for (int k = 0; k < N * N; k++) {
				for (int i = 0; i < N * N; i++) {
					for (int j = 0; j < N * N; j++) {
						if (floyd[i][k] != IFN && floyd[k][j] != IFN && floyd[i][j] != IFN) {
							if (floyd[i][k] + floyd[k][j] > floyd[i][j]) {
								floyd[i][j] = floyd[i][k] + floyd[k][j];
							}
						} else {
							if (floyd[i][k] + floyd[k][j] < floyd[i][j]) {
								floyd[i][j] = floyd[i][k] + floyd[k][j];
							}
						}
					}
				}
			}
			int max = -1;
			for (int[] a : floyd) {
				for (int b : a) {
					if (b != IFN) {
						if (b > max)
							max = b;
					}
				}
			}
			bw.write(String.format("#%d %d\n",TEST_CASE,max + 1));
		}
		bw.flush();
	}

}
