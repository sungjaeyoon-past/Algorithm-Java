package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P2309 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++) {
			int num = Integer.parseInt(br.readLine());
			ar.add(num);
			sum += num;
		}
		int cha = sum - 100;
		boolean brk = false;
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if ((ar.get(i) + ar.get(j)) == cha) {
					ar.set(i, 0);
					ar.set(j, 0);
					brk = true;
					break;
				}
			}
			if (brk)
				break;
		}

		Collections.sort(ar);
		for (int i = 2; i < 9; i++) {
			System.out.println(ar.get(i));
		}
	}

}
