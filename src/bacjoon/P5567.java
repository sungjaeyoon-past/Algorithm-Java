package bacjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P5567 {
	public static int DFS(ArrayList<Integer> []ar,int start) {
		Queue<Integer> q=new LinkedList<Integer>();
		Queue<Integer> cost=new LinkedList<Integer>();
		
		ArrayList<Integer> visited=new ArrayList<>();
		ArrayList<Integer> length=new ArrayList<>();
		q.offer(start);
		cost.offer(0);
		
		while(!q.isEmpty()) {
			int v = q.poll();
			int co=cost.poll();
			
			if(co==3)break;
			visited.add(v);
			length.add(co);
			
			for(Integer a:ar[v]) {
				if(!visited.contains(a) && !q.contains(a)) {
					q.add(a);
					cost.add(co+1);
				}
			}
		}
		
		return visited.size()-1;
	}
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	int num=Integer.parseInt(sc.nextLine());
    	int length=Integer.parseInt(sc.nextLine());
    	
    	ArrayList<Integer> []ar=new ArrayList[num+1];
    	for(int i=0;i<num+1;i++) {
    		ar[i]=new ArrayList<Integer>();
    	}
    	
    	for(int i=0;i<length;i++) {
    		String []input = sc.nextLine().split(" ");
    		int first=Integer.parseInt(input[0]);
    		int last=Integer.parseInt(input[1]);
    		ar[first].add(last);
    		ar[last].add(first);
    	}
    	int count=DFS(ar,1);
    	System.out.println(count);
    	
    }

}
