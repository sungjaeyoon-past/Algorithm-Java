package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1890 {
	public static int [][]graph;
	public static int [][]DP;
	public static int N;
	
	static public int solve(int sX,int sY) {
		
		return 1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		graph=new int[N][N];
		for(int i=0;i<N;i++) {
			String []input=br.readLine().split(" ");
			for(int j=0;j<N;j++) {
				graph[i][j]=Integer.parseInt(input[j]);
			}
			Arrays.fill(DP[i],-1);
		}		
		System.out.println(solve(0,0));	
	}
}
