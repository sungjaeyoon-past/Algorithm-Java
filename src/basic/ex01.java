package basic;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(5));
	}
	
	public static int sum(int k) {
		if(k<=0) {
			return 0;
		}else {
			return k+sum(k-1);
		}
		
	}

}
