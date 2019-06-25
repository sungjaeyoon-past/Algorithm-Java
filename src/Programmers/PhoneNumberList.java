package Programmers;

import java.util.ArrayList;
import java.util.Iterator;

public class PhoneNumberList {
	static public boolean checkItsContain(String phone, ArrayList<String> arr) {
		Iterator<String> it = arr.iterator();
		int phoneL = phone.length();
		for (; it.hasNext();) {
			String cur=it.next();
			String com="";
			System.out.println(phone+"�?,"+cur);
			int itL = cur.length();
			if (phoneL > itL) {
				com=phone.substring(0,itL);
			} else if (phoneL <itL) {
				cur=cur.substring(0,phoneL);
				com=phone;
				System.out.println(cur);
			}else {
				com=phone;
			}
			if(cur.equals(com)) {
				return true;
			}
		}
		return false; // ?��?��?���??��경우.
	}

	static public boolean solution(String[] phone_book) {
		boolean answer = true;
		ArrayList<String> arr = new ArrayList<>();
		for (String phone : phone_book) {
			if (!arr.isEmpty()) {
				if (checkItsContain(phone, arr))
					return false; // ?��?��?���? ?��?��면false
			}
			arr.add(phone);
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] arr = { "119", "97674223", "1195524421" };
//		String[] arr = {"113", "12340", "123440", "12345", "98346"};
		String[] arr = {"12232332", "12", "222222"};
		//String[] arr = {"123","456","789" };
		System.out.println(solution(arr));
	}

}
