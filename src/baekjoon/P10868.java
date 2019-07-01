package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class SegmentTree {
	private long[] tree;
	private long[] arr;
	private final long INF=1000000001;

	SegmentTree(int N, long[] arr) {
		int capacity = 1;
		for (; capacity < N; capacity *= 2);
		tree = new long[2 * capacity + 1];
		this.arr = arr;
	}

	public long init(int index, int start, int end) {
		//최하위 노드 
		if(start==end) {
			tree[index]=arr[start];
			if(tree[index]==0) tree[index]=INF;
		}else {
			int mid=(start+end)/2;
			tree[index]=Math.min(init(2*index,start,mid),init(2*index+1,mid+1,end));
		}
		return tree[index];
	}

	public long search(int index,int start, int end, int left,int right) {
		if(start>right || end<left) return INF;
		else if(start>=left && end<=right) return tree[index];
		else {
			int mid=(start+end)/2;
			return Math.min(search(2*index,start,mid,left,right), search(2*index+1,mid+1,end,left,right));
		}
	}
	
	public void print() {
		for(long a:tree) {
			System.out.print(a+" ");
		}
	}
}

public class P10868 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		long arr[]=new long[N+1];
		for(int i=1;i<N+1;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}

		SegmentTree sTree = new SegmentTree(N, arr);
		sTree.init(1, 1, N);
//		bw.write(""+sTree.search(1, 1, N,2,10));
//		bw.write(""+sTree.search(1, 1, N,3,5));
//		bw.write(""+sTree.search(1, 1, N,6,9));
//		bw.write(""+sTree.search(1, 1, N,8,10));
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			bw.write(""+sTree.search(1, 1, N, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))+"\n");
		}
	
		bw.flush();

	}

}
