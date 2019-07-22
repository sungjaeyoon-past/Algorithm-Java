package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Node1158{
	public int num;
	public Node1158 left;
	public Node1158(int num, Node1158 left) {
		this.num = num;
		this.left = left;
	}
	public void setLeft(Node1158 left) {
		this.left = left;
	}
	public Node1158 getLeft() {
		return left;
	}
	
}


public class P1158 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());

		Node1158 root = new Node1158(1,null);
		Node1158 pre = root;
		
		for(int i=2;i<N+1;i++) {
			Node1158 temp=new Node1158(i, null);
			pre.setLeft(temp);
			pre=temp;
		}
		pre.setLeft(root);

		Node1158 temp=pre;
		ArrayList<Integer> ar = new ArrayList<>();
		while(ar.size()!=N) {
			for(int i=0;i<K;i++) {
				pre=temp;
				temp=temp.getLeft();
			}
			Node1158 next=temp.getLeft();
			ar.add(temp.num);
			pre.setLeft(next);
		}
		String result="<";
		for(Integer a:ar) {
			result+=a+", ";
		}
		result=result.substring(0,result.length()-2);
		System.out.println(result+">");
		
		
		
	}
}
