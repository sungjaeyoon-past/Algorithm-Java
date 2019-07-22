package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14503 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] graph = new int[N][M];

		st = new StringTokenizer(br.readLine());
		int sx = Integer.parseInt(st.nextToken());
		int sy = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int clean = 1;
		int rotate = 0;
		int nx = sx;
		int ny = sy;
		while (true) {
			int mx = nx;
			int my = ny;
			if (rotate == 4) {// 2-c,d
				rotate = 0;
				// 후진
				if (d == 0) {// 위
					mx += 1;
				} else if (d == 1) {// ->
					my -= 1;
				} else if (d == 2) {// 아래
					mx -= 1;
				} else if (d == 3) {// <-
					my += 1;
				}
				if (mx < 0 || mx >= N || my < 0 || my >= M) {
					// 후진 불
					break;
				} else {// 2-d
					if (graph[mx][my] != 1) {// 2-c
						nx = mx;
						ny = my;
					} else {// 2-b
						break;
					}
				}
				// 4번 회전하기
			} else {
				if (d == 0) {// 위
					my -= 1;
				} else if (d == 1) {// ->
					mx -= 1;
				} else if (d == 2) {// 아래
					my += 1;
				} else if (d == 3) {// <-
					mx += 1;
				}

				if (mx < 0 || mx >= N || my < 0 || my >= M) {// 그프 안이라는 전제
					d--;
					if (d < 0)
						d = 3;
					rotate++;
					continue;
				} else {
					if (graph[mx][my] == 0) {// 2-a -> 1
						d--;
						if (d < 0)
							d = 3;
						nx = mx;
						ny = my;
						graph[mx][my] = 2;
						clean++;
						rotate = 0;
						continue;
					} else {// 2-b
						d--;
						if (d < 0)
							d = 3;
						rotate++;
						continue;
					}
				}
			}
		}
		System.out.println(clean);
	}

}
