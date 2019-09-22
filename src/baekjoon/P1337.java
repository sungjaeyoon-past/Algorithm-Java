package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P1337 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		if (N == 1) {
			System.out.println(4);
			return;
		}

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(arr);

		int min = Integer.MAX_VALUE;
		for (int a : arr) {
			int min2 = Integer.MAX_VALUE;
			for (int j = 4; j >= 0; j--) {
				int count = 0;
				int num = a - j;
				for (int i = 0; i < 5; i++) {
					if (arr.contains(num + i))
						count++;
				}
				if ((5 - count) < min2) {
					min2 = 5 - count;
				}
			}
			if (min2 < min)
				min = min2;
		}
		System.out.println(min);

	}

}
