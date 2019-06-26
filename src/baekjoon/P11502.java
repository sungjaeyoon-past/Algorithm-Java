package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11502 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		String input[]=br.readLine().split(" ");
		int cost[]=new int[N+1];
		for(int i=1;i<=N;i++) {
			cost[i]=Integer.parseInt(input[i-1]);
		}
		int []DP=new int[N+1];
		DP[1]=cost[1];
		for(int i=2;i<=N;i++) {
			int max=cost[i];
			for(int j=1;j<=i/2;j++) {
				int num=DP[j]+DP[i-j];
				if(num>max) max=num;
			}		
			DP[i]=max;
		}
		System.out.println(DP[N]);
	}

}
