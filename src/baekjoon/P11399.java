package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class P11399 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String in[] = br.readLine().split(" ");
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < in.length; i++) {
			arr.add(Integer.parseInt(in[i]));
		}

		Collections.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		});

		int sum = 0;
		int result = 0;
		for (int a : arr) {
			result += sum;
			sum += a;
			result += a;
		}
		System.out.println(result);

	}

}
