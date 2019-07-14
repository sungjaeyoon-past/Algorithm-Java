package baekjoon;

import java.util.Scanner;

public class P17294 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String []N=sc.nextLine().split("");
		
		if(N.length==1 || N.length==2) {
			System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
			return;
		}
		
		int c=Integer.parseInt(N[0])-Integer.parseInt(N[1]);
		int pre=Integer.parseInt(N[0]);
		
		for(int i=1;i<N.length;i++) {
			if((pre-c)!=Integer.parseInt(N[i])) {
				System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
				return;
			}
			pre=Integer.parseInt(N[i]);
		}
		System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
	}

}
