package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1120 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		String A = st.nextToken();
		String B = st.nextToken();

		int min = Integer.MAX_VALUE;

		for (int i = 0; i <= B.length() - A.length(); i++) {
			int sum = 0;
			for (int j = 0; j < A.length(); j++) {
				// compare j <-> i+j
				if (A.charAt(j) != B.charAt(i + j)) {
					sum++;
				}
			}
			if (sum < min)
				min = sum;
		}

		System.out.println(min);
	}

}
