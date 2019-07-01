package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P9289 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] mos = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		int TEST_CASE = Integer.parseInt(br.readLine());
		for (int i = 1; i <= TEST_CASE; i++) {
			String[] input = br.readLine().split(" ");
			String word = "";
			for (int k = 0; k < input.length; k++) {
				for (int j = 0; j < mos.length; j++) {
					if (input[k].equals(mos[j])) {
						word += (char) (j + 65);
						break;
					}
				}
			}
			bw.write(String.format("Case %d: %s\n", i, word));
		}
		bw.flush();
		br.close();
		bw.close();

	}

}
