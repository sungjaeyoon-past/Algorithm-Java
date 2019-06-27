package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7576 {
	public static boolean finish(int[][] graph) {
		for (int[] a : graph) {
			for (int b : a) {
				if (b == 0) {
					return false;
				}
			}
		}
		/* no 0 */
		return true;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int[][] graph = new int[N][M];
		boolean[][] visited = new boolean[N][M];

		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				int num = Integer.parseInt(input[j]);
				graph[i][j] = num;
				if (num == 1) {
					qx.offer(i);
					qy.offer(j);
					visited[i][j] = true;
				}
			}
		}
		
		Queue<Integer> executeQx = new LinkedList<Integer>();
		Queue<Integer> executeQy = new LinkedList<Integer>();
		final int[] dx = { 1, -1, 0, 0 };
		final int[] dy = { 0, 0, 1, -1 };

		int time = 0;
		while (!qx.isEmpty()) {
			if (finish(graph))
				break;
			while(!qx.isEmpty()) {
			executeQx.offer(qx.poll());
			executeQy.offer(qy.poll());
			}
			while (!executeQx.isEmpty()) {
				int x = executeQx.poll();
				int y = executeQy.poll();
				for (int i = 0; i < 4; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
						continue;
					} else {
						if (!visited[nx][ny] && graph[nx][ny]==0) {
							qx.offer(nx);
							qy.offer(ny);
							graph[nx][ny]=1;
							visited[nx][ny] = true;
						}
					}
				}

			}
			time++;
			/*보여지기위한용*/
			System.out.println("------------------------------");
			for(int []a:graph) {
				for(int b:a) {
					System.out.print(b+" ");
				}
				System.out.println();
			}
			System.out.println(time);
			System.out.println("------------------------------");
		}
		if (finish(graph)) {
			System.out.println(time);
		} else {
			System.out.println(-1);
		}
	}

}
