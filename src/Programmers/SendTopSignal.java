package Programmers;

public class SendTopSignal {
	static public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        for(int i=heights.length-1;i>0;i--) {
        	System.out.println(i);
        	int cur = heights[i];
        	for(int j=i-1;j>=0;j--) {
        		if(heights[j]>cur) {
        			answer[i]=j+1;
        			break;
        		}
        	}
        }
        for(int a:answer) {
        	System.out.print(a+" ");
        }
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,9,5,7,4};
		int arr2[]= {3,9,9,3,5,7,2};
		solution(arr);
		solution(arr2);
	}

}
