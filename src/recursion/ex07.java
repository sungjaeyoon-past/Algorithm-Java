package recursion;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCharReverse("abcdefg");
	}
	public static void printCharReverse(String s) {
		if(s.length()==0) {
			return;
		}else {
			printCharReverse(s.substring(1));
			System.out.print(s.charAt(0));
		}
	}
}
