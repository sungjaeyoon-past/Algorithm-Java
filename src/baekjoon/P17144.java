package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P17144 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		final int dx[] = { 0, 0, 1, -1 };
		final int dy[] = { 1, -1, 0, 0 };

		st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());

		boolean up = true;
		int upi = 0;
		int downi = 0;

		int[][] graph = new int[R][C];

		for (int i = 0; i < R; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < C; j++) {
				int num = Integer.parseInt(st.nextToken());
				if (num == -1 && up == true) {
					upi = i;
					up = !up;
				} else if (num == -1 && up == false) {
					downi = i;
				}
				graph[i][j] = num;
			}
		}

		for (int time = 0; time < T; time++) {
			int addGraph[][] = new int[R][C];
			// 확산
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					if (graph[i][j] > 0) {
						// 4방향 확
						int add = graph[i][j] / 5;
						for (int k = 0; k < 4; k++) {
							int nx = i + dx[k];
							int ny = j + dy[k];
							if (nx < 0 || nx >= R || ny < 0 || ny >= C) {
								continue;
							} else {
								if (graph[nx][ny] != -1) {
									addGraph[nx][ny] += add;
									addGraph[i][j] -= add;
								}
							}
						}
					}
				}
			}

			// 현재그래프 +add graph
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					graph[i][j] += addGraph[i][j];
				}
			}
			System.out.println("확산후 ");
			for (int a[] : graph) {
				for (int b : a) {
					System.out.print(b + " ");
				}
				System.out.println();
			}
			System.out.println("확산후 ");

		// 청소 위
			// down
//			if(graph[0][0]!=-1) {
//				int temp=graph[0][0];
//				graph[0][0]=graph[0][1];
//				for(int i=1;i<upi-1;i++) {
//					int temp2=graph[i][0];
//					graph[i][0]=temp;
//					temp=temp2;
//				}
//			}
			
			//<-
			int temp=graph[0][C-1];
//			graph[0][C-1]=graph[1][C-1];
//			for(int i=C-2;i>0;i--) {
//				int temp2 = graph[0][i];
//				graph[0][i]=temp;
//				temp=temp2;
//			}
			
			//위
			temp=graph[upi][C-1];
			graph[upi][C-1]=graph[upi][C-2];
			for(int i=upi-1;i>0;i--) {
				
			}
			
			
			//->
			
			System.out.println("청후 ");
			for (int a[] : graph) {
				for (int b : a) {
					System.out.print(b + " ");
				}
				System.out.println();
			}
			System.out.println("청후 ");
			
			
			
		}

	}

}
