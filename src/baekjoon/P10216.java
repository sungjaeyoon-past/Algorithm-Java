package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point10216{
	public int x;
	public int y;
	public int r;
	public Point10216(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public boolean isRange(Point10216 p) {
		double R= Math.sqrt(Math.abs((p.x-this.x)*(p.x-this.x))+Math.abs((p.y-this.y)*(p.y-this.y)));
		if(R<=this.r+p.r) {			
			return true;
		}else {
			return false;
		}
	}
}

public class P10216 {

	static public boolean visited[];
	static public ArrayList<Integer>[] ar;
	
	static public void DFS(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		visited[start] = true;
		while (!q.isEmpty()) {
			int v = q.poll();
			for (Integer a : ar[v]) {
				if (!visited[a]) {
					visited[a] = true;
					q.add(a);
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			int N = Integer.parseInt(br.readLine());
			Point10216[] pl=new Point10216[N];
			for(int i=0;i<N;i++) {
				st = new  StringTokenizer(br.readLine());
				int x=Integer.parseInt(st.nextToken());
				int y=Integer.parseInt(st.nextToken());
				int r=Integer.parseInt(st.nextToken());
				pl[i]=new Point10216(x, y, r);
			}
			
			ar = new ArrayList[N];
			visited=new boolean[N];
			
			for(int i=0;i<N;i++) {
				ar[i]=new ArrayList<>();
			}
			
			for(int i=0;i<N-1;i++) {
				for(int j=i+1;j<N;j++) {
					if(pl[i].isRange(pl[j])) {
						ar[i].add(j);
						ar[j].add(i);
					}
				}
			}
			
			int result=0;
			for(int i=0;i<N;i++) {
				if(!visited[i]) {
					DFS(i);
					result++;
				}
			}
			bw.write(result+"\n");
		}
		bw.flush();
	}

}
