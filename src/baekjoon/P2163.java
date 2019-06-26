package baekjoon;

import java.util.Scanner;

public class P2163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String []input = sc.nextLine().split(" ");
		int n=Integer.parseInt(input[0]);
		int m=Integer.parseInt(input[1]);
		System.out.println(m*n-1);
	}

}
