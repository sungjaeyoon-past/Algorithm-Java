package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1725 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		
		for(int i=0;i<N;i++) {
			if(s.isEmpty()) {
				s.push(Integer.parseInt(br.readLine()));
			}else {
				int num=Integer.parseInt(br.readLine());
				
				
			}
		}

	}

}
