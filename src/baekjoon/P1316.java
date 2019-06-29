package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int TEST_CASE = Integer.parseInt(br.readLine());


		int result = 0;
		for (int i = 0; i < TEST_CASE; i++) {
			String input = br.readLine();
			boolean[] used = new boolean[26];
			boolean isGroup = true;
			char pre = 0;
			for (int j = 0; j < input.length(); j++) {
				if(j!=0) {
					if(pre==input.charAt(j))continue;
				}
				if (used[input.charAt(j) - 97]) {
					isGroup = false;
					break;
				} else {
					used[input.charAt(j)-97] = true;
				}
				pre=input.charAt(j);
			}
			if (isGroup) {
				result++;
			}

		}
		System.out.println(result);


	}

}
