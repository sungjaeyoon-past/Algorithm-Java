package Test;

import java.util.ArrayList;
import java.util.List;

public class IP5 {
	public static int solution(int friendsNodes, List<Integer> friendsFrom, List<Integer> friendsTo,
			List<Integer> friendsWeight) {

		ArrayList<Integer>[] arE = new ArrayList[friendsNodes + 1];
		for (int i = 0; i < friendsNodes + 1; i++) {
			arE[i] = new ArrayList<>();
		}

		// initialize graph
		for (int i = 0; i < friendsFrom.size(); i++) {
			int start = friendsFrom.get(i);
			int end = friendsTo.get(i);
			arE[start].add(end);
			arE[end].add(start);
		}
		
		//add edge with weight
		

		//find max size arr
		int maxSize = 0;
		ArrayList<Integer> list = new ArrayList<>();
		int i = 1;
		for (ArrayList<Integer> a : arE) {
			int curSize = a.size();
			if (curSize > maxSize) {
				list.clear();
				maxSize = curSize;
				list.add(i);
			} else if (curSize == maxSize) {
				list.add(i);
			}
			i++;
		}

		//find max value
		int max = -1;
		for (Integer a : list) {
			for (Integer b : arE[a]) {
				max = Math.max(max, a * b);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		List<Integer> friendsFrom=new ArrayList<>();
		List<Integer> friendsTo=new ArrayList<>();
		List<Integer> friendsWeight=new ArrayList<>();
		
		friendsFrom.add(1);
		friendsFrom.add(1);
		friendsFrom.add(2);
		friendsFrom.add(2);
		friendsFrom.add(2);
		
		friendsTo.add(2);
		friendsTo.add(2);
		friendsTo.add(3);
		friendsTo.add(3);
		friendsTo.add(4);
		
		friendsWeight.add(1);
		friendsWeight.add(2);
		friendsWeight.add(1);
		friendsWeight.add(3);
		friendsWeight.add(3);
		
		System.out.println(solution(4, friendsFrom, friendsTo, friendsWeight));
	}
}
