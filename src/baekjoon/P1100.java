package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1100 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result=0;
		for(int i=0;i<8;i++) {
			String []input = br.readLine().split("");
			int j=0;
			if(i%2==0) {
				j=0;
			}else {
				j=1;			
			}
			for(;j<8;j+=2) {
				if(!input[j].equals(".")) {
					result++;
				}
			}
		}
		System.out.println(result);
	}

}
