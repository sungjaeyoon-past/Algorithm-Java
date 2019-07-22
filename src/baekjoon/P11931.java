package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class P11931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=0;i<N;i++) {
			ar.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(ar, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>=o2) {
					return -1;
				}else if(o1<o2){
					return 1;
				}
				return 0;
				
			}			
		});
		
		for(int a:ar) {
			System.out.println(a);
		}
	}

}
