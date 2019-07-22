package Test;

import java.util.ArrayList;
import java.util.List;

public class IP4 {
	static public long solution(List<Integer> score, int team, int m) {
		long result = 0;

		while (team > 0) {
			// constraints
			if (score.size() < m) {
				int max = -1;
				int maxIndex = -1;
				for (int i = 0; i < score.size(); i++) {
					int cur = score.get(i);
					if (cur > max) {
						max = cur;
						maxIndex = i;
					}
				}
				result += max;
				score.remove(maxIndex);
				team--;
				continue;
			}

			// find max
			int max = -1;
			int maxIndex = -1;
			for (int i = 0; i < m; i++) {
				// first list
				int cur = score.get(i);
				if (cur > max) {
					max = cur;
					maxIndex = i;
				} else if (cur == max) {// lower index
					if (i < maxIndex) {
						maxIndex = i;
					}
				}

				// last list
				cur = score.get(score.size() - 1 - i);
				if (cur > max) {
					max = cur;
					maxIndex = (score.size() - 1 - i);
				}
			}

			result += max;
			score.remove(maxIndex);
			team--;
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> score = new ArrayList<Integer>();
		int team = 8;
		int m = 3;

		score.add(6);
		score.add(18);
		score.add(8);
		score.add(14);
		score.add(10);
		score.add(12);
		score.add(18);
		score.add(9);
		System.out.println(solution(score, team, m));
	}
}
