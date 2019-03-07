package oncoder;

public class SCVresource {
	static public int solution(String[] map) {

		String[][] arr = new String[map.length][map[0].length() / 2 + 1];
		int DP[][] = new int[map.length][map[0].length() / 2 + 1];
		int i = 0;
		for (String m : map) {
			arr[i++] = m.split(" ");
		}
		for (i = 0; i < DP.length; i++) {
			for (int j = 0; j < DP[0].length; j++) {
				if (i == 0 && j == 0) {
					DP[i][j] = Integer.parseInt(arr[i][j]);
				} else if (i == 0 && j != 0) {
					DP[i][j] = DP[i][j - 1]+ Integer.parseInt(arr[i][j]);
				} else if (i != 0 && j == 0) {
					DP[i][j] = DP[i - 1][j]+ Integer.parseInt(arr[i][j]);
				} else {
					DP[i][j] = Math.max(DP[i][j - 1], DP[i - 1][j]) + Integer.parseInt(arr[i][j]);
				}
			}
		}
//
//		for (String[] a : arr) {
//			for (String b : a) {
//				System.out.print(b + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for (int[] a : DP) {
//			for (int b : a) {
//				System.out.print(b + " ");
//			}
//			System.out.println();
//		}

		return DP[DP.length-1][DP[0].length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] map = { "1 0 1", "2 3 1", "2 0 0" };
		System.out.println(solution(map));
	}

}
