package Programmers;

public class MatrixMultiple {

	static public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];

		for (int j = 0; j < arr1.length; j++) {
			for (int i = 0; i < arr2[0].length; i++) {
				int sum = 0;
				for (int k = 0; k < arr1[0].length; k++) {
					sum += (arr1[j][k] * arr2[k][i]);
				}
				answer[j][i] = sum;
			}
		}

//        for(int []a:answer) {
//        	for(int b:a) {
//        		System.out.print(b+" ");
//        	}
//        	System.out.println();
//        }

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
		int[][] arr2 = { { 3, 3 }, { 3, 3 } };
		solution(arr1, arr2);
	}

}

// 1 4    3 3
// 3 2    
// 4 1    3 3

//3 * 2  2* 2
//new int[arr1.lengtj]