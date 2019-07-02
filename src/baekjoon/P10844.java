package baekjoon;

import java.util.Scanner;

public class P10844 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int [][]DP=new int[n+1][10];
		
		for(int i=1;i<10;i++) {
			DP[1][i]=1;
		}
		
		for(int i=2;i<n+1;i++) {
			for(int j=0;j<10;j++) {
				if(j==0) {
					DP[i][j]=DP[i-1][j+1]%1000000000;
				}else if(j==9) {
					DP[i][j]=DP[i-1][j-1]%1000000000;					
				}else {
					DP[i][j]=(DP[i-1][j-1]%1000000000)+(DP[i-1][j+1]%1000000000);										
				}
			}
		}
		long sum=0;
		for(int i=0;i<10;i++) {
			sum+=DP[n][i];
		}
		System.out.println(sum%1000000000);
		
		
	}

}
