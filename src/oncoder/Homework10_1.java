package oncoder;

public class Homework10_1 {
	static public int solution(int[] marks) {
		int num = marks.length;
		int sum = 0;
		for (int a : marks) {
			sum += a;
		}
		while ((double) sum / num < 9.5) {
			System.out.println(sum + " " + num + " " + (double) sum / num);
			num++;
			sum += 10;
		}
		return num - marks.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, 9, 10 };
		System.out.println(solution(arr));
	}

}
