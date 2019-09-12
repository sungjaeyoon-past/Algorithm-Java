package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Node1021 {
	public int num;
	public Node1021 left;
	public Node1021 right;

	public Node1021(int num) {
		this.num = num;
		this.left = null;
		this.right = null;
	}

	public void setLeft(Node1021 left) {
		this.left = left;
	}

	public void setRight(Node1021 right) {
		this.right = right;
	}
}

public class P1021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());

		LinkedList<Integer> cur = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			cur.add(Integer.parseInt(st.nextToken()));
		}

		Node1021 head = null;
		Node1021 addHead = null;
		Node1021 temp = null;
		for (int i = 1; i <= N; i++) {
			temp = new Node1021(i);
			if (head == null) {
				head = temp;
				addHead = head;
			} else {
				addHead.setRight(temp);
				temp.setLeft(addHead);
				addHead = temp;
			}
		}
		temp.setRight(head);
		head.setLeft(temp);

		int count = 0;

		while (!cur.isEmpty()) {
			int c = cur.peek();
			if (head.num == c) {
				cur.poll();
				Node1021 left = head.left;
				Node1021 right = head.right;
				left.setRight(right);
				right.setLeft(left);
				head = right;
			} else {
				// ->
				int lc = 0;
				Node1021 left = head;
				while (left.num != c) {
					left = left.left;
					lc++;
				}
				// <-
				int rc = 0;
				Node1021 right = head;
				while (right.num != c) {
					right = right.right;
					rc++;
				}
				if (lc < rc) {
					head = left;
					count += lc;
				} else {
					head = right;
					count += rc;
				}
			}
		}
		System.out.println(count);

	}

}
