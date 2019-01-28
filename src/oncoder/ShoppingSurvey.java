package oncoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ShoppingSurvey {
	static public int solution(int N, int[] s){
		int answer=0;
		int itemNum=s.length;
		int personNum=N;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int a:s) {
			arr.add(a);
		}
		Collections.sort(arr);
		Iterator<Integer> it = arr.iterator();
		for(int i=0;it.hasNext();i++) {
			s[i]=it.next();
		}
//		for(int a:s) {			
//			System.out.println(a);
//		}
		
		int[][]table=new int[personNum][itemNum];
//		for(int i=0;i<personNum;i++) {
//			for(int j=0;j<s[i];j++) {
//				table[i][j]=1;
//			}
//		}
		
		for(int []a:table) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
//		
//		for(int i=0;i<personNum;i++) {
//			boolean check=true;
//			for(int j=0;j<itemNum;j++) {
//				if(table[j][i]==0) {
//					check=false;
//					break;
//				}
//			}
//			if(check) {
//				answer++;
//			}
//		}
//				
		
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {9,9,9,9,9};
		System.out.println(solution(10	, arr));
	}

}
