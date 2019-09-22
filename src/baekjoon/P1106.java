package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Hotel1106 {
	public int cost;
	public int person;

	public Hotel1106(int cost, int person) {
		super();
		this.cost = cost;
		this.person = person;
	}

}

public class P1106 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int people = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		ArrayList<Hotel1106> arr = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int cost = Integer.parseInt(st.nextToken());
			int person = Integer.parseInt(st.nextToken());
			arr.add(new Hotel1106(cost, person));
		}

		Collections.sort(arr, new Comparator<Hotel1106>() {

			@Override
			public int compare(Hotel1106 o1, Hotel1106 o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.person, o2.person);
			}
		});
		
		int [][]DP = new int[N][1000];
		/*
		 *   1-3    2-5   5-3   7-7
		 0  1  2  3  4  5  6  7  8  9  10  11  12 .....
	1	    3  6  9  12  15
	2       3  5
	5
	7	 
		 */
		
		for(int i=0;i<N;i++) {
			
		}
		
		
	}

}
