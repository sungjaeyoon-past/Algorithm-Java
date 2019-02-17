package ProgrammersBinarySearch;

public class 예산 {
	static public int sumBudget(int[] budgets, int max) {
		int sum = 0;
		for (int budget : budgets) {
			if (budget < max) {
				sum += budget;
			} else {
				sum += max;
			}
		}
		return sum;
	}

	static public int solution(int[] budgets, int M) {
		int answer = 0;
		int sum = 0;
		int maxBudget=0;
		for (int budget : budgets) {
			if(budget>maxBudget) {
				maxBudget=budget;
			}
			sum += budget;
		}
		if (M >= sum) {
			return maxBudget;
		}

		int low = 0;
		int high = M;
		int mid = 0;

		while (low+1 < high) {
			System.out.println("low:"+low+" mid:"+mid+" ,high:"+high);
			mid = (low + high) / 2;
			if (sumBudget(budgets, mid) <= M) {
				low = mid;
			} else {
				high = mid;
			}
		}
		System.out.println("low:"+low+" mid:"+mid+" ,high:"+high);

		return mid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 120, 110, 140, 150 };
		System.out.println(solution(arr, 485));
		
	}

}
