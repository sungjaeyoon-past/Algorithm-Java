package baekjoon;

import java.util.Scanner;

public class P17293 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = N; i > 0; i--) {
			if (i == 1) {
				System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
				System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
			}else if(i==2) {				
				System.out.println("2 bottles of beer on the wall, 2 bottles of beer.");
				System.out.println("Take one down and pass it around, 1 bottle of beer on the wall.");
			} else {
				System.out.println(String.format("%d bottles of beer on the wall, %d bottles of beer.", i, i));
				System.out.println(
						String.format("Take one down and pass it around, %d bottles of beer on the wall.", i - 1));
			}
			System.out.println();
		}
		if(N>1) {			
			System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
			System.out.println("Go to the store and buy some more, " + N + " bottles of beer on the wall.");
		}else {
			System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
			System.out.println("Go to the store and buy some more, 1 bottle of beer on the wall.");
		}

	}

}
