package baekjoon;

import java.util.Scanner;

public class P1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int []count=new int[10];
		
		for(int i=1;i<=N;i++) {
			int num=i;
			while(num>0) {
				count[num%10]++;
				num=num/10;
			}
		}
		for(int a:count) {
			System.out.print(a+" ");
		}
	}	

}
