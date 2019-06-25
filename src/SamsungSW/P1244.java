package SamsungSW;

import java.util.Scanner;

public class P1244 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test_case=Integer.parseInt(sc.nextLine());
		
		for(int i=1;i<=test_case;i++) {
			String []input= sc.nextLine().split(" ");
			String []numStr=input[0].split("");
			int []num=new int[numStr.length];
			int count=Integer.parseInt(input[1]);
			
			for(int k=0;k<numStr.length;k++) {
				num[k]=Integer.parseInt(numStr[k]);
			}
			
			for(int j=0;j<num.length-1;j++) {
				if(count==0)break;
				
				int max=-1;
				int maxIndex=-1;
				for(int k=j+1;k<num.length;k++) {
					if(num[k]>=max) {
						max=num[k];
						maxIndex=k;
					}
				}
				if(num[j]<max) {
					int temp=num[j];
					num[j]=num[maxIndex];
					num[maxIndex]=temp;
					count--;
				}
			}
			System.out.println();
			for(int k=0;k<num.length;k++) {
				System.out.print(num[k]);
			}
			
			System.out.println();
			//System.out.println(String.format("#%d %d",i,result));
			
		}
	}

}
