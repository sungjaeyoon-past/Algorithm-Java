package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

/*
5
1 3 2 -1
2 4 4 -1
3 1 2 4 3 -1
4 2 4 3 3 5 6 -1
5 4 6 -1
 */
public class P1167 {
	static public int N;
	// static public int[][] length;
	static public ArrayList<Integer> arr[];
	static public ArrayList<Integer> length[];

	static public int dfs(int start, int option) {// 1 -> long point 2-> length
		Stack<Integer> s = new Stack<>();
		Stack<Integer> l = new Stack<>();

		boolean visited[] = new boolean[N + 1];

		s.add(start);
		l.add(0);
		visited[start] = true;

		int max = -1;
		int maxPoint = -1;

		while (!s.isEmpty()) {
			int n = s.pop();
			int len = l.pop();
			if (len > max) {
				max = len;
				maxPoint = n;
			}
			for (int i = 0; i < arr[n].size(); i++) {
				int a = arr[n].get(i);
				int b = length[n].get(i);
				if (!visited[a]) {
					s.add(a);
					l.add(len + b);
					visited[a] = true;
				}
			}
		}
		if (option == 1) {
			return maxPoint;
		} else {
			return max;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());

		length = new ArrayList[N + 1];
		arr = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			arr[i] = new ArrayList<>();
			length[i] = new ArrayList<>();
		}
		String input;

		while ((input = br.readLine()) != null) {
			st = new StringTokenizer(input);
			int num = Integer.parseInt(st.nextToken());
			while (true) {
				int end = Integer.parseInt(st.nextToken());
				if (end == -1) {
					break;
				}
				int len = Integer.parseInt(st.nextToken());
				arr[num].add(end);
				arr[end].add(num);
				length[num].add(len);
				length[end].add(len);
			}

		}

		// 1에서 dfs -> 가장 먼점 찾음
		int n = dfs(1, 1);

		// 그 점에서 다시 dfs 가장 먼 길
		System.out.println(dfs(n, 2));

	}

}
