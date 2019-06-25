package basic;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd1(24,6));
		System.out.println(gcd2(24,6));
	}
	
	public static int gcd1(int m, int n) {
		if(m<n) {
			int temp=m;
			m=n;
			n=temp;
		}
		if(m%n==0) {
			return n; 		
		}else {
			return gcd1(n,m%n);
		}	
	}
	public static int gcd2(int m, int n) {
		if(n==0) {
			return m; 		
		}else {
			return gcd2(n,m%n);
		}	
	}

}
