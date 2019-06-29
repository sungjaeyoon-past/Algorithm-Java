package baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2606 {

	static public int BFS(ArrayList<Integer> []ar,int start) {
		Queue<Integer> q=new LinkedList<Integer>();
		boolean []visited=new boolean[ar.length];
		ArrayList<Integer> result=new ArrayList<>();
		q.add(start);
		visited[start]=true;
		
		while(!q.isEmpty()) {
			int v=q.poll();
			result.add(v);
			for(Integer a:ar[v]) {
				if(!visited[a]) {
					q.add(a);
					visited[a]=true;
				}
			}
		}
		
		return result.size()-1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine());
		int f=Integer.parseInt(sc.nextLine());
		
		ArrayList<Integer> []ar=new ArrayList[N+1];
		for(int i=0;i<N+1;i++) {
			ar[i]=new ArrayList<Integer>();
		}
		
		for(int i=0;i<f;i++) {
			String []input= sc.nextLine().split(" ");
			int first=Integer.parseInt(input[0]);
			int last=Integer.parseInt(input[1]);
			ar[first].add(last);
			ar[last].add(first);
		}
		
		System.out.println(BFS(ar,1));
	}

}
