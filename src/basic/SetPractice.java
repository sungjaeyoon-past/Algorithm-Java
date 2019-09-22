package basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String > s1= new HashSet<>(); 
		Set<String > s2= new TreeSet<>(); 
		Set<String > s3= new LinkedHashSet<>();
		
		
		s1.add("aa");
		s1.add("aa");
		s2.add("aa");
		s3.add("aa");
		
		s1.add("cc");
		s2.add("cc");
		s3.add("cc");
		
		s1.add("bb");
		s2.add("bb");
		s3.add("bb");
		
		Iterator<String> it = s1.iterator();
		Iterator<String> it2 = s2.iterator();
		Iterator<String> it3 = s3.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		while(it2.hasNext()) {
			System.out.print(it2.next()+" ");
		}
		System.out.println();
		while(it3.hasNext()) {
			System.out.print(it3.next()+" ");
		}
		String a[] = s1.toArray(new String[s1.size()]);
	}

}
