package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10818 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String[] input = br.readLine().split(" ");
		int max = -1000000001;
		int min = 1000000001;
		for (int i = 0; i < input.length; i++) {
			int num = Integer.parseInt(input[i]);
			if (num > max)
				max = num;
			if (min > num)
				min = num;
		}
		System.out.println(min+" "+max);

	}

}
