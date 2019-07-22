package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14501 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[] costDay = new int[N + 20];
		int[] money = new int[N + 20];
		int DP[] = new int[N + 20];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			costDay[i] = Integer.parseInt(st.nextToken());
			money[i] = Integer.parseInt(st.nextToken());
		}

		int max = 0;
		for (int i = 1; i <= N + 1; i++) {
			DP[i] = Math.max(DP[i], max);
			DP[i + costDay[i]] = Math.max(DP[i] + money[i], DP[i + costDay[i]]);
			max = Math.max(max, DP[i]);
		}
		System.out.print(max);

	}

}
