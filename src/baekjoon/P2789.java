package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2789 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split("");
		String result = "";
		String[] com = { "C", "A", "M", "B", "R", "I", "D", "G", "E" };

		for (int i = 0; i < in.length; i++) {
			boolean contain = false;
			for (int j = 0; j < com.length; j++) {
				if (in[i].equals(com[j])) {
					contain = true;
					break;
				}
			}
			if (!contain) {
				result += in[i];
			}
		}

		System.out.println(result);

	}

}
