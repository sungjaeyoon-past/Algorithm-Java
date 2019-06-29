package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] word = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		String input = br.readLine().trim();
		int result = 0;

		int i;
		for (i = 0; i < word.length; i++) {
			if (input.contains(word[i])) {
				input = input.replaceAll(word[i], "*");
			}
		}

		result = input.length();

		bw.write(result + "");
		bw.flush();

		br.close();
		bw.close();

	}

}
