package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Person10814 implements Comparable<Person10814> {
	public int age;
	public String name;

	public Person10814(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Person10814 o) {
		if (this.age < o.age) {
			return -1;
		} else {
			return 1;
		}
	}

}

public class P10814 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		Person10814[] p = new Person10814[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			p[i] = new Person10814(age, name);
		}

		Arrays.sort(p);

		for (int i = 0; i < N; i++) {
			bw.write(String.format("%d %s\n", p[i].age, p[i].name));
		}

		bw.flush();

	}

}
