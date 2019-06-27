package baekjoon;

import java.util.Scanner;

public class P2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first=sc.nextInt();
		int last=sc.nextInt();
		sc.close();
		
		System.out.println((int)first*(last%10));
		System.out.println((int)first*(last%100/10));
		System.out.println((int)first*(last/100));
		System.out.println(first*last);
	}

}
