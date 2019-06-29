package baekjoon;

import java.util.Scanner;

public class P10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		if(num==0) {
			System.out.println(0);
			return;
		}
		
		int[]DP=new int[num+1];
		DP[0]=0;
		DP[1]=1;
		for(int i=2;i<=num;i++) {
			DP[i]=DP[i-1]+DP[i-2];
		}
		System.out.println(DP[num]);
	}

}
