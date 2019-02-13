package Programmers;

import java.util.HashMap;
import java.util.Iterator;

public class FailRate {
	static public int[] solution(int N, int[] stages) {
		int answer[] = new int[N];
		int reach[] = new int[N];
		int fail[] = new int[N];
		HashMap<Integer, Double> map = new HashMap<Integer, Double>();
		for (int stage : stages) {
			stage--;
			if (stage == N) {
				for (int i = 0; i < N; i++) {
					reach[i]++;
				}
			} else {
				for (int i = 0; i <= stage; i++) {
					reach[i]++;
				}
				fail[stage]++;
			}
		}
		for(int i=0;i<reach.length;i++) {
			map.put(i+1, (double)reach[i]/(double)fail[i]);
		}
		Iterator<Integer> it=map.keySet().iterator();
		while(it.hasNext()) {
			Integer key=it.next();
			System.out.println(map.get(key));
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 1, 2, 6, 2, 4, 3, 3 };
		solution(5, arr);
	}

}
