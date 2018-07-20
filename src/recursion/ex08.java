package recursion;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printBinary(52);
	}
	public static void printBinary(int k) {
		if(k<2) {
			System.out.print(k);
		}else {
			printBinary(k/2);
			System.out.print(k%2);
		}
	}
}
