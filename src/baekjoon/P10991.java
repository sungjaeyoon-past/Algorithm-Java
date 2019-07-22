package baekjoon;

import java.util.Scanner;

public class P10991 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		
		for(int i=0;i<N;i++) {
			String out="";
			for(int j=i+1;j<N;j++) {
				out+=" ";
			}
			for(int j=0;j<2*i+1;j++) {	
				if(j%2==0) {
					out+="*";
				}else {
					out+=" ";
				}
			}
			System.out.println(out);
		}
	}

}
