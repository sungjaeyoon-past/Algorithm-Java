package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1018 {
/*
 8 8
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBBBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW
 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		boolean [][]graph=new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			String []input=br.readLine().split("");
			for(int j=0;j<M;j++) {				
				if(input[j].equals("W")) {
					graph[i][j]=false;
				}else {
					graph[i][j]=true;					
				}
			}
		}
		boolean startW[][]=new boolean[8][8];
		boolean startB[][]=new boolean[8][8];
		boolean []wb= {false,true,false,true,false,true,false,true};
		boolean []bw= {true,false,true,false,true,false,true,false};
		
		for(int i=0;i<8;i++) {
			if(i%2==0) {
				startW[i]=wb;
				startB[i]=bw;
			}else {
				startW[i]=bw;
				startB[i]=wb;				
			}
		}
		
		
		int min=1000000001;
		
		for(int i=0;i<=N-8;i++) {
			for(int j=0;j<=M-8;j++) {
				//start graph[i][j]~graph[i+7][j+7]
				int diffW=0;
				int diffB=0;
				for(int a=i,c=0;a<i+8;a++,c++) {
					for(int b=j,d=0;b<j+8;b++,d++) {
						if(graph[a][b]!=startW[c][d]) {
							diffW++;
						}
						if(graph[a][b]!=startB[c][d]) {
							diffB++;
						}
					}
				}
				min=Math.min(min,Math.min(diffW, diffB));
			}
		}
		System.out.println(min);
		
		
	}

}
