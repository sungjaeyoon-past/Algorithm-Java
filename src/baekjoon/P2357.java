package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class SegmentTree2357 {
	private long[] treeMin;
	private long[] treeMax;
	private long[] arr;
	private final long INF=1000000001;
	private final long MINF=-1000000001;

	SegmentTree2357(int N, long[] arr) {
		int capacity = 1;
		for (; capacity < N; capacity *= 2);
		treeMin = new long[2 * capacity + 1];
		treeMax = new long[2 * capacity + 1];
		this.arr = arr;
	}

	public long initMin(int index, int start, int end) {
		if(start==end) {
			treeMin[index]=arr[start];
			if(treeMin[index]==0) treeMin[index]=INF;
		}else {
			int mid=(start+end)/2;
			treeMin[index]=Math.min(initMin(2*index,start,mid),initMin(2*index+1,mid+1,end));
		}
		return treeMin[index];
	}
	
	public long initMax(int index, int start, int end) { 
		if(start==end) {
			treeMax[index]=arr[start];
			if(treeMax[index]==0) treeMax[index]=MINF;
		}else {
			int mid=(start+end)/2;
			treeMax[index]=Math.max(initMax(2*index,start,mid),initMax(2*index+1,mid+1,end));
		}
		return treeMax[index];
	}

	public long searchMin(int index,int start, int end, int left,int right) {
		if(start>right || end<left) return INF;
		else if(start>=left && end<=right) return treeMin[index];
		else {
			int mid=(start+end)/2;
			return Math.min(searchMin(2*index,start,mid,left,right), searchMin(2*index+1,mid+1,end,left,right));
		}
	}
	
	public long searchMax(int index,int start, int end, int left,int right) {
		if(start>right || end<left) return MINF;
		else if(start>=left && end<=right) return treeMax[index];
		else {
			int mid=(start+end)/2;
			return Math.max(searchMax(2*index,start,mid,left,right), searchMax(2*index+1,mid+1,end,left,right));
		}
	}
	
	public void print() {
		for(long a:treeMin) {
			System.out.print(a+" ");
		}
	}
}

public class P2357 {

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

		SegmentTree2357 sTree = new SegmentTree2357(N, arr);
		sTree.initMin(1, 1, N);
		sTree.initMax(1, 1, N);
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			bw.write(""+sTree.searchMin(1, 1, N, start, end)+" "+sTree.searchMax(1, 1, N, start, end)+"\n");
		}
	
		bw.flush();

	}

}
