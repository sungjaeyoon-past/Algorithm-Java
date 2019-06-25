package SamsungSW;

import java.util.Scanner;

public class P1260 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/* test_case*/
		for(int k=1;sc.hasNext();k++) {
			/* input */
			int test_size = sc.nextInt();
			int[] length = new int[test_size];
			for(int i=0;i<test_size;i++) {
				length[i] = sc.nextInt();
			}
			
			/*Exception case*/
			if(test_size==1) {
				System.out.println(String.format("#%d %s",k,length[0]));
				break;
			}
			if(test_size==2) {
				System.out.println(String.format("#%d %s",k,Math.max(length[0], length[1])));
				break;
			}
			if(test_size==3) {
				System.out.println(String.format("#%d %s",k,Math.max(length[2],Math.max(length[0], length[1]))));
				break;
			}
	
			int result = 0;
			
			/* test_case_0 */
			int m=Math.max(length[1], length[2]);
			if(length[0]>m) result+=length[0]-m;
			
			/* test_case_1 */
			m=Math.max(length[0],Math.max(length[2], length[3]));
			if(length[1]>m) result+=length[1]-m;
			
			/* test_case_i-1 */
			m=Math.max(length[test_size-2], length[test_size-3]);
			if(length[test_size-1]>m) result+=length[test_size-1]-m;
			
			/* test_case_i-2 */
			m=Math.max(length[test_size-1],Math.max(length[test_size-3], length[test_size-4]));
			if(length[test_size-2]>m) result+=length[test_size-2]-m;
						
			/* test_case_i */
			for (int i = 2; i < test_size-2; i++) {
				int max = Math.max(Math.max(length[i - 1], length[i - 2]), Math.max(length[i + 1], length[i + 2]));
				if(length[i]>max) result+=(length[i]-max);
			}
			
			System.out.println(String.format("#%d %s",k,result));
		}

	}

}
