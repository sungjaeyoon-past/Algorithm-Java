package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10953 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		for (int i = 0; i < a; i++) {
			String[] in = br.readLine().split(",");
			System.out.println(Integer.parseInt(in[0]) + Integer.parseInt(in[1]));
		}

	}
}
