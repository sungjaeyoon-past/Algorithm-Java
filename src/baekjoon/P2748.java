package baekjoon;

import java.util.Scanner;

public class P2748 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		sc.close();
		long []DP = new long[N+1];
		DP[0]=0;
		DP[1]=1;
		for(int i=2;i<N+1;i++) {
			DP[i]=DP[i-1]+DP[i-2];
		}
		System.out.println(DP[N]);
	}

}
