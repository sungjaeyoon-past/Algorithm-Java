package basic;

public class ex10search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {1,2,3,4,5,6,7,8,9};
		System.out.println("target is array["+search(array,0,8,4)+"]");
	}
	public static int search(int []array, int begin, int end, int target) {
		if(begin>end) {
			return -1;
		}else if(target==array[begin]) {
			return begin;
		}else {
			return search(array,begin+1,end,target);
		}
	}
}
