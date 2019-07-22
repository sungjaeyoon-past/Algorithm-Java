package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P1296 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String []ohmin=br.readLine().split("");
		int []count=new int[4];
		
		for(int i=0;i<ohmin.length;i++) {
			if(ohmin[i].equals("L")) {
				count[0]++;
			}else if(ohmin[i].equals("O")) {
				count[1]++;
			}else if(ohmin[i].equals("V")) {
				count[2]++;
			}else if(ohmin[i].equals("E")) {
				count[3]++;
			}
		}
		
		ArrayList<String> name = new ArrayList<>();
		int max=0;
		int N=Integer.parseInt(br.readLine());		

		for(int i=0;i<N;i++) {
			String in=br.readLine();
			String []girl=in.split("");
			int L=0;
			int O=0;
			int V=0;
			int E=0;
			for(int j=0;j<girl.length;j++) {
				if(girl[j].equals("L")) {
					L++;
				}else if(girl[j].equals("O")) {
					O++;
				}else if(girl[j].equals("V")) {
					V++;
				}else if(girl[j].equals("E")) {
					E++;
				}
			}
			L+=count[0];
			O+=count[1];
			V+=count[2];
			E+=count[3];
			
			int result=(((L+O)%100)*((L+V)%100)*((L+E)%100)*((O+V)%100)*((O+E)%100)*((V+E)%100))%100;
			
			if(result>max) {
				name.clear();
				name.add(in);
				max=result;
			}else if(result==max) {
				name.add(in);
			}
		}
		Collections.sort(name);
		System.out.println(name.get(0));
		
		
	}
}
