package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class HotterThan {
	static public int solution(int[] scoville, int K) {
		int answer = 0;
		Arrays.sort(scoville);
		ArrayList<Integer>arr =new ArrayList<Integer>();
		for(int a:scoville) {
			if(a<K) {
				arr.add(a);
			}else {
				break;
			}
		}
		Iterator<Integer> it =arr.iterator();
		for(;it.hasNext();) {
			System.out.println(it.next());
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 9, 10, 12 };
		System.out.println(solution(arr, 7));
	}

}
