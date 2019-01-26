package Programmers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Node{
	private int location;
	private int priorities;
	public Node(int location, int priorities) {
		this.location = location;
		this.priorities = priorities;
	}
	public int getPriorities() {
		return this.priorities;
	}
	public int getLocation() {
		return location;
	}
}

public class Printer {
	static public boolean checkMax(ArrayList<Node> arr) {
		Iterator it = arr.iterator();
		int first=((Node) it.next()).getPriorities();		
		for(;it.hasNext();) {
			Node current=(Node) it.next();
			if(current.getPriorities()>first) {
				return false;
			}
		}
		return true;
	}
	public static int solution(int[] priorities, int location) {
		int answer = 0;
		
		ArrayList<Node> arr = new ArrayList<Node>();
		
		int number=0;
		for(int a:priorities) {			
			Node n = new Node(number++,a);
			arr.add(n);
		}
		
		
		while(!arr.isEmpty()) {
			Iterator<Node> its= arr.iterator();
			for(;its.hasNext();) {
				System.out.print(its.next().getPriorities()+" ");
			}
			System.out.println();
			Iterator<Node> it= arr.iterator();
			boolean ch=checkMax(arr);
			
			Node ne=it.next();
			if(ch) {//맨앞에께 로케이션인지
				answer++;
				if(ne.getLocation()==location) {
					return answer;
				}
			}else {//맨뒤에 다시 추가
				arr.add(ne);
			}		
			arr.remove(0);
		}				
		return answer;
		
//		LinkedList<Integer> l = new LinkedList<>();
//		for (int a : priorities) {
//			l.add(a);
//		}
//		Iterator<Integer> it;
//		for (; l.size() > 0;) {
//			it = l.iterator();
//			int first = it.next();
//			int max = first;
//
//			for (; it.hasNext();) {
//				int current = it.next();
//				if (current > max) {
//					max = current;
//					l.removeFirst();
//					l.add(first);
//					break;
//				}
//			}
//
//			if (first == max) {
//				l.removeFirst();
//				System.out.println("삭제");
//			}
//			answer++;
//		}
//		
////		
////		it = l.iterator();
////		for (; it.hasNext();) {
////			System.out.println(it.next());
////		}

	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 3, 2 };
		int arr2[] = {1, 1, 9, 1, 1, 1};
		int loc = 2;
		int loc2 = 0;
		System.out.println(solution(arr, loc));
		System.out.println(solution(arr2, loc2));
		
	}

}
