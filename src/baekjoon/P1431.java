package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Serial1431 {
	public int sum;
	public String fullName;

	public Serial1431(String fullName) {
		this.fullName = fullName;
		this.sum = 0;
		for (int i = 0; i < fullName.length(); i++) {
			int j = (int) fullName.charAt(i);
			if (j >= 48 && j <= 57) {
				sum += (j - 48);
			}
		}
	}
}

public class P1431 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		ArrayList<Serial1431> ar = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String in = br.readLine();
			ar.add(new Serial1431(in));
		}

		Collections.sort(ar, new Comparator<Serial1431>() {
			@Override
			public int compare(Serial1431 o1, Serial1431 o2) {
				if (o1.fullName.length() > o2.fullName.length()) {
					return 1;
				} else if (o1.fullName.length() < o2.fullName.length()) {
					return -1;
				} else {// equal length
					if (o1.sum > o2.sum) {
						return 1;
					} else if (o1.sum < o2.sum) {
						return -1;
					} else {// equals num
						return o1.fullName.compareTo(o2.fullName);
					}
				}
			}
		});

		for (Serial1431 s : ar) {
			System.out.println(s.fullName);
		}

	}

}
