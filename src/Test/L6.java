package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L6 {
	public static void solve() {

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in[] = br.readLine().split(" ");

		int N = Integer.parseInt(in[0]);

		int sort = 0;
		if (in[1].equals("TOP")) {
			sort = 1;
		} else if (in[1].equals("BOTTOM")) {
			sort = 2;
		} else if (in[1].equals("MIDDLE")) {
			sort = 3;
		}
		int weight[] = new int[N];
		int num[] = new int[N];

		int max = -1;
		int sum = 0;
		for (int i = 0; i < N; i++) {
			in = br.readLine().split(" ");
			int line = Integer.parseInt(in[0]);
			if (line > max) {
				max = line;
			}
			sum += line * in[1].length();
			weight[i] = line;
			num[i] = Integer.parseInt(in[1]);
		}

		int arr[][] = new int[(2 * max) - 1][sum];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 0) {
					System.out.print(".");
				} else {
					System.out.print("#");
				}
			}

			System.out.println();
		}

	}
}
