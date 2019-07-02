package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class P1325DFS {
	static ArrayList<Integer>[] ar;
	static public int DFS(ArrayList<Integer>[] ar, int start) {
		Stack<Integer> s = new Stack<Integer>();
		boolean[] visited = new boolean[ar.length];
		int result=-1;

		s.push(start);
		visited[start] = true;

		while (!s.isEmpty()) {
			int v = s.pop();
			result++;
			for (Integer a : ar[v]) {
				if (!visited[a]) {
					s.push(a);
					visited[a] = true;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		ar = new ArrayList[N + 1];
		for (int i = 1; i < N + 1; i++) {
			ar[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int end = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());
			ar[start].add(end);
		}

		int max = -1;
		ArrayList<Integer> result = new ArrayList<>();
		boolean already[]=new boolean[N+1];

		for (int i = 1; i < N + 1; i++) {
			if(!already[i]) {
				int temp = DFS(ar, i);
				if (temp > max) {
					max = temp;
					result.clear();
					result.add(i);
				} else if (temp == max) {
					result.add(i);
				}
				already[i]=true;
				for(Integer a:ar[i]) {
					already[a]=true;
				}
			}
		}

		for (Integer a : result) {
			System.out.print(a + " ");
		}
	}

}
