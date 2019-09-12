package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class P11062 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			int A=0;
			int B=0;
			boolean turn=true;
			Deque<Integer> d = new LinkedList<Integer>();
			String []in=br.readLine().split(" ");
			for(int j=0;j<in.length;j++) {
				d.add(Integer.parseInt(in[j]));
			}
			
			while(!d.isEmpty()) {
				if(d.size()==1) {
					if(turn) {
						A+=d.poll();
					}else {
						B+=d.poll();
					}
					break;
				}
				if(d.getFirst()>=d.getLast()) {
					if(turn) {
						A+=d.pollFirst();
					}else {
						B+=d.pollFirst();
					}
				}else {
					if(turn) {
						A+=d.pollLast();
					}else {
						B+=d.pollLast();						
					}				
				}
				turn=!turn;
			}
			bw.write(A+" "+B+"\n");
		}
		bw.flush();
	}

}
