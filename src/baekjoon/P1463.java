package baekjoon;

import java.util.Scanner;

public class P1463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		int[] DP=new int[a+1];
		DP[0]=0; DP[1]=0;	
		
		for(int i=2;i<=a;i++) {
			DP[i]=DP[i-1]+1;
			if(i%2==0) {
				DP[i]=Math.min(DP[i], DP[i/2]+1);
			}
			if(i%3==0) {
				DP[i]=Math.min(DP[i], DP[i/3]+1);				
			}
		}
		System.out.println(DP[a]);
		
		
	}

}
