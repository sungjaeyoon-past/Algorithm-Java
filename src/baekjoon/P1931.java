package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Time1931 {
	public int start;
	public int end;

	Time1931(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class P1931 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		ArrayList<Time1931> ar = new ArrayList<>();

		int N = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			ar.add(new Time1931(s, e));
		}

		Collections.sort(ar, new Comparator<Time1931>() {
			@Override
			public int compare(Time1931 o1, Time1931 o2) {
				if (o1.end == o2.end) {
					return Integer.compare(o1.start, o2.start);
				}
				return Integer.compare(o1.end, o2.end);
			}
		});

		int count = 0;
		int end = -1;

		for (Time1931 a : ar) {
			System.out.println(a.start + " " + a.end);
			if (a.start >= end) {
				end = a.end;
				count++;
			}
		}
		System.out.println(count);

	}

}
