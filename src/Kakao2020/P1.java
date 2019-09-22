package Kakao2020;

public class P1 {
	static public int solution(String s) {
		int min = s.length();
		if (min == 1)
			return 1;

		for (int i = 1; i <= s.length() / 2; i++) {
			int len = s.length();
			String curS = "";
			int equNum = 0;
			for (int j = 0; j + i <= s.length(); j += i) {
				if (curS.equals(s.substring(j, j + i))) {
					equNum += 1;
				} else {
					if (equNum != 0) {
						len -= (equNum * i);
						len++;
						equNum = 0;
					}
				}
				curS = s.substring(j, j + i);

			}
			if (equNum != 0) {
				len -= (equNum * i);
				len++;
				equNum = 0;
			}

			if (len < min) {
				min = len;
			}
		}
		return min;

	}

	public static void main(String[] args) {
		System.out.println(solution("aabbaccc")); // 7
		System.out.println(solution("ababcdcdababcdcd")); // 9
		System.out.println(solution("abcabcdede")); // 8
		System.out.println(solution("abcabcabcabcdededededede")); // 14
		System.out.println(solution("xababcdcdababcdcd")); // 17
	}

}
