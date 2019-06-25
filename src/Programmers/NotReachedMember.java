package Programmers;

import java.util.HashMap;

public class NotReachedMember {
	static public String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String name : completion) {
			map.put(name, map.getOrDefault(name, 0) + 1);
		}
		System.out.println(map);
		for (String name : participant) {
			if (map.containsKey(name)) {
				if (map.get(name) == 0) {
					return name;
				} else {
					map.replace(name, map.get(name) - 1);
				}
			} else {
				return name;
			}
		}

		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "kiki", "eden" };
		System.out.println(solution(participant, completion));
	}

}
