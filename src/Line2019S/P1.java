package Line2019S;

public class P1 {

	public static void main(String[] args) {
		int C=11;
		int B=2;
		int time=0;
		boolean cat=false;
		while(true) {
			
			time++;
			int conner = C+(time*(time+1))/2;
			
			if(conner>200000) {
				break;				
			}
			
			int DPt[] = new int[time+1];
			int DPl[]=new int[time+1];
			
			DPt[0]=0;
			DPl[0]=B;
			
			for(int i=1;i<=time;i++) {
				/*
				conner-(DPl[i-1]+1)
				conner-(DPl[i-1]*2)
				conner-(DPl[i-1]-1)
				*/
			}
			
			if(DPt[time]==conner) {
				cat=true;
				break;
			}
			System.out.println(conner+" "+DPt[time]);
		}
		if(cat) {
			System.out.println(time);
		}else {			
			System.out.println(-1);
		}
	}

}
