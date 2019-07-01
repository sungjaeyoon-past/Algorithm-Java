package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P17263 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		long max=0;
		while(sc.hasNextInt()) {
			long n=sc.nextLong();
			if(n>max)max=n;
		}

		System.out.println(max);
	}

}
