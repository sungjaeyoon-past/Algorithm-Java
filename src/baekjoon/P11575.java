package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P11575 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())%26;
			int b = Integer.parseInt(st.nextToken())%26;
			String in = br.readLine();
			String out = "";
			for (int j = 0; j < in.length(); j++) {
				int c = (int) in.charAt(j) - 65;
				c = (((a * c) + b) % 26) + 65;
				out += (char) c;
			}
			bw.write(out + "\n");
		}
		bw.flush();
	}

}
