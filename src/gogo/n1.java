package gogo;

import java.util.ArrayList;
import java.util.Iterator;

public class n1 {
	static int weight(String str) {
		int w = 0;
		for (int i = 0; i < str.length(); i++) {
			w += Integer.parseInt(str.substring(i, i + 1));
		}
		return w;
	}

	static public String orderWeight(String strng) {
		ArrayList<String> arr = new ArrayList<String>();

		String[] strngs = strng.split(" ");
		String answer = "";
		for (String s : strngs) {
			System.out.println(s + "-" + weight(s));
		}

		for (String s : strngs) {
			arr.add(s);
		}

		while (!arr.isEmpty()) {
			int minIndex = 0;
			int min = 99999;
			Iterator<String> it = arr.iterator();
			for (int i = 0; it.hasNext(); i++) {
				String cur = it.next();
				if (weight(cur) < min) {
					min = weight(cur);
					minIndex = i;
				}else if(weight(cur)==min) {
					if(cur.compareTo(arr.get(minIndex))>0) {
						minIndex=i;
					}
				}
			}
			answer += arr.get(minIndex) + " ";

			arr.remove(minIndex);
		}

		return answer.substring(0, answer.length() - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(orderWeight("11 11 2000 10003 22 123 1234000 44444444 9999"));
	}

}
