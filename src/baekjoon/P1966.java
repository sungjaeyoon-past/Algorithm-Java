package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P1966 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int k = 0; k < T; k++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int result = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			ArrayList<Integer> maxArr = new ArrayList<>();
			LinkedList<Integer> printer = new LinkedList<>();
			for (int i = 0; i < N; i++) {
				int num = Integer.parseInt(st.nextToken());
				maxArr.add(num);
				printer.add(num);
			}

			Collections.sort(maxArr, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					if (o1 > o2) {
						return -1;
					} else if (o1 < o2) {
						return 1;
					} else {
						return 0;
					}
				}
			});
			int count = 0;

			while (maxArr.size() != 0) {
				int printerFirst = printer.getFirst();
				if (printerFirst == maxArr.get(0)) {
					printer.removeFirst();
					maxArr.remove(0);
					count++;
					if (result == 0) {
						System.out.println(count);
						break;
					} else {
						result--;
					}
				} else {
					printer.add(printerFirst);
					printer.removeFirst();
					if (result == 0) {
						result = printer.size() - 1;
					} else {
						result--;
					}
				}
			}
		}

	}

}
