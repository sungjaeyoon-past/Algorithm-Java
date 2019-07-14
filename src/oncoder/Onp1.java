package oncoder;

import java.util.Arrays;

public class Onp1 {

	static public String[] solution(int numPlayers, String deck) {
		String[] result = new String[numPlayers];
		Arrays.fill(result, "");
		int dlen = deck.length();
		if (numPlayers > dlen) {
			return result;
		}

		int end = dlen - (dlen % numPlayers);
		int rotate = 0;
		for (int i = 0; i < end; i++) {
			if (rotate >= numPlayers)
				rotate = 0;
			result[rotate++] += deck.substring(i, i + 1);
		}

		for (String s : result) {
			System.out.println(s);
		}

		return result;
	}

	public static void main(String[] args) {
		// solution();
		int numPlayers = 4;
		String deck = "111122223333";
		solution(numPlayers, deck);
	}

}
