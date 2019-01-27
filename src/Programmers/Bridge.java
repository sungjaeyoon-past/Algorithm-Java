package Programmers;

import java.util.ArrayList;
import java.util.Iterator;

public class Bridge {
	static boolean check(int[]arr) {
		for(int a:arr) {
			if(a!=0) {
				return false;
			}
		}
		return true;
	}
	static public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		ArrayList<Integer> remainTruck = new ArrayList<>();//남아있는 트럭 리스트.
		
		int []bridgeState=new int[bridge_length];//현재 다리위 트럭.
		int currentWeight=0; //다리위 트럭들의 무
		
		for(int a:truck_weights) {
			remainTruck.add(a);
		}
		
		Iterator<Integer> it;
	
		
		while(true) {
			it = remainTruck.iterator();
			answer++; // 1초.
//			for(int i=0;i<bridgeState.length-1;i++) {
//				bridgeState[i+1]=bridgeState[i];
//			}
			for(int i=bridgeState.length-1;i>0;i--) {
				bridgeState[i]=bridgeState[i-1];
			}
			bridgeState[0]=0;
			currentWeight=0;
			for(int i=0;i<bridge_length;i++) {
				currentWeight+=bridgeState[i];
			}
			if(!remainTruck.isEmpty()) {			
				int addTruck=(int)it.next();
				
				if(weight>=currentWeight+addTruck) {//	다음껄 출발해도 공간이 남으
					bridgeState[0]=addTruck;
					remainTruck.remove(0);
				}
			}
			
			for(int b:bridgeState) {
				System.out.print(b+" ");
			}
			System.out.println();
			
			if(check(bridgeState)&&remainTruck.isEmpty()) {
				break;
			}
		}
		
		System.out.println(answer+"초.");
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] truck_weights= {10,10,10,10,10,10,10,10,10,10};
		solution(100, 100, truck_weights);
		//solution(100, 100, truck_weights);
		//solution(2, 10, truck_weights);
		

	}

}
