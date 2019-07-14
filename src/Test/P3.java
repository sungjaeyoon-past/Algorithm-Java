package Test;

public class P3 {
	public static String solution(String p,int n) {
		String APM=p.substring(0,2);
		String []time=p.substring(3,p.length()).split(":");
		
		int si=Integer.parseInt(time[0]);
		int bun=Integer.parseInt(time[1]);
		int cho=Integer.parseInt(time[2]);
		
		if(APM.equals("PM")) {
			si+=12;			
		}
		
		if(APM.equals("AM")) {
			si=24-si;		
		}
				
		//add cho
		cho+=n;
		if(cho>=60) {
			int mok=cho/60;
			cho=cho%60;
			bun+=mok;
		}
		
		//add bun
		if(bun>=60) {
			int mok=bun/60;
			bun=bun%60;
			si+=mok;
		}
		
		//si -> 0~23
		if(si>23) {
			si=si%24;
		}
		
		//num->String
		String sSi="";
		String sBun="";
		String sCho="";
		
		if(si<10) {
			sSi+="0";
			sSi+=si;
		}else {
			sSi+=si;
		}
		if(bun<10) {
			sBun+="0";
			sBun+=bun;
		}else {
			sBun+=bun;
		}
		if(cho<10) {
			sCho+="0";
			sCho+=cho;
		}	else {
			sCho+=cho;			
		}
		return String.format("%s:%s:%s",sSi,sBun,sCho);
	}
	public static void main(String[] args) {
		System.out.println(solution("PM 01:00:00", 10));
		System.out.println(solution("PM 11:59:59", 1));
		System.out.println("----");
		System.out.println(solution("AM 00:01:00",0));
		System.out.println(solution("PM 12:01:00", 0));
		
		
	}

}
