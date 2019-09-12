package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P3190 {
	public final static int dx[] = { -1, 0, 1, 0 };
	public final static int dy[] = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		// input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int graph[][] = new int[N][N];

		Queue<Integer> tq = new LinkedList<>();
		Queue<String> dq = new LinkedList<>();

		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a - 1][b - 1] = 1;
		}

		st = new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken());
		for (int i = 0; i < L; i++) {
			st = new StringTokenizer(br.readLine());
			tq.add(Integer.parseInt(st.nextToken()));
			dq.add(st.nextToken());
		}

		int time = 0;
		LinkedList<Integer> dummyX = new LinkedList<>();
		LinkedList<Integer> dummyY = new LinkedList<>();
		graph[0][0] = -1;
		dummyX.add(0);
		dummyY.add(0);

		int dhead = 1; // up-0 right-1 down-2 left-3

		while (true) {

			int curXhead = dummyX.peekLast() + dx[dhead];
			int curYhead = dummyY.peekLast() + dy[dhead];

			// crush wall
			if (curXhead < 0 || curXhead >= N || curYhead < 0 || curYhead >= N) {
				break;
			}

			// crush me
			if (graph[curXhead][curYhead] == -1) {
				break;
			}

			// add head
			dummyX.add(curXhead);
			dummyY.add(curYhead);

			// not apple
			if (graph[curXhead][curYhead] != 1) {
				graph[dummyX.poll()][dummyY.poll()] = 0;
			}
			graph[curXhead][curYhead] = -1;
			time++;

			// dir change
			if (!tq.isEmpty()) {
				if (time == tq.peek()) {
					tq.poll();
					String p = dq.poll();
					if (p.equals("L")) {
						dhead--;
						if (dhead < 0) {
							dhead = 3;
						}
					} else if (p.equals("D")) {
						dhead++;
						if (dhead > 3) {
							dhead = 0;
						}
					}
				}
			}

		}

		System.out.println(time + 1);
	}

}
