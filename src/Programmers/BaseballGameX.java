package Programmers;

import java.util.ArrayList;
import java.util.Iterator;

public class BaseballGameX {
	static public int solution(int[][] baseball) {
		int answer = 0;
		
		ArrayList<String> arr = new ArrayList<String>();
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				for (int c = 1; c <= 9; c++) {
					String s = "";
					if ((a != b) && (b != c) && (c != a)) {
						s += "" + a + b + c;
					}
					arr.add(s);
				}
			}
		}


		for (int[] a : baseball) {
			String number=""+a[0];
			int strike=a[1];
			int ball=a[2];
			if(strike==3) {
				return 1;
			}
			Iterator<String> it = arr.iterator();
			for (; it.hasNext();) {
				// 조건에 안맞으면 제거.
				if(it.next().equals(number)) {//넘버는 제거.
					it.remove();
				}
				
			}
		}
		
		Iterator<String> it2=arr.iterator();
		for(;it2.hasNext();) {
			System.out.print(it2.next()+" ");
		}

		return arr.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 123, 1, 1 }, { 356, 1, 0 }, { 327, 2, 0 }, { 489, 0, 1 } };
		System.out.println(solution(arr));
	}

}
