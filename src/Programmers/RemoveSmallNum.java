package Programmers;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveSmallNum {
	static public int[] solution(int[] arr) {
		if(arr.length==1) {
			int []result= {-1};
			return result;
		}
		
		
		int min=arr[0];
		int minIndex=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				minIndex=i;
			}
		}
		ArrayList<Integer> arl=new ArrayList<Integer>();
		for(int a:arr) {
			if(a!=min) {
				arl.add(a);
			}
		}
		Iterator<Integer> it =arl.iterator();
		int []result=new int[arl.size()];
		
		for(int i=0;it.hasNext();i++) {
			result[i]=it.next();
			System.out.print(result[i]+" ");
		}
		
		return result;			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {4,3,2,1,5,6};
		solution(arr);
		
	}

}
