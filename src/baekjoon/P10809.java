package baekjoon;

import java.util.Scanner;

public class P10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word=sc.nextLine();
		
		for (char c = 'a' ; c <= 'z' ; c++)
            System.out.print(word.indexOf(c) + " ");
	}

}
