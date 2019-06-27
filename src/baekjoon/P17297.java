package baekjoon;

import java.util.Scanner;

public class P17297 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int M = Integer.parseInt(sc.nextLine());

		int fL = 5;
		int sL = 13;
		String first = "Messi";
		String second = "Messi Gimossi";
		String third = null;

		while (fL + sL < M) {
			third = second + " " + first;
			int tL = fL + 1 + sL;
			first = second;
			fL = sL;
			second = third;
			sL = tL;
		}
		third = second + " " + first;
		String s = third.substring(M - 1, M);
		if (s.equals(" ")) {
			System.out.println("Messi Messi Gimossi");
		} else {
			System.out.println(s);
		}

	}

}
