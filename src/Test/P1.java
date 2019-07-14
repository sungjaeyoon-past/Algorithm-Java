package Test;

public class P1 {
	
	static public int solution(int num) {
		int result=0;
		for(int i=1;i<=num;i++) {
			int cur=i;
			while(cur>0) {
				int nam=cur%10;
				if(nam==3 || nam==6 || nam==9) {
					result++;
					break;
				}
				cur=(cur-nam)/10;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(33));
		System.out.println(solution(15));
	}

}
