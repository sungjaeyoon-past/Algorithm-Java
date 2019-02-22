package Programmers;

import java.util.*;

public class Network {
	static public int solution(int n, int[][] computers) {
		Queue<Integer> qu = new LinkedList<Integer>();
		boolean[] visited = new boolean[computers.length];
		int answer = 0;

		for (int j = 0; j < visited.length; j++) {
			if (visited[j] == false) {
				visited[j] = true;
				qu.add(j);
				while (qu.size() != 0) {
					int v = qu.poll();
					System.out.println(v + " 방문 ");
					for (int i = 0; i < computers.length; i++) {
						if (computers[v][i] == 1) {
							if (visited[i] == false) {
								visited[v] = true;
								qu.add(i);
							}
						}
					}
				}
				answer++;
				System.out.println();
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		int arr2[][] = { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };

		System.out.println("네트워크 수:" + solution(3, arr2));
	}

}
