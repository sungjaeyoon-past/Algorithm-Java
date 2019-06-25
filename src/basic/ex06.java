package basic;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printChars("abcdefg");
	}
	public static void printChars(String s) {
		if(s.length()==0) {
			return;
		}else {
			System.out.print(s.charAt(0));
			printChars(s.substring(1));
		}
	}

}
