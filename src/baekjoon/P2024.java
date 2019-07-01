package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class segmentTree2024 {
	private long[] arr;
	private long[] tree;
	
	public void setArr(int dif_index, long changed_num) {
		arr[dif_index]=changed_num;
	}
	public segmentTree2024(int N, long[] arr) {
		int capacity = 1;
		for (; capacity < N; capacity *= 2)
			;
		tree = new long[2 * capacity + 1];
		this.arr = arr;
	}

	public long init(int index, int start, int end) {
		if (start == end) {
			tree[index] = arr[start];
		} else {
			int mid = (start + end) / 2;
			tree[index] += init(2 * index, start, mid);
			tree[index] += init(2 * index + 1, mid + 1, end);
		}
		return tree[index];
	}

	public void update(int dif_index, long diff, int index, int start, int end) {
		if (dif_index < start || dif_index > end)
			return;
		tree[index] += diff;
		if (start != end) {
			int mid = (start + end) / 2;
			update(dif_index, diff, 2 * index, start, mid);
			update(dif_index, diff, 2 * index + 1, mid + 1, end);
		}
	}

	public long searchSum(int index, int start, int end, int left, int right) {
		if (start > right || end < left)
			return 0;
		else if (start >= left && end <= right) {
			return tree[index];
		} else {
			int mid = (start + end) / 2;
			return searchSum(2 * index, start, mid, left, right) + searchSum(index * 2 + 1, mid + 1, end, left, right);
		}
	}

	public void print() {
		int i = 1;
		int j = 1;
		for (int k = 1; k < tree.length; k++) {
			if (j % i == 0) {
				System.out.println();
				i *= 2;
			}
			System.out.print(tree[k] + " ");
			j++;
		}
		System.out.println();
	}
}

public class P2024 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		long[] arr = new long[N + 1];
		for (int i = 1; i < N + 1; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}

		segmentTree2024 sTree = new segmentTree2024(N, arr);
		sTree.init(1, 1, N);

		for (int i = 0; i < M + K; i++) {
			st = new StringTokenizer(br.readLine());
			if (st.nextToken().equals("1")) {
				// update
				int dif_index = Integer.parseInt(st.nextToken());
				long changed_num = Long.parseLong(st.nextToken());
				long diff = changed_num - arr[dif_index];
				sTree.update(dif_index, diff, 1, 1, N);
				sTree.setArr(dif_index, changed_num);
				arr[dif_index]=changed_num;
			} else {
				// sum
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				bw.write("" + sTree.searchSum(1, 1, N, start, end) + "\n");

			}
		}
		bw.flush();

	}

}
