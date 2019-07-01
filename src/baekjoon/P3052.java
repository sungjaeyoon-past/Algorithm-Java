package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P3052 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<10;i++) {
			int num=Integer.parseInt(br.readLine());
			m.put(num%42,0);
		}
		System.out.println(m.size());
	}

}
