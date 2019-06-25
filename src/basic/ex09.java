package basic;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {1,2,3,4,5};
		System.out.println(sum(3,array));
	}
	public static int sum(int n , int[] data) {
		if(n<=0) {
			return 0;			
		}else {
			return data[n-1]+sum(n-1,data);
		}
	}
}
