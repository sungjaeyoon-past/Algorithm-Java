package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Line1967 {
	public int end;
	public int cost;

	public Line1967(int end, int cost) {
		super();
		this.end = end;
		this.cost = cost;
	}

}

public class P1967 {

	static LinkedList<Line1967>[] ar;

	public static Line1967 BFS(int start) {
		boolean[] visited = new boolean[ar.length];
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> cost = new LinkedList<>();

		visited[start] = true;
		q.add(start);
		cost.add(0);
		int node = -1;
		int max = -1;

		while (!q.isEmpty()) {
			int v = q.poll();
			int co = cost.poll();
			if (co > max) {
				max = co;
				node = v;
			}
			for (Line1967 l : ar[v]) {
				if (!visited[l.end]) {
					q.add(l.end);
					cost.add(co + l.cost);
					visited[l.end] = true;
				}
			}
		}

		return new Line1967(node, max);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		ar = new LinkedList[N + 1];
		for (int i = 0; i < N + 1; i++) {
			ar[i] = new LinkedList<>();
		}

		for (int i = 1; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			ar[start].add(new Line1967(end, cost));
			ar[end].add(new Line1967(start, cost));
		}

		// root dfs -> node
		Line1967 l = BFS(1);
		l = BFS(l.end);
		System.out.println(l.cost);

	}

}
