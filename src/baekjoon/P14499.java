package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P14499 {
	static final int dx[] = { 0, 0, 0, -1, 1 };
	static final int dy[] = { 0, 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int graph[][] = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		LinkedList<Integer> commands = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < K; i++) {
			commands.add(Integer.parseInt(st.nextToken()));
		}

		int []dice= {0,0,0,0,0,0};

		while (!commands.isEmpty()) {
			int command = commands.poll();

			int nx = X + dx[command];
			int ny = Y + dy[command];

			if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
				continue;
			}
			
			//동 
			if (command == 1) {

			}
			//서  
			if (command == 2) {

			}
			//남 
			if (command == 3) {

			}
			//북 
			if (command == 4) {

			}
			

		}
	}

}
