package Programmers;

import java.util.Arrays;

public class BoatProblem {
	static public int solution(int[] people, int limit) {
//		int answer = 0;
//		int boat[] = new int[people.length];
//		int boatPeople[]=new int[people.length];
//		for (int add : people) {
//			for (int i = 0; i < boat.length; i++) {
//				if (boat[i] + add <= limit && boatPeople[i]<2) {
//					boatPeople[i]++;
//					boat[i] += add;
//					break;
//				}
//			}
//		}
//		for (int a : boat) {
//			if (a > 0) {
//				answer++;
//			}
//		}
//
//		return answer;
		Arrays.sort(people);

		int start = 0;
		int end = people.length - 1;
		for (; start < end; --end) {
			if (people[start] + people[end] <= limit) {
				++start;
			}
		}
		return people.length - start;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 70, 50, 80, 50 };
		System.out.println(solution(arr, 100));
	}

}
