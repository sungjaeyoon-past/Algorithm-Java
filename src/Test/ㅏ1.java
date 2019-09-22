package Test;

import java.util.Scanner;
import java.util.Stack;

public class ㅏ1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<Integer> l = new Stack<Integer>();
		
		for(int i=1;i<=5;) {
			System.out.print(String.format("num%d: ",i));
			int in = sc.nextInt();
			if(in%2==0) {
				l.add(in);
				i++;
			}
		}
		
		System.out.println("\n< PRINT >");
		for(int a:l) {
			System.out.print(a+" ");
		}
		System.out.println("\n\n< REVERSE >");
		while(!l.isEmpty()) {
			int num = l.pop();
			int printNum=0;
			if(num<10) {
				printNum=num*10;
			}else {
				while(num!=0) {					
					int mok = num%10;
					printNum*=10;
					printNum+=mok;
					num/=10;
				}
			}
			System.out.print(printNum+" ");
		}
	}

}
