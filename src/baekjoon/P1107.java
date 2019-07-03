package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P1107 {
	public static String []N;
	public static boolean []use= new boolean[10];
	
	/*	 
		String near="";
		for(int i=0;i<N.length;i++) {
			int num=Integer.parseInt(N[i]);
			if(use[num]) {
				near+=num;
			}else {
				
				
			}
		} 	 
	 */
	public static String getNear(int index) {
		if(index>=N.length) {
			return"";
		}
		int num=Integer.parseInt(N[index]);
		if(use[num]) {
			return ""+num+getNear(index+1);
		}else {
			
		}
		
		return "";
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N=br.readLine().split(" ");
		
		Arrays.fill(use, true);
		int m = Integer.parseInt(br.readLine());
		
		String []in2=br.readLine().split(" ");		
		for(int i=0;i<m;i++) {
			use[Integer.parseInt(in2[i])]=false;
		}
		
		for(boolean a:use) {
			System.out.print(a+" ");
		}
		
	}

}
