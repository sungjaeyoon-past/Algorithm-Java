package baekjoon;

import java.util.Scanner;

public class P2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String []in= sc.nextLine().split(" ");
		int si=Integer.parseInt(in[0]);
		int bun=Integer.parseInt(in[1]);
		
		if(bun>=45) {
			bun-=45;
		}else {
			bun= 60-(45-bun);
			si--;
			if(si==-1) {
				si=23;
			}
		}
		System.out.println(si+" "+bun);
	}

}
