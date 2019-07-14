package Test;

import java.math.BigInteger;

public class P22 {
	static public String solution(String a, String b) {
		return ""+new BigInteger(a).add(new BigInteger(b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("10", "-1"));
		System.out.println(solution("1234", "5678"));
		System.out.println(solution("1134892859742852398432987574823952873892574265347856743856832657831465981243789325748265278364780215451431132142319048542589347534806341895378956739458438564395423556363454219875241985279834523524235243", "8889"));
	}

}
