package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P11725 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		ArrayList<Integer> ar[] = new ArrayList[N + 1];
		for (int i = 0; i < N + 1; i++) {
			ar[i] = new ArrayList<>();
		}

		for (int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			ar[a].add(b);
			ar[b].add(a);
		}

		Queue<Integer> q = new LinkedList<Integer>();
		int[] parent = new int[N + 1];
		boolean[] visited = new boolean[N + 1];

		q.add(1);
		visited[1] = true;

		while (!q.isEmpty()) {
			int x = q.poll();
			for (Integer a : ar[x]) {
				if (!visited[a]) {
					parent[a] = x;
					q.add(a);
					visited[a] = true;
				}
			}
		}

		for (int i = 2; i < parent.length; i++) {
			System.out.println(parent[i]);
		}
	}

}
