package baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1697 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input[]=sc.nextLine().split(" ");
		int start=Integer.parseInt(input[0]);
		int end=Integer.parseInt(input[1]);
		
		//ArrayList<Integer> visited=new ArrayList<>();
		boolean []visited=new boolean[100001];
		
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> cost = new LinkedList<Integer>();
		q.add(start);
		cost.add(0);
		visited[start]=true;
		
		while(!q.isEmpty()) {
			int v=q.poll();
			int co=cost.poll();
			//System.out.println(v);
			if(v==end) {
				System.out.println(co);
				break;
			}
			if(v-1>=0 && !visited[v-1]) {
				q.add(v-1);
				visited[v-1]=true;
				cost.add(co+1);
			}
			if(v+1<=100000 && !visited[v+1]) {
				q.add(v+1);
				visited[v+1]=true;
				cost.add(co+1);
			}
			if(v*2<=100000 && !visited[v*2] && v!=0) {
				q.add(v*2);
				visited[v*2]=true;	
				cost.add(co+1);
			}
		}
		
	}

}
