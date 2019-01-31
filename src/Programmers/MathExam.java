package Programmers;

import java.util.Iterator;
import java.util.LinkedList;

public class MathExam {
	static public int[] solution(int[] answers) {
		int number = 0;

		int[] person1 = { 1, 2, 3, 4, 5 }; // 5
		int[] person2 = { 2, 1, 2, 3, 2, 4, 2, 5 }; // 8
		int[] person3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }; // 10

		int count1 = 0, count2 = 0, count3 = 0;

		for (int i = 0; i < answers.length; i++) {
			int a, b, c = 0;
			a = i % 5;
			b = i % 8;
			c = i % 10;
			if (answers[i] == person1[a]) {
				count1++;
			}
			if (answers[i] == person2[b]) {
				count2++;
			}
			if (answers[i] == person3[c]) {
				count3++;
			}
		}
		System.out.println("맞은개수: "+count1);
		System.out.println("맞은개수: "+count2);
		System.out.println("맞은개수: "+count3);
		
		int max=Math.max(count3,Math.max(count1, count2));
		LinkedList<Integer> l=new LinkedList<>();
		if(max==count1) {
			l.add(1);
		}
		if(max==count2) {
			l.add(2);
			
		}
		if(max==count3) {
			l.add(3);
		}

		int result[] = new int[l.size()];
		Iterator<Integer> it=l.iterator();
		for(int i=0;i<l.size();i++) {
			result[i]=it.next();
		}
		for(int a:result) {
			System.out.print(a+" ");
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int arr2[]= {1,3,2,4,2};
		solution(arr);
		solution(arr2);
	}

}
