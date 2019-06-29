package baekjoon;

import java.util.Scanner;

public class P5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String []input = sc.nextLine().split("");
		int result=0;
		
		for(String a:input) {
			char b=a.charAt(0);
			if('A'<=b &&b<='C') {
				result+=3;
			}
			if('D'<=b &&b<='F') {
				result+=4;
			}
			if('G'<=b &&b<='I') {
				result+=5;
			}
			if('J'<=b &&b<='L') {
				result+=6;
			}
			if('M'<=b &&b<='O') {
				result+=7;
			}
			if('P'<=b &&b<='S') {
				result+=8;
			}
			if('T'<=b &&b<='V') {
				result+=9;
			}
			if('W'<=b &&b<='Z') {
				result+=10;
			}
		}
		System.out.println(result);
	}

}
