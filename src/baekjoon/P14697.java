package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P14697 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		int C=Integer.parseInt(st.nextToken());
		int result=Integer.parseInt(st.nextToken());
		
		for(int i=0;i<=50;i++) {
			for(int j=0;j<=50;j++) {
				for(int k=0;k<=50;k++) {
					int num=(A*i)+(B*j)+(C*k);
					if(num==result) {
						System.out.println(1);
						return;
					}else if(num>result) {
						break;
					}
				}
			}
		}
		System.out.println(0);
		
		
	}

}
