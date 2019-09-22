package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P9085 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int sum = 0;
			br.readLine();
			for (String a : br.readLine().split(" ")) {
				sum += Integer.parseInt(a);
			}
			bw.write(sum + "\n");
		}
		bw.flush();

	}

}
