package Programmers;

public class ExpressNX {
	static public int solution(int N, int number) {
        int answer = 0;
       int []DP=new int[number+1];
       DP[0]=0;
       if(N!=1) {
    	   DP[1]=2;
       }else {
    	   return number;
       }
       
       for(int i=2;i<=N;i++) {
    	   if(i==N) {
    		   DP[i]=1;
    		   break;
    	   }
    	   if(i==N-1) {
    		   DP[i]=3;
    		   continue;
    	   }
    	   DP[i]=i+1;
       }
       
       for(int b:DP) {
    	   System.out.print(b+" ");
       }
       
       System.out.println();
       for(int i=N+1;i<=number;i++) {
    	   int min=1000;
    	   for(int j=1;j<=i/2;j++) {
    		   if(min>DP[j]+DP[i-j]) {
    			   min=DP[j]+DP[i-j];
    		   }
    	   } 	   
    	   DP[i]=min;
       }
       for(int b:DP) {
    	   System.out.print(b+" ");
       }
       
       answer=DP[number];
       if(answer>8)return -1;
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(5, 12));
		System.out.println(solution(2, 11));
//		System.out.println(solution(4, 10));
//		System.out.println(solution(5, 10));
//		System.out.println(solution(6, 10));
	}

}
