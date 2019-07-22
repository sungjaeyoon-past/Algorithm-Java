package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P11008 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			String ori = st.nextToken();
			String copy = st.nextToken();
			int oriLen = ori.length();
			int copyLen = copy.length();
			ori = ori.replace(copy, "");
			int result = ori.length() + ((oriLen - ori.length()) / copyLen);
			bw.write(result + "\n");
		}
		bw.flush();

	}

}
