package bacjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P14502 {
	public static int DFS(int[][] originGraph, int a, int b, int c, Integer[] X, Integer[] Y) {
		int[][] graph = new int[originGraph.length][originGraph[0].length];
		for (int i = 0; i < originGraph.length; i++) {
			for (int j = 0; j < originGraph[0].length; j++) {
				graph[i][j] = originGraph[i][j];
			}
		}

		graph[X[a]][Y[a]] = 1;
		graph[X[b]][Y[b]] = 1;
		graph[X[c]][Y[c]] = 1;

		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[0].length; j++) {
				if (graph[i][j] == 2) {
					Queue<Integer> qx = new LinkedList<>();
					Queue<Integer> qy = new LinkedList<>();
					qx.offer(i);
					qy.offer(j);

					while (!qx.isEmpty()) {
						int x = qx.poll();
						int y = qy.poll();
						graph[x][y] = 1;
						if (x > 0) {
							if (graph[x - 1][y] == 0) {
								graph[x - 1][y] = 2;
								qx.offer(x - 1);
								qy.offer(y);
							}
						}
						if (y > 0) {
							if (graph[x][y - 1] == 0) {
								graph[x][y - 1] = 2;
								qx.offer(x);
								qy.offer(y - 1);
							}
						}
						if (x < graph.length - 1) {
							if (graph[x + 1][y] == 0) {
								graph[x + 1][y] = 2;
								qx.offer(x + 1);
								qy.offer(y);
							}
						}
						if (y < graph[0].length - 1) {
							if (graph[x][y + 1] == 0) {
								graph[x][y + 1] = 2;
								qx.offer(x);
								qy.offer(y + 1);
							}
						}

					}

				}
			}
		}

		int count = 0;
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[0].length; j++) {
				if (graph[i][j] == 0)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		int[][] graph = new int[N][M];

		ArrayList<Integer> X_list = new ArrayList<>();
		ArrayList<Integer> Y_list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String[] input2 = sc.nextLine().split(" ");
			for (int j = 0; j < M; j++) {
				graph[i][j] = Integer.parseInt(input2[j]);
				if (graph[i][j] == 0) {
					X_list.add(i);
					Y_list.add(j);
				}
			}
		}

		Integer[] X = X_list.toArray(new Integer[X_list.size()]);
		Integer[] Y = Y_list.toArray(new Integer[Y_list.size()]);

		int max = 0;
		for (int i = 0; i < X.length - 2; i++) {
			for (int j = i + 1; j < X.length - 1; j++) {
				for (int k = j + 1; k < X.length; k++) {
					int result = DFS(graph, i, j, k, X, Y);
					if (result > max)
						max = result;
//					System.out.println(String.format("%d,%d   %d,%d   %d,%d   result: %d", X[i],Y[i],X[j],Y[j],X[k],Y[k],result));
				}
			}
		}

		System.out.println(max);

	}

}
