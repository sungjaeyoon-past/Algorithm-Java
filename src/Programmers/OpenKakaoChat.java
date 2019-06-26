package Programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OpenKakaoChat {
	
	public static String[] solution(String[] records) {
        String[] answer = {};
        Map<String, String> m = new HashMap<>();
        String []type=new String[records.length];
        String []uidList=new String[records.length];
        ArrayList<String> result = new ArrayList<>();
        
        int i=0;
        for(String record:records) {
        	String []in = record.split(" ");
        	if(in[0].equals("Enter")) {
        		m.put(in[1],in[2]);
        		type[i]="E";
        		uidList[i]=in[1];
        	}else if(in[0].equals("Change")) {
        		m.put(in[1],in[2]);
        		type[i]="C";
        	}else if(in[0].equals("Leave")) {
        		type[i]="L";
        		uidList[i]=in[1];
        	}
        	i++;
        }
        for(int j=0;j<type.length;j++) {
        	if(type[j].equals("E")) {
        		result.add(String.format("%s님이 들어왔습니다.",m.get(uidList[j])));
        	}else if(type[j].equals("L")) {
        		result.add(String.format("%s님이 나습니다.",m.get(uidList[j])));
        	}
        }
        for(String a:result) {
        	System.out.println(a);
        }
        
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] record= {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		solution(record);
	}

}
