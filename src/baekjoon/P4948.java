package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P4948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		boolean eratos[] = new boolean[123456 * 2 + 1];
		Arrays.fill(eratos, true);
		eratos[1] = false;
		eratos[0] = false;

		for (int i = 2; i < eratos.length; i++) {
			if (eratos[i]) {
				for (int j = 2 * i; j < eratos.length; j += i) {
					eratos[j] = false;
				}
			}
		}

		while (true) {
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			int count = 0;
			for (int i = num + 1; i <= 2 * num; i++) {
				if (eratos[i]) {
					count++;
				}
			}
			System.out.println(count);

		}
	}

}
