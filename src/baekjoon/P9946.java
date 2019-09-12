package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9946 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=1;
		while(true) {
			String in=br.readLine();
			String in2=br.readLine();
			if(in.equals("END") && in2.equals("END")) {
				break;
			}
			int inN[]=new int[26];
			for(int i=0;i<in.length();i++) {
				inN[in.charAt(i)-97]++;
			}
			for(int i=0;i<in2.length();i++) {
				inN[in2.charAt(i)-97]--;
			}
			boolean same=true;
			for(int i=0;i<26;i++) {
				if(inN[i]!=0) {
					same=false;
					break;
				}
			}
			if(same) {
				System.out.println("Case "+T+": same");
			}else {
				System.out.println("Case "+T+": different");
			}
			T++;
		}
	}

}
