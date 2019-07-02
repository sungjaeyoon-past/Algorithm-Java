package basic;

import java.util.Arrays;

public class MergeSort {
	static int sorted[] = new int[100];

	static public void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	static public void merge(int a[], int m, int middle, int n) {
		int i = m; // 첫 번째 부분집합의 시작 위치 설정
		int j = middle + 1; // 두 번째 부분집합의 시작 위치 설정
		int k = m; // 배열 sorted에 정렬된 원소를 저장할 위치 설정

		while (i <= middle && j <= n) {
			if (a[i] <= a[j]) {
				sorted[k] = a[i];
				i++;
			} else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}
		if (i > middle) {
			for (int t = j; t <= n; t++, k++) {
				sorted[k] = a[t];
			}
		} else {
			for (int t = i; t <= middle; t++, k++) {
				sorted[k] = a[t];
			}
		}

		for (int t = m; t <= n; t++) {
			a[t] = sorted[t];
		}
	}

	public static void main(String[] args) {
		int[] l = new int[100];
		for (int i = 0; i < 100; i++) {
			l[i] = (int) (Math.random() * 100);
		}
		mergeSort(l, 0, 99);

		for (int a : sorted) {
			System.out.print(a + " ");
		}
	}

}
