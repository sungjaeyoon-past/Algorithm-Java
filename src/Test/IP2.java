package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IP2 {
	static public List<Long> solution(List<String> operations, List<Integer> X) {
		
		List<Long> result = new ArrayList<>();
		Stack<Integer> s = new Stack<>();
		
		for(int i=0;i<operations.size();i++) {
			
			String op = operations.get(i);
			Integer x = X.get(i);
			
			if(op.equals("push")) {
				s.push(x);
			}else if(op.equals("pop")) {
				s.remove(x);
			}
			
			int min=Integer.MAX_VALUE;
			int max=-Integer.MAX_VALUE;
			
			for(Integer cur:s) {
				if(cur>max) max=cur;
				if(cur<min) min=cur;
			}
			result.add((long) (max*min));
		}
		
		return result;	
	}

	public static void main(String[] args) {
		List<String> operations=new ArrayList<String>();
		List<Integer> X=new ArrayList<Integer>();
		
		operations.add("push");
		operations.add("push");
		operations.add("push");
		operations.add("pop");
		
		X.add(1);
		X.add(2);
		X.add(3);
		X.add(1);
		
		solution(operations, X);
	}

}
