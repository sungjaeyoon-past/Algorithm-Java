package baekjoon;

import java.util.Scanner;

public class P2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String []input=sc.nextLine().split(" ");
		int x=Integer.parseInt(input[0]);
		int y=Integer.parseInt(input[1]);
		
		int con_x=0;
		int con_y=0;
		
		for(int i=0;i<3;i++) {
			con_x*=10;
			con_y*=10;
			con_x+=x%10;
			con_y+=y%10;
			x/=10;
			y/=10;
		}
		if(con_x>=con_y) {
			System.out.println(con_x);
		}else {
			System.out.println(con_y);			
		}
	}

}
