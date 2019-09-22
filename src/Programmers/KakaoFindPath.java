package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class NodeKakaoPath {
	public int num;
	public int x;
	public int y;
	public NodeKakaoPath left;
	public NodeKakaoPath right;

	public NodeKakaoPath(int num, int x, int y) {
		super();
		this.num = num;
		this.x = x;
		this.y = y;
		left = null;
		right = null;
	}

}

class BinaryTreeKakaoPath {
	NodeKakaoPath root;
	ArrayList<Integer> preArr;
	ArrayList<Integer> postArr;

	public BinaryTreeKakaoPath() {
		preArr = new ArrayList<>();
		postArr = new ArrayList<>();
	}

	public NodeKakaoPath getRoot() {
		return root;
	}

	public void add(NodeKakaoPath n) {
		if (root == null) {
			root = n;
			return;
		}

		NodeKakaoPath cur = root;
		while (true) {
			if (n.x > cur.x) {
				if (cur.right == null) {
					cur.right = n;
					break;
				} else {
					cur = cur.right;
				}
			} else {
				if (cur.left == null) {
					cur.left = n;
					break;
				} else {
					cur = cur.left;
				}
			}
		}
	}

	public void preOrder(NodeKakaoPath n) {
		if (n != null) {
			// System.out.println(n.num);
			preArr.add(n.num);
			if (root.left != null) {
				preOrder(n.left);
			}
			if (root.right != null) {
				preOrder(n.right);
			}
		}

	}

	public int[] getPreArr() {
		return preArr.stream().mapToInt(i->i).toArray();
	}

	public int[] getPostArr() {
		return postArr.stream().mapToInt(i->i).toArray();
	}

	public void postOrder(NodeKakaoPath n) {
		if (n != null) {
			if (root.left != null) {
				postOrder(n.left);
			}
			if (root.right != null) {
				postOrder(n.right);
			}
			postArr.add(n.num);
			// System.out.println(n.num);
		}

	}

}

public class KakaoFindPath {
	static public int[][] solution(int[][] nodeinfo) {

		ArrayList<NodeKakaoPath> arr = new ArrayList<>();
		int number = 1;
		for (int[] node : nodeinfo) {
			arr.add(new NodeKakaoPath(number++, node[0], node[1]));
		}

		Collections.sort(arr, new Comparator<NodeKakaoPath>() {
			@Override
			public int compare(NodeKakaoPath o1, NodeKakaoPath o2) {
				// TODO Auto-generated method stub
				if (o1.y == o2.y) {
					return Integer.compare(o1.x, o2.x);
				} else {
					return -Integer.compare(o1.y, o2.y);
				}
			}
		});

		BinaryTreeKakaoPath bt = new BinaryTreeKakaoPath();
		for (NodeKakaoPath a : arr) {
			bt.add(a);
			//System.out.println(a.x + " " + a.y);
		}
		bt.preOrder(bt.getRoot());
		bt.postOrder(bt.getRoot());
		int[][] answer = new int[2][];
		answer[0] = bt.getPreArr();
		answer[1] = bt.getPostArr();

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nodeinfo = { { 5, 3 }, { 11, 5 }, { 13, 3 }, { 3, 5 }, { 6, 1 }, { 1, 3 }, { 8, 6 }, { 7, 2 },
				{ 2, 2 } };
		int[][] sol = solution(nodeinfo);

	}

}
