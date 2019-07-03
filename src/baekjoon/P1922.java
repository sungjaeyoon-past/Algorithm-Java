package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 6
9
1 2 5
1 3 4
2 3 2
2 4 7
3 4 6
3 5 11
4 5 3
4 6 8
5 6 8
 */
class Line1922 implements Comparable<Line1922> {
	public int start;
	public int end;
	public int cost;

	public Line1922(int start, int end, int cost) {
		super();
		this.start = start;
		this.end = end;
		this.cost = cost;
	}

	@Override
	public int compareTo(Line1922 o) {
		if (o.cost > this.cost) {
			return -1;
		} else {
			return 1;
		}
	}

}

public class P1922 {
	static int[] union;

	static public void setParent(int a, int b) {
		a = getParent(a);
		b = getParent(b);
		if (a < b) {
			union[b] = a;
		} else {
			union[a] = b;
		}
	}

	static public int getParent(int index) {
		if (union[index] == index) {
			return index;
		} else {
			return getParent(union[index]);
		}
	}

	public static boolean find(int a, int b) {
		a = getParent(a);
		b = getParent(b);
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		ArrayList<Line1922> ar = new ArrayList<>();

		union = new int[N + 1];
		for (int i = 1; i < N + 1; i++) {
			union[i] = i;
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			ar.add(new Line1922(start, end, cost));
		}

		Collections.sort(ar);

		int result = 0;
		for (Line1922 a : ar) {
			if (!find(a.start, a.end)) {
				result += a.cost;
				setParent(a.start, a.end);
			}
		}
		
		System.out.println(result);

	}
}
