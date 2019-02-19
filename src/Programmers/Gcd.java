package Programmers;

public class Gcd {
	static public int[] solution(int m, int n) {
		int[] answer = new int[2];
		answer[0] = gcd(m, n);
		answer[1]=(m*n)/answer[0];
		return answer;
	}

	public static int gcd(int m, int n) {
		if (n == 0) {
			return m;
		} else {
			return gcd(n, m % n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution(12123, 22314)[0]);
		System.out.println(solution(123, 12324)[1]);
	}

}
