package oncoder;

public class Candy10_2 {
	static public int solution(int[] type) {
		int arr[] = new int[type.length + 1];
		for (int a : type) {
			if (a <= type.length) {
				arr[a]++;
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();

		int multi=1;
		int result=0;
		for (int i = 1;i < arr.length; i++) {
			System.out.println(arr[i]+" multi:"+multi+", result:"+result);
			if(arr[i]==0) break;
			multi*=arr[i];
			result+=multi;
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 6, 7 };
		int[] arr = {1,2,1 };
		System.out.println(solution(arr));
	}

}
