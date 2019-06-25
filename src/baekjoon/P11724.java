package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P11724 {
	public static int visitAll(boolean[] visited) {
		// all visit -> 0 else not visited number
		for(int i=1;i<visited.length;i++) {
			if(!visited[i]) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int V = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		ArrayList<Integer>[] ar = new ArrayList[V + 1];
		boolean[] visited = new boolean[V + 1];
		visited[0] = true;

		for (int i = 0; i < V + 1; i++) {
			ar[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < L; i++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int last = Integer.parseInt(st.nextToken());
			ar[first].add(last);
			ar[last].add(first);
		}
		int count = 0;
		while (true) {
			int number = visitAll(visited);
			if (number == 0)
				break;
			count++;
			Queue<Integer> q = new LinkedList<Integer>();
			q.offer(number);
			visited[number] = true;
			while (!q.isEmpty()) {
				int v = q.poll();
				for (Integer a : ar[v]) {
					if (!visited[a]) {
						q.offer(a);
						visited[a] = true;
					}
				}
			}
		}
		System.out.println(count);

	}

}
