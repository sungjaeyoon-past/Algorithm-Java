package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1448 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		int A=arr[0];
		int B=arr[1];
		int C=arr[2];
		
		
		int result = -1;
		
		for (int i = 3;i<N;i++) {
			int temp=arr[3];
			
			int min = Math.min(A, Math.min(B,C));
			if(temp>min) {
				
			}
			
			
		}

		System.out.println(result);

//		if (Math.pow(A, 2) <= (Math.pow(B, 2) + Math.pow(C, 2))) {
//			result = A + B + C;
//			break;
//		}
	}

}
