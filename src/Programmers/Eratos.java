package Programmers;

import java.util.ArrayList;

public class Eratos {
	static public int solution(int n) {
		
		
		boolean[] eratos = new boolean[n + 1];

		ArrayList<Integer> stack = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			if (eratos[i] == false) {
				stack.add(i);
				for (int j = 2; i*j <= n; j++) {
					eratos[i * j] = true;
				}
			}
		}

		return stack.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(10));
		System.out.println(solution(5));
	}

}
