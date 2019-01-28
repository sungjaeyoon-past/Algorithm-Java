package oncoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ProgrammingContest {

	static public int[] solution(int T, int[] requiredTime){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int a:requiredTime) {
			arr.add(a);
		}
		Collections.sort(arr);
		int winPoint=0;
		int minusPoint=0;
		int time=0;
		Iterator<Integer> it =arr.iterator();
		int sortArr[]=new int[requiredTime.length];
		for(int i=0;it.hasNext();i++) {
			sortArr[i]=it.next();
		}
//		for(int a:sortArr) {
//			System.out.print(a+" ");
//		}
		
//		for(int i=0;time<=T;i++) {
//			if(sortArr[i]+time<T) {
//				winPoint++;
//				time+=sortArr[i];
//				minusPoint+=time;
//			}else {
//				break;
//			}
//		}
		int num=0;
		while(true) {
			if((num>sortArr.length-1) || ((sortArr[num]+time)>T) )break;
			winPoint++;
			time+=sortArr[num];
			minusPoint+=time;
			num++;
		}
		
//		for(;time<=T;) {
//			int currentProblem=it.next();
//			if(currentProblem+time<T) {
//				winPoint++;
//				time+=currentProblem;
//				minusPoint+=time;
//			}
//		}
		
        return new int[]{winPoint,minusPoint};
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []requiredTime= {12,3,21,6,4,13};
		int []result=solution(47, requiredTime);
		System.out.println(result[0]+" "+result[1]);
	}

}
