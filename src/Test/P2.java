package Test;

public class P2 {
	static public String solution(String a, String b) {
		int length = a.length();

		if (a.length() < b.length()) {
			length = b.length();
		}

		int anum[] = new int[length];
		int bnum[] = new int[length];

		String[] as = a.split("");
		String[] bs = b.split("");

		for (int i = anum.length - 1; i >= 0; i--) {
			anum[i] = Integer.parseInt(as[i]);
		}
		for (int i = bs.length - 1; i >= 0; i--) {
			bnum[i + (length - bs.length)] = Integer.parseInt(bs[i]);
		}

		String result = "";
		boolean up = false;
		
		for (int i = length - 1; i >= 0; i--) {
			int num = anum[i] + bnum[i];
			if (up) {
				num+=1;
			}
			if (num >= 10) {
				num = num % 10;
				up = true;
			} else {
				up = false;
			}
			result += num;
		}
		
		if(up) {
			result+=1;
		}
		result = new StringBuffer(result).reverse().toString();
		return String.format("\"%s\"+\"%s\"=\"%s\"입니다.", a, b, result);
	}

	public static void main(String[] args) {
		System.out.println(solution("10", "-1"));
		System.out.println(solution("1234", "5678"));
		System.out.println(solution("1111", "8889"));
//		System.out.println(solution("1111341394123124134324913547231034131231231241312313414", "88813413413212492345723502341213129"));
	}

}
