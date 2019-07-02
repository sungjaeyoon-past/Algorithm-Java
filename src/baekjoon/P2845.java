package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2845 {
/*
 5 20
99 101 1000 0 97
 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int num=Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
		String []in=br.readLine().split(" ");
		for(int i=0;i<in.length;i++) {
			bw.write(0+Integer.parseInt(in[i])-num+" ");
		}
		bw.flush();
	}

}
