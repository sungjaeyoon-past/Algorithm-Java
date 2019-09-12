package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1652 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int graph[][] = new int[N][N];
		for (int i = 0; i < N; i++) {
			String[] in = br.readLine().split("");
			for (int j = 0; j < N; j++) {
				if (in[j].equals("X")) {
					graph[i][j] = 1;
				}
			}
		}
		int countN = 0;
		int countM = 0;

		for (int i = 0; i < N; i++) {
			Stack<Integer> s = new Stack<>();
			Stack<Integer> s2 = new Stack<>();
			for (int j = 0; j < N; j++) {
				if (graph[i][j] == 0) {
					s.push(0);
				} else {
					if (s.size() >= 2) {
						countN++;
					}
					s.clear();
				}

				if (graph[j][i] == 0) {
					s2.push(0);
				} else {
					if (s2.size() >= 2) {
						countM++;
					}
					s2.clear();

				}
			}
			if (s.size() >= 2)
				countN++;
			if (s2.size() >= 2)
				countM++;
		}
		System.out.println(countN + " " + countM);
	}

}
