package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1325floyd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		final int INF = 1000000001;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int graph[][] = new int[N + 1][N + 1];
		for (int i = 1; i < N + 1; i++) {
			Arrays.fill(graph[i], INF);
			graph[i][i] = 0;
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int end = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());
			graph[start][end] = 1;
		}

		for (int k = 1; k < N + 1; k++) {
			for (int i = 1; i < N + 1; i++) {
				for (int j = 1; j < N + 1; j++) {
					if (graph[i][k] + graph[k][j] < graph[i][j]) {
						graph[i][j] = graph[i][k] + graph[k][j];
					}
				}
			}
		}

		int max=-1;
		ArrayList<Integer> result = new ArrayList<>();
		
		for (int i=1;i<N+1;i++) {
			for (int j=1;j<N+1;j++) {
				if(graph[i][j]!=INF && graph[i][j]>max) {
					result.clear();
					max=graph[i][j];
					result.add(i);
				}else if(graph[i][j]!=INF && graph[i][j]==max) {
					if(result.get(result.size()-1)!=i) {						
						result.add(i);
					}
				}
			}
		}
		
		Integer []r=result.toArray(new Integer[result.size()]);
		for(Integer a:r) {
			System.out.print(a+" ");
		}
	}

}
