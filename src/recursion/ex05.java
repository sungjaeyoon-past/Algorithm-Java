package recursion;



public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(length("aca"));
	}
	public static int length(String s) {
		if(s.equals("")) {
			return 0;
		}else {
			return 1+length(s.substring(1));
		}
	}
}
 