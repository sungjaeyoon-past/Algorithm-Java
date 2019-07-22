package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P9372 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			String in[]=br.readLine().split(" ");
			for(int j=0;j<Integer.parseInt(in[1]);j++) {
				br.readLine();
			}
			System.out.println(Integer.parseInt(in[0])-1);
		}
		
		
	}

}
