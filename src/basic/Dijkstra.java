package basic;

public class Dijkstra {
	static public void dj(int[][] arr) {
		int distance[] = new int[arr.length + 1];
		boolean check[] = new boolean[arr.length + 1];

		distance[1] = 0;
		check[1] = true;
		for (int i = 2; i < arr.length; i++) {
			distance[i] = 99999;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 3, 6 }, { 4, 3 }, { 3, 2 }, { 1, 3 }, { 1, 2 }, { 2, 4 }, { 5, 2 } };
	}

}
