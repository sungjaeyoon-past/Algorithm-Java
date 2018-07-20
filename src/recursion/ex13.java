package recursion;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(binarySearch(arr, 0, 9, 1));
	}
	public static int binarySearch(int []arr, int begin, int end, int target) {
		if(begin>end) {
			return -1;
		}else {
			int middle=(begin+end)/2;
			if(middle==target) {
				return middle;
			}else if(middle<target){
				return binarySearch(arr, middle+1, end, target);
			}else {
				return binarySearch(arr, begin, middle-1, target);
			}
		}
	}
}
