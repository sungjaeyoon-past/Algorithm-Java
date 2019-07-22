package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class P10610 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] number = br.readLine().split("");

		ArrayList<Integer> ar = new ArrayList<>();

		long count = 0;
		boolean hasZero = false;
		for (String num : number) {
			int cur = Integer.parseInt(num);
			if (cur == 0) {
				hasZero = true;
			}
			count += cur;
			ar.add(cur);
		}

		if (hasZero) {
			if (count % 3 == 0) {
				Collections.sort(ar, new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						if (o1 > o2) {
							return -1;
						} else if(o1<o2){
							return 1;
						}else {
							return 0;
						}
					}
				});
				String result = "";
				for (int a : ar) {
					result += a;
				}
				System.out.println(result);
			} else {
				System.out.println(-1);
			}
		} else {
			System.out.println(-1);
		}

	}

}
