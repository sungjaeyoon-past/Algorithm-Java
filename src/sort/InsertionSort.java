package sort;

public class InsertionSort {
	public static int[] insertionSort(int []arr) {
		int temp;
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]>arr[i]) {
				temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
		return arr;
	}
	public static void main(String args[]) {
		int []arr1= {15,2,32,54,7};
		insertionSort(arr1);
		//insertionSort(arr2);
		//insertionSort(arr3);
	}
}
