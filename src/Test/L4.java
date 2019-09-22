package Test;

import java.util.Scanner;

public class L4 {
	/*
	 * 7 1 0 1 0 0 0 1
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int start = 0;
		int end = start + 1;
		int max = -1;

		boolean last = false;
		boolean first = false;

		int count = 0;
		
		if(arr[0]==0) {
			first=true;
		}

		while (end != arr.length) {
			if (arr[end - 1] == 0) {
				count++;
				end++;
			} else {
				if (count >= max) {
					max = count;
					first=false;
				}
				count = 0;
				start = end;
				end = start + 1;
			}

			if (end == arr.length) {
				if (arr[end - 1] == 0 && count>=max) {
					last = true;
					count++;
					//System.out.println("??");
				}
			}
		}
		if (count > max) {
			max = count;
		}

		if (last) {
			System.out.println(max);
		} else if (first) {
			System.out.println(max);
		} else {
			if (max % 2 == 0) {
				System.out.println(max / 2);
			} else {
				System.out.println((max / 2) + 1);
			}
		}

	}
}
