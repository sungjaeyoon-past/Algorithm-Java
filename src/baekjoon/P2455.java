package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2455 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int count=0;
		int max =0;
		
		st = new StringTokenizer(br.readLine());
		int minus = Integer.parseInt(st.nextToken());
		int plus = Integer.parseInt(st.nextToken());
		
		count+=plus;
		max=plus;
		
		st = new StringTokenizer(br.readLine());
		minus = Integer.parseInt(st.nextToken());
		plus = Integer.parseInt(st.nextToken());
		
		count-=minus;
		count+=plus;
		if(count>max) max=count;
		st = new StringTokenizer(br.readLine());
		minus = Integer.parseInt(st.nextToken());
		plus = Integer.parseInt(st.nextToken());
		
		count-=minus;
		count+=plus;
		if(count>max) max=count;
		
		st = new StringTokenizer(br.readLine());
		minus = Integer.parseInt(st.nextToken());
		plus = Integer.parseInt(st.nextToken());
		
		count-=minus;
		count+=plus;
		if(count>max) max=count;
		System.out.println(max);

	}

}
