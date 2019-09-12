package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P1068 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String [] num = br.readLine().split(" ");
		
		int []parent = new int[N];
		
		for(int i=0;i<N;i++) {
			parent[i]= Integer.parseInt(num[i]);
		}
		
		
		int delNum = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(delNum);
		parent[delNum]=-2;
		while(!q.isEmpty()) {
			int del = q.poll();
			for(int i=0;i<N;i++) {
				if(parent[i]==del) {
					parent[i]=-2;
					q.add(i);
				}
			}
		}
//		for(int a:parent) {
//			System.out.print(a+" ");
//		}
//		
		int leafNum=0;
		
		for(int i=0;i<N;i++) {
			if(parent[i]!=-2) {
				boolean leaf=true;
				for(int j=0;j<N;j++) {
					if(parent[j]==i) {
						leaf=false;
						break;
					}
				}
				if(leaf) {leafNum++;
				System.out.println("i:"+i);
				}
			}
		}
		System.out.println(leafNum);

		
	}

}
