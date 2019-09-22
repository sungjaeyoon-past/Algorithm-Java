package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class P1302 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stubbu
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		Map<String, Integer> m = new TreeMap<String, Integer>();
		for(int i=0;i<T;i++) {
			String book = br.readLine();
			if(m.containsKey(book)) {
				m.replace(book, m.get(book)+1);
			}else {
				m.put(book,1);
			}
		}
		
		Set<Entry<String, Integer>> s = m.entrySet();
		int max=-1;
		String maxBook="";
		for(Entry<String,Integer>e :s) {
			if(e.getValue()>max) {
				max=e.getValue();
				maxBook=e.getKey();
			}
		}
		System.out.println(maxBook);

	}

}
