package baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2644 {

	public static int BFS(ArrayList<Integer>[] ar, int start, int target) {
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> cost = new LinkedList<Integer>();
		LinkedList<Integer> visited = new LinkedList<Integer>();
		
		visited.offer(start);
		q.offer(start);
		cost.offer(0);
		
		while (!q.isEmpty()) {
			int v = q.poll();
			int co=cost.poll();
			if(v==target) {
				return co;
			}
			visited.offer(v);
			for (int a : ar[v]) {
				if (!q.contains(a) && !visited.contains(a)) {
					q.offer(a);
					cost.offer(co+1);
				}
			}

		}

		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		ArrayList<Integer>[] ar = new ArrayList[num + 1];
		for (int i = 1; i < num + 1; i++) {
			ar[i] = new ArrayList<Integer>();
		}

		String[] input = sc.nextLine().split(" ");
		int start = Integer.parseInt(input[0]);
		int end = Integer.parseInt(input[1]);
		int input2 = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < input2; i++) {
			String[] input3 = sc.nextLine().split(" ");
			int first = Integer.parseInt(input3[0]);
			int last = Integer.parseInt(input3[1]);
			ar[first].add(last);
			ar[last].add(first);
		}
		System.out.println(BFS(ar, start, end));

	}

}
