package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		st = new StringTokenizer(br.readLine());

		int max = 0;
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			if (num[i] > max)
				max = num[i];
		}
		boolean eratos[]=new boolean[max+1];
		Arrays.fill(eratos,true);
		
		for(int i=2;i<max+1;i++) {
			if(eratos[i]) {
				for(int j=i;j*i<max+1;j++) {
					eratos[i*j]=false;
				}
			}
		}
		
		

	}

}
