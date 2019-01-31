package Programmers;

import java.util.Iterator;
import java.util.LinkedList;


public class Network {
	static public int solution(int n, int[][] computers) {
        int answer = 0;
        
        LinkedList<Integer> arr=new LinkedList<Integer>();//n 개수만큼 있는 링크드리스트
        for(int i=0;i<n;i++) { //0~n-1까지 존
        	arr.add(i);
        }
        
        while(arr.size()!=0) {//링크드 리스트에 있는 모든 값이 없어질때까지.
        	Iterator<Integer> it=arr.iterator();
        	
        	int current=it.next();//현재 값.
        	
        	//current가 포함된 모든 노드 리스트에 추가
        	LinkedList<Integer> connect=new LinkedList<Integer>();
        	
        	
        	//커넥트에 잇는 모든 값을 arr리스트에서 제거
        	for(Iterator<Integer> c=connect.iterator();c.hasNext();) {
        		Iterator<Integer> it2=arr.descendingIterator();
        		
        		for(;it2.hasNext();) {
        			
        		}
        	}
        }
       
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		int arr2[][]= {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
		
		System.out.println("네트워크 수:"+solution(3, arr));
	}

}
