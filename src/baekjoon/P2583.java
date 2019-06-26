package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2583 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		final int[] dx = { 0, 0, 1, -1 };
		final int[] dy = { 1, -1, 0, 0 };

		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[][] graph = new int[M][N];
		boolean[][] visited = new boolean[M][N];
		ArrayList<Integer> sizes = new ArrayList<>();

		for (int i = 0; i < K; i++) {
			String[] input = br.readLine().split(" ");
			int leftY = Integer.parseInt(input[0]);
			int leftX = M - Integer.parseInt(input[1]) - 1;
			int rightY = Integer.parseInt(input[2]) - 1;
			int rightX = M - Integer.parseInt(input[3]);
			for (int k = rightX; k <= leftX; k++) {
				for (int j = leftY; j <= rightY; j++) {
					graph[k][j] = 1;
				}
			}

		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (graph[i][j] == 0) {
					Queue<Integer> qx = new LinkedList<Integer>();
					Queue<Integer> qy = new LinkedList<Integer>();
					int size = 1;
					qx.offer(i);
					qy.offer(j);
					visited[i][j] = true;
					graph[i][j] = 1;
					while (!qx.isEmpty()) {
						int x = qx.poll();
						int y = qy.poll();
						for (int k = 0; k < 4; k++) {
							int nx = x + dx[k];
							int ny = y + dy[k];
							if (nx < 0 || nx >= M || ny < 0 || ny >= N) {
								continue;
							} else {
								if (!visited[nx][ny] && graph[nx][ny] == 0) {
									qx.add(nx);
									qy.add(ny);
									visited[nx][ny] = true;
									graph[nx][ny] = 1;
									size++;
								}
							}
						}
					}
					sizes.add(size);
				}
			}
		}
		System.out.println(sizes.size());
		Collections.sort(sizes);
		String a = "";
		for (Integer b : sizes) {
			a += b + " ";
		}
		System.out.println(a.substring(0, a.length() - 1));

	}

}
