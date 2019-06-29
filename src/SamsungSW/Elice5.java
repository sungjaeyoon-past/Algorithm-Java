package SamsungSW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Elice5 {
	/*
5 1 
20 10 30 15 25 
13 14 11 14 15 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		double []K= {0,1.53,1.97,2.39,2.68,2.94,3.17,3.21,3.09,
				2.75,2.43,2.02,1.51,1.19,0.76,0.43,0.21,0.17,0.13,0.11};
		
		st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int period=Integer.parseInt(st.nextToken());
		
		String []input=br.readLine().split(" ");
		int []P=new int[N+1];
		for(int i=0;i<N;i++) {
			P[i+1]=Integer.parseInt(input[i]);
		}
		
		String []input2=br.readLine().split(" ");                                                                                       
		int []PQ=new int[N+1];
		for(int i=0;i<N;i++) {
			PQ[i+1]=Integer.parseInt(input2[i])*P[i];
		}
		
		
		
		
	}

}
