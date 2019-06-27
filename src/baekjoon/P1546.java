package baekjoon;

import java.util.Scanner;

public class P1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		
		String []input=sc.nextLine().split(" ");
		int []grade=new int[num];
		int max=0;
		double result=0;
		for(int i=0;i<num;i++) {
			grade[i]=Integer.parseInt(input[i]);
			if(grade[i]>max) max=grade[i];
		}
		
		for(int i=0;i<num;i++) {
			result+=((double)grade[i]/max)*100;
		}
		System.out.printf("%.3f", result/num);
	}

}
