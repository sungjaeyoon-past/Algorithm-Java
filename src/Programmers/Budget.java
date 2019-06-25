package Programmers;

public class Budget {
	static public int calBudget(int[] budgets, int max) {
		int sum = 0;
		for (int a : budgets) {
			if (a >= max) {
				sum += max;
			} else {
				sum += a;
			}
		}
		return sum;
	}

	static public int solution(int[] budgets, int M) {

		int left = 0;
		int right = M;

		while (left+1<right) {
			int mid = left + right;
			System.out.println("left:" + left + "right:" + right);
			if (calBudget(budgets, mid) <= M) {
				left = mid;
			} else {
				right = mid;
			}
			
		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 120, 110, 140, 150 };
		System.out.println(solution(arr, 500));
	}

}
