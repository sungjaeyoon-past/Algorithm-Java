package recursion;

public class ex11searchmiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {1,2,3,4,5,6,7,8,9};
		System.out.println(search(array,0,8,6));
	}
	public static int search(int [] data, int begin, int end, int target) {
		if(begin>end) {
			return -1;
		}else {
			int middle=(begin+end)/2;
			if(middle==target) {
				return middle;
			}
			int index = search(data,begin,middle-1,target);
			if(index!=-1) {
				return index;
			}else {
				return search(data,middle+1,end,target);
			}
		}
	}
}
