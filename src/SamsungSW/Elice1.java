package SamsungSW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Elice1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		
		st = new StringTokenizer(br.readLine());
		int TEST_CASE=Integer.parseInt(st.nextToken());
			for(int start=1;start<=TEST_CASE;start++) {
			st = new StringTokenizer(br.readLine());
			int paperNum = Integer.parseInt(st.nextToken());
			int sortNum = Integer.parseInt(st.nextToken());
			int[] table = new int[paperNum];
	
			String[] input = br.readLine().split(" ");
			for (int i = 0; i < paperNum; i++) {
				int num = Integer.parseInt(input[i]);
				table[i] = num;
			}
			
			if(table[0]==0) table[0]=1;
			if(table[table.length-1]==0) table[table.length-1]=sortNum;
			int previous=1;
			
			int []maxCount=new int[sortNum+1];
			int zeroCount=0;
			for(int i=0;i<table.length;i++) {
				//same
				if(table[i]==previous) { 
					maxCount[previous]++;
					maxCount[previous]+=zeroCount;				
					zeroCount=0;
				}			
				//0
				if(table[i]==0) { 
					zeroCount++;
				}		
				//1
				if(table[i]==previous+1) {
					maxCount[previous]+=zeroCount;
					maxCount[previous+1]+=zeroCount;
					zeroCount=0;
					previous+=1;
					maxCount[previous]++;
				}			
				//over 2
				if(table[i]>previous+1) { 
					int num=table[i]-(previous+1);
					maxCount[previous]+=(zeroCount-num);
					maxCount[table[i]]+=(zeroCount-num);
	//				for(int k=previous+1;k<table[i];k++) {
	//					System.out.print("k:"+k);
	//					//maxCount[k]=
	//					//System.out.println();
	//				}
					previous=table[i];
					maxCount[previous]++;
					zeroCount=0;
				}	
				
			}
			int max=0;
			for(int a:maxCount) {
				if(a>max) max=a;
			}
			bw.write(String.format("#%d %d\n",start,max));
		}
			bw.flush();
		
	}

}
