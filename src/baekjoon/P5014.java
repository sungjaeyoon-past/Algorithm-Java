package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P5014 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int length = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		int UP = Integer.parseInt(st.nextToken());
		int DOWN = Integer.parseInt(st.nextToken());
		boolean canVisited = false;

		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> cost = new LinkedList<Integer>();
		boolean[] visited = new boolean[length + 1];

		q.add(start);
		cost.add(0);
		visited[start] = true;

		while (!q.isEmpty()) {
			int v = q.poll();
			int co = cost.poll();
			if (v == end) {
				System.out.println(co);
				canVisited=true;
				break;
			}

			if ((v + UP) <= length && UP!=0) {
				if (!visited[v + UP]) {
					q.add(v + UP);
					cost.add(co + 1);
					visited[v + UP]=true;
				}
			}
			if ((v - DOWN) >= 0 && DOWN!=0) {
				if (!visited[v - DOWN]) {
					q.add(v - DOWN);
					cost.add(co + 1);
					visited[v - DOWN]=true;
				}
			}
		}

		if (!canVisited) {
			System.out.println("use the stairs");
		}

	}

}
