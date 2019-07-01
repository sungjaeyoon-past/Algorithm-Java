package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2822 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int []max=new int[5];
		int []maxIndex=new int[5];
		for(int i=1;i<=8;i++) {
			int num=Integer.parseInt(br.readLine());
			if(num>max[0]) {
				max[4]=max[3];
				max[3]=max[2];
				max[2]=max[1];
				max[1]=max[0];
				max[0]=num;
				maxIndex[4]=maxIndex[3];
				maxIndex[3]=maxIndex[2];
				maxIndex[2]=maxIndex[1];
				maxIndex[1]=maxIndex[0];
				maxIndex[0]=i;
			}else if(num>max[1]) {
				max[4]=max[3];
				max[3]=max[2];
				max[2]=max[1];
				max[1]=num;
				maxIndex[4]=maxIndex[3];
				maxIndex[3]=maxIndex[2];
				maxIndex[2]=maxIndex[1];
				maxIndex[1]=i;
			}else if(num>max[2]) {
				max[4]=max[3];
				max[3]=max[2];
				max[2]=num;
				maxIndex[4]=maxIndex[3];
				maxIndex[3]=maxIndex[2];
				maxIndex[2]=i;
			}else if(num>max[3]) {
				max[4]=max[3];
				max[3]=num;
				maxIndex[4]=maxIndex[3];
				maxIndex[3]=i;
			}else if(num>max[4] ){
				max[4]=num;
				maxIndex[4]=i;
			}			
		}
		System.out.println(max[0]+max[1]+max[2]+max[3]+max[4]);
		Arrays.sort(maxIndex);
		for(int a:maxIndex) {
			System.out.print(a+" ");
		}
	}

}
