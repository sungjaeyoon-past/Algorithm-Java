package Programmers;

import java.util.ArrayList;
import java.util.Iterator;

public class EnglishEnd {
	public static boolean checkOverlap(String word, ArrayList<String> arr) {
		Iterator<String> it = arr.iterator();
		for (; it.hasNext();) {
			if (word.equals(it.next())) {
				return true;
			}
		}
		return false;
	}

	static public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		ArrayList<String> arr = new ArrayList<String>();

		int currentUser = 1;
		int turn = 1;
		String previous = words[0].substring(0,1);

		for (String word : words) {
			if (checkOverlap(word, arr)) {
				System.out.println(word + "요놈이다!");
				break;
			}
			System.out.println(word.substring(0,1)+" "+previous);
			
			if (!(word.substring(0, 1).equals(previous))) {
				System.out.println(word);
				break;
			}
			arr.add(word);

			currentUser++;
			if (currentUser > n) {
				currentUser = 1;
				turn++;
			}
			previous = word.substring(word.length() - 1);
		}
		if (arr.size() == words.length) {
			answer[0] = 0;
			answer[1] = 0;
		} else {
			answer[0] = currentUser;
			answer[1] = turn;
		}
		System.out.println(answer[0] + ", " + answer[1]);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String[] arr = { "tank", "kick", "know", "wheel", "land", "dream", "mother",
		// "robot", "tank" };
		String[] arr = { "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure",
				"establish", "hang", "gather", "refer", "reference", "estimate", "executive" };
		solution(5, arr);
	}

}
