package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P7785 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map<String, Integer> m = new HashMap<String, Integer>();

		int n = Integer.parseInt(br.readLine());
		int locate;
		for (int i = 0; i < n; i++) {
			String[] in = br.readLine().split(" ");
			if (in[1].equals("enter")) {
				locate = 1;
			} else {
				locate = 0;
			}
			m.put(in[0], locate);
		}
		ArrayList<String> arr = new ArrayList<>();
		Set<Entry<String, Integer>> s =  m.entrySet();
		for(Entry<String, Integer> a:s) {
			if(a.getValue()==1) {
				arr.add(a.getKey());
			}
		}
		String [] ar = arr.toArray(new String[arr.size()]);
		Arrays.sort(ar);

		for(int i=ar.length-1;i>=0;i--) {
			System.out.println(ar[i]);
		}
	}

}
