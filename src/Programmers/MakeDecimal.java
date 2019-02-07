package Programmers;

public class MakeDecimal {
	static public int solution(int[] nums) {
		int length = nums.length;
		int answer = 0, max1 = -10, max2 = -20, max3 = -30;
		for (int a : nums) {
			if (a > max1) {
				max3 = max2;
				max2 = max1;
				max1 = a;
				continue;
			}
			if (a > max2) {
				max3 = max2;
				max2 = a;
				continue;
			}
			if (a > max3) {
				max3 = a;
			}
		}
		int maxmax = max1 + max2 + max3;

		boolean eratos[] = new boolean[maxmax + 1];
		eratos[0] = true;
		eratos[1] = true;
		for (int i = 2; i <= maxmax; i++) {
			if (eratos[i] == false) {
				for (int j = 2; i * j <= maxmax; j++) {
					eratos[i * j] = true;
				}
			}
		}

		for (int a = 0; a < length - 2; a++) {
			for (int b = a + 1; b < length - 1; b++) {
				for (int c = b + 1; c < length; c++) {
					System.out.print(
							nums[a] + " " + nums[b] + " " + nums[c] + ":" + (nums[a] + nums[b] + nums[c]) + "\n");
					if (eratos[nums[a] + nums[b] + nums[c]] == false) {
						answer++;
					}
				}
			}
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 7, 6, 4 };
		solution(arr);
	}

}
