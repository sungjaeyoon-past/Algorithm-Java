package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10797 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int result=0;
		
		st= new StringTokenizer(br.readLine());
		int day=Integer.parseInt(st.nextToken());
		String []list= br.readLine().split(" ");
		
		for(String a:list) {
			if(day==Integer.parseInt(a))result++;
		}
		wr.write(result+"\n");
		wr.flush();
		br.close();
		wr.close();
		
	}

}
