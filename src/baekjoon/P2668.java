package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P2668 {

	static public boolean dfs(ArrayList<Integer>[] ar, int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean visited[] = new boolean[ar.length];

		q.add(start);
		visited[start]=true;
		while(!q.isEmpty()) {
			int v=q.poll();
			for(Integer a:ar[v]) {
				if(a==start) {
					return true;
				}else {
					if(!visited[a])
					q.add(a);
					visited[a]=true;
				}
			}
		}
		

		return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer>[] ar = new ArrayList[N + 1];
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < N + 1; i++)
			ar[i] = new ArrayList<>();

		for (int i = 1; i < N + 1; i++) {
			int num = Integer.parseInt(br.readLine());
			ar[i].add(num);
		}

		for (int i = 1; i < N + 1; i++) {
			if (dfs(ar, i)) {
				result.add(i);
			}
		}
		Integer []arr=result.toArray(new Integer[result.size()]);
		
		Arrays.sort(arr);
		
		System.out.println(arr.length);
		for (Integer a : arr) {
			System.out.println(a);
		}

	}

}
