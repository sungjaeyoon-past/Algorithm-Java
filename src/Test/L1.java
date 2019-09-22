package Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class L1 {
	/*
	 * 5 2 4 3 5 2 8
	 */
	public static void solve() {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		Queue<Integer> m = new LinkedList<>();

		for (int i = 0; i < A; i++) {
			m.add(sc.nextInt());
		}

		// 큐 만들
		Queue<Integer> q[] = new LinkedList[B];
		for (int i = 0; i < B; i++) {
			q[i] = new LinkedList<>();
		}

		int time = -1;
		while (!m.isEmpty()) {
			//time++;
			for (int i = 0; i < B; i++) {
				//System.out.print(time + " " + i + " " + q[i].peek() + "\n");
				//System.out.println("------");
				if (q[i].isEmpty()) {
					q[i].add(m.poll());
				} else {
					int num = q[i].poll();
					num--;
					if (num != 0) {
						q[i].add(num);
					} else {
						q[i].add(m.poll());
					}
				}
			}
			time++;

		}
		//System.out.println(time);

		int max = -1;
		for (int i = 0; i < B; i++) {
			if (!q[i].isEmpty()) {
				int num = q[i].poll();
				if (num > max)
					max = num;
			}
		}

		System.out.println(time + max);

	}

}
