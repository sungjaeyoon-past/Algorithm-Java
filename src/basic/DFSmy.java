package basic;

import java.util.Iterator;
import java.util.LinkedList;

class GraphMy{
	private int V;
	private LinkedList<Integer> adj[]; //배열의 링크드리스트.
	
	GraphMy(int v){
		V=v;
		adj=new LinkedList[v];//정점개수만큼 배열할당.
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList();//정점마다링크드리스트 할당.
		}
	}
	
	public void addEdge(int v,int w) {
		adj[v].add(w);
	}
	
	public void DFSutill(int v,boolean visited[]) {
		visited[v]=true;
		System.out.println("방문한 노드:"+v);
		
		Iterator<Integer> it=adj[v].iterator();
		while(it.hasNext()) {
			int n=it.next();
			if(!visited[n]) {
				DFSutill(n,visited);
			}
		}
		
	}
	
	public void DFS(int v) {
		boolean visited[]=new boolean[V];
		DFSutill(v, visited);
	}
	
	public void DFS() {
		boolean visited[]=new boolean[V];
		for(int i=0;i<V;i++) {
			if(visited[i]==false) {
				DFSutill(i, visited);
			}
		}
	}
	
}


public class DFSmy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphMy g = new GraphMy(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		g.DFS(2);
		//g.DFS();
	}

}
