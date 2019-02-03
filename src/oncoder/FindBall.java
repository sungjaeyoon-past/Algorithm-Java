package oncoder;

public class FindBall {
	static public int solution(String[] swaps) {
		boolean[] ball = new boolean[4];
		ball[1] = true;

		for (String a : swaps) {
			String[] b = a.split("");
			if (ball[Integer.parseInt(b[0])] == true) {
				ball[Integer.parseInt(b[0])] = false;
				ball[Integer.parseInt(b[2])] = true;
			} else if(ball[Integer.parseInt(b[2])] == true){
				ball[Integer.parseInt(b[2])] = false;
				ball[Integer.parseInt(b[0])] = true;
			}	else {
				continue;
			}
		}
		
		for(int i=1;i<4;i++) {
			if(ball[i]==true) {
				return i;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] swaps = { "2-3","1-3","2-3","2-1","3-1" };
		System.out.println(solution(swaps));
	}

}
