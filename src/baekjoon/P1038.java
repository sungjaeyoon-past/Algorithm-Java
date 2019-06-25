package baekjoon;

import java.util.Scanner;

public class P1038 {
	public static boolean decentNum(int num) {//10의자리 이상
		String number=""+num;
		String []arr=number.split("");
		int max=10;
		for(String a:arr) {
			int cur=Integer.parseInt(a);
			if(cur<max) {
				max=cur;
			}else {
				return false;
			}
		}		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int object = sc.nextInt();
		if (object <= 10) {
			System.out.println(object);
		} else {
			int current = 10;
			int currentNum = 20;
			for (; current != object; currentNum++) {
				//System.out.print("테스트:"+currentNum);
				if (decentNum(currentNum)) {// 하강숫자가 맞다
					current++;
					//System.out.print(" 맞음 ");
				}
				//System.out.println();
			}
			System.out.println(--currentNum);
		}
		sc.close();

	}

}
