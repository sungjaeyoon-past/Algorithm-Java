package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1476 {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String []in=br.readLine().split(" ");
			int E=Integer.parseInt(in[0]);
			int S=Integer.parseInt(in[1]);
			int M=Integer.parseInt(in[2]);
			
			int year=0;
			int cur1=0;
			int cur2=0;
			int cur3=0;
			while(true) {
				if(cur1==E && cur2==S &&cur3==M) {
					break;
				}else {
					year++;
					cur1++;
					cur2++;
					cur3++;
					if(cur1>15) cur1=1;
					if(cur2>28) cur2=1;
					if(cur3>19) cur3=1;
				}
			}
			System.out.println(year);
			

	}

}
