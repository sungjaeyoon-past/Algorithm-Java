package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2506 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int result = 0;
		int pre = 0;
		String[] in = br.readLine().split(" ");
		for (int i = 0; i < in.length; i++) {
			if (in[i].equals("1")) {
				pre++;
				result += pre;
			} else {
				pre = 0;
			}
		}
		System.out.println(result);
	}

}
