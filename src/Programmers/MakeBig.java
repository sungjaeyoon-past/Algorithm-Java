package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MakeBig {
	static public String solution(String number, int k) {
		String answer = "";
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> sortArr = new ArrayList<>();
		for (int i = 0; i < number.length(); i++) {
			int n = Integer.parseInt(number.substring(i, i + 1));
			arr.add(n);
			sortArr.add(n);
		}

		Collections.sort(sortArr);
		Iterator<Integer> sortIt = sortArr.iterator();
		int remove[] = new int[k];
		for (int i = 0; i < k; i++) {
			if (sortIt.hasNext()) {
				remove[i] = sortIt.next();
			}
		}

		for (int i = 0; i < k; i++) {
			for (Iterator<Integer> it = arr.iterator(); it.hasNext();) {
				if (remove[i] == it.next()) {
					it.remove();
					break;
				}
			}
		}

		Iterator<Integer> it2 = arr.iterator();
		for (; it2.hasNext();) {
			answer += it2.next();
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("1924", 2);

	}

}
