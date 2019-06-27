package SamsungSW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class Elice3 {
	public static int maxLengthBFS(int[][] graph, int i, int j) {
		final int[] dx = { 1, -1, 0, 0 };
		final int[] dy = { 0, 0, 1, -1 };
		LinkedList<Integer> qx = new LinkedList<Integer>();
		LinkedList<Integer> qy = new LinkedList<Integer>();
		LinkedList<String> qxy = new LinkedList<String>();
		LinkedList<Integer> cost = new LinkedList<Integer>();
		
		qx.add(i);
		qy.add(j);
		qxy.add(String.format("%d,%d",i,j));
		cost.add(1);

		int max = 0;
		while (!qx.isEmpty()) {
			int x = qx.pollLast();
			int y = qy.pollLast();
			String xy=qxy.pollLast();
			int co = cost.pollLast();
			if (co > max)
				max = co;
			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				if (nx < 0 || nx >= graph.length || ny < 0 || ny >= graph.length) {
					continue;
				} else {
					if (graph[nx][ny] > graph[x][y]) {
						int alAdd=qxy.indexOf(String.format("%d,%d",nx,ny));
						if(alAdd!=-1) {
							qx.remove(alAdd);
							qy.remove(alAdd);
							qxy.remove(alAdd);
							cost.remove(alAdd);
						}
						qx.add(nx);
						qy.add(ny);
						qxy.add(String.format("%d,%d",nx,ny));
						cost.add(co + 1);
					}
				}
			}
		}

		// System.out.println(String.format("%d %d -> %d",i,j,max));
		return max;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int TEST_CASE = Integer.parseInt(br.readLine());
		for (int start = 1; start <= TEST_CASE; start++) {
			long startTime = System.currentTimeMillis();

			int N = Integer.parseInt(br.readLine());
			PriorityQueue ar = new PriorityQueue();
			int[][] graph = new int[N][N];

			for (int i = 0; i < N; i++) {
				String[] input = br.readLine().split(" ");
				for (int j = 0; j < N; j++) {
					graph[i][j] = Integer.parseInt(input[j]);
				}
			}

			int max = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int num = maxLengthBFS(graph, i, j);
					if (num > max)
						max = num;
				}
			}
			long endTime = System.currentTimeMillis();

			bw.write(String.format("#%d %d\n", start, max));
			bw.write( "실행 시간 : " + ( endTime - start )/1000.0 );

		}
		bw.flush();
	}

}
