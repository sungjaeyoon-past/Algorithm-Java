package basic;

public class ex12max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {1,2,3,4,5,6,7,8,9};
		System.out.println(findMax(array,0,8));
	}
	public static int findMax(int []data,int begin, int end) {
		if(begin==end) {
			return data[begin];
		}else {
			return Math.max(data[begin], findMax(data,begin+1,end));
		}
	}

}
