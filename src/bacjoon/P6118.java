package bacjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point6118{
	public int cost;
	public int number;
	Point6118(int number,int cost){
		this.cost=cost;
		this.number=number;
	}
}

public class P6118 {
	
	public static void BFS(ArrayList<Integer> []ar,int start) {
		Queue<Point6118> q= new LinkedList<Point6118>();
		boolean visit[]=new boolean[ar.length];
		
		int max=0;
		int count=0;
		int minNum=999;
		q.add(new Point6118(1,0));
		visit[1]=true;

		while(!q.isEmpty()) {
			Point6118 p=q.poll();
			int co=p.cost;
			int v=p.number;
			if(co>max) {
				max=co;
				count=1;
				minNum=v;
			}else if(co==max){
				count++;
				if(v<minNum)minNum=v;
			}
			for(Integer a:ar[v]) {
				if(!visit[a]) {
					q.add(new Point6118(a,co+1));
					visit[a]=true;
				}
			}
		}
		System.out.println(String.format("%d %d %d",minNum,max,count));

	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int l=Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> []ar=new ArrayList[N+1];
		for(int i=0;i<N+1;i++) {
			ar[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<l;i++) {
			st = new StringTokenizer(br.readLine());
			int first=Integer.parseInt(st.nextToken());
			int last=Integer.parseInt(st.nextToken());
			ar[first].add(last);
			ar[last].add(first);
		}
		BFS(ar,1);
	}

}
