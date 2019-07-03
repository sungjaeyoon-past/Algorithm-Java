package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P5575 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		for(int i=0;i<3;i++) {
			st=new StringTokenizer(br.readLine());
			int sH=Integer.parseInt(st.nextToken());
			int sM=Integer.parseInt(st.nextToken());
			int sS=Integer.parseInt(st.nextToken());
			int eH=Integer.parseInt(st.nextToken());
			int eM=Integer.parseInt(st.nextToken());
			int eS=Integer.parseInt(st.nextToken());
			
			int H=eH-sH;
			
			int M=eM-sM;
			if(M<0) {
				M+=60;
				H--;
			}
			
			int S=eS-sS;
			if(S<0) {
				S+=60;
				M--;
			}
			
			if(M<0) {
				M+=60;
				H--;
			}
			
			
			bw.write(String.format("%d %d %d\n",H,M,S));
			
		}
		bw.flush();
	}

}
