package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P10950 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int TEST_CASE=Integer.parseInt(sc.nextLine());
		for(int i=0;i<TEST_CASE;i++) {
			String []input=sc.nextLine().split(" ");
			int num=Integer.parseInt(input[0])+Integer.parseInt(input[1]);
			bw.write(num+"\n");
		}
		bw.flush();
		bw.close();
	}

}
