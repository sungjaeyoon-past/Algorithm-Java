package basic;

public class QuickSort {
	static int partition(int arr[], int left, int right) {
		int pivot=arr[(left+right)/2];
		while(left<right) {
			while((arr[left]<pivot)&&(left<right))
				left++;
			while((arr[right]>pivot)&&(left<right))
				right--;
			if(left<right) {
				System.out.println("스왑:"+arr[left]+", "+arr[right]);
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
		}
		return left;
	}
	static public void quickSort(int []arr,int left, int right) {
		if(left<right) {
			int pivotNewIndex=partition(arr,left,right);
			quickSort(arr, left, pivotNewIndex-1);
			quickSort(arr, pivotNewIndex+1, right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 9, 24, 10, 8, 14, 28, 93, 2, 34, 12 };
		quickSort(arr, 0, arr.length-1);
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}
