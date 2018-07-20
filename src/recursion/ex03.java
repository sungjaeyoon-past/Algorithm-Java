package recursion;

public class ex03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(6));
	}
	public static int fibonacci(int k) {
		if(k<2) {
			return k;
		}else {
			return fibonacci(k-1)+fibonacci(k-2);
		}
	}
}
