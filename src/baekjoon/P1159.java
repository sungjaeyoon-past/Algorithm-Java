package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P1159 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Map<String, Integer> m = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String a = br.readLine().substring(0, 1);
			if (m.containsKey(a)) {
				m.put(a, m.get(a) + 1);
			} else {
				m.put(a, 1);
			}
		}

		ArrayList<String> result = new ArrayList<>();

		for (Map.Entry<String, Integer> a : m.entrySet()) {
			if (a.getValue() >= 5) {
				result.add(a.getKey());
			}
		}

		Collections.sort(result);
		if (result.size() != 0) {
			for (String a : result) {
				System.out.print(a);
			}
		} else {
			System.out.println("PREDAJA");
		}
	}

}
