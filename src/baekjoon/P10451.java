package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class P10451 {

	static public boolean visited[];
	static public ArrayList<Integer>[] ar;

	public static boolean dfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		visited[start] = true;
		while (!q.isEmpty()) {
			int v = q.poll();
			for (Integer a : ar[v]) {
				if (a == start) {
					return true;
				} else if (!visited[a]) {
					visited[a] = true;
					q.add(a);
				}
			}
		}
		return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for (int k = 0; k < T; k++) {
			int N = Integer.parseInt(br.readLine());
			ar = new ArrayList[N + 1];

			for (int i = 1; i < N + 1; i++) {
				ar[i] = new ArrayList<>();
			}

			String[] in = br.readLine().split(" ");
			for (int i = 1; i < N + 1; i++) {
				ar[i].add(Integer.parseInt(in[i - 1]));
			}

			visited = new boolean[N + 1];
			int result = 0;
			for (int i = 1; i < N + 1; i++) {
				if (!visited[i]) {
					if (dfs(i)) {
						result++;
					}
				}
			}
			bw.write(result + "\n");
		}
		bw.flush();
	}

}
