package Programmers;

import java.util.*;

public class NotCompleteAth {
	static public String solution(String[] participant, String[] completion) {
	
//        HashMap<String, Integer> hm=new HashMap<String, Integer>();
//        int number=0;
//        
//        for(String s:completion) {
//        	hm.put(s, number++);
//        }
//        
//        for(String p:participant) {
//        	if(!hm.isEmpty()&&hm.containsKey(p)) {
//        		hm.remove(p);
//        	}else {
//        		answer=p;
//        	}
//        }
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		for (String s : participant) {
			arr.add(s);
		}
		for (String s : completion) {
			arr2.add(s);
		}
		Collections.sort(arr);
		Collections.sort(arr2);
		Iterator<String> it = arr.iterator();
		Iterator<String> it2 = arr2.iterator();
		for (; it.hasNext() && it2.hasNext();) {
			String com = it.next();
			String com2=it2.next();
			System.out.println(com +" 와 "+com2);
			if(com!=com2) {
				return com;
			}
		}
		return it.next();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String participant[] = {"marina", "josipa", "nikola", "vinko", "filipa","kfc"};
		String completion[] = { "josipa", "filipa", "marina", "nikola","vinko" };
		System.out.println("답:"+solution(participant, completion));
	}

}
