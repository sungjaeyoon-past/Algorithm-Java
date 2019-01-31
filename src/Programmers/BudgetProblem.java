package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class BudgetProblem {
	 static public int solution(int[] d, int budget) {
	      int answer = 0;
	      ArrayList<Integer> l=new ArrayList<>();
	      //LinkedList<Integer> l=new LinkedList<Integer>();
	      for(int a:d) {
	    	  l.add(a);
	      }
	      Collections.sort(l);
	      int sum=0;
	      Iterator<Integer> it=l.iterator();
	      for(;sum<=budget;) {
	    	  if(it.hasNext()) {
	    		  int cur=it.next();
	    		  if(cur+sum<=budget) {
	    			  sum+=cur;
	    			  answer++;
	    			  System.out.print(cur+" ");
	    		  }else {
	    			  break;
	    		  }
	    	  }else {
	    		  break;
	    	  }
	      }	      
	      
	      return answer;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,3,2,5,4};
		int []arr2= {2,2,3,3};
		System.out.println(solution(arr, 9));
		System.out.println(solution(arr2, 10));
	}

}
