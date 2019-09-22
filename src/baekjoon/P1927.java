package baekjoon;

import java.util.Scanner;

public class P1927 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int heap[]=new int[N+1];
		
		int tail=1;
		
		
		for(int i=1;i<N;i++) {
			int num=sc.nextInt();
			if(num>0) {
				int cur=tail;
				heap[tail++]=num;
				while(true) {
					if(heap[cur/2]<heap[cur]) {
						int temp=heap[cur/2];
						heap[cur/2]=heap[cur];
						heap[cur]=temp;
						cur=cur/2;
					}else {
						break;
					}
				}
				tail++;
			}else {//0
				if(tail==1) {
					System.out.println(0);
				}else {//
					System.out.println(heap);
				}
				
			}
		}

	}

}
