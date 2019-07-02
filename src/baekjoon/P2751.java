package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2751 {
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

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		int N = Integer.parseInt(br.readLine());
		sorted=new int[N];
		int []arr=new int[N];
		for (int i = 0; i < N; i++) { 
			arr[i]=Integer.parseInt(br.readLine());			
		}
		mergeSort(arr,0, N-1);
		for(int a:sorted) {
			bw.write(a+"\n");
		}
		bw.flush();
	}

}
