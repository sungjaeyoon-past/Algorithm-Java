package Test;

class T1{
	public int x;
	T1(int x){
		this.x=x;
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 [][]t=new T1[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				t[i][j]=new T1(5);
			}
		}
		T1 a = t[1][1];
		t[1][1]=null;
		System.out.println(a.x);
	}

}
