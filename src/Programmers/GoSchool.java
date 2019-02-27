package Programmers;

import java.util.stream.IntStream;

public class GoSchool {
	static public int solution(int m, int n, int[][] puddles) {
		int answer = 0;
		int[][] dp = new int[m + 2][n + 2];
		int[][] temp = new int[m + 2][n + 2];

		IntStream.range(0, puddles.length).forEach(i -> temp[puddles[i][0]][puddles[i][1]] = -1);

		dp[0][1] = 1;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (temp[i][j] == -1) {
					dp[i][j] = 0;
				} else {
					dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000007;
				}
			}
		}
//		for(int []ar:dp) {
//			for(int t:ar) {
//				System.out.print(t+" ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for(int []ar:temp) {
//			for(int t:ar) {
//				System.out.print(t+" ");
//			}
//			System.out.println();
//		}

		answer = dp[m][n];

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 2, 2 } };
		System.out.println(solution(4, 3, arr));
	}

}
