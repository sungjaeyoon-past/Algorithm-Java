package baekjoon;

import java.util.Scanner;

public class P1904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		
		int DP[]=new int[N+1];
		
		if(N==1) {
			System.out.println(1);
			return;
		}
		DP[0]=1;
		DP[1]=1;
		int count=0;
		
		for(int i=2;i<=N;i++) {
			if(i%2==0) count++;
			DP[i]=DP[i-1]%15746+DP[i-2]%15746;
		}
//		for(int a:DP) {			
//			System.out.println(a);
//		}
		System.out.println(DP[N]%15746);
	}

}
