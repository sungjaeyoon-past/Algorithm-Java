package Programmers;

public class Fibonachi {
	public static long fibo(int n) {
		long arr[]=new long[100];
		arr[0]=0;arr[1]=1;
		for(int i=2;i<=n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
	}
	public static void main(String[] args) {
		System.out.println(fibo(1));
		System.out.println(fibo(2));
		System.out.println(fibo(3));
		System.out.println(fibo(4));
		System.out.println(fibo(5));
		System.out.println(fibo(6));
		System.out.println(fibo(7));
		System.out.println(fibo(80));
		System.out.println(fibo(90));
	}

}
