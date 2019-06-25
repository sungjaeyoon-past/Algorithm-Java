package basic;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(4));
	}
	public static int factorial(int k) {
		if(k==0) {
			return 1;
		}else {
			return k*factorial(k-1);
		}
	}
}
