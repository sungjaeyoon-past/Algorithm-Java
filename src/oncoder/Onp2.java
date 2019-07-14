package oncoder;

public class Onp2 {
	static public int solution(int low, int high) {

		String sLow = "" + low;
		String sHigh = "" + high;

		int result = 0;
		if (sLow.length() != sHigh.length()) {
			return 0;
		} else {
			for(int i=0;i<sLow.length();i++) {
				char cl=sLow.charAt(i);
				char ch=sHigh.charAt(i);
				if(cl==ch) {
					if(cl=='8') {
						result++;
					}					
				}else {
					break;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution(1, 10));
		System.out.println(solution(88, 88));
		System.out.println(solution(800, 899));
		System.out.println(solution(8808, 8880));
		System.out.println(solution(88888887, 88888888));
		System.out.println(solution(880, 1880));
		System.out.println(solution(8, 18));
	}

}
