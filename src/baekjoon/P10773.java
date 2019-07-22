package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K=Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<K;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num==0) {
				s.pop();
			}else {
				s.push(num);
			}
		}
		int result=0;
		for(Integer a:s) {
			result+=a;
		}
		System.out.println(result);
		
	}

}
