package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2468 {
	public static int DFS(int[][] originGraph, int WATER_LENGTH) {
		final int[] dx = { 1, -1, 0, 0 };
		final int[] dy = { 0, 0, 1, -1 };
		int[][] graph = new int[originGraph.length][originGraph.length];
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph.length; j++) {
				if (originGraph[i][j] > WATER_LENGTH) {
					graph[i][j] = 1;
				} else {
					graph[i][j] = 0;// 잠
				}
			}
		}
		int count = 0;
		/* 1들인것들count */
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph.length; j++) {
				if (graph[i][j] == 1) {
					count++;
					/* 영역 0으로 */
					Queue<Integer> qx = new LinkedList<Integer>();
					Queue<Integer> qy = new LinkedList<Integer>();
					qx.offer(i);
					qy.offer(j);
					while (!qx.isEmpty()) {
						int x = qx.poll();
						int y = qy.poll();
						graph[x][y] = 0;
						for (int k = 0; k < 4; k++) {
							int nx = x + dx[k];
							int ny = y + dy[k];
							if (nx < 0 || nx >= graph.length || ny < 0 || ny >= graph.length) {
								continue;
							} else {
								if (graph[nx][ny] == 1) {
									qx.offer(nx);
									qy.offer(ny);
									graph[nx][ny] = 0;
								}
							}
						}
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		int[][] graph = new int[N][N];
		int max = -1;
		int min = 101;
		for (int i = 0; i < N; i++) {
			String[] input = sc.nextLine().split(" ");
			for (int j = 0; j < N; j++) {
				int num = Integer.parseInt(input[j]);
				graph[i][j] = num;
				if (num > max)
					max = num;
				if (num < min)
					min = num;
			}
		}

		int result = 1;
		for (int i = min; i < max; i++) {
			int count = DFS(graph, i);
			if (count > result)
				result = count;
		}
		System.out.println(result);
	}

}
