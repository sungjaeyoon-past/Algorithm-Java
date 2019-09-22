package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1668 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] tro = new int[N];
		for (int i = 0; i < N; i++) {
			tro[i] = Integer.parseInt(br.readLine());
		}

		int max1 = -1;
		int max2 = -1;
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < N; i++) {

			if (tro[i] > max1) {
				max1 = tro[i];
				count1++;
			}

			if (tro[N - 1 - i] > max2) {
				max2 = tro[N - 1 - i];
				count2++;
			}

		}
		System.out.println(count1);
		System.out.println(count2);

	}

}
