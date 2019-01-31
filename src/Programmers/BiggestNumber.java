package Programmers;

import java.util.ArrayList;
import java.util.Iterator;

class Number{
	private double bigNum;
	private int originNum;
	Number(int n){
		this.originNum=n;
		if(n<10) {
			bigNum=n;
		}else if(n<100) {
			bigNum=(double)n/10;
		}else if(n<1000) {
			bigNum=(double)n/100;
		}else if(n==1000) {
			bigNum=1;
		}
	}
	public double getBigNum() {
		return bigNum;
	}
	public int getOriginNum() {
		return originNum;
	}
}			

public class BiggestNumber {
	static public String solution(int[] numbers) {
		String answer = "";
		ArrayList<Number> arr=new ArrayList<Number>();
		
		for(int a:numbers) {
			arr.add(new Number(a));
		}
				
		while(arr.size()!=0) {
			Iterator<Number> it=arr.iterator();
			double max=it.next().getBigNum();
			int maxIndex=0;			
			for(int i=1;it.hasNext();i++) {
				double compare=it.next().getBigNum();
				if(max<compare) {
					max=compare;
					maxIndex=i;
				}
			}
			
			answer+=" "+arr.get(maxIndex).getOriginNum();
			
			arr.remove(maxIndex);
		}	
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 30, 34, 5, 9,802,57};
		System.out.println(solution(arr));
	}

}
