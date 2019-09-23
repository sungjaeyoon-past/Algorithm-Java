package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P4307 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int len = sc.nextInt();
			int N = sc.nextInt();

			int arr[] = new int[N];

			int min = -1;
			int max = -1;

			for (int j = 0; j < N; j++) {
				int num = sc.nextInt();

				min = Math.max(min, Math.min(num, len - num));
				max = Math.max(max, Math.max(num, len - num));
			}

			bw.write(min + " " + max + "\n");
		}
		bw.flush();
	}

}
