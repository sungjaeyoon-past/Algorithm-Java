package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
	private int data;
	private Node left;
	private Node right;

	public Node(int data) {
		this.setData(data);
		setLeft(null);
		setRight(null);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}

class BinaryTree {
	public Node start;

	public Node getStart() {
		return start;
	}

	public BinaryTree(Node start) {
		this.start = start;
	}

	public void add(int data) {
		Node temp;
		temp = start;
		while (true) {
			int num = temp.getData();
			if (num <= data) {// ->
				if (temp.getRight() == null) {
					temp.setRight(new Node(data));
					break;
				} else {
					temp = temp.getRight();
					continue;
				}
			} else {// <-
				if (temp.getLeft() == null) {
					temp.setLeft(new Node(data));
					break;
				} else {
					temp = temp.getLeft();
					continue;
				}
			}
		}
	}

	public boolean find(int num) {
		Node temp;
		temp = start;
		while (true) {
			if (temp.getData() == num) {
				return true;
			} else if (temp.getData() > num) {
				if (temp.getLeft() == null) {
					return false;
				} else {
					temp = temp.getLeft();
					continue;
				}
			} else if (temp.getData() < num) {
				if (temp.getRight() == null) {
					return false;
				} else {
					temp = temp.getRight();
					continue;
				}
			}
		}
	}
}

public class P1920 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		BinaryTree bt = null;

		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (i == 0) {
				bt = new BinaryTree(new Node(num));
			} else {
				bt.add(num);
			}
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(bt.find(num)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}

	}

}
