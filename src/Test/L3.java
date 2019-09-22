package Test;

import java.util.Scanner;

public class L3 {

	/*
	 * 3 0 10 10 15 20 30
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int graph[][] = new int[N][150];
		for (int i = 0; i < N; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			for (int j = start; j < end; j++) {
				graph[i][j] = 1;
			}
		}
		int time[] = new int[150];

		int max = -1;
		for (int i = 0; i < 150; i++) {
			int count = 0;

			for (int j = 0; j < N; j++) {
				if (graph[j][i] == 1) {
					count++;
				}
			}
			time[i] = count;
			if (count > max) {
				max = count;
			}
		}

		System.out.println(max);
	}
}
