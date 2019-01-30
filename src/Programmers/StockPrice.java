package Programmers;

public class StockPrice {
	static public int[] solution(int[] prices) {
//		정확성은 맞지만 효율성에서망한 케이스.
        int[] answer = new int[prices.length];
        for(int i=0;i<prices.length-1;i++) {//전체를 반
        	for(int j=i+1;j<prices.length;j++) {
        		if(prices[i]>prices[j]||j==prices.length-1) { 			
        			answer[i]=j-i;
        			break;
        		}
        	}
        }
        answer[prices.length-1]=0;
        
        for(int a:answer) {
        	System.out.print(a+" ");
        }
        
        return answer;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {498,501,470,489};
		solution(arr);
	}

}
