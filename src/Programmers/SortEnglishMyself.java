package Programmers;

import java.util.Iterator;
import java.util.LinkedList;

public class SortEnglishMyself {
	static public String[] solution(String[] strings, int n) {
		String temp[]= new String[strings.length];
		LinkedList<String> l=new LinkedList<>();
		for(String a:strings) {
			l.add(a);
		}
		int index=0;
		
		while(l.size()!=0) {
			Iterator<String> it=l.iterator();
			String word=it.next();
			String nWord=word.substring(n,n+1);
			int minIndex=0;
			for(int i=1;it.hasNext();i++) {
				String comWord=it.next();
				String comNWord=comWord.substring(n,n+1);
				if(nWord.compareTo(comNWord)>0) {
					word=comWord;
					nWord=comNWord;
					minIndex=i;
				}else if(nWord.compareTo(comNWord)==0) {
					if(word.compareTo(comWord)>0) {
						word=comWord;
						nWord=comNWord;
						minIndex=i;
					}
				}
			}
			temp[index++]=word;
			l.remove(minIndex);
			
		}
		for(String a:temp) {
			System.out.print(a+" ");
		}
		
		
		
		
		return temp;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []arr= {"sun", "bed", "car"};
		String []arr2= {"abce", "abcd", "cdx"};
		solution(arr, 1);
		solution(arr2, 2);
		

	}

}
