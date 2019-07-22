package baekjoon;

import java.util.Scanner;

public class P2444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=N;i++) {
			String out="";
			for(int j=0;j<N-i;j++) {
				out+=" ";
			}
			for(int j=0;j<2*i-1;j++) {
				out+="*";
			}
			System.out.println(out);
		}
		for(int i=N-1;i>0;i--) {
			String out="";
			for(int j=0;j<N-i;j++) {
				out+=" ";
			}
			for(int j=0;j<2*i-1;j++) {
				out+="*";
			}
			System.out.println(out);
		}

	}

}
