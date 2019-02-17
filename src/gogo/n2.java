package gogo;

import java.util.Stack;

public class n2 {
	static public boolean isValid(String braces) {
		// Add code here
		String str[] = braces.split("");
		Stack<String> st = new Stack<>();

		for (String s : str) {
			if (s.equals("(") || s.equals("{") || s.equals("[")) {
				st.push(s);
				System.out.println(s + " in");
			} else if (s.equals(")")) {
				if (st.isEmpty()) {
					return false;
				}
				String p = st.pop();
				if (!p.equals("(")) {
					return false;
				}
			} else if (s.equals("}")) {
				if (st.isEmpty()) {
					return false;
				}
				String p = st.pop();
				if (!p.equals("{")) {
					return false;
				}
			} else if (s.equals("]")) {
				if (st.isEmpty()) {
					return false;
				}
				String p = st.pop();
				if (!p.equals("[")) {
					return false;
				}
			}else {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("[{)(())}]"));

	}

}
