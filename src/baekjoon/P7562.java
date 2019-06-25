package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7562 {

	public static void main(String[] args) throws IOException {
		final int[] dx = { -2, -1, 1, 2, 2, 1, -1, -2 };
		final int[] dy = { 1, 2, 2, 1, -1, -2, -2, -1 };

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		/* input */

		st = new StringTokenizer(br.readLine());
		int TEST_CASE = Integer.parseInt(st.nextToken());
		
		for (int k = 0; k < TEST_CASE; k++) {

			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			int startX = Integer.parseInt(st.nextToken());
			int startY = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			int endX = Integer.parseInt(st.nextToken());
			int endY = Integer.parseInt(st.nextToken());

			Queue<Integer> qx = new LinkedList<Integer>();
			Queue<Integer> qy = new LinkedList<Integer>();
			Queue<Integer> length = new LinkedList<Integer>();
			int [][]graph=new int[N][N];

			qx.offer(startX);
			qy.offer(startY);
			length.add(0);
			graph[startX][startY]=1;
			

			while (!qx.isEmpty()) {

				int x = qx.poll();
				int y = qy.poll();
				int l = length.poll();

				if (x == endX && y == endY) {
					bw.write(l+"\n");
					break;
				}
				for (int i = 0; i < 8; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
						continue;
					} else {
						if (graph[nx][ny]!=1) {
							qx.add(nx);
							qy.add(ny);
							length.add(l + 1);
							graph[nx][ny]=1;
						}
					}

				}

			}
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
