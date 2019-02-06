package Programmers;

public class JumpAndTeleport {
	static public int solution(int n) {
		if (n == 1)
			return 1;

		int number = 1;
		int current = n;
		for (; current != 1;) {
			if (current % 2 != 0) {
				current -= 1;
				number++;
			}
			current /= 2;
		}

		return number;

		// down->top 은 효율성에서 통과하지 못하였음.
		// int num = 1;
		// boolean even = true;
		// int goal;
		//
		// if (n % 2 == 0) {// 짝
		// goal = n;
		// } else {// 홀
		// goal = n - 1;
		// even = false;
		// }
		//
		// for (int i = 2; i < 30; i++) {
		// if (goal % (2 * i) == 0) {
		// num++;
		// } else {
		// break;
		// }
		// }
		//
		// int DP[] = new int[goal / (2 * num) + 1];
		// DP[0] = 0;
		// DP[1] = 1;
		//
		// for (int i = 2; i <= goal / (2 * num); i++) {
		// if (i % 2 == 0) {
		// DP[i] = Math.min(DP[i - 1] + 1, DP[i / 2]);
		// } else {
		// DP[i] = DP[i - 1] + 1;
		// }
		// }
		//
		// if (even) {
		// return DP[goal / (2 * num)];
		// } else {
		// return DP[goal / (2 * num)] + 1;
		// }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(5));
		System.out.println(solution(6));
		System.out.println(solution(5000));
		// System.out.println(solution(505339840));
	}

}
