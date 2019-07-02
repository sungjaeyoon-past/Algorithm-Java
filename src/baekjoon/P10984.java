package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10984 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			double scoreSum = 0;
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				double a = Double.parseDouble(st.nextToken());
				double b = Double.parseDouble(st.nextToken());
				sum += a;
				scoreSum += (a * b);
			}
			bw.write(String.format("%d %.1f\n", sum, scoreSum / sum));
		}
		bw.flush();

	}

}
