package SamsungSW;

import java.util.Scanner;

public class P2068 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test_case=sc.nextInt();
		for(int i=1;i<=test_case;i++) {
			int max=-1;
			for(int k=0;k<10;k++) {
				int in=sc.nextInt();
				if(in>max) max=in;
			}
			System.out.println(String.format("#%d %d",i,max));
		}

	}

}
