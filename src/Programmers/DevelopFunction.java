package Programmers;

import java.util.*;

public class DevelopFunction {
	static public int[] solution(int[] progresses, int[] speeds) {

		// 스텍에 삽입
		LinkedList<Integer> stack = new LinkedList<Integer>();
		LinkedList<Integer> stackSpeed = new LinkedList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int s : progresses) {
			stack.add(s);
		}
		for (int s : speeds) {
			stackSpeed.add(s);
		}

		while (stack.size() != 0) {

			int go = 0;
			Iterator<Integer> it = stack.iterator();
			Iterator<Integer> itS = stackSpeed.iterator();
			// 스택 progress +=speeds를 계속 더함
			for (int i = 0; it.hasNext(); i++) {
				stack.set(i, it.next() + itS.next());
			}

			Iterator<Integer> it2 = stack.iterator();
			if(it2.next()>=100) {
				go++;
				for(;it2.hasNext();) {
					if(it2.next()<100) {
						break;
					}
					go++;
				}
			}

			for (int i = 0; i < go; i++) {
				stack.remove(0);
				stackSpeed.remove(0);
			}
			if(go>0) {				
				result.add(go);
			}
		}
		int answer[]=new int[result.size()];

		Iterator<Integer> iter=result.iterator();
		for(int i=0;iter.hasNext();i++) {
			answer[i]=iter.next();
		}
		
		for(int a:answer) {
			System.out.print(a+" ");
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {93,30,55};
		int arr2[]= {1,30,5};
		solution(arr, arr2);

	}

}
