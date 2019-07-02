package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node2751{
	public Node2751 left;
	public Node2751 right;
	public Node2751 parent;
	public int data;
	public Node2751(Node2751 left, Node2751 right, int data) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
	}
	public Node2751 getLeft() {
		return left;
	}
	public void setLeft(Node2751 left) {
		this.left = left;
	}
	public Node2751 getRight() {
		return right;
	}
	public void setRight(Node2751 right) {
		this.right = right;
	}
	public Node2751 getParent() {
		return parent;
	}
	public void setParent(Node2751 parent) {
		this.parent = parent;
	}
}

class BinTree2751{
	public Node2751 root;

	public void add(int data) {
		if(root==null) {
			root=new Node2751(null, null, data);
		}else {
			Node2751 temp = root;
			while(true) {
				if(data>temp.data) {
					if(temp.right!=null) {
						temp=temp.right;
					}else {
						Node2751 n=new Node2751(null, null, data);
						temp.setRight(n);
						n.setParent(temp);
						break;
					}
				}else if(data<temp.data){
					if(temp.left!=null) {
						temp=temp.left;
					}else {
						Node2751 n=new Node2751(null, null, data);
						temp.setLeft(n);
						n.setParent(temp);
						break;
					}
				}else if(data==temp.data) {
					//not add
					break;
				}
			}
		}
	}
	public void print(Node2751 n) {
		if(n!=null) {
			print(n.left);
			System.out.println(n.data);
			print(n.right);
		}
			
	}
}

public class P2751Tree {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		BinTree2751 bt = new BinTree2751();

		for (int i = 0; i < N; i++) bt.add(Integer.parseInt(br.readLine()));		
		
		bt.print(bt.root);
	}

}
