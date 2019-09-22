package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class L2 {
	static boolean visited[];
	static String arr[];
	static public int N;
	static public int count;
	static public int order;

	public static void combi(String s, int len) {
		if (len == 0) {
			count++;
			//System.out.println(s+" "+count);
			if (count == order) {
				System.out.println(s);
			}
		} else {
			for (int i = 0; i < N; i++) {
				if (!visited[i]) {
					visited[i] = true;
					combi(s + arr[i], len - 1);
					visited[i] = false;
				}
			}

		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in[] = br.readLine().split(" ");
		order = Integer.parseInt(br.readLine());
		count = 0;

		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < in.length; i++) {
			a.add(Integer.parseInt(in[i]));
		}

		Collections.sort(a);

		N = in.length;
		visited = new boolean[N];
		arr = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = "" + a.get(i);
		}

		combi("", N);
	}
}
