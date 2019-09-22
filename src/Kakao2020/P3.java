package Kakao2020;

public class P3 {
	// ok
	static int[][] initGraph(int[][] key, int[][] lock) {
		int M = lock.length;
		int N = key.length;
		int graph[][] = new int[(2 * M) + N][(2 * M) + N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				graph[i + M][j + M] = lock[i][j];
			}
		}
		return graph;
	}

	// ok
	static int[][] addKey(int graph[][], int key[][], int i, int j) {
		for (int a = i; a < i + key.length; a++) {
			for (int b = j; b < j + key.length; b++) {
				if (key[a - i][b - j] != graph[a][b]) {
					graph[a][b] = 1;
				} else {
					graph[a][b] = 0;
				}

			}
		}
		return graph;
	}

	static boolean solve(int graph[][], int klen, int llen) {
		// print(graph);
		int sum = 0;
		for (int i = klen; i < klen + llen; i++) {
			for (int j = klen; j < klen + llen; j++) {
				if (graph[i][j] == 1) {
					sum++;
				}
			}
		}
		if (sum == llen * llen) {
			return true;
		} else {
			return false;
		}
	}

	// ok
	static void print(int graph[][]) {
		System.out.println("-----------------");
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph.length; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}

	static public boolean solution(int[][] key, int[][] lock) {
		int glen = (2 * key.length) + lock.length;
		int klen = key.length;
		int llen = lock.length;

		for (int turn = 0; turn < 4; turn++) {
			int newKey[][] = new int[klen][klen];

			for (int row = 0; row < klen; row++) {
				for (int col = 0; col < klen; col++) {
					newKey[row][col] = key[col][klen - 1 - row];
				}
			}

			key = newKey;
			for (int i = 0; i <= glen - key.length; i++) {
				for (int j = 0; j <= glen - key.length; j++) {
					int graph[][] = initGraph(key, lock);
					graph = addKey(graph, key, i, j);
					if (solve(graph, klen, llen)) {
						return true;
					}
				}
			}
		}

		return false;

	}

	public static void main(String[] args) {
		//int key[][] = { { 0, 0, 0 }, { 1, 0, 0 }, { 0, 1, 1 } };
		int key[][] = {{1,1}};
		int lock[][] = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 1, 1 } };
		System.out.println(solution(key, lock));

	}

}
