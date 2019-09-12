package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Person1946 {
	public int A;
	public int B;

	public Person1946(int a, int b) {
		A = a;
		B = b;
	}

}

public class P1946 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for (int t = 0; t < T; t++) {

			ArrayList<Person1946> arr = new ArrayList<>();

			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				arr.add(new Person1946(a, b));
			}

			Collections.sort(arr, new Comparator<Person1946>() {
				@Override
				public int compare(Person1946 o1, Person1946 o2) {
					return Integer.compare(o1.A, o2.A);
				}

			});

			int count = 1;
			int rank = arr.get(0).B;

			for (int i = 1; i < N; i++) {
				Person1946 p = arr.get(i);
				if (p.B < rank) {
					count++;
					rank = p.B;
				}
			}

			System.out.println(count);
		}

	}

}
